<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>구구단</title>
  <jsp:include page="corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h1>구구단 ${param.dan}단</h1>
<p>${result}</p>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
