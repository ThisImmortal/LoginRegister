<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>
<title>Succesfully, Logged in!</title>
</head>

<body>

	<h1>Welcome, ${user.firstName} ${user.lastName}</h1>
	<h2>Your info:</h2>

	
	<br>
	<br> First Name: ${user.firstName}
	<br>
	<br> Last Name: ${user.lastName}
	<br>
	<br> Country: ${user.country}
	<br>
	<br> Email: ${user.email}
	<br>
	<br> Password: ${user.password}
	<br>
	<br>


<c:url var="updateLink" value="showUpdateInfo">
		<c:param name="userId" value="${user.id}" />
	</c:url>
	





	<a href="${updateLink}">Update your info</a>
	<br><br>
	<a href="${pageContext.request.contextPath}/user/backToTutorialPage">Back to main page</a>
	<br><br>
	<a href="${pageContext.request.contextPath}/user/toMainPage">Log out</a>
	
</body>
</html>