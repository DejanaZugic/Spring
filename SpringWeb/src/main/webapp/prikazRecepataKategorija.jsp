<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recepti kategorije</title>
</head>
<body style='background-color: violet;'>
	
	<p style="text-align:center"><font color="#ffffff" face="courier" size="10">Kategorija ${k.imeKategorije} je izabrana.</font> <br>
	<font color="#ffffff" face="courier" size="8"> Recepti date kategorije: <br></font>
	<c:if test="${!empty receptiK }">
	<form action="/Pocetna/Report/generisiIzvestaj">
		<table border="0">
		<tr>
			<th>  </th>
			<th> </th>
			<th></th>
		</tr>
		<c:forEach var="r" items="${receptiK }" >
		<tr>
			<td>-${r.imeRecepta}</td>
			<td><a href="/Pocetna/Kontroler/prikazRe?idr=${r.idRecept}">Link</a></td>
		</tr>
		</c:forEach>
		</table>
		<p style="text-align:center"><input type="submit" value="Generisi izvestaj"style="height:100px; width:150px"></p>
		</form>
	</c:if>


</body>
</html>