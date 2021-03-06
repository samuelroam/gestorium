<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%
	Libro libro = (Libro) request.getAttribute("Libro");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Informacion del libro</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<%@include file="../includes/nav.html" %>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Informacion del libro</h1>
				<table>
					<tr>
						<td>Titulo:</td>
						<td><%=libro.getTitulo()%></td>
					</tr>
					<tr>
						<td>Autor:</td>
						<td><%=libro.getAutor()%></td>
					</tr>
					<tr>
						<td>Prestamo:</td>
						<td><%=libro.isEntregado()%></td>
					</tr>
					<tr>
						<td>Prestamo:</td>
						<td><%=libro.getFechaPrestamo()%></td>
					</tr>
					<tr>
						<td>Prestamo:</td>
						<td><%=libro.getUsuario()%></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a class="btn btn-success" href="libros/listarLibros.jsp">Listar
					libros</a> <a class="btn btn-danger"
					href="PrestarLibro?id=<%=libro.getId()%>">Pedir prestamo de
					libro</a> <a class="btn btn-warning"
					href="DevolverLibro?id=<%=libro.getId()%>">Devolver prestamo de
					libro</a>
			</div>
		</div>

	</div>


</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</html>