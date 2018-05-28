<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="modelo.*" %>
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


<h1>La lista de usuarios con java</h1>
				<%
					for(Libro libro : libros){
						out.println(libro.getTitulo() + "<br>");
					}
				%>

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