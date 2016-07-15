<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./../common/top.jsp"%>
<html>
<head>   
</head>
<body>
	<div class="col-sm-offset-3 col-sm-6">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h2 class="panel-title" align="center">로그인 하기(아이디에 <font color='red'><b>툴팁</b></font> 적용)</h2>
			</div>
			<div class="panel-body" class="col-sm-6">
				<form action="loginProc.jsp" method="post" role="form" class="form-horizontal" >
					<div class="form-group">
						<label for="id" class="col-xs-3 col-lg-3 control-label">아이디</label>
	        			<div class="col-xs-9 col-lg-9">
	            			<input type="text" name="id" id="id" data-toggle="tooltip" data-placement="left"
	            				title="아이디는 3글자이상 10글자 이하로 입력해주세요.^^"  
	            				class="form-control" placeholder="아이디" value="hong"> 
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="password" class="col-xs-3 col-lg-3 control-label">비밀 번호</label>
	        			<div class="col-xs-9 col-lg-9">
	            			<input type="password" name="password" id="password" class="form-control" placeholder="비밀 번호" value="1234"> 
	        			</div>
	        		</div>
					<div class="form-group">
						<div class="col-xs-offset-3 col-xs-2 col-lg-2">
							<button type="submit" class="btn btn-default">
								로&nbsp;&nbsp;그&nbsp;&nbsp;인
							</button> 
	        			</div>
						<div class="col-xs-offset-1 col-xs-2 col-lg-2">
							<button type="reset" class="btn btn-default">
								취&nbsp;&nbsp;소
							</button> 
	        			</div>
	        		</div>	        		
				</form>
			</div>			
		</div>
	</div>
	
	<script>     
       $("[data-toggle='tooltip']").tooltip();      
    </script>	
</body>
</html>