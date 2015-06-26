<html>
<head>
<link rel="stylesheet" href="UI/jquery-ui-1.8.custom.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body id="feedback">
<span id="rfhead">Restaurant Feedback form</span><br>
<span id="message">It is now time to evaluate the performance or our restaurant and catering operations as well as our community service. Hence we have this feedback form that I would request you to kindly fill out and send it back to me with your valued comments. I am sure, we will respectively make necessary changes or amendments to improve the business environment, quality food and better service.</span>
<center><span id="newTime"></span></center>
<table>
<tr><td>
<table id="meminfo">
<tr><td id="memhead" colspan="2">Member Information</td><td rowspan="13" id="ggraph"></td></tr>
<tr><td class="memid">Member Id:</td><td class="memid" id="memid" ></td></tr>
<tr><td class="memname">Member Name:</td><td id="memname" class="memname" ></td></tr>
<tr><td class="mememail">Email Address:</td><td id="mememail" class="mememail" ></td></tr>
<tr><td class="memphone">Phone:</td><td id="memphone" class="memphone" ></td></tr>
<tr><td colspan="2" id="pls">Please Evaluate the following</td></tr>
<tr><td class="rrr">Food and Drink</td><td class="fnd" ><div id="fnd" class="sliders"></div></td></tr>
<tr><td class="rrr">Customer Service:</td><td class="cservice"><div id="cservice" class="sliders"></div></td></tr>
<tr><td class="rrr">Ambiance:</td><td class="ambiance" ><div id="ambiance"  class="sliders"></div></td></tr>
<tr><td class="rrr">Staff Behaviour:</td><td class="sbeh" ><div  id="sbeh" class="sliders"></div></td></tr>
<tr><td class="rrr">Menu</td><td class="mmenu"><div id="mmenu" class="sliders"></div></td></tr>
<tr><td class="rrr">Price:</td><td class="pprice"> <div id="pprice" class="sliders"></div></td></tr>
<tr><td ><span class="rrr">Comments/Suggestions</span></td><td class="cs" ><textarea id="comments" cols="20" rows="3" style="resize:none" ></textarea></td></tr>
<tr><td></td><td colspan="2"><center><button id="fsumbit" onclick="FSubmit()">Submit</button></center></td></tr>
</table>
</td><td style="padding-left:100px;">
<table id="graph">
<tr>
<td id="graphic"><div class="range">5--</div><br><div class="range">4--</div><br><div class="range">3--</div><br><div class="range">2--</div><br><div class="range">1--</div></td>
<td class="fdfdf" ><div class="graph" id="gfnd"></div></td>
<td class="fdfdf"><div class="graph" id="gcservice"></div></td>
<td class="fdfdf"><div class="graph" id="gambiance"></div></td>
<td class="fdfdf"><div class="graph" id="gsbeh"></div></td>
<td class="fdfdf"><div class="graph" id="gmmenu"></div></td>
<td class="fdfdf"><div class="graph" id="gpprice"></div></td>
</tr>
<tr id="cl"><td></td><td class="cl">Food/Drinks</td><td class="cl">Customer Service</td><td class="cl">Ambiance</td><td class="cl">Service Behaviour</td><td class="cl">Menu</td><td class="cl">Price</td></tr>
</table>
        <?php
        require "connecttoserver.php";
        session_start();
        if (count($_SESSION) == 0) {
            header("Location: getin.php");
        }
		?>

</td>
</tr>
</table>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-1.4.4.js"></script>
<script type="text/javascript" src="jquery-ui-1.8.custom.js"></script>
<script type="text/javascript" src="Animation.js"></script>
<script type="text/javascript">
var food=0,service=0,ambiance=0,beh=0,menu=0,price=0,time='',userid='';

var rd_ck=document.cookie;
cookie_array=rd_ck.split(';');
for(var i=0;i<cookie_array.length;i++)
{
		read=cookie_array[i].split('=')[0];
		if(read==" username" || read=="username")
		{
			username=cookie_array[i].split('=')[1];
			userid=username;
			$('#memid').html('<b>'+userid);
		}
}
$.post('database.php',{userid:userid},function(data){
	var array=data.split('###');
	$('#memname').html('<b>'+array[0]);
	$('#mememail').html('<b>'+array[1]);
	$('#memphone').html('<b>'+array[2]);
});
setInterval(function(){
				$.post('database.php',{newTime:''},function(data){
					time=data;
				$('#newTime').html("<b>"+data);
	});
	},100	);

$('#fnd').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		food=ui.value/20;
	$('#gfnd').css({'height':ui.value*3.2,	"background-image": "url(Images/stymages/7.png)"})		
}	
});
$('#cservice').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		service=ui.value/20;
	$('#gcservice').css({'height':ui.value*3.2,		"background-image": "url(Images/stymages/41.png)"})		
}	
});
$('#ambiance').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		ambiance=ui.value/20;
	$('#gambiance').css({'height':ui.value*3.2,		"background-image": "url(Images/stymages/40.png)"})		
}	
});
$('#sbeh').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		beh=ui.value/20;
	$('#gsbeh').css({'height':ui.value*3.2,	"background-image": "url(Images/stymages/7.png)"	})		
}	
});
$('#mmenu').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		menu=ui.value/20;
	$('#gmmenu').css({'height':ui.value*3.2,"background-image": "url(Images/stymages/9.png)"})		
}	
});
$('#pprice').slider({
	min:0,
	max:100,
	slide:function(event,ui){
		price=ui.value/20;
	$('#gpprice').css({'height':ui.value*3.2,	"background-color": "crimson"})		
}	
});
function FSubmit()
{
	if(userid!='')
	{
		var sug=$('#comments').val();
		$.post('database.php',{mid:""+userid,food:food,service:service,ambiance:ambiance,beh:beh,menu:menu,price:price,sug:sug},function(data){alert("Your Feedback Submitted");window.location="menu.php";});
	}
	else
	{
		alert("You are not logged in");	
	}
}
</script>
</body>
</html>