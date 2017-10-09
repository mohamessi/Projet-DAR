<%@ page pageEncoding="UTF-8"%>
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
<title id="title">POKECHANGE</title>
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
<script src="https://www.w3schools.com/lib/w3.js"></script>
</head>
<body>

	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog">

			<!-- Modal content-->
			<div class="modal-content">
				<div id="modalBody" class="modal-body">
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						</ol>

						<!-- Wrapper for slides -->
						<style>
.carousel-inner>.item>img {
	margin: 0 auto;
}
</style>
						<div class="carousel-inner">
							<div class="item active">
								<img src="assets/img2/Pikachu.png">
							</div>

							<div class="item">
								<img src="assets/img2/Nymphali.png">
							</div>

							<div class="item">
								<img src="assets/img2/Pikachu.png">
							</div>
						</div>

						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel"
							data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left"></span> <span
							class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"
							data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right"></span> <span
							class="sr-only">Next</span>
						</a>
					</div>
					<div class="section additional-details">

						<h4 class="s-property-title">Pikachu</h4>

						<ul class="additional-details-list clearfix">
							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Possesseur</span>
								<span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Karim</span>
							</li>

							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Mis
									en ligne</span> <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">2017/09/30</span>
							</li>
							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Exemplaires</span>
								<span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">2</span></li>

							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Extention</span>
								<span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">Dragon</span>
							</li>

							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">numero</span>
								<span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">5454564865</span>
							</li>

							<li><span class="col-xs-6 col-sm-4 col-md-4 add-d-title">Prix
									en â¬</span> <span class="col-xs-6 col-sm-8 col-md-8 add-d-entry">30</span>
							</li>

						</ul>
					</div>
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

	<!--  >%@include file="searchBar.jsp"% -->
	<div w3-include-html="searchBar.html"></div>


	<!-- End search bar -->

	<!-- start navBar -->

	<%@include file="menu.jsp"%>

	<!-- End of nav bar -->
	<%
		String attribut = (String) request.getAttribute("test");
		if (attribut != null)
			out.println(attribut);
		//else out.println("fuck off");
	%>

	<!-- Cartes area -->
	<div class="content-area recent-Cartes"
		style="padding-bottom: 60px; background-color: rgb(252, 252, 252);">
		<div class="container">
			<div class="row">
				<div class="col-md-12  padding-top-40 properties-page">
					<div class="col-md-12 ">
						<div class="col-xs-10 page-subheader sorting pl0">

							<ul class="sort-by-list">
								<li class="active"><a href="javascript:void(0);"
									class="order_by_date" data-orderby="carte_date"
									data-order="ASC"> Par Date <i class="fa fa-calendar"></i>
								</a></li>
								<li class=""><a href="javascript:void(0);"
									class="order_by_price" data-orderby="carte_prix"
									data-order="DESC"> Par Prix <i
										class="fa fa-sort-numeric-desc"></i>
								</a></li>
							</ul>
							<!--/ .sort-by-list-->

							<div class="items-per-page">
								<label for="items_per_page"><b>Cartes par page :</b></label>
								<div class="sel">
									<select id="items_per_page" name="per_page">
										<option selected="selected" value="10">10</option>
										<option value="20">20</option>
										<option value="30">30</option>
									</select>
								</div>
								<!--/ .sel-->
							</div>
							<!--/ .items-per-page-->
						</div>

						<div class="col-xs-2 layout-switcher">
							<a class="layout-list" href="javascript:void(0);"> <i
								class="fa fa-th-list"></i></a> <a class="layout-grid active"
								href="javascript:void(0);"> <i class="fa fa-th"></i>
							</a>
						</div>
						<!--/ .layout-switcher-->
					</div>

					<div class="col-md-12 ">
						<div id="list-type" class="proerty-th"></div>
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
	</div>


	<!-- Footer area-->
	<%@include file="footer.jsp"%>

	<!-- SCRIPT INCLUDE -->
	<%@include file="scriptInclude.jsp"%>
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


	<script src="assets/js/index.js"></script>
	<script src="assets/js/utils.js"></script>
	<script>
		w3.includeHTML();
	</script>

</body>
</html>