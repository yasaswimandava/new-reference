<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Booking Portal</title>
<style type="text/css">
.box {
	width: 250px;
	border: 5px solid black;
	padding: 50px;
	margin: 50px;
	align-content: center;
}
.body{
 	position: relative;
    align: center;
   background-color:grey;
}
input{
   background-color: #99c2ff;
   width:150px;
   padding: 12px;
   font-size:18px;
   font-family:Times New Roman;
}
</style>
</head>
<center>
<body class="body">
	<div align="center" class="box">
		<h1>Travel Booking Portal</h1>
		<form action="/adduser" class="input">
			<input type="submit" value="User-Registration" />
		</form>
		<br>
		<br>
		<form action="/travelbooking">
			<input type="submit" value="Travel-Booking" />
		</form>
		<br>
		<br>
		<form action="/showdetails">
			<input type="submit" value="Booking Details" />
		</form>
	</div>
</body>
</html>