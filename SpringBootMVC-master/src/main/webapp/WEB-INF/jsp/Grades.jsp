<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

    <head>
      <title>Grades</title>
		  <link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
    </head>
    <body>
		  <div class="header-container">
            <h2 class="header-1">StudyBuddy</h2>
            <p class="padding-lol"></p>
            <a class="navigation" href="/notes">See notes</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/user">See user</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/calendar">See calendar</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/">Go back</a> 
        </div>
        <div class="grades-container">
            <h1>Grades</h1>
            <sf:form method="POST" commandName="grades" action="/grades">

                <table>
                   <tr>
                      <td> Subject:</td>
                        <td><sf:input path="subject" type="text" placeholder="Enter your subject"/></td>
                   </tr>
                   <tr>
                       <td>Project number:</td>
                       <td><sf:textarea path="projectnum" type="text" placeholder=""/></td>
                   </tr>
                   <tr>
                       <td>Grade:</td>
                       <td><sf:input path="grade" type="text" placeholder="Enter your grade"/></td>
                   </tr>
                </table>
                
                 <input type="submit" VALUE="Submit"/>
             </sf:form>
        </div>
    <section>    
    <div class="inserted-grades-container">
        <c:choose>
            <c:when test="${not empty grades}">
     
                <table>
                    	<tr>
                    		<td>Subject</td>
                    		<td>Project Number</td>
                    		<td>Grade</td>
                    	</tr>

                    <c:forEach var="grades" items="${manyGrades}">

                        <tr>
                            <%--We can reference attributes of the Entity by just entering the name we gave--%>
                            <%--it in the singular item var, and then just a dot followed by the attribute name--%>

                            <%--Create a link based on the name attribute value--%>
                            <td><a href="/grades/${grades.subject}">${grades.subject}</a></td>
                            <%--The String in the note attribute--%>
                            <td>${grades.projectnum}</td>
                            <td>${grades.grade}</td>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>

            <%--If all tests are false, then do this--%>
            <c:otherwise>
                <h3>No grades!</h3>
            </c:otherwise>
        </c:choose>
    </div>
	</section>
    </body>
</html>