<!DOCTYPE html>

<html>
    <head>
        <title>Select Way..</title>


        <link rel="stylesheet" type="text/css" href="themes/excite-bike/jquery-ui.css" />
        <style type="text/css">
            body{
                vertical-align:center;
                background-image: url("Images/stymages/9.png");
            }
            caption{
                background-image: url("Images/stymages/4.png");
            }
            #direction{
                width:400px;

                border:0px groove crimson;
            }
            #direction td{
                text-align:center;
                border-radius:10px;
                background-image: url("Images/stymages/00.png");

            }
            a{
                text-decoration:none;}
				
            </style>
        </head>
        <body>
        <center>

            <table id="direction">
            <caption></caption>
            <tr>
                <td><a id="gm" href="menu.php"><h2>Go to Menu</h2></a></td>
                <td><a id="gp" href="prochange.php"><h2>Edit Profile</h2></a></td>
				<td><button id="go" onclick="Destroy()"><h2>Logout</h2></button></td>
				
				
            </tr>



        </table>
    </center>
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="jquery-ui.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#gm,#gp,#go").button();
            setTimeout(function () {
                window.location = "menu.php";
            }, 5000);
        });
		function Destroy()
		{
			var date=new Date();
			date.setTime(date.getTime()-1);
			document.cookie="Items=; expires="+date.toGMTString();
			document.cookie="username=; expires="+date.toGMTString();
			document.cookie="Quantities=; expires="+date.toGMTString();
			document.cookie="Ratings=; expires="+date.toGMTString();
			window.location="logout.php";
		}
    </script>
</body>
</html>
