<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Login Form</title>

<style>
.error {
	color: red
}
</style>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/RegisterCss.css" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/3.0.2/normalize.css" />
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
</head>

<body>

<div class="register-wrapper">

	<form:form action="registerProcess" modelAttribute="user" method="POST">

		<div class="container">

			<hr>
			<label>First Name:</label>
			<form:input path="firstName" />
			<form:errors path="firstName" cssClass="error" />
			<br> <br> <label>Last name</label>
			<form:input path="lastName" />
			<br> <br> <label>Country</label>
			<form:input path="country" />
			<br> <br> <label>Email</label>
			<form:input path="email" />
			<form:errors path="email" cssClass="error" />
			<br> <br> <label>Password</label>
			<form:password path="password" />
			<form:errors path="password" cssClass="error" />
			<form:errors path="conditionTrue" cssClass="error" />
			<br> <br> <label>Repeat password</label>
			<form:password path="rePassword" />
			<form:errors path="rePassword" cssClass="error" />
			<form:errors path="conditionTrue" cssClass="error" />
			<br> <br>

			<hr>

		</div>

		<input type="submit" value="Register" class="registerbtn" />
		<br>
		<br>

	</form:form>
	
	</div>

	<a href="${pageContext.request.contextPath}/user/toMainPage">Back</a>