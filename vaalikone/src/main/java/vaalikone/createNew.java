package vaalikone;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "createNew",
    urlPatterns = {"/createNew"}
)
public class createNew extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

	  String newName = request.getParameter("Name");
	  System.out.println(newName);
	  response.sendRedirect("/mainpage");
  }
}