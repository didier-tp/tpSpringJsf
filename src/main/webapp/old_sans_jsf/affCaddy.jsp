<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>affCaddy</title>
</head>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
     prefix="c" %>
<body>
    <h3>contenu du caddy</h3>
    <table border="1">
      <% 
      List<String> caddyList = (List<String>)
                   session.getAttribute("caddy");
      if(caddyList!=null){
       for(String prod : caddyList){%>
           <tr><td><%=prod%> </td></tr>
       <% }
       }%>
    </table>   <hr/>
    <table border="1">
       <c:forEach  var="p" 
            items="${sessionScope.caddy}">
        <tr><td>${p}</td></tr>
       </c:forEach>
    </table>
    numero de session:<%=session.getId() %>
	<hr/>
	<a href="addProdCaddy.jsp">nouvel ajout caddy</a><br/>
	<a href="./old_index.html">retour accueil sans jsf</a><br/>
</body>
</html>