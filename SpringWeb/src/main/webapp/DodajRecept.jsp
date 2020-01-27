<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dodaj recept</title>
</head>
<body style='background-color: violet;'>
	<form action="/Pocetna/Kontroler/dodajGa?idk=${idk }" method="post">
		<font color="#ffffff" face="courier" size="8"> Unesite ime: <input type="text" name="imeRecepta"><br></font>
		<font color="#ffffff" face="courier" size="8"> Unesite napomenu: <input type="text" name="napomena"><br></font>
		
	<font color="#ffffff" face="courier" size="8"> 	Korisnik: ${idk }</font><br>
		<font color="#ffffff" face="courier" size="8"> Kategorija:</font><br>
			<select name="idKategorija">
			<c:forEach items="${lista}" var="l">
										<option value="${l.idKategorija} "> ${l.imeKategorije} </option>
								    </c:forEach>
								    </select>
		<p style="text-align:center"><input type="submit" value="Dodaj" style="height:100px; width:150px"><p style="text-align:center">
	</form>
	<c:if test="${!empty sacuvan }">
	<font color="#ffffff" face="courier" size="8"> 	${sacuvan.idRecept }</font>
	</c:if>
	

</body>
</html>