<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Postani clan</title>
</head>
<body style='background-color: violet;'>
	<form action="/Pocetna/Kontroler/dodajClana" method="post">
	<p style="text-align:center"><font color="#ffffff" face="courier" size="9">Da bi se registrovali morate uneti podatke.<br></font>
	<font color="#ffffff" face="courier" size="8"> Unesite vase ime(username): <input type="text" name="imeKorisnika"><br></font>
	<font color="#ffffff" face="courier" size="8"> Unesite lozinku: <input type="text" name="sifraKorisnika"><br></font>
	<font color="#ffffff" face="courier" size="8"> Unesite datum rodjenja: <input type="date" name="datumR"><br></font>
	<p style="text-align:center">	<input type="submit" value="Prijavi se" style="height:100px; width:150px" ><br></p>
	</form>
</body>
</html>