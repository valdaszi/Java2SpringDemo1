<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: valdas
  Date: 25/11/2018
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>Hello Buddy</title>
</head>
<body>
    <h2>Hello, ${name}</h2>

    <div><a href="home">Namo</a></div>
    <div><a href="${contextPath}">Į pradžią</a></div>
</body>
</html>
