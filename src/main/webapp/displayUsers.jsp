<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Detalie</title>
</head>
<body>
	<h1>
		Users Info
	</h1>
	
	<table>
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Email-Id</th>
	<th>Edit</th>
	</tr>
	<c:forEach var="user" items="${users}">
		<tr>
			<td>${user.getId()}</td>
			<td>${user.getName()}</td>
			<td>${user.getEmail()}</td>
			<td><a href="edit?id=${user.getId()}">Edit</a></td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>