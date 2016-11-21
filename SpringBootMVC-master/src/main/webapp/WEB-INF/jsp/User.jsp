<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

	<head>
		<title>User Information</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
	</head>
	<body>
		<div class="header-container">
            <h2 class="header-1">StudyBuddy</h1>
        </div>
        <div class="user-container">
			<h1>User Information</h1>
		</div>
		<section class="user-and-image-container">
			<div class="image-container">
				<p> ** Image ** </p>
			</diV>
			<div class="user-info-container">
				<p class="user-info-1">Name: </p>
				<p class="user-info-2"> ${fname} ${lname}</p>
				<p class="user-info-1">Email: </p>
				<p class="user-info-2">${email}</p>
				<p class="user-info-1">Current course: </p>
				<p class="user-info-2">${course}</p>
			</div>
		</section>
		<section class="button-container">
			<div class="button-1-2">
				<form action="/">
                    <input type="submit" value="Go back">
                </form>
            </div>
        </section>
    </body>

</html>