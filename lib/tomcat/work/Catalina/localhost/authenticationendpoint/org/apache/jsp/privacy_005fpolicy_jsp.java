/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.85
 * Generated at: 2019-11-06 09:43:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ResourceBundle;
import org.wso2.carbon.identity.application.authentication.endpoint.util.AuthenticationEndpointUtil;
import org.wso2.carbon.identity.application.authentication.endpoint.util.EncodedControl;
import java.nio.charset.StandardCharsets;

public final class privacy_005fpolicy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/localize.jsp", Long.valueOf(1536728342000L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String BUNDLE = "org.wso2.carbon.identity.application.authentication.endpoint.i18n.Resources";
    ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE, request.getLocale(), new
            EncodedControl(StandardCharsets.UTF_8.toString()));

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write("</title>\n");
      out.write("\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.png\" type=\"image/x-icon\"/>\n");
      out.write("    <link href=\"libs/bootstrap_3.3.5/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/Roboto.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom-common.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"js/html5shiv.min.js\"></script>\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- header -->\n");
      out.write("<header class=\"header header-default\">\n");
      out.write("    <div class=\"container-fluid\"><br></div>\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"pull-left brand float-remove-xs text-center-xs\">\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <img src=\"images/logo-inverse.svg\" alt=\"wso2\" title=\"wso2\" class=\"logo\">\n");
      out.write("                <h1><em>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "identity.server"));
      out.write("\n");
      out.write("                </em></h1>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- page content -->\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-xs-12 col-sm-3 col-md-3 col-lg-3 col-sm-offset-1 col-md-offset-1 col-lg-offset-1\">\n");
      out.write("        <div id=\"toc\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-xs-12 col-sm-7 col-md-7 col-lg-7\">\n");
      out.write("        <!-- content -->\n");
      out.write("        <div class=\"container col-xs-12 col-sm-12 col-md-12 col-lg-12 col-centered wr-content wr-login col-centered padding-bottom-100\">\n");
      out.write("            <div>\n");
      out.write("                <h2 class=\"wr-title uppercase blue-bg padding-double white boarder-bottom-blue margin-none\">\n");
      out.write("                    ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "privacy.policy.general"));
      out.write("\n");
      out.write("                </h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"boarder-all \">\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div id=\"privacyPolicy\" class=\"padding-double\">\n");
      out.write("                    <h4><a href=\"http://wso2.org/library/identity-server\"><strong>About WSO2 Identity Server</strong></a></h4>\n");
      out.write("                    <p>WSO2 Identity Server (referred to as &ldquo;WSO2 IS 5.5.0&rdquo; within this policy) is an open source Identity Management and Entitlement Server that is based on open standards and specifications.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"privacy-policy\"><strong>Privacy Policy</strong></h2>\n");
      out.write("                    <p>This policy describes how WSO2 IS 5.5.0 captures your personal information, the purposes of collection, and information about the retention of your personal information.</p>\n");
      out.write("                    <p>Please note that this policy is for reference only, and is applicable for the software as a product. WSO2 Inc. and its developers have no access to the information held within WSO2 IS 5.5.0. Please see the <a href=\"privacy_policy.do#disclaimer\">Disclaimer</a> section for more information</p>\n");
      out.write("                    <p>Entities, organisations or individuals controlling the use and administration of WSO2 IS 5.5.0 should create their own privacy policies setting out the manner in which data is controlled or processed by the respective entity, organisation or individual.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"what-is-personal-information\">What is personal information?</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 considers anything related to you, and by which you may be identified, as your personal information. This includes, but is not limited to:</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Your user name (except in cases where the user name created by your employer is under contract)</li>\n");
      out.write("                        <li>Your date of birth/age</li>\n");
      out.write("                        <li>IP address used to log in</li>\n");
      out.write("                        <li>Your device ID if you use a device (e.g., phone or tablet) to log in</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p>However, WSO2 IS 5.5.0 also collects the following information that is not considered personal information, but is used only for <strong>statistical</strong> purposes. The reason for this is that this information can not be used to track you.</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>City/Country from which you originated the TCP/IP connection</li>\n");
      out.write("                        <li>Time of the day that you logged in (year, month, week, hour or minute)</li>\n");
      out.write("                        <li>Type of device that you used to log in (e.g., phone or tablet)</li>\n");
      out.write("                        <li>Operating system and generic browser information</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"collection-of-personal-information\">Collection of personal information</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 collects your information only to serve your access requirements. For example:\n");
      out.write("                    <ul>\n");
      out.write("                        <li>WSO2 IS 5.5.0 uses your IP address to detect any suspicious login attempts to your account.</li>\n");
      out.write("                        <li>WSO2 IS 5.5.0 uses attributes like your first name, last name, etc., to provide a rich and personalized user experience.</li>\n");
      out.write("                        <li>WSO2 IS 5.5.0 uses your security questions and answers only to allow account recovery.</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"tracking-technologies\">Tracking Technologies</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 collects your information by:</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Collecting information from the user profile page where you enter your personal data.</li>\n");
      out.write("                        <li>Tracking your IP address with HTTP request, HTTP headers, and TCP/IP.</li>\n");
      out.write("                        <li>Tracking your geographic information with the IP address.</li>\n");
      out.write("                        <li>Tracking your login history with browser cookies. Please see our <a href=\"cookie_policy.do\">cookie policy</a> for more information.</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"user-of-personal-information\">Use of personal information</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 will only use your personal information for the purposes for which it was collected (or for a use identified as consistent with that purpose).</p>\n");
      out.write("                    <p>WSO2 IS 5.5.0 uses your personal information only for the following purposes.</p>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>To provide you with a personalized user experience. WSO2 IS 5.5.0 uses your name and uploaded profile pictures for this purpose.</li>\n");
      out.write("                        <li>To protect your account from unauthorized access or potential hacking attempts. WSO2 IS 5.5.0 uses HTTP or TCP/IP Headers for this purpose.</li>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>This includes:</li>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>IP address</li>\n");
      out.write("                                <li>Browser fingerprinting</li>\n");
      out.write("                                <li>Cookies</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                        <li>Derive statistical data for analytical purposes on system performance improvements. WSO2 IS 5.5.0 will not keep any personal information after statistical calculations. Therefore, the statistical report has no means of identifying an individual person.</li>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>WSO2 IS 5.5.0 may use:</li>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>IP Address to derive geographic information</li>\n");
      out.write("                                <li>Browser fingerprinting to determine the browser technology or/and version</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </ul>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"disclosure-of-personal-information\">Disclosure of personal information</h2>\n");
      out.write("                    <p>WSO2 IS 5.5.0 only discloses personal information to the relevant applications (also known as âService Providersâ) that are registered with WSO2 IS 5.5.0. These applications are registered by the identity administrator of your entity or organization. Personal information is disclosed only for the purposes for which it was collected (or for a use identified as consistent with that purpose), as controlled by such Service Providers, unless you have consented otherwise or where it is required by law.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"legal-process\">Legal process</h3>\n");
      out.write("                    <p>Please note that the organisation, entity or individual running WSO2 IS 5.5.0 may be compelled to disclose your personal information with or without your consent when it is required by law following due and lawful process.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"storage-of-personal-information\">Storage of personal information</h2>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"where-your-personal-information-stored\">Where your personal information is stored</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 stores your personal information in secured databases. WSO2 IS 5.5.0 exercises proper industry accepted security measures to protect the database where your personal information is held. WSO2 IS 5.5.0 as a product does not transfer or share your data with any third parties or locations. </p>\n");
      out.write("                    <p>WSO2 IS 5.5.0 may use encryption to keep your personal data with an added level of security.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"how-long-does-is-5.5-keep-your-personal-information\">How long your personal information is retained</h3>\n");
      out.write("                    <p>WSO2 IS 5.5.0 retains your personal data as long as you are an active user of our system. You can update your personal data at any time using the given self-care user portals.</p>\n");
      out.write("                    <p>WSO2 IS 5.5.0 may keep hashed secrets to provide you with an added level of security. This includes:</p>\n");
      out.write("                    <ul>\n");
      out.write("                            <li>Current password</li>\n");
      out.write("                            <li>Previously used passwords</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"how-to-request-removal-of-your-personal-information\">How to request removal of your personal information</h3>\n");
      out.write("                    <p>You can request the administrator to delete your account. The administrator is the administrator of the tenant you are registered under, or the super-administrator if you do not use the tenant feature.</p>\n");
      out.write("                    <p>Additionally, you can request to anonymize all traces of your activities that WSO2 IS 5.5.0 may have retained in logs, databases or analytical storage.</p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"more-information\">More information</h2>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"changes-to-this-policy\">Changes to this policy</h3>\n");
      out.write("                    <p>Upgraded versions of WSO2 IS 5.5.0 may contain changes to this policy and revisions to this policy will be packaged within such upgrades. Such changes would only apply to users who choose to use upgraded versions.</p>\n");
      out.write("                    <p>The organization running WSO2 IS 5.5.0 may revise the Privacy Policy from time to time. You can find the most recent governing policy with the respective link provided by the organization running WSO2 IS 5.5. The organization will notify any changes to the privacy policy over our oficial public channels.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"your-choices\">Your choices</h3>\n");
      out.write("                    <p>If you are already have a user account within WSO2 IS 5.5.0, you have the right to deactivate your account if you find that this privacy policy is unacceptable to you.</p>\n");
      out.write("                    <p>If you do not have an account and you do not agree with our privacy policy, you can chose not to create one.</p>\n");
      out.write("                    <div class=\"margin-bottom\"></div>\n");
      out.write("                    <h3 id=\"contact-us\">Contact us</h3>\n");
      out.write("                    <p>Please contact WSO2 if you have any question or concerns regarding this privacy policy.</p>\n");
      out.write("                    <p><a href=\"https://wso2.com/contact/\">https://wso2.com/contact/</a></p>\n");
      out.write("                    <div class=\"margin-bottom-double\"></div>\n");
      out.write("                    <h2 id=\"disclaimer\">Disclaimer</h2>\n");
      out.write("                    <ol>\n");
      out.write("                      <li>WSO2, its employees, partners, and affiliates do not have access to and do not require, store, process or control any of the data, including personal data contained in WSO2 IS 5.5.0. All data, including personal data is controlled and processed by the entity or individual running WSO2 IS 5.5.0.  WSO2, its employees partners and affiliates are not a data processor or a data controller within the meaning of any data privacy regulations.  WSO2 does not provide any warranties or undertake any responsibility or liability in connection with the lawfulness or the manner and purposes for which WSO2 IS 5.5.0 is used by such entities or persons. </li>  \n");
      out.write("                      </br>\n");
      out.write("                      <li>This privacy policy is for the informational purposes of the entity or persons  running WSO2 IS 5.5.0 and sets out the processes and functionality contained within WSO2 IS 5.5.0 regarding personal data protection. It is the responsibility of entities and persons running WSO2 IS 5.5.0 to create and administer its own rules and processes governing usersâ personal data, and such  rules and processes may change the use, storage and disclosure policies contained herein. Therefore users should consult the entity or persons running WSO2 IS 5.5.0 for its own privacy policy for details governing usersâ personal data. </li>\n");
      out.write("                    </ol>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /content -->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- footer -->\n");
      out.write("<footer class=\"footer\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <p>");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "wso2.identity.server"));
      out.write(" | &copy;\n");
      out.write("            <script>document.write(new Date().getFullYear());</script>\n");
      out.write("            <a href=\"http://wso2.com/\" target=\"_blank\"><i class=\"icon fw fw-wso2\"></i>\n");
      out.write("                ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "inc"));
      out.write("\n");
      out.write("            </a>. ");
      out.print(AuthenticationEndpointUtil.i18n(resourceBundle, "all.rights.reserved"));
      out.write("\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"libs/jquery_1.11.3/jquery-1.11.3.js\"></script>\n");
      out.write("<script src=\"libs/bootstrap_3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/u2f-api.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var ToC = \"<nav role='navigation' class='table-of-contents'>\" + \"<h4>On this page:</h4>\" + \"<ul>\";\n");
      out.write("    var newLine, el, title, link;\n");
      out.write("\n");
      out.write("    $(\"#privacyPolicy h2,#privacyPolicy h3\").each(function() {\n");
      out.write("        el = $(this);\n");
      out.write("        title = el.text();\n");
      out.write("        link = \"#\" + el.attr(\"id\");\n");
      out.write("        if(el.is(\"h3\")){\n");
      out.write("            newLine = \"<li class='sub'>\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("        }else{\n");
      out.write("            newLine = \"<li >\" + \"<a href='\" + link + \"'>\" + title + \"</a>\" + \"</li>\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ToC += newLine;\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    ToC += \"</ul>\" + \"</nav>\";\n");
      out.write("\n");
      out.write("    $(\"#toc\").append(ToC);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
