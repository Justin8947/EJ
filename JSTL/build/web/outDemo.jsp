<%-- 
    Document   : outDemo
    Created on : 12 Dec, 2023, 5:15:59 PM
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
<c:set var="name" value="John"/>
My name is: <c:out value= "${name}" />
    </body>
</html>
