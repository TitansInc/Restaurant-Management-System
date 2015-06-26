<?php

$server = mysql_connect("localhost", "root", "8154219449");
if (!$server) {
    die("Error>>" . mysql_error());
}
mysql_select_db("LosPollosHermanos") or die("Error>>" . mysql_error());
?>