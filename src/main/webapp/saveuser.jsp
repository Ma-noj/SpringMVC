<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <html>
    <head>
    <title>Register</title>
    </head>
    <body>
    <form:form action="saveuser" modelAttribute="user">
    Name     : <form:input path="name"/><br><br>
    Email    : <form:input path="email"/><br><br>
    Password : <form:input path="password"/><br><br>
    <form:button>Register</form:button>
    </form:form>
    </body>
    </html>