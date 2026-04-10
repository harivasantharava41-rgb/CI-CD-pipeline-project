package com.harivasanth;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

/**
 * Simple Hello World Servlet
 * Deployed via Jenkins CI/CD Pipeline -> Maven -> Docker -> Tomcat
 * Author: Harivasanth Arava
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <title>MyApp - Deployed via CI/CD</title>");
        out.println("  <style>");
        out.println("    body { font-family: Arial; background: #0a0e1a; color: white; text-align: center; padding: 60px; }");
        out.println("    h1 { color: #4a90d9; font-size: 40px; }");
        out.println("    .badge { background: #1e3a5f; padding: 10px 20px; border-radius: 8px; margin: 8px; display: inline-block; }");
        out.println("  </style>");
        out.println("</head>");
        out.println("<body>");
        out.println("  <h1>🚀 CI/CD Pipeline - Deployed Successfully!</h1>");
        out.println("  <p>This application was built and deployed automatically using:</p>");
        out.println("  <div class='badge'>⚙️ Jenkins</div>");
        out.println("  <div class='badge'>📦 Maven</div>");
        out.println("  <div class='badge'>🔍 SonarQube</div>");
        out.println("  <div class='badge'>🐳 Docker</div>");
        out.println("  <div class='badge'>🚀 Tomcat</div>");
        out.println("  <div class='badge'>🐧 Linux</div>");
        out.println("  <br><br>");
        out.println("  <p>Developed by <strong>Harivasanth Arava</strong> | MCA Cloud Computing | Jain University</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
