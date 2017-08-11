<%-- JSP 구성 요소
1) 템플릿 데이터
2) 스크립트릿(scriptlet) 엘리먼트
3) 지시(directive) 엘리먼트      
4) 표현식(expression) 엘리먼트
5) 선언문(declaration) 엘리먼트
9) JSP 주석
 --%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%><%-- jsp 지시어 --%>
<%! String name = "홍길동"; %><%-- jsp 선언문 --%>
<!DOCTYPE html><%-- 템플릿 데이터 --%>
<html><!-- HTML 주석은 JSP 입장에서 일반 텍스트로 취급된다. -->
<%! int age = 20; %>
<head>
  <meta charset="UTF-8">
  <title>JSP</title>
</head>
<body>
<h1>Declaration 엘리먼트</h1>
name: <%= name%><br> <%-- jsp 표현식(=> 작업을 수행한 후 결과를 리턴하는 문장) --%>
age: <%= age%><br>
<%plus(10, 20);%> <%-- 스크립트릿 --%>
10 + 20 = <%= result %><br>
</body>
</html>
<%!
public int result;
void plus(int a, int b) {
  this.result = a + b;
}
%>






