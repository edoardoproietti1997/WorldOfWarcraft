<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<body>
<% String username = (String)request.getAttribute("username");
%>
  <form action = "" method = "GET">
  <input type = "hidden" name = "username" value ="<%=username%>">
  <p>bentornato <% %></p>
  </select>
    </form>
</body>
</html>