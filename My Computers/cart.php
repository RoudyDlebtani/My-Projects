<?php
session_start()
?>
<?php
include('config.php');
if (isset($_GET['id'])) {
    $product = $_GET['id'];
    $users = $_SESSION['id'];
    $quantity = $_GET['quantity'];
    // checking the quantity left in the products table
    // $sqlQuanity = "select * from products p , cart c where c.productsid = p.id and c.productsid='$product and usersid='$users'";
    $sqlQuanity = "select * from products  where id='$product'";
    $result = mysqli_query($con, $sqlQuanity);
    $row = $result->fetch_assoc();
    $curentQuantity = $row['quantity'];
    //  checking if already exist in the cart table
    $sqlcheck = "select * from cart where usersid='$users' and productsid='$product'";
    $results = mysqli_query($con, $sqlcheck);
    if ($results->num_rows > 0) {
        $sqldelete = "DELETE FROM cart WHERE productsid='$product' and usersid='$users'";
        mysqli_query($con, $sqldelete);
        $sqlAddQuantity = "UPDATE products set quantity = ($curentQuantity + $quantity) where id=$product";
        mysqli_query($con, $sqlAddQuantity);
        $con->close();
    } else {
        if ($quantity > 0) {
            if ($quantity < $curentQuantity) {
                $sql = "INSERT INTO cart (usersid,productsid) VALUES ('$users','$product')";
                mysqli_query($con, $sql);
                $sqlAddQuantity2 = "UPDATE products set quantity = ($curentQuantity - $quantity) where id=$product";
                mysqli_query($con, $sqlAddQuantity2);
                $con->close();
            } else {
                die("Sorry we do not have this quantity please recheck later or try again with less quantity<a href='mainPage.php'>Return to Home Page</a>");
            }
        } else {
            die("No quantity indicated<a href='mainPage.php'>Return to Home Page</a>");
        }
    }
    header("Location:" . $_SERVER["HTTP_REFERER"]);
}
?>
<?php
if (isset($_GET['submitpayment'])) {
    include('config.php');
    $users = $_SESSION['id'];
    $sqldelete = "DELETE FROM cart WHERE usersid='$users'";
    mysqli_query($con, $sqldelete);
    $con->close();
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
            max-width: 234px !important;
            max-height: 420px !important;
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
        $sqlProduct = "SELECT * FROM cart WHERE usersid = " . $_SESSION['id'] . "";
        $res = mysqli_query($con, $sqlProduct);
        if ($res->num_rows > 0) {
            echo "<h1 class='titles' style='margin-block:2% ;'>Your cart</h1>";
            echo "<form><input type='submit' name='submitpayment' style='display: inline;margin-left: 10px; color:#DC3545' class='btn btn-dark' value='Confirm Payment'></form>";
            echo "<div class='grid-container'>";

            while ($rows = mysqli_fetch_assoc($res)) {
                $products = $rows['productsid'];
                $sql_p = "select * from products where id=" . $products . "";
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
                        $quantity2 = $row['quantity'];
                        $image = $row['image'];

                        echo "<div class='card'>";
                        echo "<img alt='laptop pic' class='card-img-top' src=" . $image . ">";
                        echo "<div class='card-body' style='margin-top : -30px ;'>";
                        echo "<h4 class='card-title'>$type</h4>";
                        echo "<p class='card-text' style='font-size :13px ; height: 80px'>$specs</p>";
                        if ($quantity2 <= 0) {
                            echo "<p style='margin:0 0 0 22%; font-size:13px ; font-weight: bold; color: red'>" . $price . "$&nbspSold out</p>";
                        } else {
                            echo "<p style='margin:0 0 0 35%; font-size:13px ; font-weight: bold; '>" . $price . "$</p>";
                        }
                        echo "<a href='cart.php?id=$id' style='margin-right: 10px; color:#DC3545' class='btn btn-dark'>Remove</a>";
                        echo "<a href='detail.php?id=" . $id . "' class='btn btn-dark' style='color:#DC3545' >Details</a>";
                        echo "</div>";
                        echo "</div>";
                    }
                }
            }
            echo "</div>";
        } else {
            echo "<p style='color:white'>Your cart is empty &nbsp;<a href='mainPage.php'>Return to the Home page</a></p>";
            echo "<div style='height:250px'></div>";
        }
        $con->close();
    } else {
        echo "<p style='color:white'>Please Login ";
        echo "<a href='logIn.php'>here.</a></p>";
        echo "<div style='height:250px'></div>";
    }
    ?>
    <?php include 'footer.php'; ?>
</body>

</html>