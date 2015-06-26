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
</style>

<script type="text/javascript">
function doJob()
{
  var cn=document.getElementById("cn");
  var nop=document.getElementById("nop");
  var date=document.getElementById("date");
  var fn=document.getElementById("fn");
  var district=document.getElementById("District");
  var iname=document.getElementById("iname");
  var iad=document.getElementById("iad");
  var ioc=document.getElementById("ioc");
  var pt=document.getElementById("pt");
  var aname=document.getElementById("aname");
  var aad=document.getElementById("aad");
  var age=document.getElementById("age");
  var aoc=document.getElementById("aoc");
  var at=document.getElementById("at");
  var wname=document.getElementById("wname");
  var wad=document.getElementById("wad");
  var woc=document.getElementById("woc");
  var sub=document.getElementById("submit");
   
  if(cn.value == "" || nop.value =="" || date.value =="" || fn.value == ""|| district.value == "" || iname.value =="" || iad.value =="" || ioc.value == "" || pt.value == "" || aname.value =="" || aad.value =="" || age.value == "" || aoc.value == "" || at.value == "" || wname.value == "" || wad.value == "" || woc.value == "")
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
<table align="center" height=80%>
<tr class="font">
<td class="td1"><p><table class="font" >
<form action="chargesheet_aac.jsp" method="post">
<%

            try {
                String cn1 = request.getParameter("cn");
                String nop1 = request.getParameter("nop");
                String date1 = request.getParameter("date");
                String fn1 = request.getParameter("fn");
                String district1 = request.getParameter("District");
                String iname1 = request.getParameter("iname");
                String iad1 = request.getParameter("iad");
                String ioc1 = request.getParameter("ioc");
                String pt1 = request.getParameter("pt");
                String aname1 = request.getParameter("aname");
                String add1 = request.getParameter("aad");
                String sex1 = request.getParameter("select1");
                String age1 = request.getParameter("age");
                String aoc1 = request.getParameter("aoc");
		String act = request.getParameter("select");
                String at1 = request.getParameter("at");
                String wname1 = request.getParameter("wname");
                String wad1 = request.getParameter("wad");
	     	String woc1 = request.getParameter("woc");
		String status ="o";

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection conn1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = conn1.createStatement();
                st.executeUpdate("insert into chargesheet values('"+cn1+"','"+nop1+"','"+date1+"','"+fn1+"','"+district1+"','"+iname1+"','"+iad1+"','"+ioc1+"','"+pt1+"','"+aname1+"','"+add1+"','"+sex1+"','"+age1+"','"+aoc1+"','"+act+"','"+at1+"','"+wname1+"','"+wad1+"','"+woc1+"','"+status+"')");
                out.println("Chargesheet Saved successfully");
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
x
