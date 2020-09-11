<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>

<title></title>

<style>
.error {
	color: red;
	font-size: 12px;
}
</style>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/PasswordForgot.css" />



</head>

<body>

<form:form action="sendPasswordToEmail" modelAttribute="login" method="POST">

			

			<div id="sc-password">
			<h1>Password Restoration</h1>
			<div class="sc-container">
			
			
				<form:input path="email" placeholder="Email" />
				<form:errors path="email" cssClass="error" />
				<div class="error">${emailNotExistMessage}</div>
				
				<input type="submit" value="Send link to email&raquo;" />
				<br><br>
				<button onclick="location.href='${pageContext.request.contextPath}/user/toMainPage'" type="button" 
		class="registerbtn">Back</button>
			
			</div>
				
			</div>
			
			</form:form>



	


</body>

</html>