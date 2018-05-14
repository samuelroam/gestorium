<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

<form action="process.jsp">

<input type="text" name="username" value="name..." onclick="this.value"/>
<br>
<input type="text" name="uemail" value="email id.." onclick="this.value"/>
<br>
<input type="password" name="upass" value="password" onclick="this.value"/>
<br>
<input type="submit" value="register"/>

</form>


<a href="login.jsp">login</a>|  
<a href="logout.jsp">logout</a>|  
<a href="profile.jsp">profile</a>

</body>
</html>