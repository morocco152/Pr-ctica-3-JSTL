<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear</title>
</head>
<body>
	<h1>Crear producto</h1>
	<form action="productos" method="post">
	<input type="hidden" name="opcion" value="guardar">
		<table>
			<tr>
				<td>Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			
			<tr>
				<td>Cantidad:</td>
				<td><input type="text" name="cantidad"></td>
			</tr>
			
			<tr>
				<td>Precio:</td>
				<td><input type="text" name="precio"></td>
			</tr>
		</table>
		<input type="submit" value="Guardar">
	</form>
</body>
</html>