<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trainee Application</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}
tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
welcome ${user.username}
<br>
<a href="LogoutController.do">logout</a>
<table>
	<thead>
		<tr>
			<th>id</th>
			<th>trainee_id</th>
			<th>trainee_name</th>
			<th>branch</th>
			<th>percentage</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${trainees}" var="trainee">
			<tr>
				<td>${trainee.id}</td>
				<td>${trainee.trainee_id}</td>
				<td>${trainee.trainee_name}</td>
				<td>${trainee.branch}</td>
				<td>${trainee.percentage}</td>
			</tr>
		</c:forEach>
		
	</tbody>
</table>

<br>
<a href="traineeController.do?action=add">add new employee</a>
</body>
</html>

