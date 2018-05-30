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

	UsuarioModelo usuarioModelo = new UsuarioModelo();
	String nombre = request.getParameter("nombre");
	String contrasena = request.getParameter("password");
	String email = request.getParameter("email");

	Usuario usuario = new Usuario();
	usuario.setNombre(nombre);
	usuario.setContrasena(contrasena);
	usuario.setEmail(email);
	
	usuarioModelo.insertarUsuario(usuario);
	
	response.sendRedirect("autenticado.jsp");
	
	%>

</body>
</html>