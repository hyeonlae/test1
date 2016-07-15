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
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">미니 쇼핑몰</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">회원<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">회원 가입</a></li>
							<li>
								<c:if test="${empty sessionScope.loginfo}">
									<a href="<%=contextPath%>/LoginForm.me">로그인</a>
								</c:if>
								<c:if test="${not empty sessionScope.loginfo}">
									<a href="<%=contextPath%>/Logout.me">로그 아웃</a>
								</c:if>									
							</li> 
							<li><a href="#">회원 탈퇴</a></li>
						</ul>
					</li>
					
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">게시물<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">게시물 등록</a></li>
							<li><a href="#">로그인 수정</a></li>
							<li><a href="#">게시물 삭제</a></li>
						</ul>
					</li>					

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">상품<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">상품 등록</a></li>
							<li><a href="#">상품 정보 수정</a></li>
							<li><a href="<%=contextPath%>/list.prd">상품 목록 보기</a></li>
							<li><a href="#">상품 목록 삭제</a></li>
						</ul>
					</li>
					
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">쇼핑몰<b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="#">aaa</a></li>
							<li><a href="#">bbb</a></li>
							<li><a href="#">ccc</a></li>
						</ul>
					</li>					

				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li>
						<c:if test="${empty sessionScope.loginfo}">					
							<a href="<%=contextPath%>/LoginForm.me">
								<span class="glyphicon glyphicon-log-in">
									로그인
								</span>
							</a>
						</c:if>
						<c:if test="${not empty sessionScope.loginfo}">					
							<a href="<%=contextPath%>/Logout.me">
								<span class="glyphicon glyphicon-log-in">
									로그 아웃
								</span>
							</a>
						</c:if>						
					</li>
				</ul>
			</div>

		</div>
	</nav>
</body>
</html>