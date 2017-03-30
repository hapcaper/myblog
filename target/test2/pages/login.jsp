<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Welcome To Realife's Blog</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.png">

    <title>MINIMAL - Free Bootstrap 3 Theme</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/main.css" rel="stylesheet">
	<link rel="stylesheet" href="assets/css/font-awesome.min.css">

    <script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/modernizr.custom.js"></script>
	

	
    <link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=EB+Garamond' rel='stylesheet' type='text/css'>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<!-- flat-ui -->
	<link href="dist2/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="dist2/css/flat-ui.css" rel="stylesheet">
    <link href="docs/assets/css/demo.css" rel="stylesheet">

  </head>
  
  <body data-spy="scroll" data-offset="0" data-target="#theMenu" style="background-color: black">
		
	<!-- Menu -->
	<nav class="menu" id="theMenu">
		<div class="menu-wrap">
			<h1 class="logo"><a href="//toIndex.do">realife</a></h1>


			<a href="#"><i class="icon-facebook"></i></a>
			<a href="#"><i class="icon-twitter"></i></a>
			<a href="#"><i class="icon-dribbble"></i></a>
			<a href="#"><i class="icon-envelope"></i></a>
		</div>

		<!-- Menu button -->
		<div id="menuToggle"><i class="icon-reorder"></i></div>
	</nav>


	
	<!-- ========== HEADER SECTION ========== -->
	<section id="home" name="home"></section>
	<div id="headerwrap">
		<div class="container">
			<div class="logo">
				<img src="assets/img/logo.png">
			</div>
			<br>
			<div class="row">
				<h1>REALIFE</h1>
				<br>
				<h3>Hello Boy.</h3>
				<br>
				<br>
				<div class="col-lg-6 col-lg-offset-3">
				</div>
			</div>
		</div><!-- /container -->
	</div><!-- /headerwrap -->
	
	
	
	<!-- ========== ABOUT SECTION ========== -->
	<section id="about" name="about"></section>
	<div id="f">
		<div class="container">
			<div class="row">
				<h3>BE YOURSELF</h3>
				<p class="centered"><i class="icon icon-circle"></i><i class="icon icon-circle"></i><i class="icon icon-circle"></i></p>
				
				<!-- INTRO INFORMATIO-->
				<div class="col-lg-6 col-lg-offset-3">
				
				
				<!-- login -->
				<form action="login.do" method="post">
				<div class="login-form">
            <div class="form-group">
              <input type="text" name="username" class="form-control login-field" placeholder="Enter your name" id="login-name">
              <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="form-group">
              <input type="password"  name="password" class="form-control login-field"  placeholder="Password" id="login-pass">
              <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

					<button type="submit" class="btn btn-primary btn-lg btn-block"  >Log in</button>
            
          </div>
          </form>
				
				<div style="height: 300px"></div>
				
				
				
				</div>								
			</div>
		</div><!-- /container -->
	</div><!-- /f -->
	

	

	
	

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
	<script src="assets/js/classie.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script src="assets/js/smoothscroll.js"></script>
	<script src="assets/js/main.js"></script>
	
	<!-- flat-ui -->
	<script src="dist2/js/vendor/jquery.min.js"></script>
    <script src="dist2/js/vendor/video.js"></script>
    <script src="dist2/js/flat-ui.min.js"></script>
    <script src="docs/assets/js/application.js"></script>
</body>
</html>
