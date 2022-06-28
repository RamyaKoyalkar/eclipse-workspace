<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Boot Demo</title>
<link rel="stylesheet" href="/resources/static/css/hello.css">
<script type="text/javascript" src="/resources/static/js/app.js"></script>
</head>
<body>

<h1>Spring Boot - MVC web application example</h1>
  <hr>

 

  <div class="form">
    <form action="wipro" method="post" onsubmit="return validate()">
      <table>
        <tr>
          <td>Enter Your name</td>
          <td><input id="name" name="name"></td>
          <td><input type="submit" value="Submit"></td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>