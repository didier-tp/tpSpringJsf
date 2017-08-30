<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>tva</title>
</head>
<body>
<h2>tva (version jsf)</h2>
<f:view>
    <h:messages />
    <h:form >
    	ht: <h:inputText value="#{tvaBean.ht}" /> <br/>
    	taux: <h:inputText value="#{tvaBean.taux}" />% <br/>
    	<h:commandButton value="calcul tva" action="#{tvaBean.calculer}" />
    </h:form>
    tva: ${tvaBean.tva} <br/>
    ttc: <h:outputText value="#{tvaBean.ttc}" />
</f:view>
</body>
</html>