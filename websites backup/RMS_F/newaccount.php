<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
  <title> New Account.. </title>
        <link rel="stylesheet" href="styles/member_css.css" />
        
 </head>

 <body>
 <center>
  <form id="registration_form" method="post" action="newaccount.php" onsubmit="return validToSubmit(this.id)">
            <table>
                <caption>Registration</caption>
                <tr>
                    <td>Card Number</td>
                    <td><input type="text" name="cardnumber" maxlength="20"></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="fname" maxlength="30"></td>
                </tr>

                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="sname" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <select name="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="others">Others</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Mobile Number</td>
                    <td><input type="text" name="mobile" maxlength="10"></td>
                </tr>
                <tr>
                    <td>Home Number</td>
                    <td><input type="text" name="home" maxlength="20"></td>
                </tr>
                <tr>
                    <td>Suburb</td>
                    <td><input type="text" name="suburb" maxlength="20"></td>
                </tr>
                <tr>
                    <td>Block</td>
                    <td><input type="text" name="block" maxlength="10"></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="city" maxlength="30"></td>
                </tr>
                <tr>
                    <td>State</td>
                    <td><input type="text" name="state" maxlength="30"></td>
                </tr>
                <tr>
                    <td>PIN Code</td>
                    <td><input type="text" name="pincode" maxlength="11"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Confirm-Password</td>
                    <td><input type="password" name="password_confirm" maxlength="30"></td>
                </tr>
                <tr>
                    <td>Security Question</td>
                    <td><input type="text" name="secq" maxlength="50"></td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td><input type="text" name="seca" maxlength="50"></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="text" name="dob" placeholder="yyyyMMdd" maxlength="10"></td>
                </tr>

                <tr>
                    <td><!--a href="javascript:hideA()">Hide</a--></td>
                    <td><input type="submit" id="register" name="register" value="Register Now"></td>
                </tr>
            </table>
			<?php
 	require 'connecttoserver.php';

        if(isset($_POST["register"])){

        $card=$_POST["cardnumber"];
        $fname=$_POST["fname"];
        $sname=$_POST["sname"];
        $gender=$_POST["gender"];
        $mobile=$_POST["mobile"];
        $home=$_POST["home"];
        $suburb=$_POST["suburb"];
        $block=$_POST["block"];
        $city=$_POST["city"];
        $state=$_POST["state"];
        $pincode=$_POST["pincode"];
        $email=$_POST["email"];
        $username=$_POST["username"];
        $password=base64_encode($_POST["password"]);
        $secq=$_POST["secq"];
        $seca=$_POST["seca"];
        $dob=$_POST["dob"];
        $doj=date("Ymd");

        $tableCreate="CREATE TABLE IF NOT EXISTS `Member` (
        `MCardNo` varchar(20) DEFAULT NULL,
        `MFirstName` varchar(30) DEFAULT NULL,
        `MLastName` varchar(30) DEFAULT NULL,
        `Gender` varchar(6) DEFAULT NULL,
        `MMobile` varchar(10) DEFAULT NULL,
        `MHomeNo` varchar(20) DEFAULT NULL,
        `MSuburb` varchar(20) DEFAULT NULL,
        `MBlock` varchar(10) DEFAULT NULL,
        `MCity` varchar(30) DEFAULT NULL,
        `MState` varchar(30) DEFAULT NULL,
        `MZip` int(11) DEFAULT NULL,
        `MEmail` varchar(30) DEFAULT NULL,
        `EntryDate` date DEFAULT NULL,
        `MUserName` varchar(30) NOT NULL DEFAULT '',
        `MPassword` varchar(30) DEFAULT NULL,
        `MSecurityQuestion` varchar(50) DEFAULT NULL,
        `MSecurityAnswer` varchar(50) DEFAULT NULL,
        `MDOB` date DEFAULT NULL,
        PRIMARY KEY (`MUserName`),
        UNIQUE KEY `MCardNo` (`MCardNo`)
        ) ";
        $createStatus=mysql_query($tableCreate);
        if(!$createStatus) die("Error>>".mysql_error());

        $adduser="INSERT INTO `Member` (`MCardNo`, `MFirstName`, `MLastName`, `Gender`, `MMobile`, `MHomeNo`, `MSuburb`, `MBlock`, `MCity`, `MState`, `MZip`, `MEmail`, `EntryDate`, `MUserName`, `MPassword`, `MSecurityQuestion`, `MSecurityAnswer`, `MDOB`) VALUES
        ('$card', '$fname', '$sname', '$gender', '$mobile', '$home', '$suburb', '$block', '$city', '$state', '$pincode', '$email', '$doj', '$username', '$password', '$secq', '$seca', '$dob')";
        $addStatus=mysql_query($adduser,$server);
        if(!$addStatus) die("Error>>".mysql_error());
        echo "Account Created Successfully!";

        }

        ?>
        </form>
</center>
        
		        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/member_js.js"></script>
 </body>
</html>
