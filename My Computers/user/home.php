<?php
session_start();
if($_SESSION['isloggedin']!=1)//?
{
    header("Location:mainPage.php");
}
else{
    $user=$_SESSION['user'];
    echo "Welcome $user";
    
 
    echo "<a href='logout.php'>click here to logout</a>";
}


