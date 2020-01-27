<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Svi recepti</title>
</head>
<body style='background-color: violet;'>
	<c:if test="${!empty listaR }">
		<c:forEach var="r" items="${listaR }">
			<font color="#ffffff" face="courier" size="8">${r.imeRecepta }</font>
			<a href="/Pocetna/Kontroler/prikazRe?idr=${r.idRecept }">Recept</a><br/>
		
		
		</c:forEach>
	
	</c:if>

</body>
</html>