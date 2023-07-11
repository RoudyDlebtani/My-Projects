<html>
    <head>
    <style>
      
            .input {
                border : 3px solid #212529 ;
                border-radius : 10px;
                margin-bottom:10px;
            }
            .text {
                font-weight: bold;
                margin-right:20px;
                color : #212529;
                margin-bottom:10px;
            }
            .align {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }
    form{
        height: 290px;
        width: 100%;
    }

    .btn-dange{
    background-color: red;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    font-size: 16px;
  }
 
 .btn-dange:hover {
    background-color: rgb(163, 14, 14);
  }

        </style>

<body>
<?php include 'header1.php'; ?>
        <div class="align">
            <h1 class="text" style="margin-bottom: 80px;">Register now</h1>
        </div>
        <form action="./user/register2.php" method="post">

            <table class="align"> 
          
          
                <tr>
                <td>   <label  class="text">Username</label></td> 
                <td>      <input type="text" name="username" class="input" placeholder="Username" required> </td> 
                </tr>
                <tr>
                <td>   <label class="text">Email</label></td> 
                <td>      <input type="email" name="email" class="input" placeholder="Email" required> </td> 
                </tr>
                <tr>
                <td>   <label class="text">Password</label></td> 
                <td>      <input type="password" name="password" class="input" required> </td> 
                </tr>
                <tr>
                <td>   <label class="text">Confirm password</label></td> 
                <td>      <input type="password" name="confirmPassword" class="input" required> </td> 
                </tr>
                <tr>
                
                    <td colspan="2" class="align" style="margin-left:100%">
                        <input type="submit" name="save" class="btn-dange" value="Submit">
                    </td>
                </tr>
            </table>
        </form>
        <p class="align">
        Already have an account?<a href="login.php"><b>Login here</b></a></p>
        <?php include 'footer.php'; ?>
    </body>
</html>