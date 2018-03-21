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
<h1><% out.print(unArticle.getTitre()); %></h1>
</div>


<%@ include file="piedDePage.html"%>
