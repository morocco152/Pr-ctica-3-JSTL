<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.util.Date"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Primer Programa con jstl</title>
</head>
<body>
	Primera Practica con jstl <br>
	<%out.println("Hola"); %>
	<%
	Date d = new Date();
	out.println("Fecha Actual: "+d);
	%>
		<br>
	<form action="Servlet.java">
		<c:out value="${myperson.userid}"></c:out>
		<c:out value="${myperson.password}"></c:out>
	</form>
</body>
</html>