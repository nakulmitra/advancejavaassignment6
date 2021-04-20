<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
header {
	background-color: #81d4fa;
	border-top-style: solid;
	border-bottom-style: solid;
	border-width: 2px;
	height: 30px;
}

.form1 {
	background-color: #0091ea;
	width: 400px;
	font-size: 20px;
	margin: auto;
	margin-top: 100px;
	text-indent: 1em;
}

p {
	text-indent: 2em;
}

.login {
	display: inline-block;
	border-bottom-color: blue;
	padding-right: 20px;
	position: relative;
	bottom: -4px;
	right: -310px;
}

footer {
	position: relative;
	bottom: -10px;
	background-color: #81d4fa;
	border-top-style: solid;
	border-bottom-style: solid;
	border-width: 1px;
	height: 30px;
}
</style>
</head>
<body style="background-color: #69f0ae;">


	<form class="form1" action="login" method="post">
		<header> Login</header>
		<pre>
Username   * <input type="text" name="userid" required><br>  
  Password   * <input type="password" name="pass" required>
  
</pre>
		<footer>
			<input type="submit" class="login" value="Login">
		</footer>
	</form>

</body>
</html>