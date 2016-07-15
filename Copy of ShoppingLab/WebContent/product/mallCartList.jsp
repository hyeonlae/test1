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
		function cartEdit(num){	/* 해당 상품에 대한 주문 수량 수정 */		
			var stock = document.getElementById("stock").value ;
			location.href="mallCartEdit.jsp?num=" + num + "&stock=" + stock  ;
		}
	</script>
</head>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-primary">
			<div class="panel-heading"><h4>장바구니 보기</h4></div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th class="text-center">번호</th>
						<th class="text-center">상품명</th>
						<th class="text-center">수량</th>
						<th class="text-center">단가</th>
						<th class="text-center">금액</th>
						<th class="text-center">삭제</th>
					</tr>
				</thead>
				<%
					for( int i=0 ; i < 2 ; i ++){
				%>
				<tr>
					<td align="center" valign="middle"><%=i + 1%></td>
					<td align="center" valign="middle">
						<img align="middle" src="<%=contextPath%>/images/Koala.jpg"
								class="img-rounded" width="36" height="36">
						<br>
						소보루
					</td>
					<td align="center">
						<input type="text" id="stock" size="2" name="stock" value="10"> 개<br>
 						<input class="btn btn-sm btn-success" type="button" value="수정" onclick="cartEdit('5')">
						
					</td>
					<td align="center">1,000원<br>10point</td>
					<td align="center">10,000원<br>10point</td>								
					<td align="center"><a href="">삭제</a></td>
				</tr>									
				<%
					}
				%>
			</table>
		</div>		
	</div>
</body>
</html>