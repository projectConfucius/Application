/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataIO;

import java.io.*;
import UserApp.User;

public class Data
{
    public static void add(User user, String filepath) throws IOException
    {
        File file = new File(filepath);
        PrintWriter out = new PrintWriter(new FileWriter(file, true));
        out.println(user.getFname() + "|" + user.getLname() + "|"
        + user.getRegno() + "|" + user.getGender() + "|"
        + user.getChoice());
        out.close();
    }
}
