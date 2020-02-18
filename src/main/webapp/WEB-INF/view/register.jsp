<%--
  Created by IntelliJ IDEA.
  User: duboi
  Date: 11/02/2020
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<%@include file="include/head.jsp"%>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="nav nav-tabs">
    <li class="nav-item">
        <a class="nav-link" href="form">Inscription</a>
    </li>
    <li class="nav-item">
        <a class="nav-link active" href="register">Listing</a>
    </li>

    <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">exemple</a>
    </li>
</ul>
<div class="form-horizontal well">
    <c:if test="${!empty user}">
        <h3 class="text-center">Inscription réussie !!</h3>
        <h4 class="text-center">Bienvenue <c:out value="${user.name} ${user.country}"/></h4>
    </c:if>
    <ul>
        <c:forEach var="user" items="${ users }">
            <li><c:out value="${ user.name } " /> <c:out value=" ${ user.country }" /></li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
