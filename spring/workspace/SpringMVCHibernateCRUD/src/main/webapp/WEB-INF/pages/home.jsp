<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>

		<table border="1">

			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Telephone</th>
			<th>Action</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.name}</td>
					<td>${employee.email}</td>
					<td>${employee.address}</td>
					<td>${employee.telephone}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="deleteEmployee?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<h4>
			New Employee Register <a href="newEmployee">here</a>
		</h4>
	</div>
</body>
</html>