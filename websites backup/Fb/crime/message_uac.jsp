<%@page import="java.sql.*;"  session="true"%>
<html>
<head>
<style type="text/css">
body
{
background: black;

}
.header {
	width: 1200px;
	height: 110px;
	-moz-border-radius:25px;
	margin: auto;
	background:url("new/red_bg.jpg") repeat-x;
	color: #ffffff;
	text-align:LEFT;
	text-shadow:10px 10px 3px #181818;
	font-size:40px;
	padding:20px;
	//font-weight:bold;
	font-family:free serif;
	font-variant:small-caps;
}.icon{
	position: absolute;
	width: 100px;
	margin:auto;
	height: 50px;
	left: 1150px;
	top:120px;
	font-size:14px;
}
.footer{
	position: absolute;
	width: 786px;
	margin:auto;
	height: 50px;
	left: 300px;
	top:600px;
	background: url(images/img6.gif) repeat-x;
	color: white;
	font-size:12px;
	text-align:center;
}
.font
{
font-size:14px;
color:red;
}
.td1
{
text-align:justify;
padding-left:130px;
padding-top:25px;
width:600px;
}
.td2
{
position:absolute;
text-align:left;
padding-left:30px;
left:900px;
top:180px;
width:200px;
color:white;
}
.align
{
text-align="right";
}
a:link,a:visited {color:#c8c8c8;text-decoration:none;font-size:13px;}  
a:hover{color:#ffffff;text-decoration:underline;}
h5{color:#e80000;text-decoration:underline;}
</style>
</head>
<body>
<div class="header">
		<p>Crime Management System</>

<div class="icon"><a class="icon1" href="home_u.html">Home |</a>
<a class="icon1" href="logout.jsp">Logout</a></div>

</div>
<table align="center" height=70%>
<tr class="font">
<td class="td1"><p><table class="font" >
<form action="msg_uac.jsp" method="post">
<%
try
{
 String subject = request.getParameter("subj");
  String msg = request.getParameter("msg");
 String stat="0";
int sn=0;
String date="12-03-2014";
String email =(String) session.getAttribute("email1");
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection con1= DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles","root","");
Statement st1 = con1.createStatement();

st1.executeUpdate("insert into message values('"+sn+"','"+email+"','"+subject+"','"+msg+"','"+date+"','"+stat+"')");
out.println("Message Sent");
}
catch(Exception e)
{
}
%>
</table>
</form>
</td>
</tr>
</table>
<div class="td2">
<ul>
			<li>
				<h5>New Additions</h5>
				<ul>
					<li><a href="complaint_u.html">Complaint</a></li>
					<li><a href="crimereport_u.html">Crime Report</a></li>
					<li><a href="missingperson_u.html">Missing Person </a></li>
					<li><a href="missingperson_ureport.jsp">View Missing Persons </a></li>
					<li><a href="mostwanted_ureport.jsp">View Mostwanted Persons</a></li>
					<li><a href="message_u.html">Message</a></li>
					<li><a href="viewstatus_u.jsp">View Status</a></li>
					<li><a href="viewall_u.jsp">View Status</a></li>
			    </ul>
			</li>
			<li>
				<h5>Account Settings </h5>
				<ul>
					<li><a href="changepass_u.html">Change Password</a></li>
					
			   </ul>
			</li>

		</ul>
  </div>
</body>
</html>
