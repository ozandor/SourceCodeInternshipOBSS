<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Contact</title>
</head>
<body>

	<form action="EditContactServlet" method="post">
		<h1>Welcome to Contact Edit Menu.</h1><br/>
		Enter contact name wanted to edit:<input name="name" type="text"><br/><br/>
		New name of the contact:<input name="nameN" type="text"><br/>
		New number of the contact:<input name="telN" type="text"><br/>
		<input type="submit" value="Edit Contact">
	</form>

</body>
</html>