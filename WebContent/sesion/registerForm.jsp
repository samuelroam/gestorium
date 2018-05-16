<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

<form action="register.jsp">

<input type="text" name="nombre" value="nombre" onclick="this.value"/>
<br>
<input type="text" name="email" value="email" onclick="this.value"/>
<br>
<input type="password" name="password" value="contrasena" onclick="this.value"/>
<br>
<input type="submit" value="register"/>

</form>



<%
	/*  */
%>


<a href="loginForm.jsp">login</a>|  
<a href="logout.jsp">logout</a>|  
<a href="profile.jsp">profile</a>

</body>
</html>