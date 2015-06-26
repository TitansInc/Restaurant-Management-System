<%@ page import="java.sql.*;" session="true"%>
<html>
<head>
<title> Crime Management System</title>
<style type="text/css">
body
{
background-image:url('new/2.jpg');
text-align:center;
}
.box
{
position:absolute;
background-color:	#181818;
-moz-border-radius:25px;
-moz-box-shadow: 5px 5px 5px #404040;
left:275px;
top:290px;
width:250px;
height:350px;
padding-top:10px;
word-wrap:break-word;
color:D8D8D8;
}
.boxsecond
{
width:520px;
left:550px;
top:290px;
overflow:auto;
text-align:left;
}

.redbox
{
position:absolute;
-moz-box-shadow: 5px 5px 5px #404040;
background:#800000 url("new/red_bg.jpg") repeat-x;
-moz-border-radius:25px;
width:250px;
height:300px;
top:665px;
word-wrap:break-word;
color:white;

}
.first
{
left:275;
}
.second
{
left:549;
}
.third
{
left:823;
}

.headingfont{font-variant:small-caps;}
.footer
{
position:absolute;
background:#181818 url("new/foot.jpg");

top:985px;
left:275px;
word-wrap:break-word;
width:810px;
height:75px;
color:white;
font-size:12px;
text-align:center;
}
a:link,a:visited {color:#FF7F00;font-weight:bold;font-size:14px;}  
a:hover{color:#ffffff;text-decoration:underline;}


</style>
</head>
<body>
<img src="new/Logo.jpg"></img>
<div class="box" >
	
	<embed src="new/home_flash.swf" height=132 width=250> </embed>
	
	<p>Already registered ?</p><a href="login.html">Login Here </a><br/>
	<p>Not yet registered ?</p><a href="newregister_u.html">SignUp Here</a></p>
</div>
	<div class="box boxsecond">
	<%
	try {

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con1 = DriverManager.getConnection("Jdbc:mysql://localhost/crimefiles", "root", "");
                Statement st = con1.createStatement();
                ResultSet rs = st.executeQuery("select * from hotnews");
                String place="",matter="",time="";
		while(rs.next())
		{
			place=rs.getString("place");
			matter=rs.getString("matter");
			time=rs.getString("time");
			out.println(place+" "+time);
			out.println("<br>"+"<br>");
			out.println(matter+"<br>"+"<br>");

		}
}
catch(Exception e)
{
out.println(e);
}
                                        %>          
	</div>

<div class="redbox first"><div class="headingfont"><h3 align="center">Missing Persons</h3></div><embed ><applet> code="gallery/ms.class" width=200 height=200</applet></embed>	</div>

<div class="redbox second">
	<div class="headingfont"><h3 align="center">Helping Citizens Stay Vigilant Against Crime </h3></div>
	
	<marquee behavior="scroll" direction="up" scrolldelay="0"><font color=#D8D8D8><p>Don�t walk or jog early in the morning or late at night when the streets are deserted.</br>
    When out at night, try to have a friend walk with you.</br>
    Carry only the money you�ll need on a particular day.</br>
    Don�t display your cash or any other inviting targets such as pagers, cell phones, hand-held electronic games, or expensive jewelry and clothing.</br>
    If you think someone is following you, switch directions or cross the street. If the person continues to follow you, move quickly toward an open store or restaurant or a lighted house. Don�t be afraid to yell for help.</br>
    Try to park in well-lighted areas with good visibility and close to walkways, stores, and people.</br>
    Make sure you have your key out as you approach your door.
    Always lock your car, even if it�s in your own driveway; never leave your motor running.</br>
    Do everything you can to keep a stranger from getting into your car or to keep a stranger from forcing you into his or her car.</br>
    If a dating partner has abused you, do not meet him or her alone. Do not let him or her in your home or car when you are alone.</br>
    If you are a battered spouse, call the police or sheriff immediately. Assault is a crime, whether committed by a stranger or your spouse or any other family member. If you believe that you and your children are in danger, call a crisis hotline or a health center (the police can also make a referral) and leave immediately.</br>
    If someone tries to rob you, give up your property�don�t give up your life.</br>
    If you are robbed or assaulted, report the crime to the police. Try to describe the attacker accurately. Your actions can help prevent someone else from becoming a victim.
</font></p></marquee></div> 
</div>

<div class="redbox third"><div class="headingfont"><h3 align="center">Most Wanted </h3></div><embed><applet> code="gallery/mw.class" width=200 height=200</applet></embed></div>
<div class="footer">
	<p>&nbsp;</p>
	<p>Copyright &copy; 2014 CMS </p>
</div>
</body>
</html>