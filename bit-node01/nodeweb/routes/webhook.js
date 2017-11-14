// nodeJS에서 Express 모듈을 사용할 경우 
// 다음과 같이 express의 라우터 객체에 클라이언트 요청을 처리할 함수를 등록한다. 
// 만약 Express 모듈을 사용하지 않는다면 다음 코드는 무효하다.
//import express from 'express';
const express = require('express');

// 클라이언트 요청이 들어왔을 때 함수를 호출해주는 객체 
const router = express.Router();

// 페이스북 서버에서 이 서버의 유효성을 검사하기 위해 요청 
// => webhook.js는 클라이언트에서 URL '/webhook'으로 요청이 들어 왔을 때 실행한다.
// => 그래서 기본 URL이 이미 '/webhook' 이다.
// => 그러니까 '/webhook' URL을 지정하기 위해서는 그냥 '/'로 해야한다.  
router.get('/', (req, res) => {
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
router.post('/', (req, res) => {
    /*
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
    */
});
    
module.exports = router;