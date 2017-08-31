<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>affTva</title>
</head>
<body> 
    tva : <%= ((com.sopra.web.data.CalculTva)
    request.getAttribute("calculTva")).getTva() %>
   
    <hr/>
    ht: ${calculTva.ht} <br/>
    taux: ${calculTva.taux} <br/>
    tva: <b>${requestScope.calculTva.tva} </b><br/>
    ttc: <b>${calculTva.ttc} </b><br/>
</body>
</html>