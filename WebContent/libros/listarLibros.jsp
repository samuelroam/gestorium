<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="modelo.*"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Iterator"%>
<%
	LibroModelo libroModelo = new LibroModelo();
	ArrayList<Libro> libros = libroModelo.selectAll();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de libros</title>
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
				<h1>Listado de Libros</h1>
			</div>
			<div class="col">
				<a class="btn btn-primary" href="anadirLibro.jsp">Añadir libro</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th>Titulo</th>
							<th>Autor</th>
							<th>Fecha</th>
						</tr>
					</thead>
					<tbody>

						<%
							Iterator<Libro> i = libros.iterator();
							Libro libro;
							LibroModelo modeloLibro = new LibroModelo();

							while (i.hasNext()) {
								libro = i.next();
								String clase;
								if (libroModelo.estaDisponible(libro)) {
									clase = "table-danger";
									//out.print("<tr class='table-success'>");
								} else {
									clase = "table-success";
									//out.print("<tr class='table-danger'>");
								}
						%>
						<tr class="<%=clase%>">
							<td><%=libro.getTitulo()%></td>
							<td><%=libro.getAutor()%></td>
							<td><%=libro.getFecha()%></td>
							<td>
								<%
									if (libro.isEntregado() == true) {
											out.println("no está disponible");
										} else {
											out.println("está disponible");
										}
								%>
							
							<td><a class="btn btn-info"
								href="../VerLibro?id=<%=libro.getId()%>">ver</a></td>
						</tr>
						<%
							} //fin while
						%>

					</tbody>
				</table>
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