<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
	<form:form action="updateuser" modelAttribute="user">
	Id :<form:input path="id" readonly="true"/><br><br>
	Name: <form:input path="name" /><br><br>
	Email:<form:input path="email"/><br><br>
	Password:<form:input path="password"/><br><br>
	<form:button>Update</form:button>
	</form:form>
</body>
</html>