<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="modelo.RegisterDao" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useModelo id="obj" class="modelo.User"/>
    <<jsp:setProperty property="*" name="obj"/>

<%
int status=RegisterDao.register(obj);
if(status>0)
	out.print("You are successfully registered");
%>

</body>
</html>