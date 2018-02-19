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
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import Dao.ApplicationDao;

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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // get parameters from the request
        
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String regNo = request.getParameter("regNo");
        String gender = request.getParameter("gender");
        String choice = request.getParameter("choice");
        
        User user = new User();
        
        user.setFname(fName);
        user.setLname(lName);
        user.setRegno(regNo);
        user.setGender(gender);
        user.setChoice(choice);
        
        ApplicationDao applicationRegister = new ApplicationDao();
        
        String applicationRegistered = applicationRegister.registerApplication(user);
        
        if (choice == "Yes")
        {
            if(applicationRegistered.equals("SUCCESS"))
             {
                request.getRequestDispatcher("/procifiency.jsp").forward(request, response);
             }
            else
            {
                request.setAttribute("errMessage", applicationRegistered);
                request.getRequestDispatcher("/application.jsp").forward(request, response);
            }
        }
        else 
             {
                request.getRequestDispatcher("/goodbye.jsp").forward(request, response);
             }
        }
}
