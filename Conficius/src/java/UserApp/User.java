/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserApp;

import java.io.Serializable;

public class User implements Serializable
{
    private String fname;
    private String lname;
    private String choice;
    private String gender;
    private String regno;
    
    public User()
    {
        fname = "";
        lname = "";
        choice = "";
        gender = "";
        regno = ""; 
    }
    
    public User(String first, String last, String RegNo, String Gender, String Choice)
    {
        fname = first;
        lname = last;
        regno = RegNo;
        gender = Gender;
        choice = Choice;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }
    
}