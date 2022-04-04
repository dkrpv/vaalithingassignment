package vaalikone;


import java.io.IOException;
import java.io.FileReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
    name = "AddPerson",
    urlPatterns = {"/this"}
)
public class form extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException {

    response.setContentType("text/html");
    response.setCharacterEncoding("UTF-8");
    FileReader fr = new FileReader("form.html");
    int i;
    while((i=fr.read())!=-1)
    	response.getWriter().print((char)i);
    fr.close();
  }
}