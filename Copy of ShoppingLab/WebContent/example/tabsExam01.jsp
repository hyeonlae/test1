<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 3;
	int mywidth = twelve - 2 * myoffset;
	int formleft = 3;
	int formright = twelve - formleft;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
</head>
<body>
	<div class="container">
		<h3>드롭다운 메뉴가 있는 Tab</h3>
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#mytab1">Home</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">과일 <span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a data-toggle="tab" href="#mytab21">사과</a></li>
					<li><a data-toggle="tab" href="#">바나나</a></li>
					<li><a data-toggle="tab" href="#">포도</a></li>
				</ul></li>
			<li><a data-toggle="tab" href="#mytab3">음료수</a></li>
			<li><a data-toggle="tab" href="#mytab4">동물 그림</a></li>
		</ul>
		<div class="tab-content">
			<div id="mytab1" class="tab-pane fade in active">
				<div class="panel panel-default panel-primary">
					<div class="panel-heading">로그인 하기</div>
					<div class="panel-body">
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label class="control-label col-sm-<%=formleft%>" for="id">아이디</label>
								<div class="col-sm-<%=formright%>">
									<input type="text" class="form-control" name="id" id="id"
										data-toggle="tooltip" data-placement="top"
										title="아이디는 3글자 이상 10글자 이하로 입력해 주세요."
										placeholder="아이디를 넣어 주셔용^^">
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-<%=formleft%>" for="password">비밀
									번호</label>
								<div class="col-sm-<%=formright%>">
									<input type="password" class="form-control" name="password"
										id="password" placeholder="비밀 번호를 넣어 주셔용^^">
								</div>
							</div>
							<div class="form-group">
								<div align="center" class="col-sm-offset-3 col-sm-6">
									<button class="btn btn-default" type="submit">로그인</button>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<button class="btn btn-default" type="reset">취소</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div id="mytab2" class="tab-pane fade">나나나</div>
			<div id="mytab21" class="tab-pane fade">
				<div class="col-md-offset-<%=myoffset%> col-md-<%=mywidth%>"
					align="right">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h1 class="panel-title" align="left">해당 상품 상세 보기</h1>
						</div>
						<div class="panel-body" align="left">
							<div class="col-md-12">
								<table class="table table-condendes table-striped">
									<tr>
										<td width="25%">글 번호</td>
										<td width="75%">100</td>
									</tr>
									<tr>
										<td width="25%">제목(조회수)</td>
										<td width="75%">젝키의 폼생폼사 <span class="badge">42</span></td>
									</tr>
									<tr>
										<td width="25%">작성자</td>
										<td width="75%">홍길동</td>
									</tr>
									<tr>
										<td width="25%">글 내용</td>
										<td width="75%">넘 잼있어요</td>
									</tr>
									<tr>
										<td width="25%">작성 일자</td>
										<td width="75%">2016/12/25</td>
									</tr>
								</table>
							</div>
							<hr>
							<div class="col-md-offset-5 col-md-4">
								<button class="btn btn-primary">돌아 가기</button>
							</div>
						</div>
						<!-- end panel-body -->
					</div>
				</div>
			</div>
			<div id="mytab3" class="tab-pane fade">
				<h3>시원한 음료수</h3>
				<table class="table">
					<tr>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup01.png" class="img-circle"
							width="160" height="160"></td>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup02.png" class="img-circle"
							width="160" height="160"></td>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup01.png" class="img-circle"
							width="160" height="160"></td>
					</tr>
					<tr>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup02.png" class="img-circle"
							width="160" height="160"></td>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup01.png" class="img-circle"
							width="160" height="160"></td>
						<td align="center"><img
							src="<%=contextPath%>/images/sevenup02.png" class="img-circle"
							width="160" height="160"></td>
					</tr>
				</table>
			</div>
			<div id="mytab4" class="tab-pane fade">
				<h2>이미지 갤러리</h2>
				<p>The .thumbnail class can be used to display an image gallery.
					Click on the images to see it in full size:</p>
				<div class="row">
					<div class="col-md-4">
						<a href="pulpitrock.jpg" class="thumbnail">
							<p>Pulpit Rock: A famous tourist attraction in Forsand,
								Ryfylke, Norway.</p> <img src="<%=contextPath%>/images/Koala.jpg"
							alt="Pulpit Rock" style="width: 150px; height: 150px">
						</a>
					</div>
					<div class="col-md-4">
						<a href="moustiers-sainte-marie.jpg" class="thumbnail">
							<p>Moustiers-Sainte-Marie: Considered as one of the "most
								beautiful villages of France".</p> <img
							src="<%=contextPath%>/images/Koala.jpg"
							alt="Moustiers Sainte Marie" style="width: 150px; height: 150px">
						</a>
					</div>
					<div class="col-md-4">
						<a href="cinqueterre.jpg" class="thumbnail">
							<p>The Cinque Terre: A rugged portion of coast in the Liguria
								region of Italy.</p> <img src="<%=contextPath%>/images/Koala.jpg"
							alt="Cinque Terre" style="width: 150px; height: 150px">
						</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>



