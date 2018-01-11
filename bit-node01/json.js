// 객체 생성 방법1
var obj = new Object();
obj.name = "홍길동";
obj.age = 20;
obj.tel = "111-1111"

// 객체 생성 방법2
var obj2 = {};
obj2.name = "홍길동";
obj2.age = 20;
obj2.tel = "111-1111"

// 객체 생성 방법3
var obj2 = {
  name: "홍길동",
  'age': 20,
  "tel": "111-1111"
};

// OS에 영향을 받지 않고, 프로그래밍 언어에도 영향을 받지 않고
//    데이터를 보내고 받는 방법? 문자열로 주고 받기

// 문자열로 데이터를 주고 받을 때 구조가 있는 데이터는 어떤 형식이 좋은가?
// 즉 구조가 있는 데이터를 전송하기 쉽게 만든 문자열로 표현하는 형식
// => CSV(Comman-Seperated Value)
var dataStr = "홍길동,20,1111-1111";

// => XML(Extensible Markup Language)
var dataStr2 = "<member><name>홍길동</name><age>20</age><tel>1111-1111</title></member>";

// => 자바스크립트의 객체 생성 단축 문법을 차용해서 만든 문법
//    JSON(JavaScript Object Notation)이라 한다.
var dataStr3 = '{"name":"홍길동","age":20,"tel":"1111-1111"}';
