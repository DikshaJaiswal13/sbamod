<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/login.css">

</head>
<body background="../images/hd1.jpg">

	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">MentorOnDemand</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar" style="">
					<ul class="nav navbar-nav">
					
						<spring:url value="/mentorLogin" var="link1" htmlEscape="true" />
						<li class="active"><a href="${link1}">Login As Mentor</a></li>
						
						<spring:url value="/adminLogin" var="link2" htmlEscape="true" />
						<li><a href="${link2}">Login As Admin</a></li>
						
						<spring:url value="/userLogin" var="link3" htmlEscape="true" />
						<li><a href="${link3 }">Login As User</a></li>
						
					</ul>
					
					
				</div>
			</div>
		</nav>
	</div>
	<div class="container">
		<div class="col-sm-2"></div>
		<div class="row">
			<div class="col-sm-8">
				<div class="card card-signin my-5">
					<div class="card-body">
						<h5 class="card-title text-center">Login</h5>
						<hr>
						<form:form class="form-signin" action="/mentorLogin" modelAttribute="ml">
							<div class="form-label-group"></div>
							<form:input type="text" placeholder="Username"
								class="form-control input-lg" id="email" path="username"/> <br />
							<div class="form-label-group"></div>
							<form:input type="password" placeholder="Password"
								class="form-control input-lg" id="password" path="password"/> <br />
							<div style="text-align: center;">
							
							<%-- <spring:url value="/mentorDetails" var="link5" htmlEscape="true" />
								<a href="${link5 }" class="btn btn-lg btn-primary text-uppercase"
									type="submit" onclick=" relocate_home()">LogIn</a> --%>
									
									
									
									<input type="submit" class="btn btn-lg btn-primary text-uppercase"
													value="Login">
									
										<spring:url value="/mentorRegister" var="link4" htmlEscape="true" />
								<a href="${link4}" class="btn btn-lg btn-primary text-uppercase"
									type="submit">Sign Up</a>
								
							</div>
						</form:form>

					</div>
				</div>
			</div>
		</div>
		<div class="col-sm-2"></div>
	</div>

</body>
</html>