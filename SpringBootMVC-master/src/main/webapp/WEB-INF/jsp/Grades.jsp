<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

    <head>
        <title>Grades</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/css/StudyBuddy.css"/>"/>
		<style>
			table,th,td {
				border:1px solid black;
			}
			header {
				width: 100%;
				height: 40px;
				background-color: #cccdd2;
			}
		</style>
    </head>
    
    <body>
		<header>
			<h1 class="header-1"> StudyBuddy - Grades</h1>
		</header
		
		<nav>
			<a href="/notes">See notes</a> | 
			<a href="/user">See user</a> | 
			<a href="/">Go back</a> 
		</nav>
		
		<section>
		
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
		</section>
		

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

    </body>
</html>