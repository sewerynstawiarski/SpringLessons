<%@page import="java.util.Date"%>
<html>
<head>
<title>Yahoo@@@@</title>
</head>
<%
out.println("Whenever! Whatever!");
Date date = new Date();
%>
<div>Current date is <%=date%></div>
<body>
First one! Yeah! <br>
<%=request.getParameter("name")%>
<form action="/login" method="post">
Name: <input type="text" name="name"/><br>
Password: <input type="password" name="password"/><br>
<p><font color="red">${errorMassage}</font></p>
<input type="submit" value="Submit"/>

</form>
</body>
</html>