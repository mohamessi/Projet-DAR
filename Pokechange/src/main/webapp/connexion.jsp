<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>POKECHANGE</title>
<meta name="description" content="GARO is a real-estate template">
<meta name="author" content="Kimarotec">
<meta name="keyword"
	content="html5, css, bootstrap, property, real-estate theme , bootstrap template">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800'
	rel='stylesheet' type='text/css'>

<!-- Place favicon.ico and apple-touch-icon.png in the root directory ->
        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
        <link rel="icon" href="favicon.ico" type="image/x-icon"-->

<link rel="stylesheet" href="assets/css/normalize.css">
<link rel="stylesheet" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/css/fontello.css">
<link href="assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css"
	rel="stylesheet">
<link href="assets/fonts/icon-7-stroke/css/helper.css" rel="stylesheet">
<link href="assets/css/animate.css" rel="stylesheet" media="screen">
<link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/icheck.min_all.css">
<link rel="stylesheet" href="assets/css/price-range.css">
<link rel="stylesheet" href="assets/css/owl.carousel.css">
<link rel="stylesheet" href="assets/css/owl.theme.css">
<link rel="stylesheet" href="assets/css/owl.transitions.css">
<link rel="stylesheet" href="assets/css/style.css">
<link rel="stylesheet" href="assets/css/responsive.css">
</head>
<body>

	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 id="modalTitle" class="modal-title">Modal Header</h4>
				</div>
				<div id="modalBody" class="modal-body">
					<p>Some text in the modal.</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>

		</div>
	</div>



	<div id="preloader">
		<div id="status">&nbsp;</div>
	</div>
	<!-- Body content -->


	<!-- search bar -->

	<%@include  file="searchBar.jsp" %>

	<!-- End search bar -->

	<!-- start navBar -->
	
	<%@include  file="menu.jsp" %>
	
	<!-- End of nav bar -->

	<!-- Cartes area -->
	<div class="content-area recent-Cartes"
		style="padding-bottom: 60px; background-color: rgb(252, 252, 252);">
		<div class="container">
			<div class="row">
				<div class="col-md-12  padding-top-40 properties-page">
					<div id="list-type" class="proerty-th">
						<div class="register-area" style="background-color: rgb(249, 249, 249);">
            <div class="container">

                <div class="col-md-6">
                    <div class="box-for overflow">
                        <div class="col-md-12 col-xs-12 register-blocks">
                            <h2>New account : </h2> 
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="name">Name</label>
                                    <input type="text" class="form-control" id="name">
                                </div>
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="text" class="form-control" id="email">
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password">
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-default">Register</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="box-for overflow">                         
                        <div class="col-md-12 col-xs-12 login-blocks">
                            <h2>Login : </h2> 
                            <form action="" method="post">
                                <div class="form-group">
                                    <label for="email">Email</label>
                                    <input type="text" class="form-control" id="email">
                                </div>
                                <div class="form-group">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password">
                                </div>
                                <div class="text-center">
                                    <button type="submit" class="btn btn-default"> Log in</button>
                                </div>
                            </form>
                            <br>
                            
                            <h2>via Facebook ou Google:  </h2> 
                            
                            <p>
                            <a class="login-social" href="#"><i class="fa fa-facebook"></i>&nbsp;Facebook</a> 
                            <a class="login-social" href="#"><i class="fa fa-google-plus"></i>&nbsp;Gmail</a>   
                            </p> 
                        </div>
                        
                    </div>
                </div>

            </div>
        </div>
					</div>
					
				</div>

			</div>
		</div>
	</div>


	<!-- Footer area-->
	<div class="footer-area">

		<div class=" footer">
			<div class="container">
				<div class="row">

					<div class="col-md-3 col-sm-6 wow fadeInRight animated">
						<div class="single-footer">
							<h4>A propos</h4>
							<div class="footer-title-line"></div>

							<img src="assets/img2/logo.png" alt="" class="wow pulse"
								data-wow-delay="1s">
							<p>Lorem ipsum dolor cum necessitatibus su quisquam
								molestias. Vel unde, blanditiis.</p>
							<ul class="footer-adress">
								<li><i class="pe-7s-mail strong"> </i>
									service@pokechange.com</li>
								<li><i class="pe-7s-call strong"> </i> 01 58 54 69 52</li>
							</ul>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 wow fadeInRight animated">
						<div class="single-footer">
							<h4>Lien rapide</h4>
							<div class="footer-title-line"></div>
							<ul class="footer-menu">
								<li><a href="#">Accueil</a></li>
								<li><a href="#">chercher un carte</a></li>
								<li><a href="#">mes cartes</a></li>
								<li><a href="#">forum</a></li>
								<li><a href="#">à propos</a></li>
							</ul>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 wow fadeInRight animated">
						<div class="single-footer">
							<h4>Derniers ajouts</h4>
							<div class="footer-title-line"></div>
							<ul class="footer-blog">
								<li>
									<div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
										<a href="single.html"> <img src="assets/img2/Pikachu.png">
										</a> <span class="blg-date">12-12-2016</span>

									</div>
									<div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
										<h6>
											<a href="single.html">pikachu</a>
										</h6>
										<p style="line-height: 17px; padding: 8px 2px;">Lorem
											ipsum dolor sit amet, nulla ...</p>
									</div>
								</li>

								<li>
									<div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
										<a href="single.html"> <img src="assets/img2/Nymphali.png">
										</a> <span class="blg-date">12-12-2016</span>

									</div>
									<div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
										<h6>
											<a href="single.html">Nymphali</a>
										</h6>
										<p style="line-height: 17px; padding: 8px 2px;">Lorem
											ipsum dolor sit amet, nulla ...</p>
									</div>
								</li>

								<li>
									<div class="col-md-3 col-sm-4 col-xs-4 blg-thumb p0">
										<a href="single.html"> <img src="assets/img2/Pikachu.png">
										</a> <span class="blg-date">12-12-2016</span>

									</div>
									<div class="col-md-8  col-sm-8 col-xs-8  blg-entry">
										<h6>
											<a href="single.html">pikachu</a>
										</h6>
										<p style="line-height: 17px; padding: 8px 2px;">Lorem
											ipsum dolor sit amet, nulla ...</p>
									</div>
								</li>


							</ul>
						</div>
					</div>
					<div class="col-md-3 col-sm-6 wow fadeInRight animated">
						<div class="single-footer news-letter">
							<h4>Recevez nos news</h4>
							<div class="footer-title-line"></div>
							<p>Lorem ipsum dolor sit amet, nulla suscipit similique
								quisquam molestias. Vel unde, blanditiis.</p>

							<form>
								<div class="input-group">
									<input class="form-control" type="text"
										placeholder="E-mail ... " style="color: black"> <span
										class="input-group-btn">
										<button class="btn btn-primary subscribe" type="button">
											<i class="pe-7s-paper-plane pe-2x" style="color: black"></i>
										</button>
									</span>
								</div>
								<!-- /input-group -->
							</form>

							<div class="social pull-right">
								<ul>
									<li><a class="wow fadeInUp animated" href="#"><i
											class="fa fa-twitter"></i></a></li>
									<li><a class="wow fadeInUp animated" href="#"
										data-wow-delay="0.2s"><i class="fa fa-facebook"></i></a></li>
									<li><a class="wow fadeInUp animated" href="#"
										data-wow-delay="0.3s"><i class="fa fa-google-plus"></i></a></li>
								</ul>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>

		<div class="footer-copy text-center">
			<div class="container">
				<div class="row">
					<div class="pull-left">
						<span> (C) <a href="#">Pokechange</a> Tous droits réservés.
						</span>
					</div>
					<div class="bottom-menu pull-right">
						<ul>
							<li><a class="wow fadeInUp animated" href="#"
								data-wow-delay="0.2s">Conditions d'utilisation</a></li>
							<li><a class="wow fadeInUp animated" href="#"
								data-wow-delay="0.3s">Données personnelles</a></li>
							<li><a class="wow fadeInUp animated" href="#"
								data-wow-delay="0.4s">cookies</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

	</div>


	<script src="assets/js/modernizr-2.6.2.min.js"></script>

	<script src="assets/js/jquery-1.10.2.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/js/bootstrap-select.min.js"></script>
	<script src="assets/js/bootstrap-hover-dropdown.js"></script>

	<script src="assets/js/easypiechart.min.js"></script>
	<script src="assets/js/jquery.easypiechart.min.js"></script>

	<script src="assets/js/owl.carousel.min.js"></script>
	<script src="assets/js/wow.js"></script>

	<script src="assets/js/icheck.min.js"></script>
	<script src="assets/js/price-range.js"></script>

	<script src="assets/js/main.js"></script>
	<script src="assets/js/utils.js"></script>


</body>
</html>