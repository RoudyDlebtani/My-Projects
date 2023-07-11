<?php
session_start();
?>
<html>
    <head>
   
        <meta charset="UTF-8">
        <title></title>
    </head>

    <style>
         body{
    background-image: url(./images/black.jpg);
  }
 #AboutUsContainer{
    width: 100%;
    height:600px;
   float: left;
   
   margin-right: 50px;
  }

  #AboutUsText{
    width: 100%;
    height: 900px;
   background-color: white;
   padding: 10px;

  }

  p{
    font-size: large;
  }
        </style>
    <body>
        <div>
        <?php include 'header1.php'; ?>
 <div id="AboutUsContainer">
 <img id="AboutUsContainer" src="./images/Aboutus.jpg" alt="1"></div>
<div id="AboutUsText"><p><b>My Computer</b> was established in 2008, as a wholesale and retail distributor for multi branded notebooks, desktops, Servers, accessories, storage devices (SSD, HDD, NAS..), printers, memory, gaming products, toners, ink supplies, LED screen and security software for desktop and laptops. then expanded into an IT distribution company in 2016.</p>

<p>We are Authorized Distributor in lebanon for PNY, Redragon, MARVO Scorpion, ESET NOD32, Manli Technology Group, Seasonic, GOFREETECH, LUNATECH, HIKVISION, XPRINTER, ONYX, POWERLINK, TechnoCable, Micropos, TeamGroup, TDagger, Xstrike, HKTV, TECHNOCOLOR, TOTOLINK, Micro Cable, DATA LINK and golden partner for INTEL and TPLINK</p>

<p><b>My Computer</b> today serve over 300 clients of various segments in Lebanon and some African countries with full distribution capability offering fast and free delivery for entire Lebanese territory.</p>

<p>At <b>My Computer</b> we aim to serve our client by bringing them the most updated technologies, latest generation, extreme gaming performance, integrated tech gadget & more…</p></div>
<?php include 'footer.php'; ?>
</div>

    </body>
</html>
