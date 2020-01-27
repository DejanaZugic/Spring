<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kulinarski dnevnik</title>
</head>
<body style='background-color: violet;'>
	<font color="#ffffff" face="courier" size="8">Dobar dan, ${korisnik.imeKorisnika }.<br></font>
	
	<font color="#ffffff" face="courier" size="8">Odaberite sta zelite da pogledate.<br></font>
	<a href="/Pocetna/Kontroler/prikaziKategorije">Kategorije</a><br/>
	<a href="/Pocetna/Kontroler/vaseKategorije?idk=${korisnik.idKorisnika}">Omiljene kategorije</a><br/>
	<a href="/Pocetna/kontrolerTri/prikazatiSveRecepte">Svi recepti</a><br/>
	<a href="/Pocetna/Kontroler/prikaziPrijatelje?idk=${korisnik.idKorisnika }">Prijatelji</a><br/>
	<a href="/Pocetna/Kontroler/prikaziPoruke?idk=${korisnik.idKorisnika }">Poruke</a><br/>
	<font color="#ffffff" face="courier" size="8">Dodajte novi recept.<br></font>
	<a href="/Pocetna/Kontroler/biranjeKategorije?idk=${korisnik.idKorisnika }">Dodaj recept</a><br/>
	<font color="#ffffff" face="courier" size="8">Dodajte novog prijatelja.<br></font>
	<a href="/Pocetna/Kontroler/dodajPrijatelja?idk=${korisnik.idKorisnika }">Dodaj prijatelja</a><br/>
	<font color="#ffffff" face="courier" size="8">Dodajte omiljenu kategoriju.<br></font>
	<a href="/Pocetna/Kontroler/dodajteOmiljenuKategoriju?idk=${korisnik.idKorisnika }">Dodajte omiljenu kategoriju</a><br/>
	<font color="#ffffff" face="courier" size="8">Posaljite poruku.<br></font>
	<a href="/Pocetna/Kontroler/novaPoruka?idk=${korisnik.idKorisnika }">Posalji poruku</a><br/>

</body>
</html>