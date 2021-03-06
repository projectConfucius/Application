<%-- 
    Document   : application
    Created on : Feb 19, 2018, 8:57:03 AM
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
<link href="form.css" rel="stylesheet">
<body>
<form id="regForm" action="ApplicationHandler" method="post">
  <h1>Application Form:</h1>
  <!-- One "tab" for each step in the form: -->
  <div class="tab">Name:
    <p><input placeholder="First name..." oninput="this.className = ''" name="fName"
              </p>
    <p><input placeholder="Last name..." oninput="this.className = ''" name="lName"
              </p>
  </div>
  <div class="tab">Registration Number:
    <p><input placeholder="Reg No...." oninput="this.className = ''" name="regNo"
              </p>
  </div>
  <div class="tab">Gender:
    <p><input placeholder="Male/Female ... " oninput="this.className = ''" name="gender"
              </p>
  </div>
  <div class="tab">Are you proficient in English:
    <p><input placeholder="Yes/No ... " oninput="this.className = ''" name="choice"
              </p>
  </div>
  <div style="overflow:auto;">
    <div style="float:right;">
      <button type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</button>
      <button type="button" id="nextBtn" onclick="nextPrev(1)">Next</button>
    </div>
  </div>
  <!-- Circles which indicates the steps of the form: -->
  <div style="text-align:center;margin-top:40px;">
    <span class="step"></span>
    <span class="step"></span>
    <span class="step"></span>
    <span class="step"></span>
  </div>
</form>
    <script src="form.js"></script>
</body>
</html>