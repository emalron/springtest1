<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<html>
<head>
	<meta charset="utf-8">
	<title>상단부</title>
</head>
<body>
<table border="0" width="100%">
	<tr>
		<td>
			<a href="${contextPath }/main.do">
				<img src="${contextPath }/resources/image/duke_swing.gif" />
			</a>
		</td>
		<td>
			<h1>스프링 실습 홈페이지!</h1>
		</td>
		<td>
			<a href="#">로그인</a>
		</td>
	</tr>
</table>
</body>
</html>
