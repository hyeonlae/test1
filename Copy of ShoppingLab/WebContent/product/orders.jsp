<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int offset = 3 ; //오프 셋 
	int content = twelve - 2 * offset ; //12 - 2 * 오프셋	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
</head>
<body>	
	<div class="container col-md-offset-<%=offset%> col-md-<%=content%>">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">주문 내역</h3>
			</div>
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-condensed">
						<thead>
							<tr>
								<th>주문 번호</th>
								<th class="text-center">주문 일자</th>
								<th class="text-center">상세 보기</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>12</td>
								<td>2016-05-06</td>
								<td class="text-center"><a>상세 보기</a></td>
							</tr>
							<tr>
								<td>11</td>
								<td>2016-05-06</td>
								<td class="text-center"><a>상세 보기</a></td>
							</tr>
							<tr>
								<td>10</td>
								<td>2016-05-06</td>
								<td class="text-center"><a>상세 보기</a></td>
							</tr>
							<tr>
								<td>9</td>
								<td>2016-05-06</td>
								<td class="text-center"><a>상세 보기</a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>