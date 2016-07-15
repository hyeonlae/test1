<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./../common/top.jsp"%>
<%
	int content = twelve / 3 ;	
%>
<html>
<head>
	<script type="text/javascript">
		function func1(){
			alert('클릭했음당') ;
		}
	</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/sevenup01.png" width="210" height="210" alt="...">
					<div class="caption">
						<h3>사이다</h3>
						<p>달걀과 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/pear01.png" width="210" height="210" alt="...">
					<div class="caption">
						<h3>배</h3>
						<p>마씨쪼 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/Koala.jpg" width="210" height="210" alt="...">
					<div class="caption">
						<h3>사이다</h3>
						<p>달걀과 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
		</div>
		<div class="row">
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/sevenup01.png" width="210" height="210" alt="...">
					<div class="caption">
						<h3>사이다</h3>
						<p>달걀과 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/pear01.png" width="210" height="210" alt="...">
					<div class="caption">
						<h3>배</h3>
						<p>마씨쪼 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
			<div class="col-sm-<%=content%> col-md-<%=content%>">
				<div class="thumbnail" onclick="func1();">
					<img src="./../images/Koala.jpg" width="210" height="210" alt="...">
					<div class="caption">
						<h3>사이다</h3>
						<p>달걀과 먹으면 음...</p>
						<p>
							<a href="#" class="btn btn-primary" role="button">구매하기</a> <a
								href="#" class="btn btn-default" role="button">담기</a>
						</p>
					</div>
				</div>			
			</div>
		</div>		
	</div>
</body>
</html>