<?php
//$query2 = "SELECT * FROM products ORDER BY price DESC";
//$query3= "SELECT * FROM products ORDER BY price ASC";
//<div class="card-container">
?>
<html>

<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .input {
            border: 3px solid #212529;
            border-radius: 10px;
            margin-bottom: 20px;
        }

        .text {
            font-weight: bold;
            margin-right: 20px;
            color: #212529;
            margin-bottom: 20px;
        }

        .align {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
        }
    </style>
</head>

<body>
    <?php include 'header1.php'; ?>
    <div class="align">
        <h1 class="text" style="margin-bottom: 20px;">Loggin</h1>
    </div>
    <form action="./user/logIn2.php" method="post" >
        <table class="align">

           
            <tr>
                <td>
                    <label class="text">Username</label>
                </td>
                </td>
                <td> <input type="text" class="input" name="username" placeholder="Username" required></td>
            </tr>
            <tr>
                <td>
                    <label class="text">Password</label>
                </td>
                </td>
                <td> <input type="password" class="input" name="password" required></td>
            </tr>
            <tr class="align">
                <td colspan="2"> <input type="submit" class="btn btn-danger" name="LOGIN" value="Submit"></td>
            </tr>


        </table>
    </form>
    <p class="align">
        Don't have an account?<a href="register.php"><b>Join Now</b></a></p>
    <?php include 'footer.php'; ?>
</body>

</html>