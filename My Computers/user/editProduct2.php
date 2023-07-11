<?php
require_once '../config.php';

if (
    isset($_POST['type1']) && isset($_POST['specs1']) &&
    isset($_POST['cpu1']) && isset($_POST['ram1']) &&
    isset($_POST['gpu1']) && isset($_POST['disk1']) &&
    isset($_POST['price1']) && isset($_POST['quantity1']) &&
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
    $myfile = fopen("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".1" . "." . $ext, "w");
    file_put_contents("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".1" . "." . $ext, $str);
    $myfile2 = fopen("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".2" . "." . $ext2, "w");
    file_put_contents("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".2" . "." . $ext2, $str2);
    $myfile3 = fopen("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".3" . "." . $ext3, "w");
    file_put_contents("../images/" . $_POST['type1'] . "." . $_POST['price1'] . ".3" . "." . $ext3, $str3);
    $imageStr1 = "images/" . $_POST['type1'] . "." . $_POST['price1'] . ".1" . "." . $ext;
    $imageStr2 = "images/" . $_POST['type1'] . "." . $_POST['price1'] . ".2" . "." . $ext2;
    $imageStr3 = "images/" . $_POST['type1'] . "." . $_POST['price1'] . ".3" . "." . $ext3;

    $id = $_POST['id'];
    $type = $_POST['type1'];
    $cpu = $_POST['cpu1'];
    $gpu = $_POST['gpu1'];
    $ram = $_POST['ram1'];
    $price = $_POST['price1'];
    $specs = $_POST['specs1'];
    $disk = $_POST['disk1'];
    $quantity = $_POST['quantity1'];



    $sql = "UPDATE products set type = '$type',specs = '$specs',cpu = '$cpu',ram = '$ram',gpu = '$gpu',disk = '$disk',price = $price,quantity = $quantity,image = '$imageStr1',image2 = '$imageStr2',image3 = '$imageStr3' where id = $id";
    if ($res = mysqli_query($con, $sql)) {
        header("location:../mainPage.php");
    } else {
        echo "ERROR: Could not able to execute $sql. " . mysqli_error($con);
    }
}else{echo 'hello word';}



?>