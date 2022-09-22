<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Static Include:<br>
<!-- Static kodu ve yazilari oldugu gibi alir ve koda koyar. -->
<%@include file="header.jsp" %><br>
Dynamic Include:<br>
<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>