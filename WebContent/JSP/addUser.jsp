<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ include file="bootstrap.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
<div class="container">
	<form:form method="POST" action="addUser.obj" modelAttribute="userDetail">
<table>
	<tr>
	<td>Username</td>
	<td><form:input path="userName" size="30"/></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><form:input path="password" size="30"/></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="Sign Up" name="btnSubmit"></td>
	</tr>
</table>
</form:form>
</div>
</body>
</html>