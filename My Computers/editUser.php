<html>
<head></head>
<style>
 table{
    width: 50%;
    height:250px;
    margin-left: 300px;
    margin-top: 50px;
 }
 input{
    width:500px;
 }

#submit{
    width:100px;
}
td{
    height: 50px;
}


</style>
<body>
<?php

require_once 'config.php';
$id = $_GET['id'];

$query = "Select * from users where id =$id";
$result = mysqli_query($con, $query);
if(!$result){
    
    echo "test failed";

}

if ($result) {
    $row = mysqli_fetch_assoc($result);
    ?>
    <h1>Edit User</h1>
    <form method="get" action="./user/editUser2.php">
    <table >
        <tr>
        <td>id:  <input type="text" name="id" size="20" value="<?php echo $row['id']; ?>" /></td>
           
        </tr>

        <tr>
            
            <td>username:  <input type="text" name="username" size="20" value="<?php echo $row['username']; ?>"/></td>
        </tr>
        <tr>
           
            <td>password:  <input type="text" name="password" size="20" value="<?php echo $row['password']; ?>"/></td>
        </tr>
       
        <tr>
           
           <td>admin 1 or 2:  <input type="number" min="0" max="1" name="admin" size="20" value="<?php echo $row['admin']; ?>"/></td>
       </tr>
       
       <tr>
           
           <td>email: <input type="text" name="email" size="20" value="<?php echo $row['email']; ?>"/></td>
       </tr>
      
        <tr>
            <td>
                <input id="submit" type="submit" value="UPDATE"/> 
            </td>
        </tr>
    </table>
    </form>
    <?php
}
?>
</body>
</html>