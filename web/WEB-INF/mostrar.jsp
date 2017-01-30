<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado de peliculas</title>
</head>
<body>
	Tengo que recuperar la lista de las peliculas del director elegido
	<h1>Lista del director<%= %></h1>


	<form method="post" action="controlador">
		listado de las peliculas del director seleccionado
		<input type="submit" value="Otra consulta"/>
		<input type="submit" value="Finalizar"/>
	</form>
</body>
</html>