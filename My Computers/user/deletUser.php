<?php
require_once "../config.php";
$id=$_GET['id'];

$query2="DELETE FROM users where id=$id";
$result2= mysqli_query($con, $query2);
header("location:../admin.php");


?>