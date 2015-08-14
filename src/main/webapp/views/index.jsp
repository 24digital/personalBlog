<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

<head>
    <title>Spittr</title>
   <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">


    <script type="text/javascript" src="<c:url value="/scripts/jquery-1.11.3.min.js"/>"></script>


</head>

<body>


<h1>Marion's Blog</h1>
<p id="#me"><h1>Hello</h1></p>
<p>Hellow and wadwda kkm wo vwefvmwkm ; vwkmivo;wimef k vmwvimwa;</p>
<script>
    $(document).ready(function(){
       var test = $('p').text();
      $('p').text("hello Marion");
    });
</script>
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

<script>
    $(document).ready(function(){
        $('#me').ondblclick(function(){alert("Thank you")});
    });

</script>
</body>
</html>