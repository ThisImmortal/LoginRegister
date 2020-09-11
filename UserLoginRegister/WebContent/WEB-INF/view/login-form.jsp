<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>

<html>

<head>
<title>Login Form</title>

<style>
.error {
	color: red;
	font-size: 12px;
	
}
</style>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/Login.css" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/3.0.2/normalize.css" />
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
</head>

<body>

	<div class="login-wrapper">



		<form:form action="loginProcess" modelAttribute="login" method="GET">

			<h1>
				<span>User</span> login.
			</h1>

			<div class="input-row">
				<span class="icon"><i class="fa fa-at"></i></span>
				<form:input path="email" placeholder="Email" />
				<form:errors path="email" cssClass="error" />
			</div>




			<div class="input-row">
				<span class="icon"><i class="fa fa-lock"></i></span>
				<form:password path="password" placeholder="Password" />
				<form:errors path="password" cssClass="error" />
				<div class="error">${invaliduser}</div>
			</div>




			<div class="submit-row">

				<input type="submit" value="Log in&raquo;" /> <span class="reset">or
					<a href="showRegisterForm">Register</a>
				</span>

			</div>
			
			<br><br>
			
			<div class="submit-row">

				 <span class="reset">
					<a href="toForgotPasswordPage">Forgot Password?</a>
				</span>

			</div>
			







		</form:form>

	</div>

	

</body>
</html>