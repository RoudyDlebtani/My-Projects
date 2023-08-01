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
  body{
    background-image: url(./images/black.jpg);
  }
  input{
    background-color: rgb(200,200,200);
  }
input:hover{
background-color:darkgray;
}

.fillter{
  height: 50px;
  width: 550px;
 
}


 img{
  width: 100%;
  height: 400px;
 }
 
 #bodyContainer{
margin-bottom: 20px;
  
 }

 h1,h3{
  margin: 50px;
  color: white;
 }


 .card {
            min-width: 234px !important;
            min-height: 480px !important;
            max-width: 234px !important;
            max-height: 480px !important;
            border: 2px solid #212529;
            background-color: #F5F5F5;
            margin-bottom: 2%;
            margin-right: 10px;
            flex-basis: 33.33333 
        }

        #card-title {
            text-align: center;
            color: #DC3545;
            background-color: #212529;
            border-radius: 2.5px;
        }
        .card-text{
          text-align: center;
          color: gray;
          background-color: white;
          height: 150px;
        }

        .card-container {
          display: flex;
           flex-wrap: wrap;
            align-items: center;
            height: 560px;
            overflow-y: scroll;
            overflow-x: hidden;
          
        }

        .card-container::-webkit-scrollbar {
            display: none;
        }

.details{

  color: red;
  width: 75px;
  height: 35px;
  text-decoration:none;
 margin-left:60px;
 background-color: #212529;
}

.text1{
  margin-left: 50px;
  text-align: center;
  background-color: #212529;
  width: 100px;
  color:red;
}
.text{
  margin-left: 10px;
  text-align: center;
 text-decoration: none;
 color:red;
   }

   .text:hover{
    text-align: center;
 text-decoration: none;
 color:red;
   }
   .card-img-top{
    height: 200px;
    width:100px;
   }
</style>
 


    
    </head>
   
        
<body>
    <?php include 'header1.php'; ?>
<!-- Slider --> 
<div id="bodyContainer"> 

<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
  </div>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="./images/caroussel1.jpg" height="300px" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="./images/caroussel2.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="./images/caroussel3.jpg" class="d-block w-100" alt="...">
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
<!-- ALL PRODUCTS--> 

<h1>ALL PRODUCTS</h1> 
<div class="all-products">
 
 

  <form action="#" method="post">
<table class="fillter"><tr>
<th ><h3>Filter:</h3></th>
  <td ><input type="submit"  name="default" value="default" ></td>
   <td><input type="submit"  name="lowest" value="lowestPrice"></td>
   <td><input type="submit"  name="highest" value="highestPrice"></td>
   <td><input type="submit"  name="alphabetic" value="alphabetic order"></td>
   <td><input type="submit"  name="newest" value="newest"></td></tr>
    </table>

 
      
</form>
<div class="card-container">
<?php 


require_once "config.php";
$query = "SELECT * FROM products";
$query2 = "SELECT * FROM products ORDER BY price DESC";
$query3= "SELECT * FROM products ORDER BY price ASC";
$query4= "SELECT * FROM products ORDER BY type ASC";
$query5= "SELECT * FROM  products ORDER BY id DESC LIMIT 10 ";


if(isset($_POST['default'])){
$result = mysqli_query($con,$query);
}else if(isset($_POST['lowest'])){
  $result = mysqli_query($con,$query3);

}else if(isset($_POST['alphabetic'])){
  $result = mysqli_query($con,$query4);

}else if(isset($_POST['newest'])){
  $result = mysqli_query($con,$query5);

}else{
  $result = mysqli_query($con,$query2);

}

if (!$result) echo "Database access failed: ";

$r = mysqli_num_rows($result);
for($j=0; $j<$r; $j++){
$fetched_row = mysqli_fetch_assoc($result);

$id=$fetched_row['id'];
$image = $fetched_row['image'];
$type = $fetched_row['type'];
$specs = $fetched_row['specs'];
$price = $fetched_row['price'];
$image3 = $fetched_row['image3'];
$image2 = $fetched_row['image2'];    
    echo" <div class='card'>";
    echo "<img alt='laptop pic' class='card-img-top' src=" . $image . ">";
    echo   "<div class='card-body>'";
    echo  "  <h5 id='card-title'>$type</h5>";
    echo   " <p class='card-text'>$specs .</p>";
    echo  " </div>";
    echo  " <div class='card-footer'>";
    echo   "  <p class='text1'>$price $</p>";
    echo   "  <div class='details'> <a class='text' href='detail.php?id=$id'>details</a> </div>";
    echo  " </div> </div>  ";


}
?>

</div>

</div>

<?php include 'footer.php'; ?>
    </body>
</html>
