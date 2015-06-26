<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html><head>
  
  <meta content="text/html; charset=ISO-8859-1" http-equiv="content-type">
  <title></title>

  
</head><body style="margin-top: 1px; height: 875px;">
<table style="text-align: left; width: 100%; height: 100%; margin-left: auto; margin-right: auto;" border="1" cellpadding="10" cellspacing="10">

  <tbody>
    <tr>
      <td style="vertical-align: top; width: 250px; text-align: right;"><br>
      </td>
      <td style="vertical-align: top; width: 486px; text-align: center;">
      <div style="text-align: right;">
      <table style="text-align: left; width: 484px; height: 262px; margin-left: auto; margin-right: auto;" border="0" cellpadding="4" cellspacing="4">
        <tbody>
          <tr>
            <th style="vertical-align: top;"><br>
            <br>
            <br>
            <br>
            <br>
            <br>
	    <form method="post" action="Mainpage.php">
            <div style="text-align: right;"><textarea wrap="off" cols="57" rows="6" name="Post"></textarea></div>
            <br>
            <div style="text-align: right;"><input name="PostBT" value="Tweet" type="submit"><br>
            </div>
	    </form>
            <br>
            </th>
          </tr>
        </tbody>
      </table>
      </div>
      <hr style="width: 100%; height: 2px;"><br>
      <table style="text-align: left; width: 80%; margin-left: auto; margin-right: auto; height: 56%;" border="1" cellpadding="2" cellspacing="2">
        <tbody>
	<?php
	if(isset($_POST['PostBT'])){
		$Tweet=$_POST['Post'];
		$Tweet2=nl2br($Tweet);
		echo "<tr><td style='vertical-align: top;'><p>$Tweet2 <br><hr style='width: 100%; height: 2px;'></p></td></tr>";
	}
	?>
		
        </tbody>
      </table>
      <br>
      <br>
      </td>
      <td style="vertical-align: top; width: 289px;"><br>
      </td>
    </tr>
  </tbody>
</table>

<br>

<br>

</body></html>
