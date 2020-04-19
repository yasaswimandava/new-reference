<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Travel Booking</h1>
		<form:form action="/updatedetails" method="post" modelAttribute="travelbooking">
			<table>
				<tr>
					<td>User id:</td>
					<td><form:input path="userId" readonly="true"/></td>
				</tr>
				<tr>
					<td>From:</td>
					<td><form:input path="travelFrom" /></td>
				</tr>
				<tr>
					<td>To:</td>
					<td><form:input path="travelTo" /></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><form:input type="date" path="doj" /></td>
				</tr>
				<tr>
					<td>Distance (KM)</td>
					<td><form:input path="distance" /></td>
				</tr>
				<tr>
			</table>
			<br />
			<br />
			<button type="submit">update details</button>
			
		</form:form>
	</div>

</body>
</html>