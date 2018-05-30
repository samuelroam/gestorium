<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.ArrayList"%>

<%@page import="modelo.*"%>
<%@page import="servlets.*"%>

<%
	ArrayList<Usuario> usuarios = (ArrayList) request.getAttribute("usuarios");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="includes/nav.html" %>
	<div>
		<h1>La lista de usuarios con java</h1>
		<%
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("nombre de usuario");
			out.println("</td>");
			out.println("<td>");
			out.println("contraseña");
			out.println("</td>");
			for (Usuario usuario : usuarios) {

				out.println("<tr>");
				out.println("<td>");
				out.println(usuario.getNombre() + "<br>");
				out.println("</td>");
				out.println("<td>");
				out.println(usuario.getContrasena());
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		%>
	</div>


</body>
</html>