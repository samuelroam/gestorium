
<%@page import="modelo.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/loginform.css">

<title>Formulario registro</title>
</head>
<body>
<form action ="registro.jsp" method="post">
	<input type ="text" name= "nombre" placeholder="Nombre de usuario"><br>
	<input type ="password" name="pass" placeholder="Constraseña"><br>
	<input type ="submit"  name="enviar" value="Enviar"><br>
</form>
</body>

</html>