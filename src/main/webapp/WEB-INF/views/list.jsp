<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 사용자 관리</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div>
		<h1>사람 목록</h1>
		<%-- request 영역에 users로 등록된 리스트를 반복문을 이용해 출력한다. --%>
		<table id="user-list">
			<thead>
				<tr>
					<th>이름</th>
					<th>나이</th>
					<th>직업</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${personList }" var="person" varStatus="vs">
					<tr>
						<td><input type="text" name="name" value="${person.name }" /></td>
						<td><input type="number" name="age" value="${person.age }" /></td>
						<td><input type="text" name="job" value="${person.job }" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="./form">사람정보입력</a>
	</div>
</body>
</html>