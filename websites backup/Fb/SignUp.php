<?php
if(isset($_POST['SignUp'])&&($_POST['UserName'])&&($_POST['RegName'])&&($_POST['RegPassword'])&&($_POST['RegRePass'])&&($_POST['DateOfBirth'])&&($_POST['Gender'])&&($_POST['SecurityQuest'])&&($_POST['SecurityAns'])){
	$UserName="Users/".$_POST['UserName'];
	$User_Name=$_POST['UserName'];
	$RegName=$_POST['RegName'];
	$RegPassword=$_POST['RegPassword'];
	$RegRePass=$_POST['RegRePass'];
	$DateOfBirth=$_POST['DateOfBirth'];
	$Gender=$_POST['Gender'];
	$SecurityQuest=$_POST['SecurityQuest'];
	$SecurityAns=$_POST['SecurityAns'];
	if(!is_dir($UserName) ){
		if(($RegPassword==$RegRePass)){
			echo "Signed up";		
			mkdir($UserName);
			chmod ("$UserName", 0777);
			$filename=$UserName."/User_Details.txt";
			$file=fopen("$filename","a");
			fwrite($file,$User_Name."\n");
			fwrite($file,$RegName."\n");
			fwrite($file,$RegPassword."\n");
			fwrite($file,$DateOfBirth."\n");
			fwrite($file,$Gender."\n");
			fwrite($file,$SecurityQuest."\n");
			fwrite($file,$SecurityAns."\n");
			}
		else{
			echo "Password does not match";
		}
	}
	else
		{
		echo "User Name Already Exists";
	}
}
else{
	header("location:index.php");
}

?>
