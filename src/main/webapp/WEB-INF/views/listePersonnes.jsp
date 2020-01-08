<%@page import="dev.demo.mvc.Personne"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Démo MVC</title>
</head>
<body>

	<h1>Liste de personnes</h1>

	<table>
		<thead>
			<tr>
				<th>nom</th>
				<th>prenom</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Personne> listePersonnes = (List<Personne>) request.getAttribute("listeP");

				for (Personne p : listePersonnes) {
			%>
			<tr>
				<td><%=p.getNom()%></td>
				<td><%=p.getPrenom()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</body>
</html>