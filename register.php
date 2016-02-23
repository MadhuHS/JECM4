<?php

require "init.php";

$username = "abc123";
$password = "123456";

$sql_query = "insert into user_info values ('$username','$password');";

if(mysqli_query($con,$sql_query))
{
	echo "<h1>inserting data successful</h1>";
}

else
{
	echo "<h1> error while inserting data to the database</h1>";
}


?>