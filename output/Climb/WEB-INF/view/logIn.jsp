
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
    <%@ include file="include/header.jsp" %>
    <div class="row">
        <form method="post" action="test" class="col-lg-9 form-horizontal well">
            <legend class="h4 border-bottom">Connexion</legend>
            <br>
            <div>
                <fieldset >
                    <div class="row form-group">
                        <label for="pseudo" class="offset-lg-1 offset-sm-1 col-2 control-label">Pseudo:</label>
                        <div class="col-7">
                            <input id="pseudo" name="pseudo" type="text" class="form-control">
                        </div>
                    </div>
                    <div class="row form-group">
                        <label for="password" class="offset-lg-1 offset-sm-1 col-2 control-label">Mot de passe:</label>
                        <div class="col-7">
                            <input id="password" name="password" type="password" class="form-control">
                        </div>
                    </div>
                    <div class="mid">
                        <a href="init-password">J'ai oublié mon mot de passe</a>
                    </div>
                    <button class="btn btn-primary offset-9" type="submit">Envoyer</button>
                </fieldset>
            </div>
        </form>
        <nav class="border-cadre col-lg-3">
            <%@ include file="include/highlight-site.jsp" %>
        </nav>
    </div>
    <%@ include file="include/footer.jsp" %>
</div>

</body>
</html>