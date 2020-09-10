<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Login Form</title>

<style>
.error {
	color: red;
	font-size:13px;
	display: block;
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

			<h1>
				<span>User</span> register.
			</h1>
			
			<form:input path="firstName" placeholder="First Name"/>
			<form:errors path="firstName" cssClass="error" />
			<br> <br> 
			<form:input path="lastName" placeholder="Last Name"/>
			<br> <br> 
			<form:input path="country" placeholder="Country" />
			<br> <br> 
			<form:input path="email" placeholder="Email"/>
			<form:errors path="email" cssClass="error" />
			<br> <br> 
			<form:password path="password" placeholder="Password"/>
			<form:errors path="password" cssClass="error" />
			<form:errors path="conditionTrue" cssClass="error" />
			<br> <br> 
			<form:password path="rePassword" placeholder="Password verifying"/>
			<form:errors path="rePassword" cssClass="error" />
			<form:errors path="conditionTrue" cssClass="error" />
			<br> <br>

			

		</div>

		<input type="submit" value="Register" class="registerbtn" />
		
		<button onclick="location.href='${pageContext.request.contextPath}/user/toMainPage'" type="button" 
		class="registerbtn">Back</button>
		
		
		
		
		

	</form:form>
	
	</div>

	