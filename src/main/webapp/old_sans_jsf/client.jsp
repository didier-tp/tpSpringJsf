<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>client</title>
</head>
<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.sopra.resa.service.ServiceClient" %>
<%@ page import="com.sopra.resa.model.Client" %>
<%
String sNumCli = request.getParameter("numClient");
if(sNumCli!=null){
	long numCli = Long.parseLong(sNumCli);
	WebApplicationContext ctxSpring =  
	  WebApplicationContextUtils
	   .getWebApplicationContext(application); 
	ServiceClient  beanServiceClient = (ServiceClient) 
	   ctxSpring.getBean("serviceClientImpl");
	Client client = 
	    beanServiceClient.rechercherClient(numCli);
	request.setAttribute("client", client);
	}
%>
<body>   <form action="" method="get">
       numClient: <input name="numClient" /> <br/>
       <input type="submit" value="rechercher" />
   </form>   <hr/>
   ${client.nom} , ${client.prenom} , ${client.idClient}
</body>
</html>