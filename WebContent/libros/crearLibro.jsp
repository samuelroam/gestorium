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
LibroModelo libroModelo = new LibroModelo();
String titulo = request.getParameter("titulo");
String autor = request.getParameter("autor");
String fecha = request.getParameter("fecha");

Libro libro = new Libro();
libro.setTitulo(titulo);
libro.setAutor(autor);
libro.setFecha(fecha);

libroModelo.insertarLibro(libro);

response.sendRedirect("listarLibros.jsp");
%>

</body>
</html>