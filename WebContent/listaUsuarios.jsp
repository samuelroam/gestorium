<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.ArrayList" %>
    
    <%@page import="modelo.*" %>
    <%@page import="servlets.*" %>
    
    <%ArrayList<Usuario> usuarios = (ArrayList)request.getAttribute("usuarios"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
				<h1>La lista de usuarios con java</h1>
				<%
					for(Usuario usuario : usuarios){
						out.println(usuario.getNombre() + "<br>");
					}
				%>
			</div>
			<div>
			<hr>
				<h1>La lista de usuarios con jslt</h1>
				
				<c:forEach items="${usuarios}" var="usuario">
					${usuario.nombre} <br>
				</c:forEach>
			</div>

</body>
</html>