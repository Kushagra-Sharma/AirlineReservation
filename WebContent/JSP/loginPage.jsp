<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="userLogin.obj" modelAttribute="userDetail">
<table>
	<tr>
	<td>Username</td>
	<td><form:input path="userName" placeholder="Enter username" size="30"/></td>
	</tr>
	
	<tr>
	<td>Password</td>
	<td><form:input path="password" placeholder="Enter password" size="30"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="Login" name="btnSubmit"></td>
	</tr>
</table>
</form:form>
</body>
</html>