<?php

if(isset($_POST['Login'])){
	$UserNameDir="Users/".$_POST['User_Name'];
	$Password=$_POST['Password'];
	$UserName=$_POST['User_Name'];
	
	if(is_dir($UserNameDir) ){
		$file=fopen($UserNameDir."/User_Details.txt","r");
		for($i=0;$i<=2;$i++){
			$pass=fgets($file,1024);
		}
		$pass=trim($pass);
		if($Password==$pass){
			header("location:Mainpage.php");
			fclose($file);	
		}
		else{
			header("location:ErrLogin.php");
		}
	}
	else{
		header("location:ErrLogin.php");
	}
}
?>
