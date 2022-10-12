<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>${setClient.firstName}'sProfile</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">
	 <link href="../assets/css/signup.css" rel="stylesheet">

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
                <li><a href="/propertyList">Buy Homes</a></li>
                
            </ul>
        </nav>
    </div>



<body class="text-center">
	<div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
		

		<div class="container">
			<div class="card">
				<img src="assets/images/charlie.jpg" alt="Person" height="100px"
					width="100px" class="card__image"> <strong>Name</strong>
				<div class="card_name">${setClient.firstName}
					${setClient.lastName}</div>
				<strong>Email</strong>

				<div class="grid-child-posts">${setClient.email}</div>
				
			</div>
		</div>

		


		<footer class="mastfoot mt-auto">
			<div class="inner">
				<p>A David Tsacnaris Works</p>
			</div>
		</footer>
	</div>


</body>
</html>


