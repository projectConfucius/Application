/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserApp;

import java.io.Serializable;

public class User implements Serializable
{
    private String fName;
    private String lName;
    private String choice;
    private String gender;
    private String regNo;
    
    public User()
    {
        fName = "";
        lName = "";
        choice = "";
        gender = "";
        regNo = ""; 
    }
    
    public User(String first, String last, String RegNo, String Gender, String Choice)
    {
        fName = first;
        lName = last;
        regNo = RegNo;
        gender = Gender;
        choice = Choice;
    }

    public String getFname() {
        return fName;
    }

    public void setFname(String fname) {
        this.fName = fname;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lname) {
        this.lName = lname;
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
        return regNo;
    }

    public void setRegno(String regno) {
        this.regNo = regno;
    }
    
}