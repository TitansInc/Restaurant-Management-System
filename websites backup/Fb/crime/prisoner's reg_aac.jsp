<%@page import="java.io.*,java.sql.*;"  session="true"%>

<html>
<head>
<style type="text/css">
body
{
background: black;

}.icon{
	position: absolute;
	width: 100px;
	margin:auto;
	height: 50px;
	left: 1150px;
	top:120px;
	font-size:14px;
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
<div class="icon"><a class="icon1" href="home_a.html">Home |</a>
<a class="icon1" href="logout.jsp">Logout</a></div>

</div>
<table align="center" height=70%>
<tr class="font">
<td class="td1"><p><table class="font" >
<form action="" method="post">

      <%
            try {
                String prison = request.getParameter("prino");
                String chargesheet = request.getParameter("csno");
                String nickname = request.getParameter("nn");
                String crimetype = request.getParameter("toc");
                String civil = request.getParameter("ci");
                String familymem = request.getParameter("fm");
                String identification = request.getParameter("im");
                String height = request.getParameter("height");
                String wat = request.getParameter("weight");
                String color = request.getParameter("clr");
			String status="o";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st2 = con1.createStatement();
                st2.executeUpdate("insert into prisonerregister values('"+prison+"','"+chargesheet+"','"+nickname+"','"+crimetype+"','"+familymem+"','"+identification+"','"+height+"','"+wat+"','"+color+"','"+status+"' )");
                out.println("Prisoner Register Successfully Updated");

            } catch (Exception e) {
                out.println(e);
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


					<li><a href="hotnews_a.html">Hot News </a></li>
					<li><a href="hotnews_areport.jsp">View Hot News </a></li>
					<li><a href="message_areport.jsp">View Message </a></li>
					<li><a href="mostwanted_a.html">Most Wanted </a></li>
					<li><a href="mostwanted_areport.jsp">View/Delete MostWanted </a></li>

					<li><a href="missingperson_a.html">Missing Persons </a></li>
					<li><a href="missingperson_areport.jsp">View/Delete Missing Persons </a></li>
					<li><a href="criminalregister_a.html">Criminal Register </a></li>
					<li><a href="criminalregister_areport.jsp">View/Delete Criminal Register </a></li>
					<li><a href="complaint_a.jsp">View Complaints </a></li>					
					<li><a href="crime_a.jsp">View CrimeReports </a></li>
					<li><a href="reply_a.html">Reply</a></li>
					<li><a href="reply_areport.jsp">All Replies</a></li>
					<li><a href="prisoner's reg_a.html">Prisoner's Register </a></li>
					<li><a href="prisoner's reg_areport.jsp">View Prisoner's Report </a></li>
					<li><a href="fir_a.html">FIR</a></li>
					<li><a href="fir_areport.jsp">FIR Report</a></li>
					<li><a href="userdetails_areport.jsp">View User Details </a></li>
					<li><a href="chargesheet_a.html">Chargesheet </a></li>
					<li><a href="chargesheet_areport.jsp">View/Delete Chargesheet </a></li>
					<li><a href="history_a.jsp">History</a></li>
				</ul>
			</li>
			<li>

				<h5>Account Settings </h5>
				<ul>
					<li><a href="changepass_a.html">Change Password </a></li>
					
				</ul>
			</li>

		</ul>
  </div>

</body>
</html>
