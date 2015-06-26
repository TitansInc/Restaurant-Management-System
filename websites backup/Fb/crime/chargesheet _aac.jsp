
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
width:250px;
color:white;
}
.align
{
text-align="right";
}

a.icon1:link,a.icon1:visited {color:D8D8D8;text-decoration:none;font-weight:bold;font-size:13px;text-align:"center";}  
a.icon1:hover{color:#ffffff;text-decoration:underline;}

a:link,visited {color:#c8c8c8;text-decoration:none;font-size:13px;}  
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
<table align="center" height=80%>
<tr class="font">
<td class="td1"><p><table class="font" >
<form action="" method="post">

<tr><td height="50" colspan="2"><div align="center" font-size:14px >CHARGESHEET</div></td></tr>



<tr><td align="right"height="5">Chargesheet No:</td><td><input type ="text" name="cn" id="cn"></td></tr>
<tr><td align="right"height="5">Name of Police:</td><td><input type ="text" name="nop" id="nop"></td></tr>
<tr><td align="right"height="5">Date:</td><td><input type ="text" name="date" id="date"></td></tr>
<tr><td align="right"height="5">Fir No:</td><td><input type ="text" name="fn" id="fn"></td></tr>
<tr><td align="right"height="5">District:</td><td><input type ="text" name="District" id="District"></td></tr>
<tr>
    <td height="54" colspan="2"><div align="left"><em>Information Details:</em></div></td>
  </tr>
<tr><td align="right"height="5">Name:</td><td><input type ="text" name="name" id="name"></td></tr>
<tr><td align="right"height="5">Address:</td><td><textarea name ="text" rows="3" height="2"add="name" id="add"></textarea></td></tr>
<tr>
<tr><td align="right"height="5">Occupation:</td><td><input type ="text" name="occupation" id="occupation"></td></tr>
<tr><td align="right"height="5">Particulars:</td><td><input type ="text" name="pt" id="pt"></td></tr>
<tr>
    <td height="54" colspan="2"><div align="left"><em>Accused Details:</em></div></td>
  </tr>
<tr><td align="right"height="5">Name:</td><td><input type ="text" name="n" id="n"></td></tr>
<tr><td align="right"height="5">Address:</td><td><textarea name ="text" rows="3" height="2"add="name" id="add"></textarea></td></tr>
<tr>
    <td align="right"height="5">SEX :</td>
    <td>
 		
     <input type="radio" name="sex" value="male"> Male
     <input type="radio" name="sex" value="female"> Female
      </td>
  </tr>
<tr><td align="right"height="5">Age:</td><td><input type ="text" name="age" id="age"></td></tr>
<tr><td align="right"height="5">Occupation:</td><td><input type ="text" name="op" id="op"></td></tr>
<tr><td align="right"><span>Act:</span></div></td>
    <td><select name="select" id="select"><option>custody</option><option>released</option></select></td></tr>
<tr><td align="right"height="5">Action:</td><td><input type ="text" name="at" id="at"></td></tr>
<tr>
    <td height="54" colspan="2"><div align="left"><em>Witness Details:</em></div></td>
  </tr>
<tr><td align="right"height="5">Name:</td><td><input type ="text" name="name" id="name"></td></tr>
<tr><td align="right"height="5">Address:</td><td><textarea name ="text" rows="3" height="2"add="name" id="add"></textarea></td></tr>
<tr>
<tr><td align="right"height="5">Occupation:</td><td><input type ="text" name="oc" id="oc"></td></tr>
<center><td align="right" height="52"><input type = "submit" value="Submit"></td></center>
<center><td><input type = "submit" value="Cancel"></td></center></tr>

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
