<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.*" %>
    <%@page import="servlets.*" %>
        <%@ page import="java.util.ArrayList" %>
    <%@ page import="java.util.Iterator" %>
    
    <%
    %>
    <%ArrayList<Libro> libros = (ArrayList)request.getAttribute("libros"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Resultados de busqueda:</h1>
<table>
<tr><th>Titulo</th><th>Autor</th><th>Fecha</th></tr>
<%
	for(Libro libro : libros){
		out.println("<tr>");
		out.println("<td>"+libro.getTitulo()+"</td>");
		out.println("<td>"+libro.getAutor()+"</td>");
		out.println("<td>"+libro.getFecha()+"</td>");
		out.println("<td>");
		%>
		<a href="VerLibro?id=<%=libro.getId()%>">ver</a>
		<%
		out.println("</td></tr>");
					}
				%>
				
</table>
<%-- <%
			Iterator<Libro> i = libros.iterator();
			Libro libro;
			LibroModelo  modeloLibro = new LibroModelo();
			
			while(i.hasNext()){
				libro = i.next();
				%>
				<tr>
					<td>
						<%=libro.getTitulo()%>
					</td>
					<td>
						<%=libro.getAutor()%>
					</td>
					<td>
						<%=libro.getFecha() %>
					</td>
					<td>
						<a class="btn btn-info" href="../VerLibro?id=<%=libro.getId()%>">ver</a>
					</td>
				</tr>
				<%
			}//fin while
			%> --%>
</body>
</html>