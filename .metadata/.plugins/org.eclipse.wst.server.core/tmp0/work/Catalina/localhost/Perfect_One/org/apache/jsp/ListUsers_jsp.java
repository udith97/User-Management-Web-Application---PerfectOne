/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-21 14:13:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mvc.bean.User;
import com.mvc.dao.IUserService;
import com.mvc.dao.UserServiceImpl;
import com.mvc.bean.User;
import com.mvc.controller.GetIdUserServlet;
import com.mvc.controller.UpdateUserServlet;
import java.util.ArrayList;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;

public final class ListUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar", Long.valueOf(1381923344000L));
    _jspx_dependants.put("jar:file:/D:/Study%20Materials/Year%2002/Semester%2002/ITP/User%20Management/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Perfect%20One/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/sql.tld", Long.valueOf(1323238578000L));
    _jspx_dependants.put("jar:file:/D:/Study%20Materials/Year%2002/Semester%2002/ITP/User%20Management/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Perfect%20One/WEB-INF/lib/javax.servlet.jsp.jstl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1323238578000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.mvc.controller.UpdateUserServlet");
    _jspx_imports_classes.add("com.mvc.dao.UserServiceImpl");
    _jspx_imports_classes.add("com.mvc.controller.GetIdUserServlet");
    _jspx_imports_classes.add("com.mvc.bean.User");
    _jspx_imports_classes.add("com.mvc.dao.IUserService");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   <link rel = \"stylesheet\" type = \"text/css\" href = \"Employee.css\" />\r\n");
      out.write("   <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("   <link rel=\"icon\" href=\"img/favicon.png\">\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("    <!-- animate CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("    <!-- owl carousel CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/scroll.css\">\r\n");
      out.write("    <!-- themify CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("    <!-- flaticon CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("    <!-- font awesome CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("    <!-- swiper CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("    <!-- style CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/stylesheetstore.css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<title>Perfect One || User List</title>\r\n");
      out.write("  <style>\r\n");
      out.write("\t\t.bg-text {\r\n");
      out.write("\t\t  background-color: rgb(0,0,0); /* Fallback color */\r\n");
      out.write("\t\t  background-color: rgba(0,0,0, 0.25); /* Black w/opacity/see-through */\r\n");
      out.write("\t\t  color: white;\r\n");
      out.write("\t\t  font-weight: bold;\r\n");
      out.write("\t\t  padding: 20px;\r\n");
      out.write("\t\t  border: 3px solid #f1f1f1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t* {box-sizing: border-box;}\r\n");
      out.write("\t\t.topnav {\r\n");
      out.write("\t\t  overflow: hidden;\r\n");
      out.write("\t\t  background-color: #e9e9e9;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav a {\r\n");
      out.write("\t\t  float: left;\r\n");
      out.write("\t\t  display: block;\r\n");
      out.write("\t\t  color: black;\r\n");
      out.write("\t\t  text-align: center;\r\n");
      out.write("\t\t  padding: 14px 16px;\r\n");
      out.write("\t\t  text-decoration: none;\r\n");
      out.write("\t\t  font-size: 17px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav a:hover {\r\n");
      out.write("\t\t  background-color: #ddd;\r\n");
      out.write("\t\t  color: black;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav a.active {\r\n");
      out.write("\t\t  background-color: #2196F3;\r\n");
      out.write("\t\t  color: white;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav .search-container {\r\n");
      out.write("\t\t  float: right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav input[type=text] {\r\n");
      out.write("\t\t  padding: 6px;\r\n");
      out.write("\t\t  margin-top: 8px;\r\n");
      out.write("\t\t  font-size: 17px;\r\n");
      out.write("\t\t  border: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav .search-container button {\r\n");
      out.write("\t\t  float: right;\r\n");
      out.write("\t\t  padding: 6px 10px;\r\n");
      out.write("\t\t  margin-top: 8px;\r\n");
      out.write("\t\t  margin-right: 16px;\r\n");
      out.write("\t\t  background: #ddd;\r\n");
      out.write("\t\t  font-size: 17px;\r\n");
      out.write("\t\t  border: none;\r\n");
      out.write("\t\t  cursor: pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.topnav .search-container button:hover {\r\n");
      out.write("\t\t  background: #ccc;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t@media screen and (max-width: 600px) {\r\n");
      out.write("\t\t  .topnav .search-container {\r\n");
      out.write("\t\t    float: none;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  .topnav a, .topnav input[type=text], .topnav .search-container button {\r\n");
      out.write("\t\t    float: none;\r\n");
      out.write("\t\t    display: block;\r\n");
      out.write("\t\t    text-align: left;\r\n");
      out.write("\t\t    width: 100%;\r\n");
      out.write("\t\t    margin: 0;\r\n");
      out.write("\t\t    padding: 14px;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t  .topnav input[type=text] {\r\n");
      out.write("\t\t    border: 1px solid #ccc;  \r\n");
      out.write("\t\t  }\r\n");
      out.write("\t\t}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header class=\"header_area\">\r\n");
      out.write("\t\t   <div class=\"sub_header\">\r\n");
      out.write("\t\t     <div class=\"container\">\r\n");
      out.write("\t\t      <div class=\"row align-items-center\">\r\n");
      out.write("\t\t       <div class=\"col-md-4 col-xl-6\">\r\n");
      out.write("\t\t        <div id=\"logo\">\r\n");
      out.write("\t\t          <a href=\"AdminPanel.jsp\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t        <div class=\"col-md-8 col-xl-6\">\r\n");
      out.write("\t\t         <div class=\"sub_header_social_icon float-right\">\t\t              \r\n");
      out.write("\t\t          <a href=\"#\" class=\"register_icon\"><h1>Users List</h1></a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t     </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction search() {\r\n");
      out.write("\t\t  var input, filter, table, tr, td, i, txtValue;\r\n");
      out.write("\t\t  input = document.getElementById(\"myInput\");\r\n");
      out.write("\t\t  filter = input.value.toUpperCase();\r\n");
      out.write("\t\t  table = document.getElementById(\"myTable\");\r\n");
      out.write("\t\t  tr = table.getElementsByTagName(\"tr\");\r\n");
      out.write("\t\t  for (i = 0; i < tr.length; i++) {\r\n");
      out.write("\t\t    td = tr[i].getElementsByTagName(\"td\")[1];\r\n");
      out.write("\t\t    if (td) {\r\n");
      out.write("\t\t      txtValue = td.textContent || td.innerText;\r\n");
      out.write("\t\t      if (txtValue.toUpperCase().indexOf(filter) > -1) {\r\n");
      out.write("\t\t        tr[i].style.display = \"\";\r\n");
      out.write("\t\t      } else {\r\n");
      out.write("\t\t        tr[i].style.display = \"none\";\r\n");
      out.write("\t\t      }\r\n");
      out.write("\t\t     }       \r\n");
      out.write("\t\t    }\r\n");
      out.write("          }\r\n");
      out.write("     </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"topnav\">\r\n");
      out.write("\t<Button>\r\n");
      out.write("\t\t<a href=\"UserReport.jsp\">Download Report</a>\r\n");
      out.write("\t\t</Button>\r\n");
      out.write("    <div class=\"search-container\">\r\n");
      out.write("    <form action=\"/action_page.php\">\r\n");
      out.write("     <input type=\"text\" id=\"myInput\" onkeyup=\"search()\" placeholder=\"Search for user..\" title=\"Type in a name\">\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t  \r\n");
      out.write("\t  ");

	  	try{
	  		String conn = "jdbc:mysql://localhost:3306/customers2";
	  		Connection con = null;
	  		Statement st = null;
	  		ResultSet rs = null;
	  		Class.forName("com.mysql.jdbc.Driver").newInstance();
	  		
	  		con = DriverManager.getConnection(conn,"root","");
	  		
	  		st = con.createStatement();
	  		
	  		String QueryString = "SELECT * FROM users";
	  		rs = st.executeQuery(QueryString);  
	  
      out.write("\r\n");
      out.write("\t  <br>\r\n");
      out.write("\t  <div class=\"bg-text\" >\r\n");
      out.write("\t  \t\t<table class=\"table table-bordered\"  id=\"myTable\">\t\t \r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("                <th> ID</th>\r\n");
      out.write("                <th>Full Name</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>User Name</th>\r\n");
      out.write("                <th>Password</th>\r\n");
      out.write("                <th>Role</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("             ");
 
            	while(rs.next()){
             
      out.write(" \r\n");
      out.write("             ");
 
            int id= rs.getInt(1);
             
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("            \r\n");
      out.write("\t\t\t <tr>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(1) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(2) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(3) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(4) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(5) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> ");
      out.print(rs.getString(6) );
      out.write(" </td>\r\n");
      out.write("\t\t\t\t<td> \r\n");
      out.write(" \t\t\t\t<form action = \"GetIdUserServlet\" method = \"post\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updateId\" value=\"");
      out.print(rs.getString(1) );
      out.write("\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updateName\" value=\"");
      out.print(rs.getString(2) );
      out.write("\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updateEmail\" value=\"");
      out.print(rs.getString(3) );
      out.write("\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updateUserName\" value=\"");
      out.print(rs.getString(4) );
      out.write("\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updatePassword\" value=\"");
      out.print(rs.getString(5) );
      out.write("\">\r\n");
      out.write("                    \t<input type=\"hidden\" name=\"updateRole\" value=\"");
      out.print(rs.getString(6) );
      out.write("\">\r\n");
      out.write("              \r\n");
      out.write("                    \t\r\n");
      out.write("                    \t<button  type=\"submit\" value=\"Edit\"  class=\"btn btn-primary\" name=\"btnEdit\">Edit</i>\r\n");
      out.write("                     </button>\r\n");
      out.write("                     </form>\r\n");
      out.write(" \t\t\t    </td>\t\t\t\t\t \r\n");
      out.write(" \t\t\t\t<td>  \r\n");
      out.write("\t\t\t\t<form method=\"POST\" action=\"DeleteUserServlet\" onsubmit=\"return validateForm()\"> \r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"deleteRec\"  value=\"");
      out.print(rs.getInt(1));
      out.write("\" />\t\t\t\r\n");
      out.write(" \t\t\t    <input type=\"submit\" value= \"Remove\" class=\"btn btn-primary\" />  \r\n");
      out.write("\t\t\t    \r\n");
      out.write(" \t\t\t\t</form> \t\t\t\t  \r\n");
      out.write("\t\t\t\t</td>\t\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\r\n");
      out.write("\t\t\t");
	
		}
            
      out.write(" \r\n");
      out.write("            \r\n");
      out.write("            ");

            	rs.close();
            	st.close();
            	con.close();
            	
            	}catch (Exception e){
	  		
	  		out.println("Error");
	  	}
	  		
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
