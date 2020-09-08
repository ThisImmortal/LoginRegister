<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>

<html>

<head>
<title>Login Form</title>

<style>.error{color: red;}</style>
</head>

<body>

	<form:form action="loginProcess" modelAttribute="login" method="GET">

		<label>Email:</label>
		<form:input path="email" /> 
		<form:errors path="email" cssClass="error"/>
		

		<br>
		<br>

		<label>Password</label>
		<form:password path="password" />
		<form:errors path="password" cssClass="error"/>
		<br><br>
		${invaliduser}
		

		<br>
		<br>

		<input type="submit" value="Log in" />
		<br>
		<br>





	</form:form>
	
	<a href="${pageContext.request.contextPath}/user/toMainPage">Back</a>

</body>
</html>