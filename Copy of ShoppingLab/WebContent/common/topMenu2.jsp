<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="common.jsp"%>
<html>
<head>
	<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">

		<nav class="navbar navbar-default" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">로고 </a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">메뉴 1 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">서브메뉴 1</a></li>
							<li><a href="#">서브메뉴 2</a></li>
							<li><a href="#">서브메뉴 3</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">메뉴 2 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">서브메뉴 1</a></li>
							<li><a href="#">서브메뉴 2</a></li>
							<li><a href="#">서브메뉴 3</a></li>
						</ul></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">메뉴 3 <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">서브메뉴 1</a></li>
							<li><a href="#">서브메뉴 2</a></li>
							<li><a href="#">서브메뉴 3</a></li>
						</ul></li>
					<li><a href="#">메뉴 4 </a></li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="검색">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>

			</div>
			<!-- /.navbar-collapse -->
		</nav>
		<article>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
				Pellentesque non orci interdum, pharetra dui nec, eleifend ligula.
				Integer rutrum nunc a mi luctus vehicula. Aenean ut odio euismod,
				fringilla leo quis, tincidunt tellus. Pellentesque ultricies lectus
				non faucibus semper. Ut egestas turpis sed purus dignissim, quis
				vehicula odio convallis. Suspendisse egestas rutrum velit sit amet
				cursus. Suspendisse a sapien ac enim pretium egestas. Mauris eget
				risus ut velit molestie pretium.</p>

			<p>Integer ac molestie orci. Sed eget suscipit ante. Donec
				suscipit lectus sed lectus elementum mollis. Vivamus tempor libero
				vitae ligula rhoncus sollicitudin. Mauris pretium eros non mauris
				pharetra, sit amet iaculis sapien egestas. Maecenas sodales augue at
				sapien facilisis, ut venenatis justo sodales. Nam est mi, semper at
				enim tincidunt, faucibus hendrerit risus. Morbi ligula libero,
				laoreet non libero in, adipiscing sagittis eros. In hac habitasse
				platea dictumst. Aenean nec accumsan mi. Nam dapibus mattis
				vestibulum. Duis eget purus volutpat, cursus nisi quis, ullamcorper
				diam. Cras commodo sodales quam, eget consectetur lorem laoreet vel.
				Curabitur rhoncus metus vitae eleifend porttitor. Donec congue orci
				id tortor laoreet, et fermentum lectus tincidunt. Nullam ac
				tincidunt ante.</p>

			<p>Aliquam erat volutpat. Duis tincidunt mattis orci et lacinia.
				Praesent posuere fringilla dui ut vestibulum. Maecenas eleifend odio
				id tincidunt cursus. Donec molestie orci nulla, sed lobortis libero
				accumsan et. Quisque libero nisi, molestie a elit vel, ultricies
				mollis ipsum. Praesent semper massa et pharetra aliquet.</p>

			<p>Aliquam et fringilla odio. Integer tristique vehicula posuere.
				Aenean vulputate a lectus sed vulputate. Class aptent taciti
				sociosqu ad litora torquent per conubia nostra, per inceptos
				himenaeos. Aliquam tincidunt dui vitae viverra mattis. Sed eget enim
				enim. Curabitur blandit turpis quis metus tincidunt, quis egestas
				tortor gravida. Maecenas fermentum turpis justo, vel fermentum massa
				scelerisque eget. Vivamus auctor, tortor vel porttitor cursus, sem
				augue faucibus turpis, sed venenatis ante lacus in augue. Duis
				faucibus tortor non magna faucibus dictum. Aenean at dictum ligula.
				Maecenas at arcu massa. In et fermentum quam, a varius risus. Mauris
				ut turpis et sem tristique scelerisque. Aenean dui erat, laoreet ac
				faucibus eu, adipiscing ac dolor.</p>

			<p>Etiam justo orci, accumsan a lacinia ac, suscipit id turpis.
				Nunc auctor erat id risus cursus mollis. Pellentesque semper massa a
				semper sodales. Proin pretium orci dolor, in lacinia tellus
				tincidunt non. Praesent pretium nec sem vitae consectetur.
				Suspendisse ut vestibulum libero. Ut eu eleifend enim, in dapibus
				nibh. Nullam congue volutpat nisi sit amet iaculis. Nullam dapibus
				iaculis lectus sed aliquam. Ut ut eros et lectus posuere vestibulum
				in et felis. Etiam eu est iaculis, faucibus lectus ac, ultrices
				odio.</p>

			</p>
		</article>
	</div>
</body>
</html>