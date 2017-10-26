'use strict';

const webexpress = require('./webexpress2')

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

webexpress.get('/hello5', function(request, response) {
    response.write('<html><head><title>test...</title></head>')
    response.write('<body><h1>미니 express 완성!</h1>')
    response.write('</body></html>')
    response.end()
})


webexpress.listen(8888, function() {
    console.log('서버 실행중...')
})
