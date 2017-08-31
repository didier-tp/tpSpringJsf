<!DOCTYPE html>
<html>
<head>
<link  rel="stylesheet" href="styles.css">
<meta charset="ISO-8859-1">
<title>paramCalcul</title>
</head>
<%
String sA = request.getParameter("a");
String sB = request.getParameter("b");
double res=0;
double a=0,b=0;
if(sA!=null && sB!=null){
   a  = Double.parseDouble(sA);
   b  = Double.parseDouble(sB);
  res= a+b;
}
%>
<body> 
<%@include file="entete.jsp" %>
<form method="get" action="">
    <!--  si action="" la page se rappelle elle meme -->
        a: <input name="a" type="number" value="<%=a%>" /> <br/>
        b: <input name="b" type="number" value="<%=b%>"/> <br/>
        <input type="submit" value="additionner"/>
    </form>    <hr/>
    res= <b><%=res%></b>
</body>
</html>