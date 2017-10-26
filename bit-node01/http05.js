'use strict';

const http = require('http')

const server = http.createServer(function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/html;charset=UTF-8'})
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>안녕하세요!</h1></body></html>')
    response.end()
})

server.listen(8888)

console.log('서버 실행중...')