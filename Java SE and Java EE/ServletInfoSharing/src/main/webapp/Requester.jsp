<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Directing Request</title>
</head>
<body>
<h1>Directing Request to origin servlet...</h1>
	<form action="OriginServlet" method="post">
	Data 1 : <input type="text" name="d1"><br>
	Data 2 : <input type="text" name="d2"><br>
	<input type="submit" value="Send Data">
	</form>
	

</body>
</html>