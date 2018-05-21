<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String titulo = request.getParameter("busqueda");
LibroModelo modeloLibro = new LibroModelo();
Libro libro = modeloLibro.selectPorTitulo(titulo);

out.println(titulo);

Libro librop = new Libro();
librop.getTitulo(titulo);
librop.getAutor(autor);
librop.getFecha(fecha);


if (libro != null ) {
	out.println(titulo);
} else {
	response.sendRedirect("fallo.html");
} 
%>
</body>
</html>