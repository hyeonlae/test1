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
	<style type="text/css">
		.form-group{ margin-bottom : 3px; }
	</style>
</head>
<body>
	<div class="container col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>">
		<div class="panel panel-default panel-primary">
			<div class="panel-heading"><h4>상품 등록</h4></div>
			<div class="panel-body">
				<form class="form-horizontal" role="form" action="<%=MyCtrlByForm %>" method="post" enctype="multipart/form-data">
					<input type="hidden" name="command" value="prInsert">
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="name">상품명</label>
						<div class="col-sm-<%=formright%>">
							<input type="text" class="form-control" name="name" id="name" value ="쭈쭈바"							
								placeholder="상품 등록">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="company">제조 회사</label>
						<div class="col-sm-<%=formright%>">
							<input type="text" class="form-control" name="company" id="company"	 value="삼양 식품"							
								placeholder="제조 회사">
						</div>
					</div>					
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="image">이미지</label>
						<div class="col-sm-<%=formright%>">
							<input type="file" class="form-control" name="image"
								id="image" placeholder="이미지를 넣어 주셔용^^">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="stock">재고</label>
						<div class="col-sm-<%=formright%>">
							<input type="number" class="form-control" name="stock"
								id="stock" placeholder="재고 수량을 넣어 주셔용^^">
						</div>
					</div>	
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="price">단가</label>
						<div class="col-sm-<%=formright%>">
							<input type="number" class="form-control" name="price"
								id="price" placeholder="단가 수량을 넣어 주셔용^^">
						</div>
					</div>
					<div class="form-group">
						<label for="category" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">카테고리</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
							<select class="form-control" name="category" id="category">
								<option value="-" selected="selected">-- 선택하세요
									---------
								<option value="none" selected="selected">::NORMAL::</option>
								<option value="HIT">HIT</option>
								<option value="NEW">NEW</option>
								<option value="BEST">BEST</option>
							</select>
 	        			</div>
	        		</div>					
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="contents">상품 설명</label>
						<div class="col-sm-<%=formright%>">
							<textarea name="contents" id="contents" rows="5" cols="" 
								placeholder="상품 설명" class="form-control">   								
								
							</textarea>								
						</div>
					</div>					
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="point">포인트</label>
						<div class="col-sm-<%=formright%>">
							<input type="number" class="form-control" name="point"
								id="point" placeholder="포인트 수량을 넣어 주셔용^^">
						</div>
					</div>					
					<div class="form-group">
						<label class="control-label col-sm-<%=formleft%>" for="inputdate">입고 일자</label>
						<div class="col-sm-<%=formright%>">
							<input type="datetime" class="form-control" name="inputdate" id="inputdate"								
								placeholder="입고 일자">
						</div>
					</div>					
					<div class="form-group">
						<div align="center" class="col-sm-offset-3 col-sm-6">
							<button class="btn btn-default" type="submit">상품 등록</button>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<button class="btn btn-default" type="reset">취소</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<script>
		$(document).ready(function(){
    		$('[data-toggle="tooltip"]').tooltip();
		});
	</script>
	
</body>
</html>





