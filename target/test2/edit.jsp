<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>lizihao's personal blog</title>

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

<!-- wangEditor -->
<link rel="stylesheet" type="text/css"
	href="dist/css/wangEditor.min.css">



<title>MINIMAL - Free Bootstrap 3 Theme</title>

<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="assets/css/main.css" rel="stylesheet">
<link rel="stylesheet" href="assets/css/font-awesome.min.css">

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/modernizr.custom.js"></script>



<link href='http://fonts.googleapis.com/css?family=Oswald:400,300,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=EB+Garamond'
	rel='stylesheet' type='text/css'>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="assets/js/html5shiv.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body data-spy="scroll" data-offset="0" data-target="#theMenu"style="background-color: black">

	<!-- Menu -->
	<nav class="menu" id="theMenu">
	<div class="menu-wrap">
		<h1 class="logo">
			<a href="index.html#home">realife</a>
		</h1>
		
		 		<c:forEach items="${bloglist }" var="blog">
				  <a href="toBlog.do?id=${blog.id }" class="smoothScroll">${blog.title }</a>
					<a href="deleteBlog.do?id=${blog.id }">删除</a>
				<br>
			</c:forEach>
	</div>

	<!-- Menu button -->
	<div id="menuToggle">
		<i class="icon-reorder"></i>
	</div>
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
				<h3>Hello, I'm Lizihao. I love game.</h3>
				<br> <br>
				<div class="col-lg-6 col-lg-offset-3"></div>
			</div>
		</div>
		<!-- /container -->
	</div>
	<!-- /headerwrap -->



	<!-- ========== ABOUT SECTION ========== -->
	<section id="about" name="about"></section>
	<div id="f">
		<button id="submit" type="button" onclick="submit()" class="btn btn-primary">发布</button>
		<button type="button" onclick="cancel()" class="btn btn-primary">取消</button>
		<div class="container">

			<div class="row">
				<h3 id="title" contenteditable="true">标题</h3>
				<p class="centered">
					<i class="icon icon-circle"></i><i class="icon icon-circle"></i><i
						class="icon icon-circle"></i>
				</p>

				<!-- INTRO INFORMATIO-->
				<div class="col-lg-6 col-lg-offset-3"></div>

			</div>

		</div>
		<!-- /container -->
	</div>
	<!-- /f -->
	<!-- 	<div style="height: 800px">
	<div id="div1" style="height: 800px">
		<p>请输入内容...</p>
	</div>
	</div> -->
	<div style="margin-left: 80px;margin-right: 80px;margin-bottom: 40px">
	<div id="div1" style="height: 500px;background-color: black" >
		<p>请输入内容...</p>
	</div>
	</div>




<!-- Bootstrap core JavaScript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/classie.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/smoothscroll.js"></script>
<script src="assets/js/main.js"></script>

<!-- wangEditor -->
<script type="text/javascript" src="dist/js/lib/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="dist/js/wangEditor.min.js"></script>
<script type="text/javascript">
	$(function() {
		var editor = new wangEditor('div1');
		editor.create();
	});
</script>
<!-- <script type="text/javascript">
$('#submit').click(function () {
        // 获取编辑器区域完整html代码
        var html = editor.$txt.html();
        var title1 = $('#title.text');
		$.post("/postBlog.do",
    {
      title:title1,
      content:html
    },
    function(){
    
    
    
    });
    }
</script> -->

<script type="text/javascript">
function submit(){

		var html = $('#div1').html();
        var title1 = $('#title').text();
        
        $.ajax({
          url: "postBlog.do",
          type: "POST",
          dataType: "json",
          data: {
          	  title:title1,
    		  content:html
          },
          success: function(data) {
            alert("success");
           	location.href="toIndex.do"
          }
        });
		location.href="toIndex.do";
	/* 	$.post("postBlog.do",
   		 {
      title:title1,
      content:html
  		  }); */

}

</script>
</body>
</html>
