<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>SSAFY 사용자 관리</h1>
	<form method="post" action="regist">
		<fieldset>
			<legend>사람 정보 입력</legend>
			<label for="name">이름</label>
			<input type="text" id="name" name="name"><br>
			<label for="age">나이</label>
			<input type="number" id="age" name="age"><br>
			<label for="job">직업</label>
			<input type="text" id="job" name="job"><br>
			<input type="submit" value="입력">
		</fieldset>
	</form>
	<a href="./list">사람목록보기</a>
</body>
</html>