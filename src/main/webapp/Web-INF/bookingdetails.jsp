<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Booking details</title>
</head>
<body>
	<div align="center">
		<h1>travel booking details</h1>
		<form:form action="/getdetails" modelAttribute="date" method="post">
			<th>User:</th>
			<br>
			<td><form:select path="user" items="${userlist}" /></td>
			<br>
			<label>From:</label>
			<br>
			<form:input path="travelFrom" />
			<br>
			<a><button type="submit">get Bookings</button></a>
			</form:form>
			<table border="1" cellpadding="10">
				<tr>
					<th>User id</th>
					<th>from</th>
					<th>to</th>
					<th>price</th> 
					<th>actions
				</tr>
				<c:forEach var="tr" items="${travellist}">
					<tr>
						<td>${tr.userId }</td>
						<td>${tr.travelFrom }</td>
						<td>${tr.travelTo }</td>
						<td>${tr.price }</td>
						<!-- <th><a href="update?id=${tr.userid}">update</a></th> -->
						
						<th><a href="/update/<c:out value="${tr.userId }" />"><input
								type="button" value="update" /></a> </th>
					</tr>
				</c:forEach>
			</table>
		
		</div>
</body>
</html>