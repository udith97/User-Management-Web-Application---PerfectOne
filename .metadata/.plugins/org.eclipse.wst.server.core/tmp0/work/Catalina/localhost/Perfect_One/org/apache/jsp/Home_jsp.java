/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-21 13:59:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mvc.dao.IUserService;
import com.mvc.dao.UserServiceImpl;
import com.mvc.bean.User;
import com.mvc.controller.GetIdUserServlet;
import com.mvc.controller.UpdateUserServlet;
import java.util.ArrayList;
import java.sql.*;
import java.io.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("\t \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Perfect One || Home</title>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<title>Perfect One || Home</title>\r\n");
      out.write("<link rel=\"icon\" href=\"img/favicon.png\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("<!-- animate CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("<!-- owl carousel CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n");
      out.write("<!-- themify CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("<!-- flaticon CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flaticon.css\">\r\n");
      out.write("<!-- font awesome CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("<!-- swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("<!-- style CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div style=\"text-align: right\">\r\n");
      out.write("\tWelcome\r\n");
      out.write("\t");
      out.print(request.getAttribute("userName"));
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!--::header part start::-->\r\n");
      out.write("\t<header class=\"header_area\">\r\n");
      out.write("\t\t<div class=\"sub_header\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 col-xl-6\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"Home.jsp\"><img src=\"img/logo.jpg\"></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-8 col-xl-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub_header_social_icon float-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\"><i class=\"flaticon-phone\"></i>+94 777 123 456</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"text-align: right\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/LogoutServlet\">Logout</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"main_menu\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t<nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link active\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"gallery.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\">gallery</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-expanded=\"false\"> Pages </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"elements.jsp\">Elements</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"about.jsp\" class=\"nav-link\">About\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tus</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"nav-item\"><a href=\"contact.jsp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"nav-link\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"header_social_icon d-none d-lg-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"ti-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</nav>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"header_social_icon d-block d-lg-none\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"> <i class=\"ti-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"ti-skype\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- Header part end-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- banner part start-->\r\n");
      out.write("\t<section class=\"banner_part\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row align-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-7 col-xl-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"banner_text\">\r\n");
      out.write("\t\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t\t<span>Let Us</span><br> Make you Relax!\r\n");
      out.write("\t\t\t\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn_1\">learn more <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"ti-angle-right\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- banner part start-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- about part start-->\r\n");
      out.write("\t<section class=\"about_part\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 offset-xl-1 col-xl-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about_img\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/about.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-xl-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"about_text\">\r\n");
      out.write("\t\t\t\t\t\t<h4>About us</h4>\r\n");
      out.write("\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\tWelcome <br> to Perfect One\r\n");
      out.write("\t\t\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t\t\t<p>Perfect One is one of leading companies in Event Management\r\n");
      out.write("\t\t\t\t\t\t\t& Promotion field in Sri Lanka. The path of the company is to\r\n");
      out.write("\t\t\t\t\t\t\tassure the success of the customers who are willing to take the\r\n");
      out.write("\t\t\t\t\t\t\tservice from us. The dedication, motivation, & the vast\r\n");
      out.write("\t\t\t\t\t\t\texperience in the field will ensure the guarantee of the success\r\n");
      out.write("\t\t\t\t\t\t\tof the projects that we are handling. Innovativeness,\r\n");
      out.write("\t\t\t\t\t\t\tCreativeness,Smartness lead us to delight our customers forever.</p>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn_2\">read more</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- about part start-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- player info part start-->\r\n");
      out.write("\t<section class=\"player_info section_padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"player_info_item owl owl-carousel\">\r\n");
      out.write("\t\t\t\t\t<div class=\"player_info_iner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 col-xl-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"player_info_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"img/player_info.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 offset-xl-1 col-xl-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"player_info_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Customer Reviews</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>I have worked with Perfect One since early 2012 and they\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thave handled a variety of our activations, events and\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpromotions. I have found them to be extremely reliable and\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tefficient. The two co founders of the organization take a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpersonal interest in every activity they undertake which is\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvery crucial for me as this ensures quality of delivery in a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttimely manner. I have seen the growth they received over the\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tyears and I wish them all the best.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"player_info_iner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 col-xl-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"player_info_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"img/player_info1.png\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6 offset-xl-1 col-xl-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"player_info_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Customer Reviews</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>I have worked with Perfect One since early 2012 and they\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thave handled a variety of our activations, events and\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpromotions. I have found them to be extremely reliable and\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tefficient. The two co founders of the organization take a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tpersonal interest in every activity they undertake which is\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvery crucial for me as this ensures quality of delivery in a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ttimely manner. I have seen the growth they received over the\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tyears and I wish them all the best.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- about part start-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- gallery_part part start-->\r\n");
      out.write("\t<section class=\"gallery_part\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section_tittle text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Our Gallery</h4>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"gallery_part_item\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"grid-sizer\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"img/gallery/gallery_item_1.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height1 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_1.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_2.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height2 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_2.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_3.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--width2 grid-item--height2 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_3.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_4.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height3 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_4.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_5.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height3 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_5.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_6.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--width2 grid-item--height2 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_6.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_7.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height2 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_7.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"img/gallery/gallery_item_8.png\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"grid-item grid-item--height1 bg_img img-gal\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url('img/gallery/gallery_item_8.png')\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"single_gallery_item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"single_gallery_item_iner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"gallery_item_text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3>Face is had place image</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>Swords Club vs Uknights Club</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- gallery_part part end-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- social_connect_part part start-->\r\n");
      out.write("\t<section class=\"social_connect_part\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"row justify-content-center \">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"section_tittle text-center\">\r\n");
      out.write("\t\t\t\t\t\t<h4>Social Media</h4>\r\n");
      out.write("\t\t\t\t\t\t<h2>Follow Us Instagram</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-12\">\r\n");
      out.write("\t\t\t\t\t<div class=\"social_connect\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_1.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_2.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_3.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_4.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_5.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-social_connect\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"social_connect_img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/insta/instagram_6.png\" class=\"\" alt=\"blog\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social_connect_overlay\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\"><span class=\"ti-instagram\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- social_connect_part part end-->\r\n");
      out.write("\t<!-- footer part start-->\r\n");
      out.write("\t<section class=\"footer-area section_padding\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xl-4 col-sm-8 mb-4 mb-xl-0 single-footer-widget\">\r\n");
      out.write("\t\t\t\t\t<h4>Newsletter</h4>\r\n");
      out.write("\t\t\t\t\t<p>You can trust us. we only send promo offers,</p>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-wrap\" id=\"mc_embed_signup\">\r\n");
      out.write("\t\t\t\t\t\t<form target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\t\taction=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\"\r\n");
      out.write("\t\t\t\t\t\t\tmethod=\"get\" class=\"form-inline\">\r\n");
      out.write("\t\t\t\t\t\t\t<input class=\"form-control\" name=\"EMAIL\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Your Email Address\" onfocus=\"this.placeholder = ''\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonblur=\"this.placeholder = 'Your Email Address '\" type=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t<button class=\"click-btn btn btn-default text-uppercase\">subscribe</button>\r\n");
      out.write("\t\t\t\t\t\t\t<div style=\"position: absolute; left: -5000px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"b_36c4fd991d266f23781ded980_aefe40901a\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttabindex=\"-1\" value=\"\" type=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"info\"></div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<footer class=\"copyright_part\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row align-items-center\">\r\n");
      out.write("\t\t\t\t<p class=\"footer-text m-0 col-lg-8 col-md-12\">\r\n");
      out.write("\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\tAll rights reserved | Perfectone.lk\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\tclass=\"col-lg-4 col-md-12 text-center text-lg-right footer-social\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><i class=\"ti-facebook\"></i></a> <a href=\"#\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ti-twitter\"></i>\r\n");
      out.write("\t\t\t\t\t</a> <a href=\"#\"><i class=\"ti-instagram\"></i></a> <a href=\"#\"><i\r\n");
      out.write("\t\t\t\t\t\tclass=\"ti-skype\"></i></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- footer part end-->\r\n");
      out.write("\r\n");
      out.write("\t<!-- jquery plugins here-->\r\n");
      out.write("\t<!-- jquery -->\r\n");
      out.write("\t<script src=\"js/jquery-1.12.1.min.js\"></script>\r\n");
      out.write("\t<!-- popper js -->\r\n");
      out.write("\t<script src=\"js/popper.min.js\"></script>\r\n");
      out.write("\t<!-- bootstrap js -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- aos js -->\r\n");
      out.write("\t<script src=\"js/aos.js\"></script>\r\n");
      out.write("\t<!-- easing js -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.js\"></script>\r\n");
      out.write("\t<!-- swiper js -->\r\n");
      out.write("\t<script src=\"js/swiper.min.js\"></script>\r\n");
      out.write("\t<!-- swiper js -->\r\n");
      out.write("\t<script src=\"js/masonry.pkgd.js\"></script>\r\n");
      out.write("\t<!-- particles js -->\r\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("\t<!-- carousel js -->\r\n");
      out.write("\t<script src=\"js/swiper.min.js\"></script>\r\n");
      out.write("\t<!-- swiper js -->\r\n");
      out.write("\t<script src=\"js/swiper_custom.js\"></script>\r\n");
      out.write("\t<!-- custom js -->\r\n");
      out.write("\t<script src=\"js/custom.js\"></script>\r\n");
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
