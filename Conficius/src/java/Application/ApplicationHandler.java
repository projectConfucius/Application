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
import java.sql.*;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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

           // inserting data into mysql database 
           // create a test database and student table before running this to create table
           //create table application( 
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // loads mysql driver
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/applicationform", "root", "");
                
                String query = "insert into aapplication values(?, ?, ?, ?, ?)";
                
                PreparedStatement ps = con.prepareStatement(query); // generates sql query
                
                ps.setString(1, fName);
                ps.setString(2, lName);
                ps.setString(3, regNo);
                ps.setString(4, gender);
                ps.setString(5, choice);
                
                ps.executeUpdate();
                System.out.println("Succesfully inserted");
                ps.close();
                con.close();
            }
            catch (ClassNotFoundException | SQLException ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }
            
            RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
            rd.forward(request, response);
        }
    }
