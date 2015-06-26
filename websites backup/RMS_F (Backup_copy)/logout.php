<?php

session_start();
$_SESSION=array();
$_COOKIE=array();

session_destroy();
header("Location: welcome.html");

?>
