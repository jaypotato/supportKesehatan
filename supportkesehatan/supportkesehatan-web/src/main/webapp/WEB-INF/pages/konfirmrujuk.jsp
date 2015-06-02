<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Rujukan | Sistem Jaminan Kesehatan</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width">

  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/bootstrap-responsive.min.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/sl-slide.css">
  <link rel="stylesheet" href="css/chosen.css">

  <script src="js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>

  <!-- Le fav and touch icons -->
  <link rel="shortcut icon" href="images/ico/favicon.ico">
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
  <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
</head>

<body>

  <!--Header-->
  <header class="navbar navbar-fixed-top">
    <div class="navbar-inner">
            <div class="container">
                <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </a>
                <a id="logo" class="pull-left" href="index.html"></a>
                <div class="nav-collapse collapse pull-right">
                    <ul class="nav">
                        <li><a href="index.html">Beranda</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Rujukan <i class="icon-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="">Ajukan Rujukan</a></li>
                                <li><a href="">Terima Rujukan</a></li>
                            </ul>
                        </li>
                        <li><a href="">Informasi Kesehatan</a></li>
                        <li><a href="">Klaim Anggaran</a></li>
                        <li class="login"><a href="register.html"><i class="icon-signout"></i> Keluar </a></li>
                    </ul>        
                </div><!--/.nav-collapse -->
            </div>
        </div>
  </header>
  <!-- /header -->
<section class="title">
        <div class="container">
            <div class="row-fluid">
                <div class="span6">
                    <h1>Daftar Rujuk Masuk</h1>
                </div>
            </div>
        </div>
    </section>

    <section id="contact-page" class="container">
    

        <div class="center gap">
      <h1><i class="icon-file icon-big"></i> Daftar Rujuk Masuk <i class="icon-file icon-big"></i>  </h1>
    </div>
        <div class="row-fluid">

           <table class="table table-hover table-bordered table-striped">
              <thead>
                <tr>
                  <th style="text-align:center; width:25%;">Nama Pasien</th>
                  <th style="text-align:center;width:50%;">Asal Rujuk</th>
                  <th style="text-align:center;width:10%;">Konfirmasi</th>
                  
                </tr>
              </thead>
              <tbody>
          <tr>
          <td style="text-align:center;"></td>
          <td style="text-align:center;"></td>
          <td style="text-align:center;">
          <a data-toggle="modal" href="#updatejobForm">Konfirmasi</a> | 
          <a data-toggle="modal" href="#deleteJob" style="color:red">Tolak</a>
          </td>
          </tbody>
          </table>

    </div>

</section>


<!--Footer-->
<footer id="footer">
    <div class="container">
        <div class="row-fluid">
            <div class="span5 cp">
                 <span>&copy; SIBEA 2014 All right reserved. By </span><a>APSE_5112100055_5112100084</a>
        </div>
            <!--/Copyright-->

            <div class="span6">
                <ul class="social pull-right">
                    <li><a href="#"><i class="icon-facebook"></i></a></li>
                    <li><a href="#"><i class="icon-twitter"></i></a></li>
                    <li><a href="#"><i class="icon-pinterest"></i></a></li>
                    <li><a href="#"><i class="icon-linkedin"></i></a></li>
                    <li><a href="#"><i class="icon-google-plus"></i></a></li>                       
                    <li><a href="#"><i class="icon-youtube"></i></a></li>
                    <li><a href="#"><i class="icon-tumblr"></i></a></li>                        
                    <li><a href="#"><i class="icon-dribbble"></i></a></li>
                    <li><a href="#"><i class="icon-rss"></i></a></li>
                    <li><a href="#"><i class="icon-github-alt"></i></a></li>
                    <li><a href="#"><i class="icon-instagram"></i></a></li>                   
                </ul>
            </div>

            <div class="span1">
                <a id="gototop" class="gototop pull-right" href="#"><i class="icon-angle-up"></i></a>
            </div>
            <!--/Goto Top-->
        </div>
    </div>
</footer>
<!--/Footer-->

<!--  Update form -->
<div class="modal hide fade in" id="updatejobForm" aria-hidden="false">
    <div class="modal-header">
        <i class="icon-remove" data-dismiss="modal" aria-hidden="true"></i>
      
    </div>
    <!--Modal Body-->
    <div class="modal-body">
        <center><form class="form-inline" action="<?=base_url();?>index.php/mengelolabeasiswa/mengelolabeasiswa" method="post" id="deleteJob">
      <h3 style="color:red">Apakah anda yakin ingin menerima rujukan ini?</h3>
            <button type="submit" class="btn btn-primary">Ya</button>
       <button type="danger" class="btn btn-danger">Tidak</button>
        </form>
        </center>
    </div>
    <!--/Modal Body-->
</div>

<!--  /Update form -->

<!--  Delete -->
<div class="modal hide fade in" id="deleteJob" aria-hidden="false">
    <div class="modal-header">
        <i class="icon-remove" data-dismiss="modal" aria-hidden="true"></i>
      
    </div>
    <!--Modal Body-->
    <div class="modal-body">
        <center><form class="form-inline" action="<?=base_url();?>index.php/mengelolabeasiswa/mengelolabeasiswa" method="post" id="deleteJob">
      <h3 style="color:red">Apakah anda yakin ingin menolak rujukan ini?</h3>
            <button type="submit" class="btn btn-primary">Ya</button>
       <button type="danger" class="btn btn-danger">Tidak</button>
        </form>
        </center>
    </div>
    <!--/Modal Body-->
</div>
<!--  Delete -->
<script src="js/vendor/jquery-1.9.1.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<script src="js/chosen.jquery.js" type="text/javascript"></script>
</body>
</html>
