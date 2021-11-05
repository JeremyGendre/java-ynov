<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Fichiers</title>
</head>
<body>
	<form method="POST" action="<%= request.getContextPath() %>/file/add" enctype="multipart/form-data">
		<input type="file" required name="new-file" autofocus placeholder="Ajouter un fichier" />
		<button>Ajouter</button>
	</form>
</body>
</html>