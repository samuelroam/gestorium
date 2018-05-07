<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/loginform.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
<title>Login form</title>
<script type="text/javascript">
$(document).ready(function(){
		
	//cambiar datos del formulario para registrarse
	$("#registro").click(function(){
		$(this).addClass("seleccionado");
		$("#inicio").removeClass("seleccionado");
		$("#form").attr("action", "../funciones/registro.jsp");
		$("#submit").attr("value", "Registrarse");
		$("#file").css("visibility", "visible");
	});
	
	//cambiar datos del formulario para Inicio de Sesión
	$("#inicio").click(function(){
		$(this).addClass("seleccionado");
		$("#registro").removeClass("seleccionado");
		$("#form").attr("action", "../action/iniciarSesion.jsp");
		$("#file").css("visibility", "hidden");
		$("#submit").attr("value", "IniciarSesion");
	});
		
}); 
</script>
</head>
<body>
<div id= "loginform">
	<div id="tipoForm">
	
		<div id= "inicio" class="tipoForm seleccionado">Iniciar sesión</div>
	
		<div id= "registro" class="tipoForm">Registrarse</div>	
		
									
	</div>
	
	<form action="../action/iniciarSesion.jsp" method="post" id="form">
	
	<input type="text" name="nombre" placeholder="Usuario"> <br>
	<input type="password" name="pass" placeholder="Contraseña"><br>
	<input type = "file" name="foto" value="subir archivo" id="file" style="visibility:hidden;"><br>
	<input type="submit" name="submit"  value ="Iniciar Sesión" id="submit">

</form>
	
	
	
</div>
</body>
</html>