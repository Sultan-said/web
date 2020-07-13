<%--
  Created by IntelliJ IDEA.
  User: BRAIN DEROSSA
  Date: 13/07/2020
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% session.setAttribute ("message", "please guess");
 HttpSession session =request.getSession(true);
int randomnumber = (int) (Math. random() * 100) + 1; // get a random number
session.setAttribute("saveNumber", randomnumber);
    %>
<p>Visit or refresh this page to randomly drop a number between 1 and 100
    <br>Click the link below to go to guess the number
    < a href = "inputnumber. JSP" rel = "external nofollow" > guess the number</a>
</body>
</html>
