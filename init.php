<?php

$Server_name = "localhost";
$mysql_username = "root";
$mysql_password ="";
$db_name ="mobileapp";

$con = mysqli_connect($Server_name,$mysql_username,$mysql_password,$db_name);

if(!$con)
{
	echo "<h1> Database connection not successful </h1>".mysqli_connect_error();
}

else
{
		echo "<h1> Database connection successful </h1> ";

}

?>