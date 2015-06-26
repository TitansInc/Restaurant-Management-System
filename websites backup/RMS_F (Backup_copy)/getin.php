<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title> New Document </title>
        <link rel="stylesheet" href="styles/member_css.css" />

 </head>

 <body>
 <center>
  <form  id="login_form"  method="post" action="getin.php">
            <table>
                <caption>Log In</caption>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="login_username" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="login_password" maxlength="30"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="login" value="Login"></td>
                </tr>

            </table>
        </form>
		<?php
	require 'config.php';
	session_start();
		if(count($_SESSION)!=0){
			header("Location: direct.php");
		}
	if(isset($_POST["login"])){
		$luser=$_POST['login_username'];
		$lpwd=base64_encode($_POST['login_password']);
		$qry=mysql_query("SELECT * FROM Member WHERE `MUserName`='$luser' and `MPassword`='$lpwd'");
		if(!$qry) die("Something Wrong! ".mysql_error());
		$lrcount=mysql_num_rows($qry);
		$data=mysql_fetch_assoc($qry);
		if($lrcount!=0){
			echo "successfully logged in!";
			session_start();
			$_SESSION["IN_USERNAME"]=$data["MUserName"];
			$_SESSION["IN_CONTACT"]=$data["MMobile"];
			$_SESSION["IN_FULLNAME"]=$data["MFirstName"]." ".$data["MLastName"];
			setcookie("username",$data["MUserName"]);
			header("Location: direct.php");

		}else{
			echo "Login Failed!";
		}
	}
	
?>
</center>
 <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/member_js.js"></script>
 </body>
</html>
