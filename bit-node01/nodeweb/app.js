const https = require('https')
const express = require('express')
const fs = require('fs')
const bodyParser = require('body-parser');
const request = require('request')

var jsonParser = bodyParser.json()
var urlParser = bodyParser.urlencoded({extended: true})

// .env 파일의 내용을 로딩한다.
require('dotenv').config()

const app = express()
app.use(jsonParser);
app.use(urlParser);

// 인증서 데이터를 로딩
var options = {
    key: fs.readFileSync('custom.key'),
    cert: fs.readFileSync('www_eomcs_com.crt'),
    ca: fs.readFileSync('www_eomcs_com.ca-bundle') 
}

app.use(express.static('public'))

app.get('/hello', function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/plain;charset=UTF-8'
    })
    response.write('Hello, 안녕하세요!\n')
    response.end()
})

// 페이스북 서버에서 이 서버의 유효성을 검사하기 위해 요청 
app.get('/webhook', function(req, res) {
    if (req.query['hub.mode'] === 'subscribe' &&
        req.query['hub.verify_token'] === process.env.VERIFY_TOKEN) {
        console.log("Validating webhook");
        res.status(200).send(req.query['hub.challenge']);
    } else {
        console.error("Failed validation. Make sure the validation tokens match.");
        res.sendStatus(403);          
    }
});

// 메시지 처리 
// 1) 사용자가 페이지북 페이지로 메시지를 보낸다.
// 2) 페이스북 메신저 서버가 이 서버의 '/webhook' URL POST 요청한다.
// 3) 이 서버는 이 POST 요청을 처리한 후 응답한다.
// 4) 페이브북 메신저 서버가 사용자에게 메시지를 보낸다.
// 5) 사용자의 메신저에 응답 내용을 출력된다.
// Message processing
app.post('/webhook', function (req, res) {
  var data = req.body;
  
  // Make sure this is a page subscription
  if (data.object === 'page') {
    
    // Iterate over each entry - there may be multiple if batched
    data.entry.forEach(function(entry) {
      var pageID = entry.id;
      var timeOfEvent = entry.time;

      // Iterate over each messaging event
      entry.messaging.forEach(function(event) {
        if (event.message) {
          console.log('event.message===> ', event.message)
          receivedMessage(event);
        } else if (event.postback) {
          console.log('event.postback===> ', event.postback)
          receivedPostback(event);   
        } else {
          //console.log("unknown event===> ", event);
        }
      });
    });
  
    // Assume all went well.
    //
    // You must send back a 200, within 20 seconds, to let us know
    // you've successfully received the callback. Otherwise, the request
    // will time out and we will keep trying to resend.
    res.sendStatus(200);
  }
});
  
// Incoming events handling
function receivedMessage(event) {
    var senderID = event.sender.id;
    var recipientID = event.recipient.id;
    var timeOfMessage = event.timestamp;
    var message = event.message;
  
    console.log("Received message for user %d and page %d at %d with message:", 
      senderID, recipientID, timeOfMessage);

    var messageId = message.mid;
    var messageText = message.text;
    var messageAttachments = message.attachments;
  
    if (messageText) {
      // If we receive a text message, check to see if it matches a keyword
      // and send back the template example. Otherwise, just echo the text we received.
      
      if (messageText.startsWith("op:")) {
        var arr = messageText.substring(3).split(',')
        var result = 0;
        switch (arr[0]) {
          case 'plus': 
            result = parseInt(arr[1]) + parseInt(arr[2]); 
            break;
        }
        sendTextMessage(senderID, "결과=" + result);

      } else if (messageText == 'generic') {
        sendGenericMessage(senderID);

      } else {
        sendTextMessage(senderID, "올바른 명령이 아닙니다.");
      }
    } else if (messageAttachments) {
      sendTextMessage(senderID, "Message with attachment received");
    }
}
  
function receivedPostback(event) {
    var senderID = event.sender.id;
    var recipientID = event.recipient.id;
    var timeOfPostback = event.timestamp;
  
    // The 'payload' param is a developer-defined field which is set in a postback 
    // button for Structured Messages. 
    var payload = event.postback.payload;
  
    console.log("Received postback for user %d and page %d with payload '%s' " + 
      "at %d", senderID, recipientID, payload, timeOfPostback);
  
    // When a postback is called, we'll send a message back to the sender to 
    // let them know it was successful
    sendTextMessage(senderID, "Postback called");
}
  
  //////////////////////////
  // Sending helpers
  //////////////////////////
function sendTextMessage(recipientId, messageText) {
    var messageData = {
      recipient: {
        id: recipientId
      },
      message: {
        text: messageText
      }
    };
  
    callSendAPI(messageData);
}
  
function sendGenericMessage(recipientId) {
    var messageData = {
      recipient: {
        id: recipientId
      },
      message: {
        attachment: {
          type: "template",
          payload: {
            template_type: "generic",
            elements: [{
              title: "rift",
              subtitle: "Next-generation virtual reality",
              item_url: "https://www.oculus.com/en-us/rift/",               
              image_url: "http://messengerdemo.parseapp.com/img/rift.png",
              buttons: [{
                type: "web_url",
                url: "https://www.oculus.com/en-us/rift/",
                title: "Open Web URL"
              }, {
                type: "postback",
                title: "Call Postback",
                payload: "Payload for first bubble",
              }],
            }, {
              title: "touch",
              subtitle: "Your Hands, Now in VR",
              item_url: "https://www.oculus.com/en-us/touch/",               
              image_url: "http://messengerdemo.parseapp.com/img/touch.png",
              buttons: [{
                type: "web_url",
                url: "https://www.oculus.com/en-us/touch/",
                title: "Open Web URL"
              }, {
                type: "postback",
                title: "Call Postback",
                payload: "Payload for second bubble",
              }]
            }]
          }
        }
      }
    };  
  
    callSendAPI(messageData);
}
  
function callSendAPI(messageData) {
    request({
      uri: 'https://graph.facebook.com/v2.6/me/messages',
      qs: { access_token: process.env.PAGE_ACCESS_TOKEN },
      method: 'POST',
      json: messageData
  
    }, function (error, response, body) {
      if (!error && response.statusCode == 200) {
        var recipientId = body.recipient_id;
        var messageId = body.message_id;
  
        console.log("Successfully sent generic message with id %s to recipient %s", 
          messageId, recipientId);
      } else {
        console.error("Unable to send message.");
        //console.error(response);
        console.error(error);
      }
    });  
}

https.createServer(options, app).listen(9999, function() {
    console.log('서버가 시작되었습니다!')
})








// nodejs 모듈 설치
// => npm(node package manager) 프로그램을 이용하여 모듈을 설치한다.
// => npm install 모듈명1 모듈명2 모듈명3 ...
// 
// express 모듈 설치
// => npm install express
//
// 모듈이 여러 개일 경우 모두 암기해서 일일이 설치하기에는 너무 번거롭다.
// 그래서 npm은 프로그램 정보 및 기타 모듈 정보를 담은 별도의 설정 파일을 사용한다.
// => package.json
// => 즉 package.json 파일에 프로그램 정보나 사용할 모듈 정보를 저장해 둔다.
//
// package.json 사용
// 1) package.json 파일 생성 
//    => "npm init" 명령 실행
// 2) package.json에 프로그램에서 사용할 모듈을 등록
//    => "npm install 모듈명 --save"
//    => 모듈을 설치하는 것과 함께 package.json 파일에 모듈 정보를 등록한다.
// 3) package.json 활용
//    => 기존에 다운로드 받은 node_modules 폴더 및 그 하위 폴더를 모두 제거하라.
//    => "npm install" 명령 실행
//       package.json 파일에 등록된 모든 모듈을 자동으로 다운로드 받아 설치한다.
// 
//

