<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 2;
	int mywidth = twelve - 2 * myoffset;
%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.form-group1{ 
			margin-bottom: 3px;
			height: 25px;
			padding-top: 3px;
			padding-bottom: 3px;
			padding-left: 6px ;
			padding-right: 6px ; 
		}
		.form-control{
			height: 25px;
		}
		 .btn-primary .badge{
			color:red ; /* #337ab7; */
			background-color: red  ; /* #fff */
		}		
	</style>
</head>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-primary">
			<div class="panel-heading">
				<h4>회원 쇼핑 내역</h4>
			</div>
			<div class="panel-body">
				<table class="table table-condensed table-hover table-bordered">
					<thead>
						<tr>
							<td colspan="6">
								<form class="form-inline" role="form">
									<div class="form-group">
										<label for="email">회원 ID : &nbsp;&nbsp;</label> 
										<input type="email" height="12" size="8"
											class="form-control" id="email" placeholder="">
										&nbsp;
										<input type="password" class="form-control" id="pwd" size="10"
											placeholder=""> 
										<label for="email">&nbsp;&nbsp; ~ &nbsp;&nbsp;</label>
										<input type="password" class="form-control" size="10" id="pwd" placeholder="">
									</div>
									<button type="submit" class="form-control btn btn-primary">내역 조회</button>
								</form>
							</td>
						</tr>
						<tr>
							<th colspan="6" align="left">고객 아이디 : hong</th>
						</tr>
						<tr>
							<th>주문 번호</th>
							<th>판매 일자</th>
							<th>상품명</th>
							<th>단가</th>
							<th>수량</th>
							<th>금액</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>2016-07-06</td>
							<td>사이다</td>
							<td><fmt:formatNumber value="4000" pattern="###,###" /></td>
							<td>10</td>
							<td><fmt:formatNumber value="40000" pattern="###,###.00" />
							</td>
						</tr>
						<tr>
							<td>2</td>
							<td>2016-07-06</td>
							<td>콜라</td>
							<td><fmt:formatNumber value="3000" pattern="###,###" /></td>
							<td>20</td>
							<td><fmt:formatNumber value="60000" pattern="###,###.00" />
							</td>
						</tr>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>