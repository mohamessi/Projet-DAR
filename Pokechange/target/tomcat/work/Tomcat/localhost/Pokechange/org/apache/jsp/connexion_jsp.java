/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-10-04 07:15:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connexion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/searchBar.jsp", Long.valueOf(1507100684161L));
    _jspx_dependants.put("/menu.jsp", Long.valueOf(1507101315617L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!-->\n");
      out.write("<html class=\"no-js\">\n");
      out.write("<!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<title>POKECHANGE</title>\n");
      out.write("<meta name=\"description\" content=\"GARO is a real-estate template\">\n");
      out.write("<meta name=\"author\" content=\"Kimarotec\">\n");
      out.write("<meta name=\"keyword\"\n");
      out.write("\tcontent=\"html5, css, bootstrap, property, real-estate theme , bootstrap template\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<link\n");
      out.write("\thref='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,800'\n");
      out.write("\trel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("<!-- Place favicon.ico and apple-touch-icon.png in the root directory ->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\"-->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/normalize.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/fontello.css\">\n");
      out.write("<link href=\"assets/fonts/icon-7-stroke/css/pe-icon-7-stroke.css\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<link href=\"assets/fonts/icon-7-stroke/css/helper.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"assets/css/animate.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/bootstrap-select.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/icheck.min_all.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/price-range.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/owl.theme.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/owl.transitions.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/responsive.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<!-- Modal -->\n");
      out.write("\t<div class=\"modal fade\" id=\"myModal\" role=\"dialog\">\n");
      out.write("\t\t<div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("\t\t\t<!-- Modal content-->\n");
      out.write("\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t\t\t<h4 id=\"modalTitle\" class=\"modal-title\">Modal Header</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"modalBody\" class=\"modal-body\">\n");
      out.write("\t\t\t\t\t<p>Some text in the modal.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"preloader\">\n");
      out.write("\t\t<div id=\"status\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Body content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- search bar -->\n");
      out.write("\n");
      out.write("\t");
      out.write("<div class=\"home-lager-shearch\" id=\"searchBarLo\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"col-md-12 large-search\">\r\n");
      out.write("\t\t\t<div class=\"search-form wow pulse\">\r\n");
      out.write("\t\t\t\t<form action=\"\" class=\" form-inline\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"vous cherchez une carte\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"lunchBegins\" class=\"selectpicker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-live-search=\"true\" data-live-search-style=\"begins\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Choisis ton extention\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Tempete de sable</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Dragon</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Team Magma vs team aqua</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Legende oubliées</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Emeraude</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"lunchBegins\" class=\"selectpicker\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-live-search=\"true\" data-live-search-style=\"begins\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Choisis ta ville\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Paris</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Lille</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Lyon</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Marseille</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>Ile de france</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- End search bar -->\n");
      out.write("\n");
      out.write("\t<!-- start navBar -->\n");
      out.write("\t\n");
      out.write("\t");
      out.write("<nav class=\"navbar navbar-default\" id=\"navigBa\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\tdata-toggle=\"collapse\" data-target=\"#navigation\">\r\n");
      out.write("\t\t\t <span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span><span class=\"icon-bar\"></span><span\r\n");
      out.write("\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t <a class=\"navbar-brand\" href=\"index.html\"><img\r\n");
      out.write("\t\t\tsrc=\"assets/img2/logo.png\" alt=\"\" height=\"48\" width=\"129\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"collapse navbar-collapse yamm\" id=\"navigation\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"button navbar-right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button class=\"navbar-btn nav-button wow bounceInRight login\">\r\n");
      out.write("\t\t\t\t<a href=\"connexion.jsp\" style=\"color: white\">Connexion</a>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<button class=\"navbar-btn nav-button wow bounceInRight login\">\r\n");
      out.write("\t\t\t\t<a  href=\"connexion.jsp\" style=\"color: white\">Inscription</a>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<ul class=\"main-nav nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<li class=\"wow fadeInDown\" data-wow-delay=\"0.1s\"><a class=\"\"\r\n");
      out.write("\t\t\t\thref=\"index.jsp\">Accueil</a></li>\r\n");
      out.write("\t\t\t<li class=\"wow fadeInDown\" data-wow-delay=\"0.1s\"><a class=\"\"\r\n");
      out.write("\t\t\t\thref=\"index.jsp\">Messages (3)</a></li>\r\n");
      out.write("\t\t\t<li class=\"wow fadeInDown\" data-wow-delay=\"0.1s\"><a class=\"\"\r\n");
      out.write("\t\t\t\thref=\"index.jsp\">Panier (3)</a></li>\r\n");
      out.write("\t\t\t<li class=\"wow fadeInDown\" data-wow-delay=\"0.1s\"><a class=\"\"\r\n");
      out.write("\t\t\t\thref=\"Forum.jsp\">Forum</a></li>\r\n");
      out.write("\t\t\t<li class=\"wow fadeInDown\" data-wow-delay=\"0.1s\"><a class=\"\"\r\n");
      out.write("\t\t\t\thref=\"index.jsp\">A prospos</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- End of nav bar -->\n");
      out.write("\n");
      out.write("\t<!-- Cartes area -->\n");
      out.write("\t<div class=\"content-area recent-Cartes\"\n");
      out.write("\t\tstyle=\"padding-bottom: 60px; background-color: rgb(252, 252, 252);\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12  padding-top-40 properties-page\">\n");
      out.write("\t\t\t\t\t<div id=\"list-type\" class=\"proerty-th\">\n");
      out.write("\t\t\t\t\t\t<div class=\"register-area\" style=\"background-color: rgb(249, 249, 249);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"box-for overflow\">\n");
      out.write("                        <div class=\"col-md-12 col-xs-12 register-blocks\">\n");
      out.write("                            <h2>New account : </h2> \n");
      out.write("                            <form action=\"\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\">Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"name\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\">Email</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\">Register</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"box-for overflow\">                         \n");
      out.write("                        <div class=\"col-md-12 col-xs-12 login-blocks\">\n");
      out.write("                            <h2>Login : </h2> \n");
      out.write("                            <form action=\"\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\">Email</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"password\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"text-center\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-default\"> Log in</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            <h2>via Facebook ou Google:  </h2> \n");
      out.write("                            \n");
      out.write("                            <p>\n");
      out.write("                            <a class=\"login-social\" href=\"#\"><i class=\"fa fa-facebook\"></i>&nbsp;Facebook</a> \n");
      out.write("                            <a class=\"login-social\" href=\"#\"><i class=\"fa fa-google-plus\"></i>&nbsp;Gmail</a>   \n");
      out.write("                            </p> \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Footer area-->\n");
      out.write("\t<div class=\"footer-area\">\n");
      out.write("\n");
      out.write("\t\t<div class=\" footer\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6 wow fadeInRight animated\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-footer\">\n");
      out.write("\t\t\t\t\t\t\t<h4>A propos</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-title-line\"></div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<img src=\"assets/img2/logo.png\" alt=\"\" class=\"wow pulse\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-wow-delay=\"1s\">\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor cum necessitatibus su quisquam\n");
      out.write("\t\t\t\t\t\t\t\tmolestias. Vel unde, blanditiis.</p>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"footer-adress\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"pe-7s-mail strong\"> </i>\n");
      out.write("\t\t\t\t\t\t\t\t\tservice@pokechange.com</li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><i class=\"pe-7s-call strong\"> </i> 01 58 54 69 52</li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6 wow fadeInRight animated\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-footer\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Lien rapide</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-title-line\"></div>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"footer-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Accueil</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">chercher un carte</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">mes cartes</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">forum</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ã  propos</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6 wow fadeInRight animated\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-footer\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Derniers ajouts</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-title-line\"></div>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"footer-blog\">\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-4 col-xs-4 blg-thumb p0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"> <img src=\"assets/img2/Pikachu.png\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a> <span class=\"blg-date\">12-12-2016</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8  col-sm-8 col-xs-8  blg-entry\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">pikachu</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"line-height: 17px; padding: 8px 2px;\">Lorem\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet, nulla ...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-4 col-xs-4 blg-thumb p0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"> <img src=\"assets/img2/Nymphali.png\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a> <span class=\"blg-date\">12-12-2016</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8  col-sm-8 col-xs-8  blg-entry\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">Nymphali</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"line-height: 17px; padding: 8px 2px;\">Lorem\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet, nulla ...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3 col-sm-4 col-xs-4 blg-thumb p0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\"> <img src=\"assets/img2/Pikachu.png\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a> <span class=\"blg-date\">12-12-2016</span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-8  col-sm-8 col-xs-8  blg-entry\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"single.html\">pikachu</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</h6>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"line-height: 17px; padding: 8px 2px;\">Lorem\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tipsum dolor sit amet, nulla ...</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 col-sm-6 wow fadeInRight animated\">\n");
      out.write("\t\t\t\t\t\t<div class=\"single-footer news-letter\">\n");
      out.write("\t\t\t\t\t\t\t<h4>Recevez nos news</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"footer-title-line\"></div>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, nulla suscipit similique\n");
      out.write("\t\t\t\t\t\t\t\tquisquam molestias. Vel unde, blanditiis.</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"E-mail ... \" style=\"color: black\"> <span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary subscribe\" type=\"button\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"pe-7s-paper-plane pe-2x\" style=\"color: black\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<!-- /input-group -->\n");
      out.write("\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social pull-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"><i\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"fa fa-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-wow-delay=\"0.2s\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdata-wow-delay=\"0.3s\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"footer-copy text-center\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"pull-left\">\n");
      out.write("\t\t\t\t\t\t<span> (C) <a href=\"#\">Pokechange</a> Tous droits rÃ©servÃ©s.\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"bottom-menu pull-right\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-wow-delay=\"0.2s\">Conditions d'utilisation</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-wow-delay=\"0.3s\">DonnÃ©es personnelles</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"wow fadeInUp animated\" href=\"#\"\n");
      out.write("\t\t\t\t\t\t\t\tdata-wow-delay=\"0.4s\">cookies</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/jquery-1.10.2.min.js\"></script>\n");
      out.write("\t<script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/bootstrap-select.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/bootstrap-hover-dropdown.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/easypiechart.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/jquery.easypiechart.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/wow.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/icheck.min.js\"></script>\n");
      out.write("\t<script src=\"assets/js/price-range.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"assets/js/main.js\"></script>\n");
      out.write("\t<script src=\"assets/js/utils.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}