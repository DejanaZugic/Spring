<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Datum za statistiku</title>
</head>
<body style='background-color: violet;'>
	<form action="/Pocetna/Kontroler/statistikaZaDatum" method="get">
		<font color="#ffffff" face="courier" size="8">Unesite datum<input type="date" name="datum"></font>
	<p style="text-align:center"><input type="submit" value="Statistika" style="height:100px; width:150px"></p>
	</form>
</body>
</html>