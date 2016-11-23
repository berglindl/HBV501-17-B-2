<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
	<head>
		<title>StudyBuddy</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
	</head>
	<body>
			<h2 class="header-1">StudyBuddy</h2>
		<div>
			<form action="index" onSubmit="return login();" method="post">
				<div class="login-container">
					<div class="prettify-login-container">
						<label class="user-and-password">Username:</label>
						<input type="text" placeholder="Enter username" name="username" id="username" required>
						<label class="user-and-password">Password:</label>
						<input type="password" placeholder="Enter password" name="password" id="password" required>
						<input type="checkbox" checked="checked">Remember me
						<br>
						<br>
  						</div>
						<input type="submit" value="Login" id="submit" onclick="login()">
					</div>
				</div>
			</form>
		</div>
		<script src=<c:url value="/js/Login.js"/>></script>
</body>

</html>
