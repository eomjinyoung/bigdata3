'use strict';

const http = require('http')

const server = http.createServer()

server.listen(8888)

console.log('서버 실행중...')