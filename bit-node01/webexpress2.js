'use strict';

const http = require('http')
const url = require('url')

let getmap = {}
let postmap = {}

function error(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>잘못된 URL입니다.</h1>')
    response.write('</body></html>')
    response.end()
}

module.exports = {
    get: function(path, f) {
        getmap[path] = f
    },
    post: function(path, f) {
        postmap[path] = f
    },
    listen: function(port, listener) {
        const server = http.createServer(function(request, response) {
            let urlInfo = url.parse(request.url)
            
            response.writeHead(200, {
                'Content-Type': 'text/html;charset=UTF-8'})
        
            var handler = null;
            if (request.method == 'GET') {
                handler = getmap[urlInfo.pathname]
            } else if (request.method == 'POST') {
                handler = postmap[urlInfo.pathname]
            }
            if (handler) {
                handler(request, response)
            } else {
                error(request, response)
            }
        })
        
        server.listen(port, listener)
        return server
    }
}