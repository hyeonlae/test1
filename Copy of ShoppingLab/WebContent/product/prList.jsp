<%@page import="mypkg.utility.Paging"%>
<%@page import="mypkg.model.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 2;
	int mywidth = twelve - 2 * myoffset;
	int formleft = 3 ;
	int formright = twelve - formleft ; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
<script type="text/javascript">
	function writeForm(){
		location.href='<%=MyCtrlCommand%>prInsertForm' ;        
	}
	function search(){
		if( $('#mode').val() == '-' ){
			alert('검색 목록을 선택해주세요') ;
			//$('#mode').focus();
		}else{
			//alert('하하') ;
		}
		//alert( $('#mode').val() );
	}
	function searchAll(){
		//$('#mode').val('-');
		//$('#keyword').val('');
		location.href='<%=contextPath%>/prList';
	}
</script>
</head>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default">
			<div class="panel-heading"><h4>상품 목록</h4>
				<a class="form-control-static">${requestScope.pagingStatus}</a>
			</div>
			
			<tr>
					<td colspan="10" align="center">
						<form class="form-inline" role="form" name="myform" action="<%=MyCtrlCommand%>prList" method="post">
							<div class="form-group">
								<select class="form-group" name="mode" id="mode">
									<option value="all" selected="selected">--선택하세호우!--------
									<option value="name">상품명
									<option value="company">제조 회사
									<option value="category">카테고리
								</select>
							</div>
							<div class="form-group">
								<input type="text" class="form-control btn-xs" name="keyword"
									id="keyword" placeholder="검색 키워드">
							</div>
							<button class="btn btn-default btn-warning" type="submit" onclick="search();">검색</button>
							<button class="btn btn-default btn-warning" type="button" onclick="searchAll();">전체 검색</button>
							<button class="btn btn-default btn-info" type="button"
								onclick="writeForm();">상품 등록하기</button>
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<p class="form-control-static">${requestScope.pagingStatus}</p>
						</form>
				</tr>
				<table class="table table-condensed table-hover">
				<thead>
					<tr>
						<th>번호</th>
						<th>상품명</th>
						<th>제조 회사</th>
						<th>이미지</th>
						<th>재고</th>
						<th>단가</th>
						<th>카테고리</th>
						<th>상품 설명</th>
						<th>포인트</th>
						<th>입고 일자</th>
						<th>삭제</th>
						<th>수정</th>
					</tr>
				</thead>
				<c:forEach var="bean" items="${requestScope.lists}">
				<tr>
					<td>${bean.num}</td>
					<td>
							<a href="<%=MyCtrlCommand%>prDetailView&num=${bean.num}&${requestScope.parameter}">	
								${bean.name}
							</a>
						</td>
					<td>${bean.company}</td>
					<td>${bean.image}</td>
					<td>${bean.stock}</td>
					<td>${bean.price}</td>
					<td>${bean.category}</td>
					<td>${bean.contents}</td>
					<td>${bean.point}</td>
					<td>${bean.inputdate}</td>
					<td>삭제</td>
					<td>수정</td>
				</tr>
				</c:forEach>			
			</table>
		</div>
		<div align="center">
			<footer>${requestScope.pagingHtml}</footer>	
		</div>		
	</div>
</body>
</html>