<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>

<br>
<a href=PageHome.jsp style="color:black;text-decoration:none ;font-size:35px;fontweight:bold;">AirLines</a>
<br><br>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px"
align="center">
<form action=ForgotPassword method=post>
<label for=email>Email :-</label> <input type="email" name=email id=email
/><br><br>
<label for=pass>New Password :-</label> <input type="password"
name=password id=pass /><br><br>
<input type=submit value=submit /> <input type=reset />
</form>
</div>


</body>
</html>