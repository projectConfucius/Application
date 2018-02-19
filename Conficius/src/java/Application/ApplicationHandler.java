/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import UserApp.User;
import DataIO.Data;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Daniel
 */
@WebServlet(name="ApplicationHandler", urlPatterns = {"/Conficius"})
public class ApplicationHandler extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // get parameters from the request
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String regno = request.getParameter("regno");
        String gender = request.getParameter("gender");
        String choice = request.getParameter("choice");
        
        // Create the UserIO object
        User user = new User();
        user.setFname(fname);
        user.setLname(lname);
        user.setRegno(regno);
        user.setGender(gender);
        user.setChoice(choice);
        
        // write the UserIO object to a file
        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/WEB-INF/application.txt");
        Data.add(user, path);
        
        // store the UserIO object in the session
        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        
        // forward request and response to JSP page
        String url = "/display.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        this.doPost(request, response);
    }
}
