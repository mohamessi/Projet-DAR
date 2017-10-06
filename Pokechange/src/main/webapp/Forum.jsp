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
<title>POKECHANGE | Home page</title>
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
						<section id="comments" class="comments wow fadeInRight animated">
							<h4 class="text-uppercase wow fadeInLeft animated">3
								comments</h4>

						</section>
					</div>
					<div class="row comment">
						<div class="col-sm-3 col-md-2 text-center-xs">
							<h5 class="text-uppercase">Patrick</h5>
						</div>
						<div class="col-sm-9 col-md-10">
							<form>

								<div class="row wow fadeInLeft animated">
									<div class="col-sm-12">
										<div class="form-group">
											<textarea class="form-control" id="comment" rows="4"></textarea>
										</div>
									</div>
								</div>

								<div class="row wow fadeInLeft animated">
									<div class="col-sm-12 text-right">
										<button class="btn btn-primary">
											<i class="fa fa-comment-o"></i> Post comment
										</button>
									</div>
								</div>
							</form>
						</div>
					</div>



				</div>

				<div class="col-md-12">
					<div class="pull-right">
						<div class="pagination">
							<ul>
								<li><a href="#">Prec</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">Suiv</a></li>
							</ul>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>


	<!-- Footer area-->
	


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
	<script src="assets/js/forum.js"></script>
	<script src="assets/js/utils.js"></script>


</body>
</html>