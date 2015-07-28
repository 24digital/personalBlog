<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/WEB-INF/resources/style.css" />" >
</head>
<body>
<h1>Welcome to Kool</h1>
<a href="<c:url value="/t" />">Spittles</a> |
<a href="<c:url value="/spitter/register" />">Register</a>

<c:forEach items="${posts}" var="post">
    <li id="post_<c:out value="post.id"/> ">
        (<c:out value="${post.description}"/>)
    </li>
</c:forEach>

<c:forEach items="${spittleList}" var="spittle" >
    <li id="spittle_<c:out value="spittle.id"/>">
        <div class="spittleMessage">
            <c:out value="uuu" />
        </div>
        <div>
            <span class="spittleTime"><c:out value="${spittle.time}" /></span>
<span class="spittleLocation">
(<c:out value="${spittle.latitude}" />,
<c:out value="${spittle.longitude}" />)</span>
        </div>
    </li>
</c:forEach>
</body>
</html>