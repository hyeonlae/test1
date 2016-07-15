<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./../common/top.jsp"%>
<%
	int offset = 3 ; //오프 셋 
	int content = twelve - 2 * offset ; //12 - 2 * 오프셋	
%>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">	
	<title>BootStrap</title>
	<style type="text/css">
		/*.panel-body{ margin-bottom: -30px;}*/
		.bigfont{ font-size: 17px;}
		.panel-title{ font-size: 19px; font-weight: bolder;}
	</style>
</head>
<body>
	<div class="container col-md-offset-<%=offset%> col-md-<%=content%>" align="right">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h1 class="panel-title" align="left">결재 내역서 보기</h1>
			</div>
			<div class="panel-body" align="left">
				<div class="col-md-12">
					<table class="table table-condendes table-striped" >
						<tr>
							<td class="bigfont"  width="40%" align="center">상품명</td>
							<td class="bigfont"  width="30%" align="center">수량</td>
							<td class="bigfont"  width="30%" align="center">금액</td>
						</tr>
						<tr>
							<td align="center">사과</td>
							<td align="center">10</td>
							<td align="center">10,000원</td>
						</tr>		
						<tr>
							<td align="center">배</td>
							<td align="center">20</td>
							<td align="center">20,000원</td>
						</tr>	
						<tr>
							<td align="center" colspan="3">
								<h3>총 결재 금액 : 30,000원</h3>
							</td>
						</tr>	

					</table>				
				</div>
				<hr>
				<div class="col-md-offset-5 col-md-4">
					<button class="btn btn-primary">결재 하기</button>
				</div>
			</div><!-- end panel-body -->
		</div>		
	</div>		
</body>
</html>