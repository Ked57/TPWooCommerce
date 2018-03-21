<%@ page pageEncoding="UTF-8"%>
<%@ include file="enTetePage.html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
</head>
<body>
	<form>
		<div>
			<label for="pseudo">Email :</label>
			<input id=pseudo type="text" placeholder="Entrer votre e-mail" data-validation="email" data-validation-error-msg-email="Doit être un e-mail"></input>
		</div>
		<div>
			<label for="password">Mot de passe :</label>
			<input id="password" type="password" placeholder="Entrer votre mot de passe" data-validation="custom length" data-validation-regexp="^([a-zA-Z0-9]+)$" data-validation-length="8-20" data-validation-error-msg-custom="Doit être composé de chiffres et de lettres" data-validation-error-msg-custom="Doit faire entre 6 et 20 caractères"></input>
		</div>
		<div>
			<input type="submit" value="Connexion"></input>
		</div>
	</form>
	<script type="text/javascript">
	$.validate();
	</script>
</body>
</html>
<%@ include file="piedDePage.html"%>