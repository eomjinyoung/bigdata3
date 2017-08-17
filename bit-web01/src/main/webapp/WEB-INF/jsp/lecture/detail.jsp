<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset='UTF-8'>
  <title>강의관리</title>
  <jsp:include page="../corestyle.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../header.jsp"></jsp:include>
<h1>강의 조회 by JSP</h1>
<form action='update.do' method='POST' enctype='multipart/form-data'>
강의일련번호:<input type='text' name='lectureNo' value='${lecture.lectureNo}'><br>
강의실일련번호:<input type='text' name='classroomNo' value='${lecture.classroomNo}'><br>
매니저일련번호:<input type='text' name='managerNo' value='${lecture.managerNo}'><br>
강의명:<input type='text' name='title' value='${lecture.title}'><br>
강의내용:<input type='text' name='descript' value='${lecture.descript}'><br>
시작일:<input type='text' name='startDate' value='${lecture.startDate}'><br>
종료일:<input type='text' name='endDate' value='${lecture.endDate}'><br>
수강가능인원:<input type='text' name='qty' value='${lecture.qty}'><br>
수업료:<input type='text' name='price' value='${lecture.price}'><br>
총시간:<input type='text' name='thours' value='${lecture.thours}'><br>


<button>변경</button>
<button type='button' onclick='doDelete()'>삭제</button>
<button type='button' onclick='doList()'>목록</button>
</form>
<script>
function doDelete() {
  location.href = 'delete.do?no=${lecture.lectureNo}'
}
function doList() {
  location.href = 'list.do'

}
</script>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>