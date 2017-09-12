<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장비등록결과</title>
</head>
<body>
<h1>장비등록결과</h1>
<c:choose>
<c:when test="${empty error}">
<p>장비를 성공적으로 등록하였습니다.<br>
등록 번호가 고객님의 이메일로 발송되었으니 확인하시어 장비에 설정해 주시기 바랍니다.<br>
장비에 등록 번호를 설정하는 방법은 제품에 첨부된 문서를 확인하세요.</p>
</c:when>
<c:otherwise>
<h2>메일 전송 오류!</h2>
<pre>${error}</pre>
</c:otherwise> 
</c:choose>
</body>
</html>








