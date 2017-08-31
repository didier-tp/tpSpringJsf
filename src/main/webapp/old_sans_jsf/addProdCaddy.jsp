<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>addProdCaddy</title>
</head>
<%@ page import="java.util.List,java.util.ArrayList" %>
<%String produit = request.getParameter("produit");
String message="";
if(produit!=null){
	List<String> caddyList = (List<String>)
			         session.getAttribute("caddy");
	if(caddyList==null){
		caddyList = new ArrayList<String>();
		session.setAttribute("caddy",caddyList);
	}
	caddyList.add(produit);
	message="il y a " + caddyList.size() +
			     " elements dans le caddy";
}%>
<body> <form action="" method="get">
         produit : <input name="produit"/> <br/>
         <input type="submit" value="add in caddy" />
     </form> <%=message%>    
     <br/>
    numero de session:<%=session.getId() %>
     <hr/>
     <a href="affCaddy.jsp">afficher contenu caddy</a>
</body>
</html>