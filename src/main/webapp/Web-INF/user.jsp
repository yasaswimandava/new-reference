<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
<style type="text/css">
.box {
	width: 300px;
	border: 8px solid black;
	padding: 100px;
	margin: 50px;
	align-content: center;
}
 
.body {
	align: center;
	background-color: #99c2ff;
}

input {
	width: 150px;
	padding: 8px;
	font-size: 18px;
	font-family: Times New Roman;
}
</style>
</head>
<center>
	<body class="body">
		<div class="box">
			<h1>User-Registration</h1>
			<form action="/saveuser" method="post" modelattribute="user">
				USER NAME:<br> <input type="text" name="userName" id="userName"
					placeholder="User Name" required="required"><br> <br>AGE:<br>
				<input type="number" required name="age" placeholder="Age"><br>
				<br>
				<input style="background-color: #FF00FF" type="submit"
					onclick="validate()" value="save">
			</form>
			
		</div>
		

	</body>
</html>