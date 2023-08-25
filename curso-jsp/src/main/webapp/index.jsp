<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Curso JSP</title>
</head>
<body>

	<h1>Bem vindo ao curso JSP</h1>
	<h4>Pagina do curso JAVA com conexão ao banco de DADOS</h4>

	<form action="ServletsLogin" method="post">
	<input type="hidden" value="<%= request.getParameter("url")%>" name="url">
		<table>
			<tr>
				<td>Login</td>
				<td><input name="login" type="text"></td>
			</tr>
			<tr>
				<td>Senha</td>
				<td><input name="senha" type="password"></td>
			</tr>
			<tr>
				<td />
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>

	</form>

	<h4>${msg}</h4>



	<div>
		<input name="login" type="text"> <input name="login"
			type="text">
	</div>

</body>
</html>