<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kategorije</title>
</head>
<body style='background-color: violet;'>
	<p style="text-align:center"><font color="#ffffff" face="courier" size="10">Kategorije(${brojKategorija })<br></font>
	<c:if test="${!empty kategorije }">
		<table border="0">
		<tr>
			<th>  </th>
			<th>Pogledaj recepte kategorije</th>
		</tr>
		<c:forEach var="k" items="${kategorije }" >
		<tr>
			<td> -${k.imeKategorije}</td>
			<td><a href="/Pocetna/Kontroler/prikazKa?id=${k.idKategorija}">Link</a><br/></td>
		</tr>
		</c:forEach>
		</table>
	</c:if>
	

</body>
</html>