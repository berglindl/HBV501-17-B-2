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
            <h2 class="header-1">StudyBuddy</h2>
            <p class="padding-lol"></p>
            <a class="navigation" href="/notes">See notes</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/grades">See grades</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/calendar">See calendar</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/index">Go back</a> 
        </div>
        <div class="user-container">
			<h1>User Information</h1>
		</div>
		<section class="user-and-image-container">
			<div class="user-info-container">
				<p class="user-info-1">Name: </p>
				<p class="user-info-2"> ${fname} ${lname}</p>
				<p class="user-info-1">Email: </p>
				<p class="user-info-2">${email}</p>
				<p class="user-info-1">Current course: </p>
				<p class="user-info-2">${course}</p>
			</div>
		</section>
    </body>
</html>