<!DOCTYPE HTML>
<html>
    <head>
        <title> Los Pollos Hermanos </title>
        <link rel="stylesheet" href="styles/rms.css">
        <script type="text/javascript" src="js/jquery.js"></script>
    </head>

    <body id="welcome">
        <div id="rmslogo"></div>
        <table id="menus">
            <tr>
                <th><a href="#" title="welcome.html">HOME</a></th>
                <th><a href="#" title="menu.php">MENU</a></th>
                <th><a href="#" title="table_reservation.php">RESERVATION</a></th>
                <th><a href="#" title="getin.php">LOG-IN/OUT</th>
                <th><a href="#" title="newaccount.php">SIGNUP</th>
                <th><a href="#" title="feedback.php">FEEDBACK</a></th>

            </tr>
        </table>
        <iframe id="work" src="welcome.html"></iframe>
    </body>
    <script type="text/javascript">
        $(document).ready(function () {
            $("a").click(function () {

                    $("#work").attr("src",$(this).attr("title"));
            });
        });
    </script>
</html>
