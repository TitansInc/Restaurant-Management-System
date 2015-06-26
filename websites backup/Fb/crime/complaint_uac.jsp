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
color: red;
//font-family:free serif;
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

a.icon1:link,a.icon1:visited {color:D8D8D8;text-decoration:none;font-weight:bold;font-size:13px;text-align:"center";}  
a.icon1:hover{color:#ffffff;text-decoration:underline;}

a:link,a:visited {color:#c8c8c8;text-decoration:none;font-size:13px;}  
a:hover{color:#ffffff;text-decoration:underline;}
h5{color:#e80000;text-decoration:underline;}
</style>

<script type="text/javascript">
function doJob()
{

  var ds=document.getElementById("suspecteddetails");
  var des=document.getElementById("description");
  var d=document.getElementById("date");
  var toc=document.getElementById("typeofcrime");
  var sub=document.getElementById("submit");
   
  if(ds.value == "" || des.value == "" || d.value == "" || toc.value =="")
	{
		alert("Fill all the fields");sub.innerHTML=("");return false;
	}
}
</script>

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
<%try{

String email =(String)session.getAttribute("email1");

                String detailssuspect = request.getParameter("suspecteddetails");
                String description = request.getParameter("description");
                String date = request.getParameter("date");
                String typecrime = request.getParameter("typeofcrime");
String comid="";
String status="o";
int snum;
ResultSet r;
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
			Statement st1 = con1.createStatement();
                Statement st2 = con1.createStatement();
		r=st1.executeQuery("select count(*) from complaintreg");
r.next();
		snum=r.getInt(1);
		
		snum+=1;
		comid="C"+snum;
               st2.executeUpdate("insert into complaintreg values('"+snum+"','"+email+"','"+detailssuspect+"','"+description+"','"+date+"','"+typecrime+"','"+comid+"','"+status+"')");
out.println("Your Complaint ID no:"+comid+"<br>");         
              out.println("Complaint submitted,take action soon,Thank You");


}
catch(Exception e)
{

}
%>
</table>
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
<div align="center">
<img src="new/footer.jpg"/>	
</div>
</body>
</html>
