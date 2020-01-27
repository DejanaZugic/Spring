<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pretrazi po naslovu</title>
</head>
<body style='background-color: violet;'>
	<form action="/Pocetna/Kontroler/prikaziPoNaslovu" method="get">
	<font color="#ffffff" face="courier" size="8">Unesite naziv:	<input type="text" name="imeRecepta"><br></font>
	<p style="text-align:center"><input type="submit" value="Pretrazi"style="height:100px; width:150px" ></p>
	</form>
	

</body>
</html>