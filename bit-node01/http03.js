'use strict';

const http = require('http')

const server = http.createServer(function(request, response) {
    response.write('Hi~~')
    response.end()
})

server.listen(8888)

console.log('서버 실행중...')