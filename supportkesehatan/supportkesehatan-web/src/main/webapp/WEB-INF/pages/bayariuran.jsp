<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title> Iuran | Sistem Jaminan Kesehatan</title>
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
                        <li class="active"><a href="index.html">Beranda</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Jaminan Kesehatan <i class="icon-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="">Riwayat Kesehatan</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Premi JasKes <i class="icon-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="">Bayar Iuran</a>
                                <li><a href="">Riwayat Pembayaran</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Fasilitas Kesehatan <i class="icon-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="">Daftar Fasilitas Kesehatan</a></li>
                            </ul>
                        </li>
                        <li class="login"><a href="register.html"><i class="fa fa-sign-out"></i> Keluar </a></li>
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
                    <h1>Riwayat Pembayaran Iuran</h1>
                </div>
            </div>
        </div>
  </section>

  <section id="bayar-iuran" class="container">
    <form class="center" action='' method="POST">
      <fieldset class="registration-form">
        <div class="control-group">
          <div class="controls">
            <label style="text-align:left;">Jenis Iuran: </label>
            <div class="chosen-container">
                <select name="jenis_iuran" data-placeholder="Jenis Iuran" class="input-xlarge">
                    <option value="iuran_pokok">Iuran Pokok - Rp 20.000,-</option>                
                    <option value="iuran_bulanan">Iuran Pokok - Rp 40.000,-</option>
                    <option value="iuran_pokok">Iuran Momentual - Rp 60.000,-</option>            
                </select>
            </div>
          </div>
        </div>

        <div class="control-group">
          <div class="controls">
            <label style="text-align:left;">Tanggal Pembayaran: </label>
            <div class="chosen-container">
                <input class="input-xlarge" type="date" name="tanggal_iuran">
            </div>
          </div>
        </div>

        <div class="control-group">
          <!-- Button -->
          <div class="controls">
            <button class="btn btn-success btn-large btn-block">Submit Pembayaran</button>
          </div>
        </div>
      </fieldset>
    </form>
  </section>


<!--Footer-->
<footer id="footer">
    <div class="container">
        <div class="row-fluid">
            <div class="span5 cp">
                 
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

<!--  Delete -->
<script src="js/vendor/jquery-1.9.1.min.js"></script>
<script src="js/vendor/bootstrap.min.js"></script>
<script src="js/main.js"></script>
<script src="js/chosen.jquery.js" type="text/javascript"></script>
</body>
</html>
