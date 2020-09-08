<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

<head>
<title>Login Form</title>

<style>
.error {
	color: red
}
</style>
</head>

<body>

	<form:form action="updateProcess" modelAttribute="user" method="POST">


		<label>First Name:</label>
		<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>

		<label>Last name</label>
		<form:input path="lastName" />
		<br>
		<br>

		<label>Country</label>
		<form:input path="country" />
		<br>
		<br>

		<label>Email</label>
		<form:input path="email" />
		<form:errors path="email" cssClass="error" />
		<br>
		<br>

		<label>Password</label>
		<form:password path="password" />
		<form:errors path="password" cssClass="error" />
		<form:errors path="conditionTrue" cssClass="error"/>
		<br>
		
		<label>Repeat password</label>
		<form:password path="rePassword" />
		<form:errors path="rePassword" cssClass="error" />
		<form:errors path="conditionTrue" cssClass="error"/>
		<br>
		<br>

		<input type="submit" value="Update" />
		<br>
		<br>



	</form:form>

	<c:url var="toWelcomePage" value="toWelcomePage">
		<c:param name="userId" value="${user.id}" />
	</c:url>



	<a href="${toWelcomePage}">Back</a>