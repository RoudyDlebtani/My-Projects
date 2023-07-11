<?php 
require_once '../config.php';

    if (
        isset($_POST['type']) && isset($_POST['specs']) &&
        isset($_POST['cpu']) && isset($_POST['ram']) &&
        isset($_POST['gpu']) && isset($_POST['disk']) &&
        isset($_POST['price']) && isset($_POST['quantity']) &&
        file_exists($_FILES['image']['tmp_name']) &&
        file_exists($_FILES['image2']['tmp_name']) &&
        file_exists($_FILES['image3']['tmp_name']) &&
        is_uploaded_file($_FILES['image']['tmp_name']) &&
        is_uploaded_file($_FILES['image2']['tmp_name']) &&
        is_uploaded_file($_FILES['image3']['tmp_name'])
    ) {
        $str = file_get_contents($_FILES['image']['tmp_name']);
        $str2 = file_get_contents($_FILES['image2']['tmp_name']);
        $str3 = file_get_contents($_FILES['image3']['tmp_name']);
        $ext = pathinfo($_FILES['image']['name'], PATHINFO_EXTENSION);
        $ext2 = pathinfo($_FILES['image2']['name'], PATHINFO_EXTENSION);
        $ext3 = pathinfo($_FILES['image3']['name'], PATHINFO_EXTENSION);
        $myfile = fopen("../images/" . $_POST['type'] . "." . $_POST['price'] . ".1" . "." . $ext, "w");
        file_put_contents("../images/" . $_POST['type'] . "." . $_POST['price'] . ".1" . "." . $ext, $str);
        $myfile2 = fopen("../images/" . $_POST['type'] . "." . $_POST['price'] . ".2" . "." . $ext2, "w");
        file_put_contents("../images/" . $_POST['type'] . "." . $_POST['price'] . ".2" . "." . $ext2, $str2);
        $myfile3 = fopen("../images/" . $_POST['type'] . "." . $_POST['price'] . ".3" . "." . $ext3, "w");
        file_put_contents("../images/" . $_POST['type'] . "." . $_POST['price'] . ".3" . "." . $ext3, $str3);
        $imageStr1 = "images/" . $_POST['type'] . "." . $_POST['price'] . ".1" . "." . $ext;
        $imageStr2 = "images/" . $_POST['type'] . "." . $_POST['price'] . ".2" . "." . $ext2;
        $imageStr3 = "images/" . $_POST['type'] . "." . $_POST['price'] . ".3" . "." . $ext3;
        $sql = "INSERT INTO `products`(`type`,`specs`,`cpu`,`ram`,`gpu`,`disk`,`price`,`quantity`,`image`,`image2`, `image3`) 
        VALUES ('" . $_POST['type'] . "','" . $_POST['specs'] . "','" . $_POST['cpu'] . "','" . $_POST['ram'] . "','" . $_POST['gpu'] . "','" . $_POST['disk'] . "','" . $_POST['price'] . "','" . $_POST['quantity'] . "','" . $imageStr1 . "','" . $imageStr2 . "','" . $imageStr3 . "')";
        if ($res = mysqli_query($con, $sql)) {
            header("location:../mainPage.php");
        } else {
            echo "ERROR: Could not able to execute $sql. " . mysqli_error($con);
        }
    }


    



?>