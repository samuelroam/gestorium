<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="crearLibro.jsp">

<input type="text" name="titulo" placeholder="nombre del libro" onclick="this.value"/>
<br>
<input type="text" name="autor" placeholder="autor del libro" onclick="this.value"/>
<br>
<input type="text" name="fecha" placeholder="fecha" onclick="this.value"/>
<br>
<input type="submit" value="añadir"/>

</form>

</body>
</html>