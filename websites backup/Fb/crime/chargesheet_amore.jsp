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
td{color:white;}

th{text-align:right;}
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
<table class="table" height=80% >
<tr class="font">
<td class="td1 td"><p><table class="font" align="center">
<form action="fir_aac.jsp" method="post">

<tr><th height="50" colspan="2"><div align="center" font-size:14px >CHARGESHEET</div></th></tr>

                <%
            try {
		String fir= request.getParameter("firno");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select * from chargesheet where firno='"+fir+"'");
		String chargesheetno = "", nameofpolicesta = "", Date = "", firno="", district="", infname="",infaddress="", infoccupation="", infparticulars="",
		accname="", accaddress="", sex="", accage="", accoccupation="", accstatus="", accaction="", wtsname="", wtsaddress="", wtsoccupation="", status="";
                                               
                                        
   
     while(rs.next())
	
	{
	chargesheetno = rs.getString("chargesheetno");
        nameofpolicesta = rs.getString("nameofpolicesta");
	Date = rs.getString("Date");
	firno = rs.getString("firno");
	district = rs.getString("district");
	infname = rs.getString("infname");
        infaddress = rs.getString("infaddress");
        infoccupation = rs.getString("infoccupation");
	infparticulars = rs.getString("infparticulars");
	accname = rs.getString("accname");
	accaddress  = rs.getString("accaddress");
	sex= rs.getString("sex");
	accage = rs.getString("accage");
	accoccupation=rs.getString("accoccupation");
	accstatus=rs.getString("accstatus");
	accaction=rs.getString("accaction");
	wtsname=rs.getString("wtsname");
	wtsaddress=rs.getString("wtsaddress");
	wtsoccupation=rs.getString("wtsoccupation");
        }
 %>
<tr><th>Chargesheet No:</th><td><%=chargesheetno%></td></tr>
<tr><th>Name of Police:</th><td><%=nameofpolicesta%></td></tr>
<tr><th>Date:</th><td><%=Date%></td></tr>
<tr><th>FIR No.:</th><td><%=firno%></td></tr>
<tr><th>District:</th><td><%=district  %></td></tr>

<tr><td height="54" colspan="2"><div align="left"><em>Information Details:</em></div></th></tr>
<tr><th>Name:	</th><td><%= infname  %></td></tr>
<tr><th>Address:</th><td><%= infaddress%></td></tr>
<tr><th>Occupation:</th><td><%=infoccupation%></td></tr>
<tr><th>Particulars:</th><td><%= infparticulars%></td></tr>

<tr><td height="54" colspan="2"><div align="left"><em>Accused Details:</em></div></th></tr>
<tr><th>Name:	</th><td><%= accname  %></td></tr>
<tr><th>Address:</th><td><%=accaddress%></td></tr>
<tr><th>Sex:</th><td><%= sex%></td></tr>
<tr><th>Age:</th><td><%= accage%></td></tr>
<tr><th>Occupation:</th><td><%=accoccupation%></td></tr>
<tr><th>Current Status:</th><td><%=accstatus %></td></tr>

<tr><td height="54" colspan="2"><div align="left"><em>Witness Details:</em></div></th></tr>
<tr><th>Name:	</th><td><%= wtsname  %></td></tr>
<tr><th>Address:</th><td><%=wtsaddress%></td></tr>
<tr><th>Occupation:</th><td><%=wtsoccupation %></td></tr>
<tr><th height="50" colspan="2"><div align="center"><a href="chargesheet_aclose.jsp?firno=<%=firno%>" >Close the Chargesheet</a></div></th></tr>

<%}catch (Exception e) {
                out.println(e);
            }%>
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

