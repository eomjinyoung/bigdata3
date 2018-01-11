<%@ page language="java" 
    contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String category = request.getParameter("category");
if (category.equals("c1")) {%>
{
  "menu": [
    {"name": "메뉴1", "value": "menu1"},
    {"name": "메뉴2", "value": "menu2"},
    {"name": "메뉴3", "value": "menu3"}
  ]
}  
<%} else if (category.equals("c2")) {%>
{
  "menu": [
    {"name": "메뉴100", "value": "menu100"},
    {"name": "메뉴200", "value": "menu200"},
    {"name": "메뉴300", "value": "menu300"}
  ]
}  
<%} else if (category.equals("c3")) {%>
{
  "menu": [
    {"name": "메뉴x", "value": "menux"},
    {"name": "메뉴y", "value": "menuy"},
    {"name": "메뉴z", "value": "menuz"}
  ]
}  
<%}%>