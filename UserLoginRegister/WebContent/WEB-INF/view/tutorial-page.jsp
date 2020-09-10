<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>

<head>

  <title></title>
  
  <link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/tutorialPage.css" />
</head>

<body>

 <div class="navbar">
 
 <c:url var="tomyinfo" value="toWelcomePage">
		<c:param name="userId" value="${user.id}" />
	</c:url>
 
  <a href="${tomyinfo}">My info</a>
  <a href="#news">News</a>
  <div class="dropdown">
    <button class="dropbtn">CV Templates
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <div class="header">
        <h2>Mega Menu</h2>
      </div>
      <div class="row">
        <div class="column">
          <h3>First Template</h3>
          <img alt="" height="550px" width="400px" src="${pageContext.request.contextPath}/resources/img/resume1.jpg" >
          <br><br>
          <a href="#">Use this template</a>
          
        </div>
        <div class="column">
          <h3>Second Template</h3>
          <img alt="" height="550px" width="400px" src="${pageContext.request.contextPath}/resources/img/resume2.jpg" >
          <br><br>
          <a href="#">Use this template</a>
          
        </div>
        <div class="column">
          <h3>Third Template</h3>
          <img alt="" height="550px" width="400px" src="${pageContext.request.contextPath}/resources/img/resume3.jpg" >
          <br><br>
          <a href="#">Use this template</a>
         
        </div>
      </div>
    </div>
  </div>
</div> 


</body>


</html>