<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String userToGreet = (String) request.getAttribute("userToGreet");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TD3 - Hello <%= userToGreet %></title>
</head>
<body>
	<p>Hello <%= userToGreet %></p>
</body>
</html>
