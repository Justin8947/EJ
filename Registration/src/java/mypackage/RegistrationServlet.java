package mypackage;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegistrationServlet extends HttpServlet
{ public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
IOException, ServletException
 { Connection con=null;
 PreparedStatement ps=null;
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 String username=request.getParameter("uname");
 String password=request.getParameter("pw");
 String emailid=request.getParameter("email");
 String country=request.getParameter("coun");
 try
 { Class.forName("com.mysql.jdbc.Driver");
 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bscit","root","123456");
 out.println("connection done successfully...");
 ps=con.prepareStatement("insert into registration values (?,?,?,?)");
 ps.setString(1,username);
 ps.setString(2,password);
 ps.setString(3,emailid);
 ps.setString(4,country);
 ps.execute();

 out.print("Data insserted successfully!!!!");
 }
 catch(Exception e) { out.println(e); }
 out.println("<b>"+"<b>");
 }
}