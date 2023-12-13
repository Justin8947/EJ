<%-- 
    Document   : index
    Created on : 12 Dec, 2023, 4:24:09 PM
    Author     : RAM GANESH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mypackage.MarksEntryBean"%>
<%@page import="javax.naming.InitialContext"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
private static MarksEntryBean obj;
public void jspInit()
{
 try
 {
 InitialContext ic=new InitialContext();
 obj=(MarksEntryBean)ic.lookup("java:global/Pract7CMarksApp/MarksEntryBean");
 }
 catch(Exception e)
 {
System.out.println(e);
 }
}
%>



<%
 if(request.getParameter("InsertMarks")!=null)
 {
 String sname;
 int marks1, marks2, marks3;
 sname = request.getParameter("sname");
 marks1=Integer.parseInt(request.getParameter("m1"));
 marks2=Integer.parseInt(request.getParameter("m2"));
 marks3=Integer.parseInt(request.getParameter("m3"));
 obj.addMarks(sname,marks1,marks2,marks3);
 out.print("Marks entered successfully..!!!!");
 } 
%>
    </body>
</html>
