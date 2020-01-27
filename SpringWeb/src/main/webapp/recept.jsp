<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recept</title>
</head>
<body style='background-color: violet;'>
	
	 <c:if test="${!empty recept }">
	<font color="#ffffff" face="courier" size="8">  Recept za ${recept.imeRecepta}</font><br>
	<font color="#ffffff" face="courier" size="8">  Napomena za recept: ${recept.napomena }</font><br>
	<font color="#ffffff" face="courier" size="8">  Kategorija kojoj pripada: ${kate }</font><br>
	<font color="#ffffff" face="courier" size="8">  Korisnik koji je dodao recept: ${kori }</font><br>
	<font color="#ffffff" face="courier" size="8">  Sastojci:</font><br>
	 	<c:if test="${!empty lista1 }">
	 		<c:forEach var="s" items="${lista1 }">
	 			<font color="#ffffff" face="courier" size="8"> ${s.imeSastojka }<br></font>
	 		</c:forEach>
	 	</c:if>
	<font color="#ffffff" face="courier" size="8">  Slike:</font>
	 	<c:if test="${!empty lista2 }">
	 		<c:forEach var="sl" items="${lista2 }">
	 			<font color="#ffffff" face="courier" size="8"> ${sl.opisSlike }<br></font>
	 		</c:forEach>
	 	</c:if>
	 <font color="#ffffff" face="courier" size="8"> Omiljene kategorije kojim pripada:</font>
	 <c:if test="${!empty lista3 }">
	 		<c:forEach var="ok" items="${lista3 }">
	 		<font color="#ffffff" face="courier" size="8"> 	${ok.imeKategorije }<br></font>
	 		</c:forEach>
	 	</c:if>
	 </c:if>
	 
	 <img alt="" src="main/webapp/slike/sir.jpg" style="width: 400px; height: 300px;">
	
	
	
			
	
</body>
</html>