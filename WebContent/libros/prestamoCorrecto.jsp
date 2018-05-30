<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%
	Libro libro = (Libro) request.getAttribute("libro");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../includes/nav.html"%>

	<%
		String entregado = new String();
		if (libro.isEntregado() == true) {
			entregado = "prestado";
		} else {
			entregado = "devuelto";
		}
	%>

	<h1>Menú de prestamos</h1>
	<p>Su préstamo se ha realizado correctamente</p>
	<p>
		su libro,
		<mark><%=libro.getTitulo()%></mark>
		ha sido <b>
			<%
				out.println(entregado);
			%>
		</b> correctamente
	</p>
	<a href="libros/listarLibros.jsp">ir a lista</a>
	<a href="./index.jsp">ir a inicio</a>


</body>
</html>