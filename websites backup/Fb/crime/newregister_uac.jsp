<%@page import="java.io.*,java.sql.*;"  session="true"%>
<%
try{
int result;
String uname=request.getParameter("uname");
String pass = request.getParameter("pass");
String security=request.getParameter("security");

  String ans=request.getParameter("ans");
  String a=request.getParameter("text");
  String pi=request.getParameter("pin");
  String ph=request.getParameter("phn");
  String e=request.getParameter("email");
  String v=request.getParameter("village");
  String m=request.getParameter("mandal");
  String d=request.getParameter("dist");
  String s=request.getParameter("state");
	String stat="u";
Class.forName("com.mysql.jdbc.Driver");
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = con1.createStatement();
                //Statement st1 = con1.createStatement();
                st.executeUpdate("insert into login values('" + e + "','" + uname + "','" + pass + "','" + stat + "')");
                                out.println("Congrats!!Now you are a registered Member");
				
		st.executeUpdate("insert into details values('"+e+"','"+uname+"','"+security+"','"+ans+"','"+a+"','"+pi+"','"+ph+"','"+v+"','"+m+"','"+d+"','"+s+"')");
response.sendRedirect("login.html");

            } catch (Exception e) {
                out.println(e);
            }




%>
