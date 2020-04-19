<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Travel Registration</title>
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
	padding: 4px;
	font-size: 18px;
	font-family: Times New Roman;
}

.user {
	padding: 4px;
	font-size: 18px;
	font-family: Times New Roman;
}
</style>
</head>

	<body class="body">
		<div class="box">
			<h1>Travel- Booking</h1>
			<form:form action="/book" method="post" modelAttribute="travelbooking">
			<table id=travelbooking>
				<td>select user</td>
				<td><select name="userId">
						<c:forEach var="user" items="${user}">
							<option value="${user.userId }">${user.userName }</option>
						</c:forEach>
				</select>
				<tr>
					<td>from:</td>
					<td><form:input path="travelFrom" /></td>
				</tr>
				<tr>
					<td>to:</td>
					<td><form:input path="travelTo" /></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><form:input type="date" path="doj" /></td>
				</tr>
				<tr>
					<td>distance (KM)</td>
					<td><form:input path="distance" /></td>
				</tr>
				<tr>
					<td>price</td>
					<td><form:input path="price" /></td>
				</tr>
				<tr>
					<td>Food Preference:</td>
					<td><input type="radio">vegetarian<input type="radio">Non Vegetarian</td>
				</tr>

				<tr>
					<td>traveling with :</td>
					<td><input type="checkbox">visa<input
						type="checkbox">Passport
					</td>
				</tr>
			</table>
			<br/>
			<br/>
			<button type="submit" id="book" class="registerbtn">book</button>
		</form:form>
		</div>
	</body>
</html>