<%@ page pageEncoding="UTF-8"%>
<%@ include file="../enTetePage.html"%>
<%@ page import="commerce.catalogue.domaine.modele.Livre" %>
<%@ page import="java.lang.reflect.Field" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%
  Livre livre = new Livre() ;
%>
    <form action="controleLivres.jsp?commande=ajouter" method="post">
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
	String value = "" ;
	if(articleField.getType().toString().equals("int"))
      value = "0";
    if(articleField.getType().toString().equals("double"))
      value = "0.0";
    if(articleField.getType().toString().equals("class java.lang.String"))
      value = "";
%>
      <div>
        <label for="_<%=articleField.getName() %>_id"><%=articleLabel %></label>
		<div>
		  <input type="text" size="70" name="<%=articleField.getName() %>" value="<%=value %>"
		  <%
		  System.out.println("1:"+articleField.getName());
        		if(articleField.getName().equalsIgnoreCase("titre")){
    				out.print(" data-validation=\"required length\" data-validation-error-msg-required=\"Titre obligatoire\" data-validation-length=\"1-30\" data-validation-length=\"1-30\" data-validation-error-msg-length=\"La longeur doit être comprise entre 1 et 30 caractères\"");
    			}
    			if(articleField.getName().equalsIgnoreCase("image")){
    				out.print(" data-validation=\"url\" data-validation-length=\"1-30\" data-validation-error-msg-url=\"Doit être une url\"");
    			}
    			if(articleField.getName().equalsIgnoreCase("langue")){
    				out.print(" data-validation=\"custom\" data-validation-regexp=\"^([a-zA-Z]+)$\" data-validation-error-msg-custom=\"Ne doit être composé que de lettre \"");
    			}
    			if(articleField.getName().equalsIgnoreCase("prix")){
    				out.print(" data-validation=\"required custom\" data-validation-error-msg-required"+
    			"=\"Prix obligatoire.\" data-validation-regexp=\"^([0-9]+[.])?[0-9]{1,2}$\""+
    				" data-validation-error-msg-custom =\"Cette valeur n'est pas un prix.\"");
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
//   for (int i = 0; i < list.size(); i++) {
//     if (list.get(i).getName().equals("dateDeParution")) {
// 	  list.remove(i);
//     }
//   }
  musiqueFields = list.toArray(new Field[musiqueFields.length-2]);
  for (Field articleField : musiqueFields) {
	//System.out.println("filed:"+articleField.getName());
    String articleLabel = articleField.getName().substring(0,1).toUpperCase() + articleField.getName().substring(1) ;
	String value = "" ;
	if(articleField.getType().toString().equals("int"))
      value = "0";
    if(articleField.getType().toString().equals("double"))
      value = "0.0";
    if(articleField.getType().toString().equals("class java.lang.String"))
      value = "";
%>
      <div>
        <label for="_<%=articleField.getName() %>_id"><%=articleLabel %></label>
		<div>
		  <input type="text" size="70" name="<%=articleField.getName() %>" value="<%=value %>"
		   <%
		  System.out.println("2:"+articleField.getName());
        		if(articleField.getName().equalsIgnoreCase("auteur")){
    				out.print(" data-validation=\"required length\" data-validation-error-msg-required=\"Auteur obligatoire\" data-validation-length=\"1-30\" data-validation-error-msg-length=\"La longeur doit être comprise entre 1 et 30 caractères\"");
    			}
    			if(articleField.getName().equals("ISBN")){
    				out.print(" data-validation=\"required length number\" data-validation-error-msg-required=\"Code ISBN obligatoire\" data-validation-length=\"13\" data-validation-error-msg-length=\"La longeur doit être de 13 caractères\"");
    			}
    			if(articleField.getName().equals("nbPages")){
    				out.print(" data-validation=\"required number\" data-validation-error-msg-required=\"Nombre de pages obligatoire\"");
    			}
    			if(articleField.getName().equals("dateDeParution")){
    				out.print(" data-validation=\"required date\" data-validation-format=\"dd/mm/yyyy\" data-validation-error-msg-required=\"Date de parution obligatoire\" data-validation-error-msg-date=\"Date au format dd/mm/yyyy\"");
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
<%@ include file="../piedDePage.html"%>
