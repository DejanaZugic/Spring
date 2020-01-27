<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dobrodosli</title>
</head>
<body style='background-color: violet;'>
	<font color="#ffffff" face="courier" size="8">Dobrodosli ${korisnik.imeKorisnika }<br></font>
	<font color="#ffffff" face="courier" size="8">Pregledajte statistiku.<br></font>
	<a href="/Pocetna/Kontroler/prikaziStatistiku">Statistika</a><br/>
	<font color="#ffffff" face="courier" size="8">Pregledajte danasnju statistiku.<br></font>
	<a href="/Pocetna/biranjeDatuma.jsp">Statistika</a><br/>
	<font color="#ffffff" face="courier" size="8">Kreirajte novu kategoriju.<br></font>
	<a href="/Pocetna/dodajKategoriju.jsp">Dodaj kategoriju</a><br/>
	<font color="#ffffff" face="courier" size="8">Ili pristupite ostalim funkcionalnostima.<br></font>
	<a href="/Pocetna/uspeo.jsp">Detaljnije</a><br/>
	
	
</body>
</html>