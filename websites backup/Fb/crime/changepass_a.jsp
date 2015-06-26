<%@page import="java.io.*,java.sql.*;"  session="true"%>
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
}
.icon{
	position: absolute;
	width: 100px;
	margin:auto;
	height: 50px;
	left: 1150px;
	top:120px;
	font-size:14px;
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
padding-top:5px;
width:800px;
}
.td2
{
position:absolute;
text-align:left;
padding-left:30px;
left:900px;
top:180px;
width:300px;
color:white;
}
.align
{
text-align="right";
}

a.icon1:link,a.icon1:visited {color:D8D8D8;text-decoration:none;font-weight:bold;font-size:13px;text-align:"center";}  
a.icon1:hover{color:#ffffff;text-decoration:underline;}

a:link,a:visited {color:#c8c8c8;text-decoration:none;font-size:13px;}  
a:hover{color:#ffffff;text-decoration:underline;}
h5{color:#e80000;text-decoration:underline;}
td
{
border:1px solid gray;vertical-align:top;}
table
{border-collapse:collapse;}
td{color:white;}
.td{border:0px solid gray;vertical-align:top;}
</style>

<script type="text/javascript">
function doJob()
{
  var dis=document.getElementById("district");
  var date=document.getElementById("date");
  var time=document.getElementById("time");
  var toi=document.getElementById("toi");
  var poc=document.getElementById("poc");
  var fl=document.getElementById("fl");
  var fno=document.getElementById("fno");
  var section=document.getElementById("section");
  var gdren=document.getElementById("gdren");
  var ia=document.getElementById("ia");
  var passno=document.getElementById("passno");
  var comno=document.getElementById("comno");
  var police=document.getElementById("police");
  var rt=document.getElementById("receivetime");
  var ir=document.getElementById("inforeceived");
  var dfps=document.getElementById("dfps");
  var sub=document.getElementById("submit");
   
  if(dis.value == "" || date.value == "" || time.value =="" || toi.value =="" || poc.value == "" || fl.value == "" || fno.value =="" || section.value =="" || gdren.value == "" || ia.value == "" || passno.value =="" || comno.value =="" || police.value == "" || rt.value == "" || ir.value =="" || dfps.value =="")
	{
		alert("Fill all the fields");sub.innerHTML=("");return false;
	}

}
</script>


</head>
<body>
<div class="header">
		<p>Crime Management System</>
<div class="icon"><a class="icon1" href="home_a.html">Home |</a>
<a class="icon1" href="logout.jsp">Logout</a></div>
</div>
<table class="table" height=80% cellpadding="0">
<tr class="font">
<td class="td1 td"><p><table class="font table" align="right" height=100% width=100%>
<form action="fir_aac.jsp" method="post">



                <%
            try {
		
		String email =(String)session.getAttribute("email1");
		String old=request.getParameter("old");
		String anew=request.getParameter("new");
		String cnew=request.getParameter("cnew");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select * from login where email='"+email+"'");
                String pass= "";
		while(rs.next())
		{
			pass=rs.getString("password");
			if(!old.equals(pass))
				{
					response.sendRedirect("changepass.html");break;

				}
			else if(old.equals(pass))
			{st.executeUpdate("update login set password='"+anew+"'where email='"+email+"'");
			out.println("Password Changed");}

		}
                                              
                                        


            } catch (Exception e) {
               
            }
                                    %>

</form>
</table>
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
<div align="center">
<img src="new/footer.jpg"/>	
</div>
</body>
</html>

