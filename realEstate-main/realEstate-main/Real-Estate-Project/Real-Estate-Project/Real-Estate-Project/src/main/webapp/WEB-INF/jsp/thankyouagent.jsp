<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 
<html>
<head>
<meta charset="utf-8">
<title>Agent Portal</title>
 
 <link href="../assets/css/signup.css" rel="stylesheet">
<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">
 
<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet">
 
 
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}
@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>
 
 <div class="hero">
        <nav>
            <h2>The Real<span> Estate Project</span></h2>
            <ul>
                <li><a href="/">Home</a></li>
                
            </ul>
        </nav>
    </div>
 
<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		
 <br>
 <br>
 <br>
 <br>
 <br>
 <br>
 <br><br>
		<main role="main" class="inner cover">
			<h1 class="cover-heading">Agent Profile.</h1>
			<p class="lead">Thank you ${newAgent.firstName}
				${newAgent.lastName}. Welcome back!</p>
			
			<p class="lead">
				<a href="/agentProfile" class="btn btn-lg btn-secondary">Profile</a>
			</p>
		</main>
 
		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>
					A David Tsacnaris Works
				</p>
			</div>
		</footer>
	</div>
 
 
</body>
 
</html>
 

