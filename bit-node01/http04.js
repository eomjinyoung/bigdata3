'use strict';

const http = require('http')

const server = http.createServer(function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/plain;charset=UTF-8'})
    response.write('Hi~~\n')
    response.write('안녕하세요~~\n')
    response.end()
})

server.listen(8888)

console.log('서버 실행중...')