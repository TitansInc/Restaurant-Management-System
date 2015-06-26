
<%@page import="java.sql.*" session="true"%>
	<%
	try
{

session.setAttribute("email1","");
session.setAttribute("pass1","");
	response.sendRedirect("login.html");
	
}
catch(Exception e)
{
}
%>