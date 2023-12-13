<%-- 
    Document   : setDemo
    Created on : 12 Dec, 2023, 5:14:08 PM
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
        
        <%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<c:set var="pageTitle" scope="application"
value="Dukes Soccer League: Registration" />
${pageTitle} 
    </body>
</html>
