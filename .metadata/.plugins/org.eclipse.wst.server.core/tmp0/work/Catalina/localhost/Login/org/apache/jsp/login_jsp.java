/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.44
 * Generated at: 2021-05-23 19:13:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#naver_id_login {\r\n");
      out.write("\t\tpadding: 0;\r\n");
      out.write("\t\twidth: 222px;\r\n");
      out.write("\t\theight: 49px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#naver_id_login_img {\r\n");
      out.write("\t\twidth: 222px;\r\n");
      out.write("\t\theight: 49px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/naverLogin_implicit-1.0.3.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://developers.kakao.com/sdk/js/kakao.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tKakao.init('5c95aa7ad857e55475bed627ba9faf99');\t\t// 카카오 developer javascript key\r\n");
      out.write("\t\tKakao.isInitialized();\t\t\t\t\t\t\t\t// 초기화 함수 실행\r\n");
      out.write("\t\tKakao.Auth.createLoginButton({ \t\t\t\t\t\t// 로그인 버튼 생성\r\n");
      out.write("\t\t\tcontainer : '#kakao_id_login',\r\n");
      out.write("\t\t\tsuccess : function(authObj) {\t\t\t\t\r\n");
      out.write("\t\t\t\tKakao.API.request({\t\t\t\t\t\t\t// REST API 호출\r\n");
      out.write("\t\t\t\t\turl : '/v2/user/me',\t\t\t\t\t// 사용자 정보 가져오기 GET/POST\r\n");
      out.write("\t\t\t\t\tsuccess : function(response) {\r\n");
      out.write("\t\t\t\t\t\tvar id = response.id;\r\n");
      out.write("\t\t\t\t\t\tvar nickname = response.properties.nickname;\r\n");
      out.write("\t\t\t\t\t\tvar form = document.createElement('form');\r\n");
      out.write("\t\t\t\t\t\tvar objs_1;\r\n");
      out.write("\t\t\t\t\t\tobjs_1 = document.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tobjs_1.setAttribute('type', 'hidden');\r\n");
      out.write("\t\t\t\t\t\tobjs_1.setAttribute('name', 'id');\r\n");
      out.write("\t\t\t\t\t\tobjs_1.setAttribute('value', id);\r\n");
      out.write("\t\t\t\t\t\tform.appendChild(objs_1);\r\n");
      out.write("\t\t\t\t\t\tobjs_2 = document.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tobjs_2.setAttribute('type', 'hidden');\r\n");
      out.write("\t\t\t\t\t\tobjs_2.setAttribute('name', 'nickname');\r\n");
      out.write("\t\t\t\t\t\tobjs_2.setAttribute('value', nickname);\r\n");
      out.write("\t\t\t\t\t\tform.appendChild(objs_2);\r\n");
      out.write("\t\t\t\t\t\tvar objs_4 = document.createElement('input');\r\n");
      out.write("\t\t\t\t\t\tobjs_4.setAttribute('type', 'hidden');\r\n");
      out.write("\t\t\t\t\t\tobjs_4.setAttribute('name', 'command');\r\n");
      out.write("\t\t\t\t\t\tobjs_4.setAttribute('value', 'login');\r\n");
      out.write("\t\t\t\t\t\tform.appendChild(objs_4);\r\n");
      out.write("\t\t\t\t\t\tform.setAttribute('method', 'post');\r\n");
      out.write("\t\t\t\t\t\tform.setAttribute('action', \"login.do\");\r\n");
      out.write("\t\t\t\t\t\tdocument.body.appendChild(form);\r\n");
      out.write("\t\t\t\t\t\tform.submit();\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfail : function(error) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(\"request fail\", error);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfail : function(err) {\r\n");
      out.write("\t\t\t\talert(JSON.stringify(err));\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"kakao_padding\">\r\n");
      out.write("\t\t<div id=\"kakao_id_login\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"naver_id_login\"></div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar naver_id_login = new naver_id_login(\"l7ZP85mP73uJt0uO_AOd\", \"http://localhost:8787/Login/naver_callback.jsp\"); // key값으로 객체 생성, callback url\r\n");
      out.write("\t\tvar state = naver_id_login.getUniqState();\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\tnaver_id_login.setButton(\"green\", 10, 40); \t\t\r\n");
      out.write("\t\tnaver_id_login.setDomain(\"http://localhost:8787/Login/naver_callback.jsp\"); \r\n");
      out.write("\t\tnaver_id_login.setState(state);\r\n");
      out.write("\t\tnaver_id_login.init_naver_id_login();\r\n");
      out.write("\t</script>\r\n");
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
