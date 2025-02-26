<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
    <%@ include file="include/header.jsp" %>
    <div class="row">
        <div class="col-lg-9  well">
            <form class="row form-horizontal inline-form">
                <legend class="h4 border-bottom">Recherche de site d'escalade</legend>
                <div class="col-lg-3">
                    <div class="row">
                        <label for="firstname" class="col-12 control-label">Lieu:</label>
                    </div>
                    <div class="row  ml-1 mr-1 mr-lg-0 ml-lg-0">
                        <input id="firstname" type="text" class="col-12 form-control">
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="row">
                        <label for="level" class="col-12 control-label">cotation:</label>
                    </div>
                    <div class="row  ml-1 mr-1 mr-lg-0">
                        <select id="level" class="form-control">
                            <option>Moins de 5c+</option>
                            <option>Entre 6a et 6c+</option>
                            <option>Entre 7a et 7c+</option>
                            <option>Plus de 8a</option>
                        </select>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="row">
                        <label for="level" class="
							col-12 control-label">Nombre de secteur:</label>
                    </div>
                    <div class="row  ml-1 mr-1 mr-lg-0">
                        <select id="level" class="form-control">
                            <option>moins de 3</option>
                            <option>4 à 6</option>
                            <option>6 à 8</option>
                            <option>8 à 10</option>
                            <option>Plus de 10</option>
                        </select>
                    </div>
                </div>
                <div class="col-lg-3">
                    <div class="row">
                        <label for="name" class="col-12 control-label">Dernière mise à jour:</label>
                    </div>
                    <div class="row  ml-1 mr-1 ml-lg-0 mr-lg-0">
                        <input id="name" type="Date" class="form-control col-12">
                    </div>
                </div>
            </form>
            <br>
            <form class="row navbar-form navbar-right inline-form">
                <div class="col-12 form-group">
                    <input type="search" class="input-sm form-control" placeholder="Recherche">
                    <button type="submit" class="btn btn-primary btn-sm"><span class="glyphicon glyphicon-eye-open"></span> Chercher</button>
                </div>
            </form>
            <div class="container">
                <section class="row">
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/1.jpg" alt="climb">
                            <figcaption class="row">site 1</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/2.jpg" alt="climb">
                            <figcaption class="row">site 2</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/3.jpg" alt="climb">
                            <figcaption class="row">site 3</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/3.jpg" alt="climb">
                            <figcaption class="row">site 4</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/5.jpg" alt="climb">
                            <figcaption class="row">site 5</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/6.jpg" alt="climb">
                            <figcaption class="row">site 6</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/1.jpg" alt="climb">
                            <figcaption class="row">site 7</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/2.jpg" alt="climb">
                            <figcaption class="row">site 8</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/3.jpg" alt="climb">
                            <figcaption class="row">site 9</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/4.jpg" alt="climb">
                            <figcaption class="row">site 10</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/5.jpg" alt="climb">
                            <figcaption class="row">site 11</figcaption></a>
                    </figure>
                    <figure class="col-pad col-xs-6 col-sm-4 col-md-3">
                        <a href="/Climb_war/climbingSite" class="link-img"><img class="row" src="image/6.jpg" alt="climb">
                            <figcaption class="row">site 12</figcaption></a>
                    </figure>
                </section>
            </div>

        </div>
    </div>
</div>


<nav class="border-cadre col-lg-3">
    <%@ include file="include/highlight-site.jsp" %>
</nav>
</div>
<%@ include file="include/footer.jsp" %>
</div>

</body>
</html>