<%@ page pageEncoding="UTF-8"%>
<%@ page import="commerce.catalogue.service.UserManager" %>
<%@ page import="commerce.catalogue.domaine.modele.User" %>
<%@ page import="java.util.Iterator" %>
<%
	UserManager uManager = (UserManager)application.getAttribute("userManager") ;
	String pseudo = (String)request.getParameter("pseudo");   
	String passw = (String)request.getParameter("password");
	if(pseudo != null && passw != null){
		User user = uManager.getUser(pseudo);
		if(uManager.checkPassw(user, passw)){
			String token = uManager.connect(user);
			response.addCookie(new Cookie("token",token));
			response.sendRedirect(response.encodeURL("index.jsp"));
		}else response.sendRedirect(response.encodeURL("connexion.jsp?error=1"));
	} else response.sendRedirect(response.encodeURL("connexion.jsp?error=2"));
%>