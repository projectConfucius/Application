/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection createConnection()
    {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3308/applicationform";
        String username = "root";
        String password = "";
        
        try {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
            
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Printing connection object " + con);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
