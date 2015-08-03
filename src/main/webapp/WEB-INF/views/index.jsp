<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="/WEB-INF/resources/style.css"/>
    <script src="/WEB-INF/scripts/jquery-1.11.3.min.js"/>
</head>

<body>
<script>$("#clickMe").html("Welcome");</script>

<h1>Marion's Blog</h1>
<div id="#clickMe" >Hello</div>
<a href="<c:url value="/" />">Spittles</a> |
<a href="<c:url value="/welcome/55" />">Register</a>

<form method="post" >
    Name: <input type="text" name="username"/>
    <input type="submit" name="user">
</form>
<c:forEach items="${posts}" var="post">
    <li id="post_<c:out value="post.id"/> ">
        (<c:out value="${post.description}"/>)
    </li>
</c:forEach>

</body>
</html>