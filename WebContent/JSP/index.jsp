<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 	<%@ include file="bootstrap.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Airline Reservation</title>
<style>
	a {  
     text-align: center;
  }
</style>
</head>
<body>
<div class="jumbotron">
<div class="container">
	<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
				
					<h1 class="display-8">Welcome to Airline Reservation System</h1>
<%-- <form:form method="POST" action="userLogin.obj" modelAttribute="userDetail">
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
		<td><input type="submit" value="Login" name="btnSubmit"></td>
	</tr>
</table>
</form:form> --%>
<a href="login.obj" class="btn btn-lg btn-success center-block">Existing User</a><br><br>
<a href="createUser.obj" class="btn btn-lg btn-success center-block">Sign Up</a>
			</div>
		</div>
	</div>		
</div>
</body>
</html>