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
        <h1>Thank you for joining our Application list</h1>
        <p>Here is the information you have entered</p>
        <style>
            table#nat{
            width: 50%;
            background-color: #c48ec5;
            }
        </style>
    </head>
<body>  
<% 
	String fName =  request.getParameter("fName");
	String lName = request.getParameter("lName");
	String regNo = request.getParameter("regNo");
	String gender = request.getParameter("gender");
	String choice = request.getParameter("choice"); 
%>
<table id ="nat">
<tr>
	<td>First Name</td>
	<td><%= fName %></td>
</tr>
<tr>
	<td>Last Name</td>
	<td><%= lName %></td>
</tr>
<tr>
	<td>Reg No.</td>
	<td><%= regNo %></td>
</tr>
<tr>
	<td>Gender</td>
	<td><%= gender %></td>
</tr>
<tr>
	<td>Choice</td>
	<td><%= choice %></td>
</tr>
</table>
<br>
use " <i> select * from student; </i> " in mysql client to verify it.
</body>
</html>
    </body>
</html>
