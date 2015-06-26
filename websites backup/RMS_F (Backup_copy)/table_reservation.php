<!DOCTYPE html>

<html>
    <head>
        <title>Reserve Buddy</title>

        <link rel="stylesheet" type="text/css" href="themes/excite-bike/jquery-ui.css" />
        <style type="text/css">
            body{
                background-image: url("Images/stymages/2.png");

            }
            #resrve_tab{
                background: red;
                background-image: url("Images/stymages/8.png");
                font-family: oklahoma;
            }
            th{
                text-align: left;
                font-family: oklahoma;
                color:aqua;
            }
            #stre{
                border:none;
                background-image: url("Images/stymages/10.png");

            }
        </style>
    </head>
    <body>
    <center>
        <form action="table_reservation.php" method="post">
            <table id="resrve_tab">
                <tr>
                    <td>
                        Select Your Date(YYYY-MM-DD)
                    </td>
                    <td>
                        <input type="text" id="dater" name="rdate">
                    </td>
                </tr>
                <tr>
                    <td>
                        Start Time(H:M)
                    </td>
                    <td>
                        <select id="sh" name="rsh">
                        </select>
                        <select id="sm" name="rsm">
                        </select>                        
                    </td>
                </tr>        
                <tr>
                    <td>
                        End Time(H:M)
                    </td>
                    <td>
                        <select id="eh" name="reh" disabled>
                        </select>
                        <select id="em" name="rem">
                        </select>                        
                    </td>
                </tr>  
                <tr>
                    <td></td>
                    <td><input type="submit" value="Check" name="check" onclick="return valid()"></td>
                </tr>
            </table>
        </form>
        <?php
        require './connecttoserver.php';
        session_start();
        if (count($_SESSION) == 0) {
            header("Location: getin.php");
        }
        if (isset($_POST["check"])) {
            $d = mysql_real_escape_string(htmlentities($_POST["rdate"]));
            $sh = mysql_real_escape_string(htmlentities($_POST["rsh"]));
            $sm = mysql_real_escape_string(htmlentities($_POST["rsm"]));
            $shm = $sh . ":" . $sm . ":00";
            $_SESSION["START_TIME"] = $shm;
            $eh = mysql_real_escape_string(htmlentities($_POST["reh"]));
            $em = mysql_real_escape_string(htmlentities($_POST["rem"]));
            $ehm = $eh . ":" . $em . ":00";
            $_SESSION["END_TIME"] = $ehm;
;
            $top = "";
                $sq = "select TableNo from (select Tables.TableNo,Temp1.ResTableNo from Tables left join (select ResTableNo from Reservation where ((ResSTime >= '$shm' and ResSTime < '$ehm') or (ResETime >'$shm' and ResETime<='$ehm') or ((ResSTime<='$shm' and ResSTime<'$ehm') and (ResETime>'$shm' and ResETime>='$ehm'))) and ResDate='$d' group by ResTableNo) as Temp1 on Temp1.ResTableNo=Tables.TableNo) as Temp2 where ResTableNo is null";
                $sqres = mysql_query($sq) or die("Scheeee!" . mysql_error());
                $top = $sqres;

            if (mysql_num_rows($top) != 0) {
                $lastb;
                $ht = "<form method='post' action='table_reservation.php'><table border=0 id='stre'><tr><th>Table No</th><th>Size</th><th>Ur Choice</th></tr>";
                while ($x = mysql_fetch_assoc($top)) {
                    $lastb = $x["TableNo"];
                    $y = mysql_query("SELECT * FROM Tables where TableNo='" . $x["TableNo"] . "'");
                    $yr = mysql_fetch_assoc($y);
                    $ht.="<tr><td>" . $x["TableNo"] . "</td><td>" . $yr["Size"] . "</td><td><input type='radio' value='" . $x["TableNo"] . "' name='stable' /></td></tr>";
                }
                $ht.="<tr><td><table><tr><th>Full Name</th><td><input type=text id='f1' name=ffname value='" . $_SESSION["IN_FULLNAME"] . "'></td></tr>"
                        . "<tr><th>Contact</th><td> <input type=text id='f2'  name=cont value='" . $_SESSION["IN_CONTACT"] . "'></td></tr>"
                        . "<tr><th>Date</th><td> <input type=text name=rda value='" . $d . "' hidden>$d</td></tr>"
                        . "<tr><th>Start</th><td> <input type=text  name=start value='" . $shm . "' hidden>$shm</td></tr>"
                        . "<tr><th>End</th><td> <input type=text name=end value='" . $ehm . "' hidden>$ehm</td></tr>"
                        . "<tr><th>Selected Table No</th><td> <input type=text id=stab name=stab value='" . $lastb . "' hidden><h3 id='tbn'>$lastb</h3></td></tr>"
                        . "<tr hidden><th>Res Id</th><td> <input type=text name=rid value='" . substr($d, 2, 9) . $shm . $ehm . "'></td></tr>"
                        . "<tr hidden><th>Username</th><td><input type=text name=mid value='" . $_SESSION["IN_USERNAME"] . "'></td></tr></table></td><td></td><td><input type='submit' onclick='return checkit()' name='regit' value='Fixit'></td></table></form>";
                echo $ht;
            } else {
                echo "<h2>Sorry, No Tables free at requested time!</h2>";
            }
        }
        if (isset($_POST["regit"])) {
            $resfir = "insert into Reservation values('" . $_POST["rid"] . $_POST["stab"] . "','" . $_POST["stab"] . "','" . $_POST["ffname"] . "','" . $_POST["cont"] . "','" . $_POST["rda"] . "','" . $_POST["start"] . "','" . $_POST["end"] . "','" . $_POST["mid"] . "')";
            
            mysql_query($resfir) or die("Reservation Filed" . mysql_error());
            
            echo "<h1>Reserved Successfully</h1>";
        }
        ?>

    </center>


    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="jquery-ui.js"></script>
    <script type="text/javascript" src="js/table_reservation.js"></script>
</body>
</html>
