<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
<style type="text/css">
/*.panel-body{ margin-bottom: -30px;}*/
.form-group {
	margin-bottom: 3px;
}

.form-control {
	height: 25px;
}
</style>
<script type="text/javascript">
	function gotoBack(){
		location.href='<%=contextPath%>/List.bo?${requestScope.parameter}';
		//alert('${requestScope.parameter}') ;
	}
</script>
</head>
<%
	int myoffset = 2; //전체 외관의 옵셋
	int mywidth = twelve - 2 * myoffset;
	int leftside = 4; //판넬의 좌측
	int rightside = twelve - leftside; //판넬의 우측
%>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-primary">
			<div class="panel-heading">
				<h1 class="panel-title" align="left">게시물 상세 보기</h1>
			</div>
			<div class="panel-body">
				<div class="col-sm-<%=leftside%> col-sm-<%=leftside%>">
					<table>
						<tr>
							<td align="center"><img align="middle" src="<%=contextPath%>/images/Koala.jpg"
								class="img-rounded" width="200" height="200"></td>
						</tr>
					</table>
				</div>
				<div class="col-sm-<%=rightside%> col-sm-<%=rightside%>">
					<table class="table table-hover table-condensed">
						<tr>
							<td width="25%" align="center">글 번호</td>
							<td width="75%" align="left">${bean.no}</td>
						</tr>						
						<tr>
							<td width="25%" align="center">작성자</td>
							<td width="75%" align="left">${bean.writer}</td>
						</tr>
						<tr>
							<td width="25%" align="center">제목</td>
							<td width="75%" align="left">${bean.subject}</td>
						</tr>
						<tr>
							<td width="25%" align="center">비밀번호</td>
							<td width="75%" align="left">${bean.password}</td>
						</tr>
						<tr>
							<td width="25%" align="center">글 내용</td>
							<td width="75%" align="left">${bean.content}
							</td>
						</tr> 
						<tr>
							<td width="25%" align="center">조회수</td>
							<td width="75%" align="left">${bean.readhit}</td>
						</tr>
						<tr>
							<td width="25%" align="center">작성 일자</td>
							<td width="75%" align="left">${bean.regdate}</td>
						</tr>
					</table>
				</div>
				<hr>
				<div class="col-sm-offset-5 col-sm-4">
					<button class="btn btn-primary" onclick="gotoBack();">
						돌아 가기</button>
				</div>
			</div>
			<!-- end panel-body -->
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="popover"]').popover();
		});
	</script>
</body>
</html>