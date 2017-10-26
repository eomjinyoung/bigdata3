'use strict';

const http = require('http')
const url = require('url')
const webexpress = require('./webexpress')

webexpress.get('/hello', function(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>안녕하세요!</h1>')
    response.write('</body></html>')
    response.end()
})

webexpress.get('/hello2', function(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>안녕하세요2!</h1>')
    response.write('</body></html>')
    response.end()
})

webexpress.get('/hello3', function(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>안녕하세요3!ㅋㅋㅋㅋ</h1>')
    response.write('</body></html>')
    response.end()
})

webexpress.get('/hello4', function(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>의심하지 마시오!</h1>')
    response.write('</body></html>')
    response.end()
})

function error(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>잘못된 URL입니다.</h1>')
    response.write('</body></html>')
    response.end()
}

const server = http.createServer(function(request, response) {
    let urlInfo = url.parse(request.url)
    
    response.writeHead(200, {
        'Content-Type': 'text/html;charset=UTF-8'})

    var listener = null;
    if (request.method == 'GET') {
        listener = webexpress.get(urlInfo.pathname)
    } else if (request.method == 'POST') {
        listener = webexpress.post(urlInfo.pathname)
    }
    if (listener) {
        listener(request, response)
    } else {
        error(request, response)
    }
})

server.listen(8888)

console.log('서버 실행중...')