
const handleReceiveMessage = (event) => {
    console.log('message')
};

const handleReceivePostback = (event) => {
    console.log('postback')
};

module.exports = {
    handleReceiveMessage,
    handleReceivePostback
};