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
        <div class="start-screen-container">
            <h1>Welcome back!</h1>
            <section class="button-container">
                <div class="button-1-2">
                    <form action="/grades">
                        <input type="submit" value="See grade progress">
                    </form>
                    <form action="/calendar">
                        <input type="submit" value="See calendar">
                    </form>
                </div>
                <div class="button-3-4">
                    <form action="/notes">
                        <input type="submit" value="See notes">
                    </form>
                    <form action="/user">
                        <input type="submit" value="See user">
                    </form>
                </div>
            </section>
        </div>
        <section class="button-container">
            <div class="button-1-2">
                <form action="/">
                    <input type="submit" value="Log Out">
                </form>
            </div>
        </section>
    </body>
</html>
