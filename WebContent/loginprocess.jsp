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

UsuarioModelo modeloUsuario = new UsuarioModelo();
Usuario usuario = modeloUsuario.comprobarLogin(email);



if(status){  
out.println("You r successfully logged in");  
session.setAttribute("session","TRUE");  
}  
else  
{  
out.print("Sorry, email or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>

</body>
</html>