/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-02-12 11:19:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import commerce.catalogue.service.CatalogueManager;
import commerce.catalogue.domaine.modele.Article;
import commerce.catalogue.domaine.modele.Livre;
import commerce.catalogue.domaine.modele.Musique;
import commerce.catalogue.domaine.modele.Piste;
import java.util.Iterator;

public final class afficheRecherche_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/piedDePage.html", Long.valueOf(1518434142305L));
    _jspx_dependants.put("/enTetePage.html", Long.valueOf(1518434142165L));
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Site web marchand</title>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/playList.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" id=\"storefront-woocommerce-style-css\" href=\"./css/themes/storefont/assets/sass/woocommerce/woocommerce.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./js/jplayer-2.9.2/skin/blue.monday/css/jplayer.blue.monday.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jplayer-2.9.2/jplayer/jquery.jplayer.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/jplayer-2.9.2/add-on/jplayer.playlist.min.js\"></script>\r\n");
      out.write("<style id='storefront-style-inline-css' type='text/css'>\r\n");
      out.write("\t\t\ttable.cart td.product-remove,\r\n");
      out.write("\t\t\ttable.cart td.actions {\r\n");
      out.write("\t\t\t\tborder-top-color: #ffffff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div id=\"inner-wrapper\">\r\n");
      out.write("\t\t\t<header id=\"header\" class=\"col-full\">\r\n");
      out.write("\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"site-title\">Site web marchand</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</header>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"./js/playListJs.jsp\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if (session.getAttribute("panier")==null) {
		response.sendRedirect("./index.jsp");
	} else {

      out.write("\r\n");
      out.write("<nav id=\"navigation\" class=\"col-full\" role=\"navigation\">\r\n");
      out.write("\t<ul id=\"main-nav\" class=\"nav fl\">\r\n");
      out.write("\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-item\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(response.encodeURL("./afficheRecherche.jsp"));
      out.write("\">Rechercher\r\n");
      out.write("\t\t\t\tun article</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li id=\"menu-item-290\"\r\n");
      out.write("\t\t\tclass=\"menu-item menu-item-type-custom menu-item-object-custom\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(response.encodeURL("./controlePanier.jsp"));
      out.write("\">Panier</a>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"content\" class=\"site-content\" tabindex=\"-1\">\r\n");
      out.write("\t<div class=\"col-full\">\r\n");
      out.write("\t\t<div class=\"primary\" class=\"content-area\">\r\n");
      out.write("\t\t\t<section id=\"main\" class=\"site-main\" role=\"main\">\r\n");
      out.write("\t\t\t\t<h1 class=\"page-title\">Résultats de la recherche</h1>\r\n");
      out.write("\t\t\t\t<ul class=\"products\">\r\n");
      out.write("\t\t\t\t\t");

						CatalogueManager catalogueManager = (CatalogueManager) application
									.getAttribute("catalogueManager");
							Iterator<Article> listeDesArticles = catalogueManager
									.getArticles().iterator();
							Livre livre = null;
							Musique musique = null;
							Article article;
							while (listeDesArticles.hasNext()) {
								article = (Article) listeDesArticles.next();
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"product type-product\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(response.encodeURL("./controlePanier.jsp?refArticle="
								+ article.getRefArticle()
						+ "&amp;commande=ajouterLigne"));
      out.write("\"> <img\r\n");
      out.write("\t\t\t\t\t\t\tsrc=\"");
 if (article.getImage().startsWith("http")) 
									    out.print(article.getImage()) ;
							        else
							        	out.print("./images/"+article.getImage()) ; 
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"attachment-shop_catalog wp-post-image\" alt=\"poster_2_up\"\r\n");
      out.write("\t\t\t\t\t\t\theight=\"300\" width=\"300\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<h3>");
      out.print(article.getTitre());
      out.write("</h3> <span class=\"price\"><ins>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"amount\">");
      out.print(article.getPrix());
      out.write(" €</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ins></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(response.encodeURL("./controlePanier.jsp?refArticle="
								+ article.getRefArticle()
						+ "&amp;commande=ajouterLigne"));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"button add_to_cart_button product_type_simple\">Mettre\r\n");
      out.write("\t\t\t\t\t\t\tdans le panier</a>\r\n");

                            	if (article instanceof Musique) { 
                            		musique = (Musique) article;
                            		if (musique.getPistes().size() > 0) {

      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div id=\"jquery_jplayer_");
      out.print(article.getRefArticle());
      out.write("\" class=\"jp-jplayer\"></div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"jp_container_");
      out.print(article.getRefArticle());
      out.write("\" class=\"jp-audio\" role=\"application\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"jp-type-playlist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"jp-gui jp-interface\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"jp-controls-holder\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"jp-controls\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"jp-previous\" role=\"button\" tabindex=\"0\">previous</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"jp-play\" role=\"button\" tabindex=\"0\">play</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"jp-stop\" role=\"button\" tabindex=\"0\">stop</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"jp-next\" role=\"button\" tabindex=\"0\">next</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"jp-playlist\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>&nbsp;</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"jp-no-solution\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>Update Required</span> To play the media you will need to\r\n");
      out.write("\t\t\t\t\t\t\t\t\teither update your browser to a recent version or update your <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"http://get.adobe.com/flashplayer/\" target=\"_blank\">Flash\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplugin</a>.\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div> \r\n");

                            		}
                            	}
							}
 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");

	}

      out.write('\r');
      out.write('\n');
      out.write("\t\t<footer id=\"footer\" class=\"col-full\">\r\n");
      out.write("\t\t\t<div id=\"credit\" class=\"col-right\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<object type=\"image/svg+xml\" data=\"./images/deezer.svg\" width=\"152\" height=\"34\"></object>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tDesigned by\r\n");
      out.write("\t\t\t\t\t<a title=\"Premium WordPress Themes & Plugins by WooThemes\" alt=\"Premium WordPress Themes & Plugins by WooThemes\" href=\"http://www.woothemes.com/\">\r\n");
      out.write("\t\t\t\t\t\t<img width=\"74\" height=\"19\" alt=\"WooThemes\" src=\"./images/woothemes.png\">\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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
