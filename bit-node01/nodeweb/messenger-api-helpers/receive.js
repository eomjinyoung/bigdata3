const sendAPI = require('./send');

const handleReceiveMessage = (event) => {
    var senderID = event.sender.id;
    var recipientID = event.recipient.id;
    var timeOfMessage = event.timestamp;
    var message = event.message;

    console.log("Received message for user %d and page %d at %d with message:", 
        senderID, recipientID, timeOfMessage);

    var messageId = message.mid;
    var messageText = message.text;
    var messageAttachments = message.attachments; 
    
    sendAPI.sendTextMessage(senderID, messageText);
};

const handleReceivePostback = (event) => {
    console.log('postback')
};

module.exports = {
    handleReceiveMessage,
    handleReceivePostback
};