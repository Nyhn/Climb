<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<body>
  <div class="container">
    <%@ include file="include/header.jsp" %>
    <div class="row">
      <form method="post" action="registerCheck" class="col-lg-9 form-horizontal well">
        <legend class="h4 border-bottom">Formulaire d'inscription</legend>
        <br>
        <fieldset >
          <legend class="push border-bottom">Identité</legend>
          <div class="row form-group">
            <label for="name" class="offset-lg-1 offset-sm-1 col-2 control-label">Nom:</label>
            <div class="col-7">
              <input id="name" name="name"type="text" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="firstname" class="offset-lg-1 offset-sm-1 col-2 control-label">Prénom:</label>
            <div class="col-7">
              <input id="firstname" name="firstname" type="text" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="sex" class="offset-lg-1 offset-sm-1 col-2 control-label">Sexe:</label>
            <div class ="radio col-7">
              <label id="sex" for="man" class="radio">
                <input type="radio" name="sex" value="man" id="man">
                Homme &emsp; &emsp;
              </label>
              <label id="sex" for="woman" class="radio">
                <input type="radio" name="sex" value="woman" id="woman">
                Femme
              </label>
            </div>
          </div>
          <div class="row form-group">
            <label for="birth" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Date de naissance :</label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="birth" name="birth" type="Date" class="form-control">
            </div>
          </div>
        </fieldset>
        <fieldset>
          <legend class="push border-bottom">Coordonnée</legend>
          <div class="row form-group">
            <label for="address" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Adresse postale: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="address" name="address" type="text" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="ZIP" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">code postale: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="ZIP" name="ZIP" type="text" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="mail" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Adresse e-mail: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="mail" name="mail" type="email" class="form-control">
            </div>
          </div>
          <div class="row form-group">

            <label for="mail2" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Vérification Adresse e-mail:</label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="mail2" name="mail2" type="email" class="form-control">
            </div>
          </div>
          <div class="row form-group">

            <label for="phone" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Téléphone: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="phone" name="phone" type="tel" class="form-control">
            </div>
          </div>
        </fieldset>
        <fieldset>
          <legend class="push border-bottom">Compte</legend>
          <div class="row form-group">
            <label for="pseudo" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Pseudo: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="pseudo" name="pseudo" type="text" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="password" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Mot de passe: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="password" name="password" type="password" class="form-control">
            </div>
          </div>
          <div class="row form-group">
            <label for="password2" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Vérification Mot de passe: </label>
            <div class="col-xs-7 col-sm-7 col-lg-7">
              <input id="password2" name="password2" type="password" class="form-control">
            </div>
          </div>
        </fieldset>
        <div class="row form-group">
          <label for="level" class="offset-lg-1 offset-sm-1 col-xs-2 col-sm-2 col-lg-2 control-label">Niveau d'escalade:</label>
          <div class="col-xs-7 col-sm-7 col-lg-7">
            <select id="level" name="level" class="form-control">
              <option>Débutant (4 à 5C)</option>
              <option>Intermédiaire (6A à 6C+)</option>
              <option>Avancé (7A à 7B)</option>
              <option>Expert (7B+ à 8A+)</option>
            </select>
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