<?php
require_once '../config.php';
if(isset($_GET['id']) && ($_GET['id']!="")
&& isset($_GET['username']) && ($_GET['username']!="")
&& isset($_GET['password']) && ($_GET['password']!="")
&&  isset($_GET['admin']) && ($_GET['admin']!="")
&&  isset($_GET['email']) && ($_GET['email']!=""))
{
    
    $id=$_GET['id'];
    $username=$_GET['username'];
    $password=$_GET['password'];
    $admin=$_GET['admin'];
    $email=$_GET['email'];

    $query="UPDATE users set  username='$username', password='$password'  , email='$email', admin='$admin' where id ='$id'";
 

    $result= mysqli_query($con, $query);

   


    if($result)
    {
        header("location:../admin.php");
    }
    else
    {
        header("location:../mainPage.php");
    }

}else{echo "failed";}
?>