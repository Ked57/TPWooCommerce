<%@ page pageEncoding="UTF-8"%>
<%@ include file="../enTetePage.html"%>
<%@ page import="commerce.catalogue.domaine.modele.Livre" %>
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.lang.reflect.Method" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%
Livre livre = (Livre)session.getAttribute("livre") ;
if (livre == null)
	response.sendRedirect(response.encodeURL("index.jsp")) ;
 else { 
%>
    <form action="controleLivres.jsp?commande=modifier" method="post">
	  <input type="hidden" name="refArticle" value="<%=livre.getRefArticle() %>"/>
<%
  Field[] articleFields = livre.getClass().getSuperclass().getDeclaredFields();
  ArrayList<Field> list = new ArrayList<Field>(Arrays.asList(articleFields));
  for (int i = 0; i < list.size(); i++) {
    if (list.get(i).getName().equals("refArticle")) {
	  list.remove(i);
    }
  }
  articleFields = list.toArray(new Field[articleFields.length-1]);
  for (Field articleField : articleFields) {
    String articleLabel = articleField.getName().substring(0,1).toUpperCase() + articleField.getName().substring(1) ;
	Class noparams[] = {};
	Method method = livre.getClass().getSuperclass().getDeclaredMethod("get" + articleLabel,noparams) ;
%>
      <div>
        <label for="_<%=articleField.getName() %>_id"><%=articleLabel %></label>
		<div>
		  <input type="text" size="70" name="<%=articleField.getName() %>" value="<% if(method.invoke(livre, null)!=null) out.print(method.invoke(livre, null)); else out.print(""); %>"
		  <%
		  if(articleField.getName().equalsIgnoreCase("titre")){
				out.print(" data-validation=\"required length\" data-validation-error-msg-required=\"Titre obligatoire\" data-validation-length=\"1-30\" data-validation-length=\"1-30\" data-validation-error-msg-length=\"La longeur doit être comprise entre 1 et 30 caractères\"");
			}
			if(articleField.getName().equalsIgnoreCase("image")){
				out.print(" data-validation=\"url\" data-validation-length=\"1-30\" data-validation-error-msg-url=\"Doit être une url\"");
			}
			if(articleField.getName().equalsIgnoreCase("langue")){
				out.print(" data-validation=\"length\" data-validation-length=\"0-2\" data-validation-length=\"1-30\" data-validation-error-msg-length=\"La longeur doit être comprise entre 0 et 2 caractères\"");
			}
			if(articleField.getName().equalsIgnoreCase("prix")){
				out.print(" data-validation=\"required custom\" data-validation-error-msg-required"+
			"=\"Prix obligatoire.\" data-validation-regexp=\"^([0-9]+[.])?[0-9]{1,2}$\""+
				" data-validation-error-msg-custom =\"Cette valeur n'est pas un prix.");
			}
			if(articleField.getName().equalsIgnoreCase("disponibilite")){
				out.print(" data-validation=\"required number\" data-validation-error-msg-required=\"Disponibilité obligatoire\"");
			}
		  %>
		  />
		</div>
	  </div>
<%
  }
  Field[] musiqueFields = livre.getClass().getDeclaredFields();
  list = new ArrayList<Field>(Arrays.asList(musiqueFields));
  for (int i = 0; i < list.size(); i++) {
    if (list.get(i).getName().equals("dateDeParution")) {
	  list.remove(i);
    }
  }
  musiqueFields = list.toArray(new Field[musiqueFields.length-2]);
  for (Field articleField : musiqueFields) {
    String articleLabel = articleField.getName().substring(0,1).toUpperCase() + articleField.getName().substring(1) ;
	Class noparams[] = {};
	Method method = livre.getClass().getDeclaredMethod("get" + articleLabel,noparams) ;
%>
      <div>
        <label for="_<%=articleField.getName() %>_id"><%=articleLabel %></label>
		<div>
		  <input type="text" size="70" name="<%=articleField.getName() %>" value="<% if(method.invoke(livre, null)!=null) out.print(method.invoke(livre, null)); else out.print(""); %>"
		  <%
		  if(articleField.getName().equalsIgnoreCase("auteur")){
				out.print(" data-validation=\"required length\" data-validation-error-msg-required=\"Auteur obligatoire\" data-validation-length=\"1-30\" data-validation-error-msg-length=\"La longeur doit être comprise entre 1 et 30 caractères\"");
			}
			if(articleField.getName().equals("ISBN")){
				out.print(" data-validation=\"required length number\" data-validation-error-msg-required=\"Code ISBN obligatoire\" data-validation-length=\"13\" data-validation-error-msg-length=\"La longeur doit être de 13 caractères\"");
			}
			if(articleField.getName().equals("nbPages")){
				out.print(" data-validation=\"required number\" data-validation-error-msg-required=\"Nombre de pages obligatoire\"");
			}
		  %>
		  
		  />
		</div>
	  </div>
<%
  }
%>
      <div>
        <input type="Submit" name="Submit" Value="Submit"/>
	  </div>
	</form>
	<script type="text/javascript">
	$.validate();
	</script>
<%
}
%>
<%@ include file="../piedDePage.html"%>
