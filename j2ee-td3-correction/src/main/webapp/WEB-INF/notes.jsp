<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
List<String> notes = (List<String>) request.getAttribute("notes");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TD3 - Notes</title>
</head>
<body>
	<section>
		<h2>Notes</h2>
		<%
		if (notes != null) { 
			for (String note : notes) { %>
			<p><%= note %></p>
		<%
			}
		} 
		%>
	</section>
	<hr>
	<section>
		<h2>Ajouter une note</h2>
		<form action="notes/add" method="get">
			<textarea name="note"></textarea>
			<input type="submit" />
		</form>
	</section>
</body>
</html>
