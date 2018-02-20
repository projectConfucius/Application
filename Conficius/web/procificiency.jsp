<%-- 
    Document   : display
    Created on : Feb 19, 2018, 9:56:26 AM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <title>English Test</title><br>
	 <link href="https://fonts.googleapis.com/css?family=PT+Sans" rel="stylesheet">
	 <link href="procificiency.css" rel="stylesheet">
 </head>
 <body>
   <div id="quizContainer" class="container">
	<div class="title">English Proficiency Test</div><br>
	<div id="question" class="question"></div>
	<label class="option"> <input type="radio" name="option" value="1"/><span id="opt1"></span>
	</label>
	<label class="option"><input type="radio" name="option" value="2"/><span id="opt2"></span>
	</label>
	<label class="option"><input type="radio" name="option" value="3"/><span id="opt3"></span>
	</label>
	<label class="option"><input type="radio" name="option" value="4"/><span id="opt4"></span>
	</label>
	
	<button id="nextButton" class="next-btn" onclick="loadNextQuestion();">Next Question</button>
   </div>
	
	<div id= "result" class="container result" style="display:none;">
	</div>
	
	<script src="question.js"></script>
	<script src="quiz-script.js"></script>
 </body>
</html>
