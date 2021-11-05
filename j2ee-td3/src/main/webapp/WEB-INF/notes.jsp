<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Notes</title>
</head>
<body>
<div>
Liste des notes :
</div>
	<ul>
	<% 
	List<String> notes = (List<String>) request.getAttribute("notes");
	for(String note : notes){%>
		<li><%= note %></li>
	<%}%>
	</ul>
	<%if(notes.size() == 0){%>
		<li>Aucune note</li>
	<%}	%>
	<form method="POST" action="<%= request.getContextPath() %>/note/add" style="margin-top:1em;">
		<input type="text" required name="note" autofocus placeholder="Ajouter une note..." />
		<button>Ajouter</button>
	</form>
	<div style="margin-top:2em;">
		<form method="GET" action="<%= request.getContextPath() %>/notes">
			<input type="hidden" name="delete" value="true"/>
			<button>Supprimer la liste</button>
		</form>
	</div>
</body>
</html>