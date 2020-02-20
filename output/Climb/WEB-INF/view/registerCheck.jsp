<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
    <%@ include file="include/header.jsp" %>
    <div class="row">
        <div class="col-lg-9 form-horizontal well">
            <c:if test="${!empty user}">
                <h3 class="text-center">Inscription réussie !!</h3>
                <h4 class="text-center">Bienvenue <c:out value="${user.name} ${user.firstname}"/></h4>
            </c:if>
        </div>
        <nav class="border-cadre col-lg-3">
            <%@ include file="include/highlight-site.jsp" %>
        </nav>
    </div>
    <%@ include file="include/footer.jsp" %>
</div>

</body>
</html>