<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating Contact</title>
</head>
<body>
	<form action="CreateContactServlet" method="post">
		<h1>Welcome to Contact Creation Menu.</h1><br/>
		Enter contact name and surname:<input name="name" type="text"><br/>
		Enter contact telephone number:<input name="tel_number" type="text"><br/>
		<input type="submit" value="Add Contact">
	</form>
</body>
</html>