<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%--Esto es una directiva para utilizar la clase Date --%>
	<%@ page import="java.util.Date"  %>
	<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">

  <title>Registro </title>
  <script src="valid.js"></script>
</head>
<body>
    <h2>Registrarse</h2>
	<form action="servlet/LoginServlet" method="POST">
        <input type="text" name="cui" id="cui" placeholder="CUI"></br></br>
        <input type="password" name="clave" id="clave" placeholder="clave"></br></br>
        <input type="submit" name="btnAceptar" value="Aceptar">
    </form>
    <script>
	    function valid() {
	    var codigo, clave ;
	
	    codigo = document.getElementById("cui").value;
	    clave = document.getElementById("clave").value;
	
	
	    if(codigo === "" || codigo.lenght > 8)
	        {alert("ERROR");
	        return false;}
	
	    else if(clave === " ")
	        {alert(" ingrese clave");
	        return false;}
	    }
    </script>
</body>
</html>