
<%@page import="java.sql.*" session="true"%>
	<%
	try
{
String email=request.getParameter("email");
String pass=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con1=DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles","root","");
Statement st1=con1.createStatement();
Statement st2=con1.createStatement();
ResultSet r;
String status="";
int s=0;
r=st1.executeQuery("select * from login where email='"+email+"' and password='"+pass+"'");
while(r.next())
{
status=r.getString("status");
	s=1;
session.setAttribute("email1",email);
session.setAttribute("pass1",pass);


if(status.equals("u"))
	{
	response.sendRedirect("home_u.html");
	}
else if(status.equals("a"))
	{
	response.sendRedirect("home_a.html");
	}
}
if(s==0)
	{
	response.sendRedirect("login_invalid.html");

	}
}
catch(Exception e)
{
out.println(e);
}
%>