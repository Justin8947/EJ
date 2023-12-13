<%-- 
    Document   : choose_when_otherwise
    Created on : 12 Dec, 2023, 5:16:42 PM
    Author     : RAM GANESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="income" value="${4000*4}"/>
Your Income is: <c:out value="${income}"/>
<c:choose>
 <c:when test="${income <=1000}">

     Income is not good
 </c:when>
 <c:when test="${income > 10000}">
 Income is Very Good
 </c:when>
 <c:otherwise>
 Income is undetermined
 </c:otherwise>
</c:choose>
        
    </body>
</html>
