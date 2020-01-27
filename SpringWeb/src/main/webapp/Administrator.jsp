<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prijavi se</title>
</head>
<body  style='background-color: violet;'>
<p style="text-align:center"><font color="#ffffff" face="courier" size="10">Unesite potrebne parametre:</font>.</p>
		<form action="/Pocetna/Kontroler/prijavaAdmina" method="get" >
			<font color="#ffffff" face="courier" size="8">Unesite ime: <input type="text" name="username" ><br></font>
			<font color="#ffffff" face="courier" size="8">Unesite lozinku: <input type="text" name="lozinka"><br></font>
			<br>
			
		<p style="text-align:center"><input type="submit" value="Prijava" style="height:100px; width:150px"></p>
		</form>
</body>
</html>