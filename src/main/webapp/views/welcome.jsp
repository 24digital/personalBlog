<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/WEB-INF/resources/style.css" />" >
</head>
<body>
<h1>Hello</h1>
<%=request.getAttribute("userid")%>
</body>
</html>