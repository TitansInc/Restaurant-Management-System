<html>
<head>
<link rel="stylesheet" href="UI/jquery-ui-1.8.custom.css" />
<link rel="stylesheet" href="UI/jquery.ptTimeSelect.css" />
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<table id="main">
<th><div id="userid"></div></th>
<tr id="r1">
<td id="c11">
<div id='addition'></div>
</td>
<td id="c12">Your Selected Items</td>
</tr>
<tr id="r2">
<td id="c21">
<div id="Items_Div"><div id="items"></div></div>
<div id="Cart" ></div>
<div id="buttons"><center><button id="clear" onclick="Confirm_Delete('All')">Clear All</button><button id="continue" >Continue</button></center></div>
<span id="Method">Method
<fieldset class="RGU">
<input type="radio" class="radio" id="method_myself" />Collect Myself<br>
<input type="radio" class="radio" id="method_delivery" />Delivery
</fieldset><br><button id="Submit" >Submit</button></span>

<center><table id='Delivery_Addr'><th id='checker' colspan="2">Delivery Details</th>
<tr><td colspan="2"><center>Delivery No:<span id="DNo"></span></center></td></tr>
<tr><td class="me">Customer Name:</td><td id="c_name"><span id="username"></span></td></tr><tr><td class="me" id="reciver">Reciever Name:</td><td><input type="text" id="r_name" /></td></tr>
<tr><td class="me">Delivery Date:</td><td id="del_date"><input type="text" readonly="readonly"  id="date" /></td></tr><tr><td class="me" id="del_time">Delivery Time:</td><td><input readonly="readonly" type="text" id="time"/></td></tr>
<tr><td class="me">Contact No:</td><td id="c_num"><input type="text" id="p_no" />ex:(+9999999999)</td></tr>
<tr><td class="me">Address</td><td id="addr"><textarea cols="50" colspan="2" rows="5" id="address"></textarea></td></tr>
<tr><td></td><td><input type="button" id="Submit_Addr" value="Submit" onclick="Delivery_Details()" /></td></tr>
<tr><td colspan="2" id="error"></td></tr>
<tr><td colspan="2" id="home"><center><button onclick="Ctgr()" >Go to Home</button></center></td></tr>
</table></center>
</td>
<td id="c22">
<div id='user_rate'></div>
<div id='slected_item'></div>
</td>
</tr>
</table>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery-1.4.4.js"></script>
<script type="text/javascript" src="jquery-ui-1.8.custom.js"></script>
<script type="text/javascript" src="jquery.ptTimeSelect.js"></script>
<script type="text/javascript" src="Animation.js"></script>
<script type="text/javascript">
$("#date").datepicker({changeMonth:true,changeYear:true,slide:true,minDate:0});
$("#time").ptTimeSelect();
	</script>
</body>
</html>