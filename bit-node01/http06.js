'use strict';

const http = require('http')
const url = require('url')

const server = http.createServer(function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/html;charset=UTF-8'})
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>안녕하세요!</h1>')
    response.write('<p>' + request.url + '</p>')
    let urlInfo = url.parse(request.url)
    response.write('<p>' + urlInfo.pathname + '</p>')
    response.write('</body></html>')
    response.end()
})

server.listen(8888)

console.log('서버 실행중...')