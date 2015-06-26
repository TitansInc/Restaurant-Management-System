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
<table class="table" height=80% >
<tr class="font">
<td class="td1 td"><p><table class="font" align="center">
<form action="fir_aac.jsp" method="post">

<tr><th height="50" colspan="2"><div align="center" font-size:14px >FIR</div></th></tr>

                <%
            try {
String fir= request.getParameter("firno");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select * from fir where firno='"+fir+"'");
                String district = "", Datc = "", time = "",typeofinformation="",placeofoccurence="",foreignlocal="",act="",firno="",section="",gdre="",add="",pass="",com="",polic="",rti="",infor="",dist="",status="";
                                               
                                        
   
     while(rs.next())
	
	{
district = rs.getString("district");
                                               Datc  = rs.getString("Datc");
                                              time= rs.getString("time");
											  typeofinformation = rs.getString("typeofinformation");
											   placeofoccurence = rs.getString("placeofoccurence");
                                               foreignlocal  = rs.getString("foreignlocal");
act= rs.getString("act");
											  firno = rs.getString("firno");
section=rs.getString("section");
gdre=rs.getString("diaryrefno");
add=rs.getString("informantadd");
pass=rs.getString("passportno");
com=rs.getString("complaintno");
polic=rs.getString("police");
rti=rs.getString("receivedtime");
infor=rs.getString("informationrec");
dist=rs.getString("distancefrmpolst");
                
				 

             }
                                    %>
<tr><th>District:</th><td><%=district%></td></tr>
<tr><th>Date:	</th><td><%=Datc%></td></tr>
<tr><th>Time:</th><td><%= time%></td></tr>
<tr><th>Type of information:</th><td><%=typeofinformation%></td></tr>
<tr><th>Place of occurrence:</th><td><%=placeofoccurence  %></td></tr>
<tr><th>Foreign/Local:	</th><td><%= foreignlocal  %></td></tr>
<tr><th>Act:</th><td><%=act%></td></tr>
<tr><th>FIR No:</th><td><%=firno %></td></tr>
<tr><th>Section:	</th><td><%= section %></td></tr>
<tr><th>General Diary Ref Entry No:</th><td><%= gdre%></td></tr>
<tr><th>Informant Address:</th><td><%= add%></td></tr>
<tr><th>Passport No:	</th><td><%= pass%></td></tr>
<tr><th>Complaint No:	</th><td><%=com %></td></tr>
<tr><th>Police:	</th><td><%= polic%></td></tr>
<tr><th>Received Time:	</th><td><%= rti%></td></tr>
<tr><th>Information Received:	</th><td><%=infor %></td></tr>
<tr><th>Distance from Police Station:	</th><td><%=dist %></td></tr>
<tr><th height="50" colspan="2"><div align="center"><a href="fir_acclose.jsp?firno=<%=firno%>&complaintno=<%=com%>" >Close the Fir</a></div></th></tr>

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
<div align="center">
<img src="new/footer.jpg"/>	
</div>
</body>
</html>

