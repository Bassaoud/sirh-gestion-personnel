<!doctype html>
<%@page import="java.util.Date"%>
<html>
	<head>
		<title>D�mo JSP</title>
	</head>
	<body>
	<%
	
		Date uneDate = new Date();
		String a = "ddd";
		
		
	
	%>
		<%-- Un commentaire JSP --%>
		<!-- Un commentaire HTML -->
		<h1>Premi�re JSP</h1>
		<p>
			Nous sommes : <%= uneDate %>
		</p>
		<%@include file="fragment.jsp" %>
	</body>
</html>