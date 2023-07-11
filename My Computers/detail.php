<?php
session_start();
?>
<html>
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous">


 </script>

<style>
  b{
    color: white;
  }
  body{
    background-image: url(./images/black.jpg);
  }
    #mains{
            height: 1000px;
            width:100%;
            background-size: cover;
            background-attachment: fixed;
        }

.payment{
color: red;
width: 90px;
height: 35px;
margin-left:60px;
background-color: #212529;
text-align: center;
}

img{
  width: 400px;
  height: 400px;
   }

#bodyContainer{
    margin-left: 400px;
    margin-right: 400px;
}

.carousel-control-next-icon,.carousel-control-prev-icon{
    background-color: black;
}

.text{
    width: 600px;
    margin-left: 300px;
    border-bottom: 1px solid black;
    font-size: large;
    display: flex;
    color:white;
}


.a{
    text-align: center;
 text-decoration: none;
 color:red;
}
   .a:hover{
    text-align: center;
 text-decoration: none;
 color:red;
   }
</style>
    
</head>
   
        
   <body>
    <div id="mains">
       <?php include 'header1.php'; ?>
   <!-- Slider --> 

   <?php
require_once 'config.php';
if( isset($_SESSION['id'])) {


$id = $_GET['id'];//product id
$users = $_SESSION['id'];//user id

$query3 = "Select * from products where id =$id";
$result = mysqli_query($con, $query3);
if (!$result) die ("Database access failed: ");
if ($result) {
    $row = mysqli_fetch_assoc($result);

?>
   



   <div id="bodyContainer"> 
   
   <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
     <div class="carousel-indicators">
       <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
       <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
       <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
     </div>
     <div class="carousel-inner">
       <div class="carousel-item active">
       <img alt='laptop pic' src="<?php echo $row['image']; ?>">
       </div>
       <div class="carousel-item">
       <img alt='laptop pic'  src= "<?php echo $row['image2']; ?>">
       </div>
       <div class="carousel-item">
       <img alt='laptop pic'  src=" <?php echo $row['image3']; ?> ">
       </div>
     </div>
     <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
       <span class="carousel-control-prev-icon" aria-hidden="true"></span>
       <span class="visually-hidden">Previous</span>
     </button>
     <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
       <span class="carousel-control-next-icon" aria-hidden="true"></span>
       <span class="visually-hidden">Next</span>
     </button>
   
   
   </div>



   
   </div>
   <div class="text"><h1> <?php echo $row['type']; ?></h1></div> <br>
   <div class="text"><b>specs:</b>  <?php echo $row['specs']; ?></div> <br>
   <div class="text"><b>cpu:</b>  <?php echo $row['cpu']; ?></div> <br>
   <div class="text"> <b>ram:</b> <?php echo $row['ram']; ?></div> <br>
   <div class="text"><b>gpu :</b>  <?php echo $row['gpu']; ?></div> <br>
   <div class="text"> <b>disk:</b>  <?php echo $row['disk']; ?></div> <br>
   <div class="text">  <b>price:</b> <?php echo $row['price']; ?></div> <br>
   <?php
   $sql_whishlist_check = "SELECT * from `products` p , `wishlist` w WHERE p.id =" . $id . " and p.id = w.products_id and w.users_id = " . $users . "";
      $result = $con->query($sql_whishlist_check);
      if ($result->num_rows > 0) {
        echo           "<a href='whishList.php?id=$id' style='margin-right: 10px; color:#DC3545' class='btn btn-dark' name='wish'>unsave</a>";
      } else {
        echo           "<a href='whishList.php?id=$id' style='margin-right: 10px; color:#DC3545' class='btn btn-dark' name='wish'>save</a>";
      }


      $sql_cart_check = "SELECT * from cart WHERE productsid = '$id' and usersid = '$users'";
      $results = $con->query($sql_cart_check);

      if ($results->num_rows > 0) {
        //eza mech ma7touta bel cart 7ot hawde
          echo            "<a href='cart.php?id=$id' style='margin-right: 10px; color:#DC3545' class='btn btn-dark'>Remove from cart</a>";
        } else {
          echo  "<form action='./cart.php' method='GET' style='display: inline;'>";
          echo            "<input type='submit' name='addcart' value='Add to cart' style='margin-right: 10px; color:#DC3545 !important' class='btn btn-dark'>";
          echo            "<input type='hidden' name='id' value=" . $id . ">";
          echo           "<b >Quantity:</b><input type='number' class='input' name='quantity' value = '0' max='$row[quantity]'>";
          echo "</form>";
        }
        echo       "</div></div></div></div>";
  

}
}else{
  echo "<h6>please Login<a href='logIn.php' >here</a>  </h6>";
}

?>
   </div>
<?php include 'footer.php'; ?>
    </body>
</html>
