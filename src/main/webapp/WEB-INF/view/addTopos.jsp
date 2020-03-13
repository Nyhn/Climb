<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
    <%@ include file="include/header.jsp" %>
    <div class="row">
        <form method="post" action="toposCheck" class="col-lg-9 form-horizontal well">
            <legend class="h4 border-bottom">Ajouter un topos</legend>
            <br>
            <fieldset >
                <legend class="push border-bottom">Caractéristiques</legend>
                <div class="row form-group">
                    <label for="title" class="offset-lg-1 offset-sm-1 col-2 control-label">Titre:</label>
                    <div class="col-7">
                        <input id="title" name="title"type="text" class="form-control">
                    </div>
                </div>
                <div class="row form-group">
                    <label for="autor" class="offset-lg-1 offset-sm-1 col-2 control-label">Auteur:</label>
                    <div class="col-7">
                        <input id="autor" name="autor" type="text" class="form-control">
                    </div>
                </div>
                <div class="row form-group">
                    <label for="image" class="offset-lg-1 offset-sm-1 col-2 control-label">Lien de l'image:</label>
                    <div class="col-7">
                        <input id="image" name="image" type="url" class="form-control">
                    </div>
                </div>
            </fieldset>
            <fieldset>
                <legend class="push border-bottom">État de disponibilité</legend>
                <div class="row form-group">
                    <label for="available" class="offset-lg-1 offset-sm-1 col-2 control-label">Disponible:</label>
                    <div class ="radio col-7">
                        <label id="available" for="no" class="radio">
                            <input type="radio" name="available" value="no" id="no">
                            Non &emsp; &emsp;
                        </label>
                        <label id="sex" for="yes" class="radio">
                            <input type="radio" name="available" value="yes" id="yes">
                            Oui
                        </label>
                    </div>
                </div>
            <button class="btn btn-primary offset-9" type="submit">Envoyer</button>
        </form>
        <nav class="border-cadre col-lg-3">
            <%@ include file="include/highlight-site.jsp" %>
        </nav>
    </div>
    <%@ include file="include/footer.jsp" %>
</div>
</body>
</html>