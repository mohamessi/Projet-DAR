$(function() {
	var  res = navBar();
	$("#navigation").html(res);
	//alert('cfdcdcd');
});

function navBar(){
	var nav = '<div class="button navbar-right">';
	nav+='<button class="navbar-btn nav-button wow bounceInRight login" ><a class="" href="connexion.html" style="color:white">Connexion</a></button>';
	nav+='<button class="navbar-btn nav-button wow bounceInRight login" ><a class="" href="connexion.html" style="color:white">Inscription</a></button></div>';
	nav+='<ul class="main-nav nav navbar-nav navbar-right">';
	nav+='<li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="index.html">Accueil</a></li>';
	nav+='<li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="index.html">Messages (3)</a></li>';
	nav+='<li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="index.html">Panier (3)</a></li>';
	nav+='<li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="forum.html">Forum</a></li>';
	nav+='<li class="wow fadeInDown" data-wow-delay="0.1s"><a class="" href="index.html">A prospos</a></li>';
	nav+='</ul>';
	
	return nav;
}

/*

						
					<li class="wow fadeInDown" data-wow-delay="0.1s"><a class=""
						href="#">Messages (3)</a></li>
					<li class="wow fadeInDown" data-wow-delay="0.1s"><a class=""
						href="#">Panier (3)</a></li>
					<li class="wow fadeInDown" data-wow-delay="0.1s"><a class=""
						href="forum.html">Forum</a></li>
					<li class="wow fadeInDown" data-wow-delay="0.1s"><a href="#">A
							propos</a></li>

				</ul>
*/


