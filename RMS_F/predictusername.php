<?php
 	require 'connecttoserver.php';
 	if(isset($_POST["tosearch"])){
		$tos=mysql_real_escape_string(htmlentities($_POST["tosearch"]));
		if(!empty($tos)){
			$search=mysql_query("SELECT `MUserName` FROM `Member` WHERE `MUserName`='$tos'");
			$rescount=mysql_num_rows($search);
			if($rescount==0){
				echo "<i style=\"color:green;\" id=\"indicator\"><b>".$_POST['tosearch']."</b> is available!</i>";
			}else{
				echo "<i style=\"color:red;\" id=\"indicator\"><b>".$_POST['tosearch']."</b> is not available!</i>";
			
			}
			
		}
	}
?>
