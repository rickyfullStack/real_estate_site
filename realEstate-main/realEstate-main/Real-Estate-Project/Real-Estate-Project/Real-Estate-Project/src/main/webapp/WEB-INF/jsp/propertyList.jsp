<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Property Detail Page</title>

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
<link href="assets/css/realEstateStyle.css" rel="stylesheet">

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
	<c:forEach var="var" items="${setProperty}">
		<hr>
		<h2>Property ${var.id }</h2>
		<h4>${var.street }</h4>
		<h4>${var.city }</h4>
		<h4>${var.state }</h4>
		<h4>${var.zip }</h4>
		<h4>${var.houseSize } sqft</h4>
		<h4>Full Price: $${var.salePrice }</h4>
		<h4>Discounted Price (if applicable): $${var.todaysPrice }</h4>
		<h4>${var.agent.firstName } ${var.agent.lastName }</h4>
		<h4>Phone: ${var.agent.agentPhoneNum }</h4>
		<h4>Email: ${var.agent.email }</h4>
		<c:if test="${ clientStuff != 'a'}">
			<form action="/clientPurchase"> 
				<input type="hidden" name="clientId" value="1">
				<input type="hidden" name="propertyId" value="${var.id }">
				<button type="submit" path="/clientProfile"class="btn btn-primary">Buy</button>
				
			</form>
		</c:if>
		
		
		<hr>
	</c:forEach>
	
	
</body>
</html>