package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ejb.MarksEntryBean;
import javax.naming.InitialContext;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


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

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write('\n');

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

      out.write("\n");
      out.write("<html>\n");
      out.write(" <head>\n");
      out.write(" <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write(" <title>JSP Page</title>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write(" <h2>Enter Details</h2>\n");
      out.write(" <form name=\"result\" method=\"post\">\n");
      out.write(" Enter student's name: <input type='text' name=\"sname\" /><br>\n");
      out.write("Enter subject 1 marks: <input type='text' name=\"m1\" /><br>\n");
      out.write(" Enter subject 2 marks: <input type='text' name=\"m2\" /><br>\n");
      out.write(" Enter subject 3 marks: <input type='text' name=\"m3\" /><br>\n");
      out.write(" <input type='submit' name=\"InsertMarks\" /><br>\n");
      out.write(" </form>\n");
      out.write(" </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
