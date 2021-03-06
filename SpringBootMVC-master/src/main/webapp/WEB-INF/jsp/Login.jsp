<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
	<head>
		<title>StudyBuddy</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
	</head>
	<body>
		<div class="header-container">
            <h2 class="header-1">StudyBuddy</h2>
        </div>
		<div>
			<form action="index" onSubmit="return login();" method="post">
				<div class="login-container">
					<div class="prettify-login-container">
						<label>Username:</label>
						<input type="text" placeholder="Enter username" name="username" id="username" required>
						<label>Password:</label>
						<input type="password" placeholder="Enter password" name="password" id="password" required>
						<br>
					</div>
					<input type="submit" value="Login" id="submit" onclick="login()">
				</div>
			</form>
		</div>
		<script src=<c:url value="/js/Login.js"/>></script>
	</body>
</html>