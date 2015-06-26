<?php
if(isset($_POST['All']))
{
	require "config.php";
	$MName='';
	$MImage='';
	$Price='';
	$Description='';
	$CName='';
	$RatingValue='';
	
	$sql="SELECT * FROM Meals";
	$exec=mysql_query($sql,$con);
	while($row=@mysql_fetch_array($exec))
	{
		$name=$row['MName'];
		$MName.=$name."##";
		$MImage.=$row['MImage']."##";
		$Price.=$row['Price']."##";
		$Description.=$row['Description']."##";
		$CName.=$row['CName']."##";
		$qer=mysql_query("SELECT avg(RatingValue) FROM Rating where MName='".$name."'",$con);
		$qrs=mysql_fetch_assoc($qer);
		$rate=$qrs['avg(RatingValue)'];
		if($rate=='')
		{
			$RatingValue.="0##";
		}
		else {
			$RatingValue.=$rate."##";
			}
	}
echo $MName."@@".$MImage."@@".$Price."@@".$Description."@@".$CName."@@".$RatingValue;
}


if(isset($_POST['OrderNo']))
{
	require "config.php";	
	echo mysql_num_rows(mysql_query("SELECT * FROM Orders"))+1;
}


if(isset($_POST['DeliveryNo']))
{
	require "config.php";	
	echo mysql_num_rows(mysql_query("SELECT * FROM Delivery"))+1;
}


if(isset($_POST['Ratings'],$_POST['Names'],$_POST['User']))
{
	require "config.php";	
	$rates=$_POST['Ratings'];
	$names=$_POST['Names'];
	$username=$_POST['User'];

	$Rates=split(",",$rates);
	$Names=split(",",$names);
	for($i=0;$i<count($Rates);$i++) {
		$sql="INSERT INTO Rating (RatingValue, MName, MUserName) VALUES('".$Rates[$i]."','".$Names[$i]."','".$username."')";
		mysql_query($sql,$con);
		}
}


if(isset($_POST['DTime'],$_POST['DAddr'],$_POST['RName'],$_POST['Phone'],$_POST['OrderNo']))
{
		require "config.php";
		$time=$_POST['DTime'];
		$addr=$_POST['DAddr'];
		$rname=$_POST['RName'];
		$phone=$_POST['Phone'];
		$order=$_POST['OrderNo'];
		$sql="INSERT INTO Delivery (OrderNo,Receiver,CPhoneNo,DAddress,DTime) VALUES ('".$order."','".$rname."','".$phone."','".$addr."','".$time."')";
		mysql_query($sql,$con);
}
if(isset($_POST['OrderNo'],$_POST['MName'],$_POST['Quantity'],$_POST['SubTotal']))
{
	require "config.php";
	$order=$_POST['OrderNo'];
	$names=$_POST['MName'];
	$quants=$_POST['Quantity'];
	$subt=$_POST['SubTotal'];
	
	$Quants=split(",",$quants);
	$Names=split(",",$names);
	$SubT=split(",",$subt);
	
	for($i=0;$i<count($Names);$i++) {
		$sql="INSERT INTO OrderDetails (OrderNo, MName, Quantity,SubTotal) VALUES('".$order."','".$Names[$i]."','".$Quants[$i]."','".$SubT[$i]."')";
		$query=mysql_query($sql,$con);
		if(!$query)
		{
			echo mysql_error();	
		}
		}
}

if(isset($_POST['OrderNo'],$_POST['Total'],$_POST['SType'],$_POST['MUser']))
{
	require "config.php";	
	$order=$_POST['OrderNo'];
	$Gtotal=$_POST['Total'];
	$username=$_POST['MUser'];
	$stype=$_POST['SType'];

	$sql="INSERT INTO Orders (OrderNo,TotalAmount,ODate,OTime,ServiceType,CookStatus,MemberID) VALUES ('".$order."','".$Gtotal."',curdate(),curtime(),'".$stype."','Waiting','".$username."')";
	mysql_query($sql,$con);
}
if(isset($_POST['newTime']))
{
	$date=date("d")-1;
	$date.=date("/m/Y");
	$atime=date('his',strtotime('+180 minute'));
	if(date('H')<12)
	{
		$atime.=" PM";
	}
	else
	{
		$atime.=" AM";	
	}
	echo $date.' '.$atime;
}
if(isset($_POST['mid'],$_POST['food'],$_POST['service'],$_POST['ambiance'],$_POST['beh'],$_POST['menu'],$_POST['price'],$_POST['sug']))
{
	require "config.php";
	$FNo=mysql_num_rows(mysql_query("SELECT * FROM Feedback"))+1;
	$sql="INSERT INTO Feedback (FNo,VFoodDrinks,VCustomerService,VStaffBehaviour,VAmbiance,VMenu,VPrice,Comment,FDate,MemberID) VALUES ('".$FNo."','".$_POST['food']."','".$_POST['service']."','".$_POST['beh']."','".$_POST['ambiance']."','".$_POST['menu']."','".$_POST['price']."','".$_POST['sug']."',curdate(),'".$_POST['mid']."')";
	mysql_query($sql,$con);
}
if(isset($_POST['userid']))
{
	require "config.php";
	$name='';
	$email='';
	$phone='';
	$sql="SELECT MFirstName,MEmail,MMobile from Member where MUserName='".$_POST['userid']."'";
	$exec=mysql_query($sql,$con);
	while($row=@mysql_fetch_array($exec))
	{
		$name=$row['MFirstName'];
		$email=$row['MEmail'];
		$phone=$row['MMobile'];
	}
	echo $name."###".$email."###".$phone;
}
?>
