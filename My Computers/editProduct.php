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

$query = "Select * from products where id =$id";
$result = mysqli_query($con, $query);
if(!$result){
    
    echo "test failed";

}

if ($result) {
    $row = mysqli_fetch_assoc($result);
    ?>
    <h1>Edit Product</h1>
    <form method="post" action="./user/editProduct2.php" enctype="multipart/form-data">
    <table >
  
    <tr>
        <td> <input type="hidden" name="id" size="20" value="<?php echo $row['id']; ?>" /></td>
    </tr>
      
   

        <tr>
        <td>type:  <input type="text" name="type1" size="20" value="<?php echo $row['type']; ?>" /></td>
           
        </tr>

        <tr>
            
            <td>gpu:  <input type="text" name="gpu1" size="20" value="<?php echo $row['gpu']; ?>"/></td>
        </tr>
        <tr>
           
            <td>disk:  <input type="text" name="disk1" size="20" value="<?php echo $row['disk']; ?>"/></td>
        </tr>
        <tr>
         
            <td>specs:  <input type="text" name="specs1" size="20" value="<?php echo $row['specs']; ?>"/></td>
        </tr>
        <tr>
           
           <td>ram:  <input type="text" name="ram1" size="20" value="<?php echo $row['ram']; ?>" /></td>
       </tr>
       <tr>
           
           <td>quantity:  <input type="text" name="quantity1" size="20" value="<?php echo $row['quantity']; ?>" /></td>
       </tr>
       <tr>
           
       <td>cpu:  <input type="text" name="cpu1" size="20" value="<?php echo $row['cpu']; ?>" /></td>
       </tr>
       <tr>
           
           <td>price:  <input type="text" name="price1" size="20" value="<?php echo $row['price']; ?>" /></td>
       </tr>

       <tr><td> <input   type='file' name='image'   required></td> </tr>
       <tr> <td>  <input type='file' name='image2' required></td>  </tr>
       <tr> <td > <input type='file' name='image3' required></td>  </tr>
     

       
               
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