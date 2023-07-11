<?php
 session_start();
require_once '../config.php';
if(isset($_POST['username']) && $_POST['username']!=""
        && isset($_POST['password']) && $_POST['password']!=""
        
     )   
{
 
    $user=$_POST['username'];
    $pass=$_POST['password'];
    
    $query="Select * From users where username='".$user."' and password='".$pass."'";
    
    $res= mysqli_query($con, $query);
    
    $nbrows= mysqli_num_rows($res);
    if($nbrows == 0)
    {
        header("Location:../logIn.php");
    }
    else if($nbrows==1) {
       
       //hayde la2an id mech 3am yen3amalo isset
        $_SESSION['username']=$user;
        $tab = mysqli_fetch_assoc($res);
            $_SESSION['id'] = $tab['id'] ;//????
    
            header("Location:../mainPage.php");
   }

}

?>
