<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>The Best Real Estate Project</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="../assets/css/signup.css" rel="stylesheet">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet">

<div class="hero">
	<nav>
		<h2>
			The Real<span> Estate Project</span>
		</h2>
		<ul>
			<li><a href="/">Home</a></li>
			<li><a href="/clientLogin">Client Login</a></li>
			<li><a href="/agentLogin">Agent Login</a></li>

		</ul>
	</nav>
</div>
</head>

<body>
	<div class="container">
		<div class="title">Client Registration</div>
		<div class="content">
			<form:form modelAttribute="client" action="/signup" method="post">
				<div class="user-details">
					<div class="input-box">
						<span class="details">First Name</span>
						<form:input path="firstName" type="text" class="form-control"
							id="inputFirstName" />
					</div>
					<div class="input-box">
						<span class="details">Last Name</span>
						<form:input path="lastName" type="text" class="form-control"
							id="inputLastName" />
					</div>
					
					<div class="input-box">
						<span class="details">Email</span>
						<form:input path="email" type="text" class="form-control"
							id="inputEmail4" />
					</div>
					
					
					
					
					<div class="input-box">
						<span class="details">Password</span>
						<form:input path="password" type="password" class="form-control"
							id="inputPassword4" />
					</div>
				</div>
				<br>
				<button type="submit" class="btn btn-primary">Sign Up</button>
			</form:form>

			<footer class="mastfoot mt-auto">
				<div class="inner">
					<p>A Claim Academy Product</p>
				</div>
			</footer>
		</div>
</body>
</html>

