<%@ page pageEncoding="UTF-8"%>
<%@ include file="enTetePageMenu.html"%>

<input type="button" value="Musique" id="musique">
<input type="button" value="Livre" id="livre">

<script type="text/javascript">
	$('#musique').click(function() {
		  var array = window.location.pathname.split("/");
		  //console.log(array[1]);
		  //console.log(array[2]);
		  var array2 =window.location.href.split(window.location.pathname);
		  //console.log(base);
		  document.location.href=array2[0]+"/"+array[1]+"/"+array[2]+"/"+"musiques"; 
	});
	$('#livre').click(function() {
		 var array = window.location.pathname.split("/");
		  //console.log(array[1]);
		  //console.log(array[2]);
		  var array2 =window.location.href.split(window.location.pathname);
		  //console.log(base);
		  document.location.href=array2[0]+"/"+array[1]+"/"+array[2]+"/"+"livres"; 
	});
	
</script>
<%@ include file="piedDePageMenu.html"%>
