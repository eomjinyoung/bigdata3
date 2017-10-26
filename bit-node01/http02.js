'use strict';

const http = require('http')

const server = http.createServer(function() {
    console.log('요청 들어왔음!')
    // 응답을 안하면 웹 브라우저는 계속 기다린다.
})

server.listen(8888)

console.log('서버 실행중...')