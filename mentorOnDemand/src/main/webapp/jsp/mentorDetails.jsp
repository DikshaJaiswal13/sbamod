<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mentor Details</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./css/mentorDetails.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.checked {
	color: orange;
}
</style>
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
						<!-- <li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Mentor <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li class="active"><a href="#">Your Profile</a></li>
								<li><a href="./courseRequest.html">Course Request</a></li>
								<li><a href="./ongoingCourses">Ongoing Courses</a></li>
							</ul></li> -->
						<li class="active"><a href="./mentorDetails.html">Profile</a></li>
						<li><a href="./courseRequest.html">Course Request</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Courses <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="./ongoingCourses.html">Ongoing Courses</a></li>
								<li><a href="./previousCourses.html">Training History</a></li>
								
							</ul></li>
						<!-- <li><a href="./ongoingCourses.html">Ongoing Courses</a></li> -->
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span>
								Sign Up</a></li> -->
						<li><a href="./mentorLogin.html"><span
								class="glyphicon glyphicon-log-in"></span> Logout</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>
	<div class="container">
		<div class="jumbotron">
			<h2>Welcome Rohan Dutta</h2>
		</div>
		<div class="col-sm-3 imgDetail">
			<div class="card">
				<img src="steve-jobs.jpg"
					style="max-width: 100%; max-height: 100%; object-fit: fill;">
			</div>
		</div>
		&nbsp;

		<div class="col-sm-9 details ">
			<div class="row d-flex align-items-center ">
				<div class="col-sm-6">
					<h3>Name :Rohan Dutta</h3>
					<h3>Username :rohandutta</h3>
					<h3>Amount in Wallet :5000</h3>
					<h3>Address :xyz</h3>

				</div>
				<div class="col-sm-6 ">
					<br />
					<h3>Email ID :abcd@gmail.com</h3>
					<h3>Mobile :987654321</h3>
					<h3>LinkedIn URL :5000</h3>
				</div>
			</div>
			<br>
			<div class="row">
				<div class="table-responsive">
				<h3>Skill Set:</h3>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Sl No.</th>
								<th>Skill Name</th>
								<th>Facilities</th>
								<th>Total Experience</th>
								<th>Rating</th>
								<th>Delete</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>Java</td>
								<td>Reading Material</td>
								<td>10</td>
								<td><span class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span class="fa fa-star"></span>
									<span class="fa fa-star"></span></td>
								<td><p data-placement="top" data-toggle="tooltip"
										title="Delete">
										<button class="btn btn-danger btn-xs" data-title="Delete"
											data-toggle="modal" data-target="#delete">
											<span class="glyphicon glyphicon-trash"></span>
										</button>
									</p></td>
							</tr>
							<tr>
								<td>2</td>
								<td>Spring Boot</td>
								<td>Reading Material</td>
								<td>17</td>
								<td><span class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span
									class="fa fa-star checked"></span> <span class="fa fa-star"></span></td>
								<td><p data-placement="top" data-toggle="tooltip"
										title="Delete">
										<button class="btn btn-danger btn-xs" data-title="Delete"
											data-toggle="modal" data-target="#delete">
											<span class="glyphicon glyphicon-trash"></span>
										</button>
									</p></td>
							</tr>
						</tbody>
					</table>
				</div>
				<div class="modal fade" id="delete" tabindex="-1" role="dialog"
					aria-labelledby="edit" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-hidden="true">
									<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
								</button>
								<h4 class="modal-title custom_align" id="Heading">Delete
									this entry</h4>
							</div>
							<div class="modal-body">

								<div class="alert alert-danger">
									<span class="glyphicon glyphicon-warning-sign"></span> Are you
									sure you want to delete this Record?
								</div>

							</div>
							<div class="modal-footer ">
								<button type="button" class="btn btn-success">
									<span class="glyphicon glyphicon-ok-sign"></span> Yes
								</button>
								<button type="button" class="btn btn-default"
									data-dismiss="modal">
									<span class="glyphicon glyphicon-remove"></span> No
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	


</body>
</html>