<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
	<head>
		<title>Notes</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
	</head>
	<body>
		<div class="header-container">
            <h2 class="header-1">StudyBuddy</h2>
            <p class="padding-lol"></p>
            <a class="navigation" href="/grades">See grades</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/user">See user</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/calendar">See calendar</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/">Go back</a> 
        </div>
		<div class="notes-container">
			<h1>Notes</h1>
			<sf:form method="POST" commandName="theNotes" action="/notes">
				<h2><sf:input path="title" type="text" placeholder="Enter title" size="100"/></h2>
				<p><sf:textarea path="notes" type="text" placeholder="Write your notes here" rows="10" cols="100"/></p>
				<input type="submit" value="Submit"/>
			</sf:form>
		</div>
		<div>
			<c:choose>
				<c:when test="${not empty theNotes}">
					<div class="insert-notes-container">
						<c:forEach var="notes" items="${manyNotes}">
							<section class="inserted-notes-container">
								<h2><a href="/notes/${notes.title}">${notes.title}</a></h2>
								<p>${notes.notes}</p>
							</section>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<h2>Nothing to show.</h2>
				</c:otherwise>
			</c:choose>
		</div>
	</body>
</html>
