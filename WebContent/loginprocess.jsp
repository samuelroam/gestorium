<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="modelo.UsuarioModelo"%>  
	<%@page import="modelo.Usuario"%> 
	
	<%
	// recibir parametros que envia el login, email y password
	
	// comprobar si hay en la base de datos comprobarLogin
	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  
   
  
<%  

String email = request.getParameter("email");
String password = request.getParameter("password");
/* out.println(email + password); */
UsuarioModelo modeloUsuario = new UsuarioModelo();
Usuario usuario = modeloUsuario.comprobarLogin(email);

if (usuario != null && password.equals(usuario.getContrasena())) {
	session.setAttribute("usuario", usuario);
	response.sendRedirect("autenticado.html");
} else {
	response.sendRedirect("fallo.html");
} 



%>

</body>
</html>