<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Searching Contact</title>
</head>
<body>
	<form action="SearchContactServlet" method="post">
		<h1>Welcome to Contact Search Menu.</h1><br/>
		Enter contact name to search:<input name="name" type="text"><br/>
		<input type="submit" value="Search Contact">
	</form>
	
	<br>${name} <br>${tel_number}
	
</body>
</html>