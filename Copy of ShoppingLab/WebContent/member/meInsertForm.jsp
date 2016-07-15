<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="./../common/top.jsp"%>
<%
	int myoffset = 2 ;
	int mywidth = twelve - 2 * myoffset;
	int formleft = 3 ;
	int formright = twelve - formleft ; 
%>
<html>
<head>
	<script type="text/javascript" src="jquery.js"></script>
	<script type="text/javascript" src="jquery.validate.js"></script>
	<style type="text/css">
		.form-group{ margin-bottom : 3px; }
		.err{
			font-size : 10pt;
			color:red;
			font-weight: bolder;
		}
	</style>
	<script type="text/javascript">
		function function1(  ){
			var id = document.myform.id.value ;
			if( id.length == 0 ){
				alert('아이디를 입력해 주세요') ;
				document.myform.id.focus() ; 
				return false ;
			}
			var url='<%=MyCtrlCommand%>meIdcheck&id=' + id ; 
			window.open(url, 'mywin', 'height=150,width=300') ;
		}
		function function2(  ){
			var url='<%=MyCtrlCommand%>meZipcheck' ; 		
			window.open(url, 'mywin', 'height=600,width=720,status=yes,scrollbars=yes,resizable=no') ;			
		}	
		function function3(){
			document.myform.isCheck.value =  false ; 
		}
		function checkForm(  ){
			var isCheck = document.myform.isCheck.value ;
			//alert( isCheck ) ;
			if( isCheck == 'false' ){
				alert('아이디 중복 체크를 우선 해주세용.') ;
				return false ;
			}			
		}
	</script>
</head>
<body>
	<div id="main_container" align="center" 
		class="container col-xs-offset-<%=myoffset%> col-lg-offset-<%=myoffset%> col-xs-<%=mywidth%> col-lg-<%=mywidth%>"> 
		<h2>회원 가입 하기</h2>
		<div class="panel panel-primary sub_container">
			<div class="panel-heading" align="left">
				<font color="red"><b>회원 가입</b></font> 페이지입니다.
			</div>
			<div class="panel-body sub_container">
				<form id="myform" name="myform" class="form-horizontal" role="form" action="<%=MyCtrlByForm%>" method="post">
					<input type="hidden" name="command" value="meInsert">
					<input type="text" name="isCheck" value="false">
					<input type="hidden" name="mpoint" value="5">
					<div class="form-group">
						<label for="id" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">아이디</label>
	        			<div class="col-xs-<%=formright-2%> col-lg-<%=formright-2%>">
	            			<input type="text" name="id" id="id" class="form-control" placeholder="아이디" value="${requestScope.bean.id}" onkeyup="function3();">
	            			<span class="err">${errid}</span>  
	        			</div>
	        			<div class="col-xs-<%=2%> col-lg-<%=2%>" align="left">
	            			<input type="button" class="btn btn-info" value="중복 검사" onclick="function1( );"> 
	        			</div>
	        		</div>        		
					<div class="form-group">
						<label for="name" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">이름</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="text" name="name" id="name" class="form-control" placeholder="이름" value="김유신"> 
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="password" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">비밀 번호</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="password" name="password" id="password" class="form-control" placeholder="비밀 번호를 넣어 주셔요" value="1234"> 
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="salary" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">급여</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="text" name="salary" id="salary" class="form-control" placeholder="급여" value="12345">
	            			<span class="err">${errsalary}</span> 
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="hiredate" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">입사 일자</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="date" name="hiredate" id="hiredate" class="form-control" placeholder="입사 일자" value="2016-05-05"> 
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="gender" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">성별</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>" align="left">
	            			<label class="radio-inline"> <input type="radio"
								name="gender" id="gender1" value="남자">남자
							</label> &nbsp;&nbsp;<label class="radio-inline"> <input type="radio"
								name="gender" id="gender2" value="여자">여자
							</label>
							<span class="err">${errgender}</span>
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="hobby" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">취미</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>" align="left">
							<label class="checkbox-inline"> <input type="checkbox"
								name="hobby" id="hobby1" value="독서">독서
							</label> <label class="checkbox-inline"> <input type="checkbox"
								name="hobby" id="hobby2" value="운동">운동
							</label> <label class="checkbox-inline"> <input type="checkbox"
								name="hobby" id="hobby3" value="음악감상">음악감상
							</label> <label class="checkbox-inline"> <input type="checkbox"
								name="hobby" id="hobby4" value="퀼트">퀼트
							</label>
							<span class="err">${errhobby}</span>
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="job" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">직업</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
							<select class="form-control" name="job" id="job">
								<option value="-" selected="selected">-- 선택하세요
									---------
								<option value="교수">교수
								<option value="학생">학생
								<option value="기타">기타
							</select>
							<span class="err">${errjob}</span>
 	        			</div>
	        		</div>
					<div class="form-group">
						<label for="zipcode" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">우편 번호</label>
	        			<div class="col-xs-<%=formright-2%> col-lg-<%=formright-2%>">
	            			<input type="text" name="fakezipcode" id="fakezipcode" class="form-control" disabled="disabled" placeholder="우편 번호" value="" >
	            			<input type="text" name="zipcode" id="zipcode" value="" >
	            			<span class="err">${errzipcode}</span> 
	        			</div>
						<div class="col-xs-<%=2%> col-lg-<%=2%>" align="left">
	            			<input type="button" class="btn btn-info" value="우편 번호 찾기" onclick="function2( );"> 
	        			</div>	        			
	        		</div> 
					<div class="form-group">
						<label for="address1" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">주소</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="text" name="fakeaddress1" id="fakeaddress1" class="form-control" disabled="disabled" placeholder="주소" value="" >
	            			<input type="text" name="address1" id="address1"  value="">	            			
	        			</div>
	        		</div>
					<div class="form-group">
						<label for="address2" class="col-xs-<%=formleft%> col-lg-<%=formleft%> control-label">세부 주소</label>
	        			<div class="col-xs-<%=formright%> col-lg-<%=formright%>">
	            			<input type="text" name="address2" id="address2" class="form-control" placeholder="세부 주소" value="">
	            			<span class="err">${erraddress2}</span> 
	        			</div>
	        		</div>
					<div class="form-group">
						<div class="col-xs-<%=twelve%> col-lg-<%=twelve%>" align="center">
							<button type="submit" class="btn btn-default" onclick="return checkForm() ;"><b>회원 가입</b></button>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<button type="reset" class="btn btn-default">초기화</button>
						</div>
					</div>
				</form>
			</div>
		</div>		
	</div>
	<script type="text/javascript">
		$(document).ready(function() {		
			//alert('dd') ;
			$('#myform').validate({
				rules : {
					id : {
						required : true
						,rangelength : [ 4, 8 ]
					}				
				}, //end rules
				messages : {
					id : {
						required : '아이디는 필수 입력 사항입니다.'
						,rangelength : '아이디는 4자리 이상 8자리 이하입니다.'
					}			
				}
			});
		});
		
	</script>	
</body>
</html>