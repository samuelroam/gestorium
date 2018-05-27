<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#emailo").click(function(){
        $("#emilio").fadeIn();
    });
    $("#email").mouseleave(function(){
    	$("#emilio").delay(800).fadeOut();
    })

    
});
</script>
</head>
<body>
<%@include file="../includes/nav.html" %>


<hr/>  
  
<h3>Login Form</h3>  
<%  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
out.print(login_msg);  
}  
 %>  
 <br/>  
<form action="loginprocess.jsp" method="post">  
<div id="email">Email:<input type="text" name="email" value="holamundo" placeholder="email"/><br/><br/></div>
<div id="emailo" style=";width:25px;height:25px;border:2px solid black;text-align:center;">?</div>
<div id="emilio" style="float:left;display:none;background-color:red;">email para iniciar sesion</div><br>
<div id="password">Password:<input type="password" value="mundo" name="password"/><br/><br/></div>
<input type="submit" value="login"/>
</form>

</body>
</html>