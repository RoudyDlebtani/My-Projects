<?php
require_once '../config.php';
if(isset($_POST['username']) && $_POST['username']!=""
        && isset($_POST['password']) && $_POST['password']!=""
        && isset($_POST['confirmPassword']) && $_POST['confirmPassword']!=""
        &&isset($_POST['email']) && $_POST['email']!="")   
{  $user=$_POST['username'];
    $pass=$_POST['password'];
    $email=$_POST['email'];
    $confirmPassword=$_POST['confirmPassword'];
    $passLength=strlen($pass);
    $query1="Select * From users where username='".$user."'";// to check if the acc already exist
    $res1= mysqli_query($con, $query1);
    $nbrows= mysqli_num_rows($res1);
    if($pass!= $confirmPassword)//if the confirm password not the same
{ header("Location:../register.php");
    }else if($nbrows == 1){//if the user exist
  header("Location:../register.php");
    }
    else {
    $query2= "INSERT INTO users (username,email,password)
    VALUES ('$user','$email','$pass')";
    $result2= mysqli_query($con, $query2);
     if(!$result2)
    {     header('location: ../register.php');  }
    else   { header('location: ../logIn.php');   }  }
}else{ echo "hello world";}