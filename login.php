<?php

require "init.php";

$username ="abc12";
$password = "1234";

$sql_query = "select username,password from user_info where username like '$username' 
              and password like '$password';";


$result_set = mysqli_query($con,$sql_query);			  

if(mysqli_num_rows($result_set)>0)
{
	$row = mysqli_fetch_assoc($result_set);
	$name =  $row["username"];
	echo "<h1>welcome</h1>".$name;
}	
	
else
{
	echo "<h1>invalid username or password</h1>";
}	


?>