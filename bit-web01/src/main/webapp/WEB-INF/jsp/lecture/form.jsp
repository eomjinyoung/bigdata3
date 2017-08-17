<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>교실관리</title>
  <style>
body {
  background-image: url('11.png');
  background-color: #D9E5FF;
  background-position:center center;
}
</style>
</head>
<body>
<h1>교실 등록</h1>
<form action="add.do" method="POST" enctype="multipart/form-data">
교실번호:<input type="text" name="classroomNo"><br>
매니저번호:<input type="text" name="managerNo"><br>
강의명:<input type="text" name="title"><br>
상세:<input type="text" name="descript"><br>
시작일:<input type="text" name="startDate"><br>
종료일:<input type="text" name="endDate"><br>
인원:<input type="text" name="qty"><br>
가격:<input type="text" name="price"><br>
총시간:<input type="text" name="thours"><br>
<button>등록</button>
</form>

</body>
</html>