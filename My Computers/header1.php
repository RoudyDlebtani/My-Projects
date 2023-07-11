


<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  <style> 

.title{
    border: 2px dashed white;
    color: white;
    font-size:xx-large;
}

*{
    font-size: large;
    margin: 1px;;
}

  </style>
  </head>
  <body>
    
  

  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="title" >My Computers</div>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">

      <?php
            if (isset($_SESSION['id'])) {
                $id = $_SESSION["id"];
                include('config.php');
                $sql = "select admin from users where id = " .$id . "";
                $res = mysqli_query($con, $sql);
               $row = mysqli_fetch_assoc($res);
                    $admin = $row['admin'];
                    if ($admin === "1") {
                   echo   "<li class='nav-item'> <a class='nav-link' href='admin.php'>admin</a>  </li>";
                   
                    }
                }
            
            ?>
         
        

        <li class="nav-item">
          <a class="nav-link " aria-current="page" href="mainPage.php">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="whishList.php">Whishlist</a>
        </li>
        <li class="nav-item ">
          <a class="nav-link" href="cart.php">Cart</a>
     </li>
     <li class="nav-item ">
          <a class="nav-link" href="aboutUs.php">About Us</a>
     </li>

     
    
        
     <li class="nav-but">
     <?php 
  
     if (isset($_SESSION['id'])) {
                echo "<a class='btn btn-danger' href='./user/logout.php'>Logout";
            } else {
                echo "<a class='btn btn-danger' href='logIn.php'>Login";
            } ?></a>
        </li>  
     </ul>

    </div>
  </div>
</nav>

  </body>
</html>


