<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 2;
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
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-primary">
			<div class="panel-heading">
				<h4>답글 달기</h4>
			</div>
			<div class="panel-body">
				<form class="form-horizontal" role="form"
					action="<%=contextPath%>/Reply.bo" method="post">
					<input type="hidden" name="pageNumber"
						value="<%=request.getParameter("pageNumber")%>"><input type="hidden" name="pageSize"
						value="<%=request.getParameter("pageSize")%>"> <input
						type="hidden" name="groupno"
						value="<%=request.getParameter("groupno")%>"> <input
						type="hidden" name="orderno"
						value="<%=request.getParameter("orderno")%>">
						<input type="hidden" name="depth"
						value="<%=request.getParameter("depth")%>">
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="writer">작성자</label>
						<div class="col-sm-<%=formright%>">
							<input type="text" class="form-control" name="fakewriter"
								id="fakewriter" placeholder="작성자"
								value="${sessionScope.loginfo.name}(${sessionScope.loginfo.id})"
								disabled="disabled"> <input type="hidden" name="writer"
								id="writer" value="${sessionScope.loginfo.id}">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="subject">글
							제목</label>
						<div class="col-sm-<%=formright%>">
							<input type="text" class="form-control" name="subject"
								id="subject" placeholder="글 제목"  value="">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="password">비밀
							번호</label>
						<div class="col-sm-<%=formright%>">
							<input type="password" class="form-control" name="password"
								id="password" placeholder="비밀 번호를 넣어 주셔용^^"
								 value="">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="content">글
							내용</label>
						<div class="col-sm-<%=formright%>">
							<textarea name="content" id="content" rows="5" cols=""
								placeholder="글 내용" class="form-control"></textarea>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="regdate">작성
							일자</label>
						<div class="col-sm-<%=formright%>">
							<input type="datetime" class="form-control" name="regdate"
								id="regdate" placeholder="작성 일자" value="2016-05-05">
						</div>
					</div>
					<div class="form-group">
						<div align="center" class="col-sm-offset-3 col-sm-6">
							<button class="btn btn-default" type="submit">답글 달기</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button class="btn btn-default" type="reset">취소</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script>
		$(document).ready(function() {
			$('[data-toggle="tooltip"]').tooltip();
		});
	</script>

</body>
</html>