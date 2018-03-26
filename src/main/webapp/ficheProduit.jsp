<%@ page pageEncoding="UTF-8"%>
<%@ include file="enTetePage.html"%>
<%@ page import="commerce.catalogue.domaine.modele.Article"%>
<%@ page import="commerce.catalogue.service.CatalogueManager"%>
<%
String refArticle = request.getParameter("refArticle");
System.out.println(refArticle);

CatalogueManager catalogueManager = (CatalogueManager) application.getAttribute("catalogueManager");
Article unArticle;
unArticle = new Article();
unArticle = catalogueManager.chercherArticleParRef(refArticle);
%>
<div>
<img src="<% out.print(unArticle.getImage());%>">
</div>
<div>
<p>Nom : <% out.print(unArticle.getTitre()); %></p>
</div>
<div>
<p>Langue : <% out.print(unArticle.getLangue()); %></p>
</div>
<div>
<p>Prix : <% out.print(unArticle.getPrix()); %></p>
</div>
<div>
<p>Ref : <% out.print(unArticle.getRefArticle()); %></p>
</div>
<div>
	<input id="ajout" type="button" value="Ajouter au panier" onclick="ajout()"></input>
</div>

<script>
	function ajout() {
		window.location.replace("<%=response.encodeURL("./controlePanier.jsp?refArticle=" + unArticle.getRefArticle()
			+ "&commande=ajouterLigne")%>");	}
</script>


<%@ include file="piedDePage.html"%>
