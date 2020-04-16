<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Book Portal HOME</title>
</head>
<body>
<p>Welcome to Book Portal HOME</p>
<h3>Please enter your username	 </h3>
<p>Time on server is ${serverTime} </p>

<form action="user" method="post">
<input type="text" name="userName"> <br>
<input type="submit" value="login	">

</form>
</body>
</html>