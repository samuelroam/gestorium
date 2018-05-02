
<%@page import="modelo.UsuarioModelo"%>
<%@page import="modelo.Usuario" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
</head>
<body>
<%
String nombre = request.getParameter("nombre"); 
String pass  = request.getParameter("pass"); 
UsuarioModelo usuarioModelo = new UsuarioModelo(); 
if(nombre != null && pass != null){
	Usuario usuario = new Usuario(); 
	usuario.setUser(nombre);
	usuario.setPassword(pass);
	usuarioModelo.insert(usuario); 
	response.sendRedirect("../log/loginForm.jsp"); 
	
}else{
	response.sendRedirect("../log/loginForm.jsp"); 
}
%>
</body>
</html>