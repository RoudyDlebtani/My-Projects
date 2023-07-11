<html>
<head></head>
<body>
<a href="mainPage.php"><input type="button" value="return to the main page" name="return" ></a>

<h1>ADD PRODUCTS</h1>
<form action="./user/admin2.php" method="post" enctype="multipart/form-data">
<table >


    
<tr>
    <td><input type="text" placeholder="specs" name="specs" required></td>
    <td><input type="text" placeholder="type" name="type" required></td>
    <td><input type="text" placeholder="price" name="price" required ></td>
    <td><input type="text" placeholder="gpu" name="gpu" required ></td>

</tr>

<tr>
    <td><input type="text" placeholder="ram" name="ram" required></td>
    <td><input type="text" placeholder="quantity" name="quantity" required ></td>
    <td><input type="text" placeholder="disk" name="disk" required></td>
    <td><input type="text" placeholder="cpu" name="cpu" required></td>

</tr>

<tr>

<td> <input type='file' name='image' required></td>
<td> <input type='file' name='image2' required></td>
<td> <input type='file' name='image3' required><td>
<td> <input type="submit"  name="submit" value="Submit"></td>
</tr>

</table>
</form>


<h1>ALL PRODUCTS</h1>
<table border='1'><tr><b><th>type</th><th>specs</th>
<th>price</th><th>gpu</th>
<th>quantity</th><th>ram</th><th>disk</th><th>cpu</th>
<th>delet</th><th>edit</th> </tr>


<?php

require_once "config.php";
$query = "SELECT * FROM products";

$result = mysqli_query($con,$query);

if (!$result) die ("Database access failed: ");

$r = mysqli_num_rows($result);
for($j=0; $j<$r; $j++){
$fetched_row = mysqli_fetch_assoc($result);

$id=$fetched_row['id'];
$cpu = $fetched_row['cpu'];
$disk = $fetched_row['disk'];
$gpu = $fetched_row['gpu'];
$image = $fetched_row['image'];
$image2 = $fetched_row['image2'];
$image3 = $fetched_row['image3'];
$price = $fetched_row['price'];
$quantity = $fetched_row['quantity'];
$ram = $fetched_row['ram'];
$specs = $fetched_row['specs'];
$type = $fetched_row['type'];

echo "<tr><td>$type</td><td> $specs</td>
<td> $price</td><td>$gpu</td><td>$quantity</td>
<td>$ram</td><td>$disk</td> <td>$cpu </td>"
. "<td><a href='./user/deletProduct.php?id=$id'><img src='./images/drop.png' ></a></td>" .
 "<td><a href='editProduct.php?id=$id'><img src='./images/edit.png' ></a></td>".
"</tr>";
}?>

</table>
<br><br>

<h1>ALL USERS</h1>

<table border='1'>
<tr><th>id</th><th>username</th>
<th>email</th><th>password</th>
<th>admin </th><th>delet</th><th>edit</th> </tr>

<?php

require_once "config.php";
$query = "SELECT * FROM users";

$result = mysqli_query($con,$query);

if (!$result) die ("Database access failed: ");

$r = mysqli_num_rows($result);
for($j=0; $j<$r; $j++){
$fetched_row = mysqli_fetch_assoc($result);

$id=$fetched_row['id'];
$username = $fetched_row['username'];
$email = $fetched_row['email'];
$password = $fetched_row['password'];
$admin = $fetched_row['admin'];

echo "<tr><td>$id</td><td> $username</td>
<td> $email</td><td>$password</td><td>$admin</td>"
. "<td><a href='./user/deletUser.php?id=$id'><img src='./images/drop.png' ></a></td>" .
 "<td><a href='editUser.php?id=$id'><img src='./images/edit.png' ></a></td>".
"</tr>";
}?>

</table>


</body>
</html>
