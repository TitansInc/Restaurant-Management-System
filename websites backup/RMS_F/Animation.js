var MName=[],Categrs=[],MImage=[],Price=[],Description=[],CName=[],Rating=[],TempCat=[],category='All',rate='';
var CItems=[],CQuants=[],CRates=[],SubTotal=[],GTotal=0, username="",OrderNo='',DNo='',Stype='';
$(document).ready(function(){
	$('#user_rate').hide();
	$.post('database.php',{All:''},function(data){
	var xor=data.split("@@");
	var mname=xor[0].split('##');
	var mimage=xor[1].split('##');
	var price=xor[2].split('##');
	var description1=xor[3].split('##');
	var cname=xor[4].split('##');
	var rating=xor[5].split('##');
	for(var i=0;i<mname.length-1;i++)
	{
		MName.push(mname[i].toUpperCase());
		TempCat.push(mname[i].toUpperCase());
		MImage.push('Meals/'+mimage[i]+'');
		Price.push(parseInt(price[i]));
		Description.push(description1[i]);
		CName.push(cname[i]);
		Rating.push(parseInt(rating[i]));
	}
	Category();
	Items();
	Check_Cookie();
	});
	$.post('database.php',{OrderNo:''},function(data){
		
		var l=data.length;
		OrderNo='LPH';
		for(var i=10;i>=l;i--)
		{
			OrderNo+='0';	
		}
		OrderNo+=data;
	});
	$.post('database.php',{DeliveryNo:''},function(data){
		
		var l=data.length;
		DNo='DN';
		for(var i=8;i>l;i--)
		{
			DNo+='0';	
		}
		DNo+=data;
	});
	$('#Cart').hide();
	$('#Method').hide();
	$('#Delivery_Addr').hide();
	$('#user_rate').hide();
	$('#buttons').hide();

$('.radio').click(function(){
$('.radio').not(this).removeAttr('checked');	
});	

	
	$('#continue').click(function(){
		if(CItems.length>=1)
		{
			$('.delete').attr('disabled');
		$('#Method').show();		
	}
	else
	{
		alert('You dont have items to deliver');	
	}
});

$('#Submit').click(function(){
		var m1=document.getElementById('method_myself').checked;
		var m2=document.getElementById('method_delivery').checked;
		if(m2==true)
		{
			Stype='Delivery';
			$('#home').hide();
			$('#username').text(username);
			$('#DNo').text(DNo);
			$('#Delivery_Addr').show();
		}
		else if(m2==false && m1==false)
		{
			alert('Choose any method')	
		}
		else
		{
			Stype='CollectMyself';
		Database();
		alert('thanks for choosing self delivery');
		Confirm_Delete('All');
		$('#date').val('');
		$('#time').val('');
		$('#address').val('');
		$('#r_name').val('');
		$('#p_no').val('');
		Ctgr();
		}
	});
});

function Category()
{
	var ctgr="<span id='cat'>Category</span><select id='lst'><option class='list' onclick=ClickFunction(this.value) onmouseover=ClickFunction(this.value) value='All'>All</option>";
	var tt=[];
	for(var i=0;i<CName.length;i++)
	{
		if(tt.indexOf(CName[i])==-1)
		{
			tt.push(CName[i]);
			ctgr+="<option class='list' onclick=ClickFunction(this.value) onmouseover=ClickFunction(this.value) value="+CName[i]+">"+CName[i]+"</option>";
		}
	}
	ctgr+="</select><input type='text' onkeyup=Typed(this.value) id='text'/><button id='view_cart' onclick=View_Cart()>View Cart</button><br>";
	$('#addition').html(ctgr);
}
function ClickFunction(ctgrname)
{
	$('#user_rate').hide();
	category=ctgrname;
	Ctgr();
}

function Typed()
{
	Items();
	Ctgr();
}
function View_Cart()
{
	if(username!='')
	{
			$('#Items_Div').hide();
	$('#c12').hide();
	$('#c22').hide();
	$('#Cart').show();
	$('#buttons').show();
	$('#user_rate').hide();
	var qua=0,subt=0,total=0,body="<span id='orderno' >Order No:"+OrderNo+"</span><br><span id='orderlist' >Order List</span><br><table><tr><td class='MName' >Meal Name</td><td class='quantity' >Quantity</td><td class='price' >Price(RS)</td><td class='sub_total' >Sub Total</td><td class='del' >Delete</td></tr>";
	for(var l=0;l<CItems.length;l++)
	{
		qua=CQuants[l];
		subt=qua*parseInt(Price[CItems[l]]);
		SubTotal.push(subt);
		total+=subt;
		body+="<tr><td class='MName' >"+MName[CItems[l]]+"</td><td class='quantity' >"+CQuants[l]+"</td><td class='price' >"+Price[CItems[l]]+"</td><td class='sub_total' >"+subt+"</td><td class='del' ><input type='checkbox' class='delete' id='"+MName[CItems[l]]+"' /></td></tr>";
	}	
	body+="<tr><td class='MName' ></td><td class='quantity' ></td><td class='price' >Grand Total</td><td class='sub_total' >"+total+"</td><td class='del' ><button onclick=Confirm_Delete('Not') >Confirm Delete</button></td></tr></table>";
	$('#Cart').html(body);
	$('#total').text(total);
	GTotal=total;
	}
	else
	{
		alert('You are not logged in');	
	}
}

function Confirm_Delete(parm)
{
	var rr=false,i=0;
	for(i=0;i<CItems.length;i++)
	{
			rr=document.getElementById(""+MName[CItems[i]]).checked;
			if(rr==true && parm=='Not' && CItems.length>1 )
			{
					CItems.splice(i,1);
					CQuants.splice(i,1);
					CRates.splice(i,1);
					document.cookie="Items="+CItems;
					document.cookie="Quantities="+CQuants;
					document.cookie="Ratings="+CRates;
					Check_Cookie();	
					Confirm_Delete();
			}
			else if( parm=='All' || (rr==true && CItems.length==1))
			{
					var date=new Date();
					date.setTime(date.getTime()-1);
					document.cookie="Items=; expires="+date.toGMTString();
					document.cookie="Quantities=; expires="+date.toGMTString();
					document.cookie="Ratings=; expires="+date.toGMTString();
					CItems.splice(0,CItems.length);
					CQuants.splice(0,CQuants.length);
					CRates.splice(0,CRates.length);
					Check_Cookie();	
					View_Cart();
			}
		}
		View_Cart();
}

function Ctgr()
{
	$('#slected_item').hide();
	$('#Cart').hide();
	$('#buttons').hide();
	$('#Delivery_Addr').hide();
	$('#Method').hide();
	$('#user_rate').hide();
	$('#Items_Div').show();
	$('#c21').show();
	$('#c12').show();
	$('#c22').show();
	Items();
}
function Items()
{	
	var images='';
	var im_name=$('#text').val();
	var subs='';
	var rates=''
	var imgs='';
	if(category=='All' )
	{
		for(var i=0;i<MName.length;i++)
		{	

			var mname=MName[i].toUpperCase();	
			if(mname.indexOf(im_name.toUpperCase())!=-1)
			{
					for(j=1;j<=Rating[i];j++)
					{
						imgs+="<img class='rate' src=Images/Rating/rate.png />";
					}
				images+="<div class='items' id="+i+" onclick=Show(this.id) ><img src="+MImage[i]+" class='Items_images' ><br><span class='rates' >Rating:"+imgs+"</span><br><center><span class='names' >"+MName[i]+"</span></center></div><span id='len'></span>";	
					imgs='';			
			}
		}
	}
	else if(category!='All')
	{
		for(i=0;i<MName.length;i++)
		{
			var mname=MName[i].toUpperCase();	
			if((mname.indexOf(im_name.toUpperCase())!=-1) && category==CName[i])
			{
					for(j=1;j<=Rating[i];j++)
					{
						imgs+="<img class='rate' src=Images/Rating/rate.png />";
					}
				images+="<div class='items' id="+i+" onclick=Show(this.id) ><img src="+MImage[i]+" class='Items_images' ><br><span class='rates' >Rating:"+imgs+"</span><br><center><span class='names' >"+MName[i]+"</span></center></div><span id='len'></span>";	
				imgs='';
			}
		}
	}
	$('#items').html(images);
}
function User_Rate(num)
{
		var imgs="User Rating:";
		rate=num;
		for(var i=1;i<=5;i++)
		{
			if(i<=num)
			{
				imgs+="<img class='u_rate' src=Images/Rating/rate2.png id="+i+" onclick=User_Rate(this.id) />";
			}
			else
			{
				imgs+="<img class='u_rate' src=Images/Rating/rate1.png id="+i+" onclick=User_Rate(this.id) />";	
			}
			imgs+="";
		}
		$('#user_rate').html(imgs);
}
function Show(ind)
{
	$('#slected_item').show();
	var imgs='';
	var bt='';
	var qt=0;
	var ir=CItems.indexOf(ind);
	if(ir==-1)
	{
			User_Rate(0);
			qt='';
			bt='Add to Cart';
	}
	else if(ir>=0)
	{
		User_Rate(CRates[ir]);	
		qt=CQuants[ir];
		bt='Modify';
	}
	for(j=1;j<=Rating[ind];j++)
	{
		imgs+="<img class='rate' src=Images/Rating/rate.png />";
	}
	var image="<div id='index' ><img src="+MImage[ind]+" id='show_image' /><br><div id='show_name'><center>"+MName[ind]+"</center></div><div id='show_category'>Category: "+CName[ind]+"</div><div id='show_rating'>Rating:"+imgs+"</div><div id='show_price'>Price: Rs "+Price[ind]+" /- </div><div id='show_description'>Description: "+Description[ind]+"</div><div id='quant' >Quantity:<input value='"+qt+"' type='text' id='quantity' /></div><center><button id='Add_To_Cart' onclick=Add_To_Cart('"+ind+"') >"+bt+"</button></div></center></div>";
	$('#slected_item').html(image);
		$('#index').hover(function(){
		$('#user_rate').slideDown(function(){});
	});
}
function Add_To_Cart(dex)
{
	if(username!='')
	{
	var ir=CItems.indexOf(""+dex);
	if(CItems.indexOf(""+dex)==-1)
	{
		if(parseInt($('#quantity').val())>=1)
		{
			CItems.push(dex);
			CQuants.push(parseInt($('#quantity').val()));
			CRates.push(rate);
			document.cookie="Items="+CItems;
			document.cookie="Quantities="+CQuants;
			document.cookie="Ratings="+CRates;
			Check_Cookie();
			Show(dex);
			
		}
		else
		{
			alert('Please Enter valid quantity');	
		}
	}
	else
	{
		if(parseInt($('#quantity').val())>=1)
		{
			CQuants[ir]=parseInt($('#quantity').val());
			CRates[ir]=rate;
			document.cookie="Items="+CItems;
			document.cookie="Quantities="+CQuants;
			document.cookie="Ratings="+CRates;
			Check_Cookie();
			alert('Modified Successfully');	
		}
	}
}
else
{
	alert('You are not logged in');	
}
}
function Check_Cookie()
{
	var rd_ck=document.cookie;
	cookie_array=rd_ck.split(';');
	for(var i=0;i<cookie_array.length;i++)
	{
		read=cookie_array[i].split('=')[0];
		if(read=="Items" || read==" Items")
		{
			CItems=cookie_array[i].split('=')[1].split(',');
		}
		else if(read==" Quantities" || read=="Quantities")
		{
			CQuants=cookie_array[i].split('=')[1].split(',');
		}
		else if(read==" Ratings" || read=="Ratings")
		{
			CRates=cookie_array[i].split('=')[1].split(',');
		}
		else if(read==" username" || read=="username")
		{
			username=cookie_array[i].split('=')[1].toUpperCase();
			$('#userid').html('<b>'+username);
		}
	}
}
function Delivery_Details()
{
	var DDate=$('#date').val();
	var DTime=$('#time').val();
	var DAddr=$('#address').val();
	var RName=$('#r_name').val();
	var Phone=$('#p_no').val();
	$('#date').click(function(){$('#error').html("");});
	$('#time').click(function(){$('#error').html("");});
	$('#address').click(function(){$('#error').html("");});
	$('#r_name').click(function(){$('#error').html("");});
	$('#p_no').click(function(){$('#error').html("");});
	
	if(DDate!='' && DTime!='' && DAddr!='' && RName!='' && Phone!='')
	{
			$.post('database.php',{DTime:""+DTime,DAddr:""+DAddr,RName:""+RName,Phone:""+Phone,OrderNo:""+OrderNo},function(data){
		});
		Database();
		$('#error').html("<center><b>Your details have been recorded..</center>");
		Confirm_Delete('All');
		$('#date').val('');
		$('#time').val('');
		$('#address').val('');
		$('#r_name').val('');
		$('#p_no').val('');
		$('#home').show();
	}
	else
	{
		$('#error').html("<center><b>Please fill all the details..</center>");
	}
}
function Database()
{
		var Temp=[];
		for(var i=0;i<CItems.length;i++)
		{
			Temp.push(MName[CItems[i]]);
		}
		$.post('database.php',{Ratings:""+CRates,Names:""+Temp, User:username },function(data){
		});
		$.post('database.php',{OrderNo:""+OrderNo,MName:""+Temp,Quantity:""+CQuants,SubTotal:""+SubTotal },function(data){
			});
		$.post('database.php',{Ratings:""+CRates,Names:""+Temp,User:""+username },function(data){
		});
		$.post('database.php',{OrderNo:""+OrderNo,Total:GTotal,SType:""+Stype,MUser:username },function(data){
		});	
}
