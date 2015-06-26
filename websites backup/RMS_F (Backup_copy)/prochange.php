<!DOCTYPE html>

<html>
    <head>
        <title>Register to Restaurent</title>


        <link rel="stylesheet" type="text/css" href="themes/excite-bike/jquery-ui.css" />
        <style type="text/css">
            body{
                text-align: center;
                background-image: url("Images/stymages/4.png");
            }
            #basic_info{
                padding:20px;
                font-family: oklahoma;
                background-image:url("Images/stymages/8.png");
                border-image:  url("Images/stymages/33 (40).png");
                box-shadow: 0px 0px 20px white;
            }
            caption{
                background-image:url("Images/stymages/2.png");
                padding:10px 3px;
                color:white;

            }
            tr:hover{
                background-image: url("Images/stymages/7.png");
            }
            #basic_info input{
                font-family: oklahoma;

            }
        </style>
    </head>
    <body><center>
        <?php
        require "connecttoserver.php";
        session_start();
        if (count($_SESSION) == 0) {
            header("Location: getin.php");
        }
        $oq = "SELECT * FROM Member WHERE MUserName='" . $_SESSION["IN_USERNAME"] . "'";
        $res = mysql_query($oq) or die("Can't access ur data..!" . mysql_error());
        $vals = mysql_fetch_assoc($res);
        //print_r($vals);
        ?>
        <form name="modify" action="prochange.php" method="post" onsubmit="return isK()">
            <table id="basic_info">
                <caption>Modify Your Account</caption>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" id="r_firstname" name="fname" maxlength="30" value="<?php echo $vals['MFirstName'] ?>"></td>
                </tr>

                <tr>
                    <td>Last Name</td>
                    <td><input type="text" id="r_secondtname" name="sname" maxlength="30" value="<?php echo $vals['MLastName'] ?>"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>
                        <!--div id="gender_picker">
                            <input type="radio" name="sex" id="m"><label for="m">Male</label>
                            <input type="radio" name="sex" id="f"><label for="f">Female</label>
                            <input type="radio" name="sex" id="o"><label for="o">Others</label>
                        </div-->
                        <select id="gender_selector" name="gender">
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="others">Others</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="text" id="datepick" name="dob" placeholder="yyyyMMdd" maxlength="10" value="<?php echo $vals['MDOB'] ?>"></td>
                </tr>


                <tr>
                    <td>Mobile Number</td>
                    <td><input type="text" id="r_mobile" name="mobile" maxlength="10" value="<?php echo $vals['MMobile'] ?>"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="text" id="r_email"  name="email" maxlength="30" value="<?php echo $vals['MEmail'] ?>"></td>
                </tr>
                <tr>

                    <td>Payment Card Number</td>
                    <td><input type="text" id="r_cardnumber"  name="cardnumber" maxlength="20" value="<?php echo $vals['MCardNo'] ?>"></td>
                </tr>


                <tr>
                    <td>Home Number</td>
                    <td><input type="text" id="r_home" name="home" maxlength="20" value="<?php echo $vals['MHomeNo'] ?>"></td>
                </tr>
                <tr>
                    <td>Suburb</td>
                    <td><input type="text" id="r_suburb"  name="suburb" maxlength="20" value="<?php echo $vals['MSuburb'] ?>"></td>
                </tr>
                <tr>
                    <td>Block</td>
                    <td><input type="text" id="r_block" name="block" maxlength="10" value="<?php echo $vals['MBlock'] ?>"></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" id="r_city"  name="city" maxlength="30" value="<?php echo $vals['MCity'] ?>"></td>
                </tr>
                <tr>
                    <td>State</td>
                    <td><input type="text" id="r_state"  name="state" maxlength="30" value="<?php echo $vals['MState'] ?>"></td>
                </tr>
                <tr>
                    <td>PIN Code</td>
                    <td><input type="text" id="r_pincode"  name="pincode" maxlength="11" value="<?php echo $vals['MZip'] ?>"></td>
                </tr>

                <tr hidden>
                    <td>Username</td>
                    <td><input type="text" id="r_username" name="username" maxlength="30" value="<?php echo $vals['MUserName'] ?>" ></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" id="r_password" name="password" maxlength="30" value="<?php echo base64_decode($vals['MPassword']) ?>"></td>
                </tr>
                <tr>
                    <td>Confirm-Password</td>
                    <td><input type="password" id="r_cpassword" name="password_confirm" maxlength="30" value="<?php echo base64_decode($vals['MPassword']) ?>"></td>
                </tr>
                <tr>
                    <td>Security Question</td>
                    <td><input type="text" id="secq" name="secq" maxlength="50" value="<?php echo $vals['MSecurityQuestion'] ?>"></td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td><input type="text" id="seca" name="seca" maxlength="50" value="<?php echo $vals['MSecurityAnswer'] ?>"></td>
                </tr>
                <tr>
                    <td> </td>
                    <td><input type="submit" id="regnow" value="Modify" name="modify" /></td>

                </tr>



            </table>




        </form>
        <?php
        if (isset($_POST["modify"])) {
            mysql_query("UPDATE  `Member` SET  `MFirstName` =  '" . $_POST["fname"] . "',
`MLastName` =  '" . $_POST["sname"] . "',
`MCardNo` = '" . $_POST["cardnumber"] . "',
`Gender` =  '" . $_POST["gender"] . "',
`MMobile` =  '" . $_POST["mobile"] . "',
`MHomeNo` =  '" . $_POST["home"] . "',
`MSuburb` =  '" . $_POST["suburb"] . "',
`MBlock` =  '" . $_POST["block"] . "',
`MCity` =  '" . $_POST["city"] . "',
`MState` =  '" . $_POST["state"] . "',
`MZip` =  '" . $_POST["pincode"] . "',
`MEmail` =  '" . $_POST["email"] . "',
`MSecurityQuestion` =  '" . $_POST["secq"] . "',
`MSecurityAnswer` =  '" . $_POST["seca"] . "',
`MDOB` =  '" . $_POST["dob"] . "' WHERE  `Member`.`MUserName` =  '" . $_POST["username"] . "'") or die("Failed to modify ur profile! " . mysql_error());
echo "Successfully modified ur account";
			
        }
        ?>



        <script type="text/javascript" src="jquery.js"></script>
        <script type="text/javascript" src="jquery-ui.js"></script>
        <script type="text/javascript">
            function isK() {
                return ($("#r_firstname").val().length > 0 && $("#r_secondtname").val().length > 0 && $("#datepick").val().length >= 10 && $("#r_mobile").val().length >= 10 && $("#r_email").val().length > 2 && $("#r_email").val().indexOf("@") != -1 && $("#r_email").val().indexOf(".") != -1 &&
                        $("#r_cardnumber").val().length >= 4 && $("#r_home").val().length > 0 && $("#r_suburb").val().length > 0 && $("#r_block").val().length > 0 && $("#r_city").val().length > 0 && $("#r_state").val().length > 0 && $("#r_pincode").val().length > 0 && $("#r_username").val().length > 0 && $("#r_password").val().length > 0 && $("#r_cpassword").val().length > 0 && $("#r_password").val() == $("#r_cpassword").val() && $("#secq").val().length > 0 && $("#seca").val().length > 0);
            }



        </script>

    </body>
</html>
