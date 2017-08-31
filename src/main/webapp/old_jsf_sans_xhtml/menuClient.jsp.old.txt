<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:view>
   message: <h:outputText value="#{loginBean.message}" />
   username : <h:outputText value="#{loginBean.username}" />
   
   liste des clients dont le nom correspond à username:
   <h:dataTable border="1"
     var="c" value="#{loginBean.listeCli}">
       <h:column>
           <f:facet name="header">
              <f:verbatim>nom</f:verbatim>
           </f:facet>
           <h:outputText value="#{c.nom}"/>
       </h:column>
        <h:column>
           <f:facet name="header">
              <f:verbatim>prenom</f:verbatim>
           </f:facet>
           <h:outputText value="#{c.prenom}"/>
       </h:column>
   </h:dataTable>
</f:view>
</body>
</html>