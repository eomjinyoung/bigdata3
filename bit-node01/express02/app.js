var express = require('express')
var app = express()

// 정적 파일의 경로를 지정해야 express에서 찾아 클라이언트에게 보낼 수 있다.
app.use(express.static('public'))

app.get('/hello', function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/plain;charset=UTF-8'
    })
    response.write('Hello!\n')
    response.end()
})

app.get('/hello2', function(request, response) {
    response.writeHead(200, {
        'Content-Type': 'text/plain;charset=UTF-8'
    })
    response.write('Hello2!\n')
    response.end()
})

app.listen(9999, function() {
    console.log('서버가 시작되었습니다!')
})

// nodejs 모듈 설치
// => npm(node package manager) 프로그램을 이용하여 모듈을 설치한다.
// => npm install 모듈명1 모듈명2 모듈명3 ...
// 
// express 모듈 설치
// => npm install express
//
// 모듈이 여러 개일 경우 모두 암기해서 일일이 설치하기에는 너무 번거롭다.
// 그래서 npm은 프로그램 정보 및 기타 모듈 정보를 담은 별도의 설정 파일을 사용한다.
// => package.json
// => 즉 package.json 파일에 프로그램 정보나 사용할 모듈 정보를 저장해 둔다.
//
// package.json 사용
// 1) package.json 파일 생성 
//    => "npm init" 명령 실행
// 2) package.json에 프로그램에서 사용할 모듈을 등록
//    => "npm install 모듈명 --save"
//    => 모듈을 설치하는 것과 함께 package.json 파일에 모듈 정보를 등록한다.
// 3) package.json 활용
//    => 기존에 다운로드 받은 node_modules 폴더 및 그 하위 폴더를 모두 제거하라.
//    => "npm install" 명령 실행
//       package.json 파일에 등록된 모든 모듈을 자동으로 다운로드 받아 설치한다.
// 
//

