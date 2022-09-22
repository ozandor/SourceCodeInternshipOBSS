<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Param JSP tests.</title>
</head>
<body>
<h1>String:</h1>
<form action="paramServlet.java" method="GET">
<%request.getParameter("String"); %>
A: <input type="text" name="String">
</form>



</body>
</html>