<%-- 
    Document   : display
    Created on : Feb 19, 2018, 9:56:26 AM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Data: </title>
    </head>
    <body>
        <h1>Thank you for joining our Application list</h1>
        <p>Here is the information you have entered</p>
        <jsp:useBean id="user" scope="session" class="UserApp.User"/>
        <table cellspacing="5" cellpadding="5" border="1">
            <tr>
                <td align="right">First Name:</td>
                <td><jsp:getProperty name="user" property="fname"/></td>
            </tr>
            <tr>
                <td align="right">Last Name:</td>
                <td><jsp:getProperty name="user" property="lname"/></td>
            </tr>
            <tr>
                <td align="right">Reg No:</td>
                <td><jsp:getProperty name="user" property="regno"/></td>
            </tr>
            <tr>
                <td align="right">Gender:</td>
                <td><jsp:getProperty name="user" property="gender"/></td>
            </tr>
            <tr>
                <td align="right">Choice:</td>
                <td><jsp:getProperty name="user" property="choice"/></td>
            </tr>
        </table>
    </body>
</html>
