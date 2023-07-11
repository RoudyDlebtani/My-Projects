<?php
session_start();
?>
<?php
// walla tasser
require_once 'config.php';
//hone 3am ya3be wishlist bi aleb data base
if (isset($_GET['id'])) {//hayde id lal product
    $product = $_GET['id'];//hayde id lal product
    $users = $_SESSION['id'];//hayde id lal user
    $sqlcheck = "select * from wishlist where users_id='$users' and products_id='$product'";//3am ychayek eza user w product bi aleb wishlist
    $result = mysqli_query($con, $sqlcheck);
    if ($result->num_rows > 0) {//eza ma fi daleton men whishlist data base
        $sqldelete = "DELETE FROM wishlist WHERE products_id='$product' and users_id='$users'";
        mysqli_query($con, $sqldelete);
        $con->close();
    } else {//eza fi 3abiyonn
        $sql = "INSERT INTO wishlist (users_id,products_id) VALUES ('$users','$product')";
        mysqli_query($con, $sql);
        $con->close();
    }
    header("Location:" . $_SERVER["HTTP_REFERER"]);
}
?>
<html>

<head>
    <style>
        body {
            background-image: url(images/black.jpg);
            background-size: cover;
            background-attachment: fixed;
        }

        .grid-container {
            background: transparent;
            justify-content: center;
            display: flex;
            gap: 2%;
            flex-wrap: wrap;
            padding: 2%;
        }

        .card {
            min-width: 234px !important;
            min-height: 420px !important;
            max-width: 284px !important;
            max-height: 520px !important;
            border: 2px solid #212529;
            background-color: #F5F5F5;
            margin-bottom: 2%;
        }

        .card-title {
            text-align: center;
            color: #DC3545;
            background-color: #212529;
            border-radius: 2.5px;
        }

        .titles {
            color: white;
            margin-left: 10px;
            font-family: fantasy;
        }
    </style>
</head>

<body>
    <?php include 'header1.php'; ?>
    <?php
    if (isset($_SESSION['id'])) {
        include('config.php');
        $sql = "SELECT products_id , count(*) as top FROM `wishlist` WHERE users_id = " . $_SESSION['id'] . " GROUP by products_id";
        $res = mysqli_query($con, $sql);
        if ($res->num_rows > 0) {
            echo "<h1 class='titles' style='margin-block:2%'>Your Wishlist</h1>";
            echo "<div class='grid-container'>";

            while ($row = mysqli_fetch_assoc($res)) {
                $products = $row['products_id'];

                

                $sql_p = "select * from products where id=" . $products;
                $results = mysqli_query($con, $sql_p);
                if ($results->num_rows > 0) {
                    while ($row = mysqli_fetch_assoc($results)) {

                        $id = $row['id'];
                        $type = $row['type'];
                        $cpu = $row['cpu'];
                        $specs = $row['specs'];
                        $gpu = $row['gpu'];
                        $ram = $row['ram'];
                        $price = $row['price'];
                        $disk = $row['disk'];
                        $quantity = $row['quantity'];
                        $image = $row['image'];

                        echo "<div class='card'>";
                        echo "<img alt='laptop pic' class='card-img-top' src=" . $image . ">";
                        echo "<div class='card-body' style='margin-top : -30px ;'>";
                        echo "<h4 class='card-title'>$type</h4>";
                        echo "<p class='card-text' style='font-size :13px ; height: 80px'>$specs</p>";
                        if ($quantity <= 0) {
                            echo "<p style='margin:0 0 0 22%; font-size:13px ; font-weight: bold; color: red'>" . $price . "$&nbspSold out</p>";
                        } else {
                            echo "<p style='margin:0 0 0 35%; font-size:13px ; font-weight: bold; '>" . $price . "$</p>";
                        }
                        echo "<a href='whishList.php?id=" . $id . "' style='margin-left: 30px;margin-right: 10px; color:#DC3545' class='btn btn-dark'>unsave</a>";
                        echo "<a href='detail.php?id=" . $id . "' class='btn btn-dark' style='color:#DC3545' >Details</a>";
                        echo "</div>";
                        echo "</div>";
                    }
                }
            }
            echo "</div>";
        } else {
            echo "<p style='color:white'>Your whilist is empty &nbsp;<a href='mainPage.php'>Return to the Home page</a></p>";
            echo "<div style='height:250px'></div>";
        }
        $con->close();
    } else {
        echo "<p style='color:white'>Please Login ";
        echo "<a href='login.php'>here.</a></p>";
        echo "<div style='height:250px'></div>";
    }
    ?>
    <?php include 'footer.php'; ?>
</body>

</html>