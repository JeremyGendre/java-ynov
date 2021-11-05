<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String[] files = (String[]) request.getAttribute("files");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TD3 - Gestion de fichiers</title>
</head>
<body>
	<section>
		<h2>Fichiers à télécharger</h2>
		<ul>
		<%
		if (files != null) { 
			for (String file : files) { %>
			<li><a href="<%= request.getContextPath() %>/files/get?fileName=<%= URLEncoder.encode(file, "UTF-8") %>" target="_blank"><%= file %></a></li>
		<%
			}
		} 
		%>
		</ul>
	</section>
	<hr>
	<section>
		<h2>Ajouter un fichier</h2>
		<form action="add" method="post" enctype="multipart/form-data">
			<input type="file" name="file" />
			<input type="submit" />
		</form>
	</section>
</body>
</html>
