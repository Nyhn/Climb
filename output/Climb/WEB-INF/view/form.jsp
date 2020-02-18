<%--
  Created by IntelliJ IDEA.
  User: dubois
  Date: 11/02/2020
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="include/head.jsp"%>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul class="nav nav-tabs">
    <li class="nav-item">
        <a class="nav-link active" href="form">Inscription</a>
    </li>
    <li class="nav-item">
        <a class="nav-link" href="register">Listing</a>
    </li>

    <li class="nav-item">
        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">exemple</a>
    </li>
</ul>
    <form method="post" action="register" class="col-lg-9">
        <div class="form-group">
            <label for="nom">Nom :</label>
            <input type="text" class="form-control" id="nom" name="nom" placeholder="ex: Jean-edouard">
        </div>
        <div class="form-group">
            <label for="pays">Pays :</label>
            <input type="text" class="form-control" id="pays" name="pays" placeholder="ex: France">
        </div>
        <button type="submit" class="btn btn-primary mb-2">Validation</button>
    </form>
<p><img src="../resources/img/a.jpg" alt="img"></p>
</body>
</html>
