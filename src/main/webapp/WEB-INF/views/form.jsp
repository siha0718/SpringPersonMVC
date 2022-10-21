<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
<style>
	label{
		display: inline-block;
		width: 80px;
	}
	textarea {
	width: 100%;
}
</style>
</head>
<body>
	<h1>사람정보입력</h1>
	<form method="post" action="form">
		<fieldset>
			<legend>사람 정보 입력</legend>
			이름: <input type="text" name="name"><br>
			나이: <input type="number" name="age"><br>
			직업: <input type="text" name="job"><br>
			<input type="submit" value="등록">
		</fieldset>
	</form>
	
	<a href="/list">사람목록보기</a>
</body>
</html>