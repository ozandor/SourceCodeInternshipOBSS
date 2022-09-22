<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Give the amount of the money.</title>
</head>
<body>

<h2>Give the amount of the money:</h2>
	
	<form action="ATMServlet" method="post">
		<%request.getParameter("money"); %>
		<input type="text" name="money">
		<input type="submit">

	</form>

</body>
</html>