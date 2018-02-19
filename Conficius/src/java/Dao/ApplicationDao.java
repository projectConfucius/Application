/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import UserApp.User;
import DB.DBConnection;

public class ApplicationDao
{
    public String registerApplication(User user)
    {
        String fName = user.getFname();
        String lName = user.getLname();
        String regNo = user.getRegno();
        String gender = user.getGender();
        String choice = user.getChoice();
        
        Connection con = null;
        PreparedStatement preparedStatement = null;
        
        try
        {
            con = DBConnection.createConnection();
            
            String query = "insert into application values(?, ?, ?, ?, ?)";
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, lName);
            preparedStatement.setString(3, choice);
            preparedStatement.setString(4, gender);
            preparedStatement.setString(5, regNo);
            
            int i = preparedStatement.executeUpdate();
            
            if (i!=0)
                return "SUCCESS";
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        
        return "Oops ... Something went wrong there ...!";
    }
}

