<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="modelo.*"%>
<%
	int id = Integer.parseInt(request.getParameter("id"));
	LibroModelo libroModelo = new LibroModelo();
	Libro libro = new Libro();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String fecha = request.getParameter("fecha");

		libro.setId(id);
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setFecha(fecha);
		libro.setEntregado(true);

		libroModelo.prestar(libro);

		response.sendRedirect("verLibro.jsp");
	%>

</body>
</html>