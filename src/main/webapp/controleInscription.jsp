<%@ page pageEncoding="UTF-8"%>
<%@ page import="commerce.catalogue.service.UserManager" %>
<%@ page import="commerce.catalogue.domaine.modele.User" %>
<%@ page import="java.util.Iterator" %>
<%
	UserManager uManager = (UserManager)application.getAttribute("userManager") ;
	String pseudo = (String)request.getParameter("pseudo");   
	String passw = (String)request.getParameter("password");
	String nom = (String)request.getParameter("nom");
	String prenom = (String)request.getParameter("prenom");
	String adresse = (String)request.getParameter("adresse");
	String telephone = (String)request.getParameter("telephone");
	if(pseudo != null && passw != null){
		if(uManager.getUser(pseudo) != null){
			response.sendRedirect(response.encodeURL("inscription.jsp?error=1"));
		}else {
			User user = uManager.addUser(passw, pseudo, nom, prenom, adresse, telephone);
			response.addCookie(new Cookie("token",uManager.connect(user)));
			response.sendRedirect(response.encodeURL("./afficheRecherche.jsp"));
		}
	} else response.sendRedirect(response.encodeURL("connexion.jsp?error=2"));
%>