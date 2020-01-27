<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dodaj prijatelja</title>
</head>
<body style='background-color: violet;'>
	<form action="/Pocetna/Kontroler/dd" method="post">
	<font color="#ffffff" face="courier" size="8">Izaberite prijatelja</font> <br>
	<select name="idPrijatelja">
			<c:forEach items="${lista}" var="l">
						<option value="${l.idKorisnika} "> ${l.imeKorisnika} </option>
		 </c:forEach>
					</select>
					<p style="text-align:center"><input type="submit" value="Dodaj" style="height:100px; width:150px"></p>
					</form>
</body>
</html>