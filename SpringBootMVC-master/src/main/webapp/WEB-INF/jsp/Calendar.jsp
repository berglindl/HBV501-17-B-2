<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
    <head>
        <title>Calendar</title>
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
            <a class="navigation" href="/user">See user</a> 
            <p class="navigation">|</p> 
            <a class="navigation" href="/index">Go back</a> 
        </div>
        <div class="calendar-container">
            <div class="month">
                <ul>
                    <li class="prev-month"><-</li>
                    <li class="next-month">-></li>
                    <li class="now-month">NOVEMBER</li>
                    <li class="this-year">2016</li>
                </ul>
            </div>
            <ul class="weekdays">
                <li>Monday</li>
                <li>Tuesday</li>
                <li>Wednesday</li>
                <li>Thursday</li>
                <li>Friday</li>
                <li>Saturday</li>
                <li>Sunday</li>
            </ul>
            <ul class="days">
                <li class="not-this-month">31</li>
                <li class="this-month">1</li>
                <li class="this-month">2</li>
                <li class="this-month">3</li>
                <li class="this-month">4</li>
                <li class="this-month">5</li>
                <li class="this-month">6</li>
                <li class="this-month">7</li>
                <li class="this-month">8</li>
                <li class="this-month">9</li>
                <li class="this-month">10</li>
                <li class="this-month">11</li>
                <li class="this-month">12</li>
                <li class="this-month">13</li>
                <li class="this-month">14</li>
                <li class="this-month">15</li>
                <li class="this-month">16</li>
                <li class="this-month">17</li>
                <li class="this-month">18</li>
                <li class="this-month">19</li>
                <li class="this-month">20</li>
                <li class="this-month">21</li>
                <li class="this-month">22</li>
                <li class="this-month">23</li>
                <li class="this-month">24</li>
                <li class="this-month">25</li>
                <li class="this-month">26</li>
                <li class="this-month">27</li>
                <li class="this-month">28</li>
                <li class="this-month">29</li>
                <li class="this-month">30</li>
                <li class="not-this-month">1</li>
                <li class="not-this-month">2</li>
                <li class="not-this-month">3</li>
                <li class="not-this-month">4</li>
            </ul>
        </div>
    </body>
</html>