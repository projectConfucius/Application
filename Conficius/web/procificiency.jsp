<%-- 
    Document   : display
    Created on : Feb 19, 2018, 9:56:26 AM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="utf-8">
<link href="procificiency.css" rel="stylesheet">
</head>
<body>
<h1>The Sum is based on Radio Buttons Checks</h1>
    <form action="">
        <h2>How procifient are you in English ?</h2>
        <p><strong>I walk/bicycle  to work/school. </strong><br>
            Yes
            <input class="calc" type="radio" name="radio1" value="10">
            No
            <input class="calc" type="radio" name="radio1" value="0">
            Sometimes
            <input class="calc" type="radio" name="radio1" value="5"></p>
            <p><strong>I buy  locally grown food. </strong><br>
            Yes
            <input class="calc" type="radio" name="radio2" value="10">
            No
            <input class="calc" type="radio" name="radio2" value="0">
            Sometimes
            <input class="calc" type="radio" name="radio2" value="5"></p>
            <p><strong>I recycle. </strong><br>
            Yes
            <input class="calc" type="radio" name="radio3" value="10">
            No
            <input class="calc" type="radio" name="radio3" value="0">
            Sometimes
            <input class="calc" type="radio" name="radio3" value="5"></p>

            <p><strong>I compost. </strong><br>
            Yes
            <input class="calc" type="radio" name="radio4" value="10">
            No
            <input class="calc" type="radio" name="radio4" value="0">
            Sometimes
            <input class="calc" type="radio" name="radio4" value="5"></p>
        <p>Total Green Score:
            <input type="text" name="sum">
        </p>
    </form>
<script src="procificiency.js"></script>
</body>
</html>
