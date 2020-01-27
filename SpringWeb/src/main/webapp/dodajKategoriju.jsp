<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dodaj Kategoriju</title>
</head>
<body style='background-color: violet;'>
		<form action="/Pocetna/Kontroler/dodajKategoriju" method="post">
			<font color="#ffffff" face="courier" size="8"> Unesite ime kategorije<input type="text" name="imeKategorije"></font>
			<p style="text-align:center"><input type="submit" value="Dodaj" style="height:100px; width:150px">
		
		</form>
		<c:if test="${!empty kategorija}">
		<font color="#ffffff" face="courier" size="8">Uneta je ${kategorija.idKategorija }</font>
		
		</c:if>
</body>
</html>