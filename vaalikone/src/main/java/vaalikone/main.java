package vaalikone;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "main page",
    urlPatterns = {"/mainpage"}
)
public class main extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    response.getWriter().print("<link rel=\"stylesheet\" href=\"style.css\">");

    response.getWriter().print("<a href=\"/this\">Create New Candidate</a><br>");
    response.getWriter().print("<a href=\"/this\">Delete Candidate</a><br>");
    response.getWriter().print("<a href=\"/this\">Edit Candidate</a><br>");

  }
}