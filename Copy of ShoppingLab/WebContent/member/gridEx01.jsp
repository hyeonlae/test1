<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 3 ;
	int mywidth = twelve - 2 * myoffset ; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
</head>
<body>
	<div class="container-fluid">
		<h1>3등분</h1>
		<p>Resize the browser window to see the effect.</p>
		<div class="row">
			<div class="col-sm-4" style="background-color: lavender;">첫번째</div>
			<div class="col-sm-4" style="background-color: lavenderblush;">두번째</div>
			<div class="col-sm-4" style="background-color: lavender;">세번째</div>
		</div>
	</div>
	<hr>
	<div class="container-fluid">
		<h1>1:2의 배율</h1>
		<p>Resize the browser window to see the effect.</p>
		<div class="row">
			<div class="col-sm-4" style="background-color: lavender;">첫번째</div>
			<div class="col-sm-8" style="background-color: lavenderblush;">두번째</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>1:3의 배율</h1>
		<p>Resize the browser window to see the effect.</p>
		<div class="row">
			<div class="col-sm-3" style="background-color: lavender;">첫번째</div>
			<div class="col-sm-9" style="background-color: lavenderblush;">두번째</div>
		</div>
	</div>
	<hr>
	<div class="container">
		<h1>옵셋을 이용한 정중앙</h1>
		<div class="row">
			<div class="col-sm-offset-<%=myoffset%> col-sm-<%=mywidth%>" style="background-color: lavender;">첫번째</div>			
		</div>
	</div>	
</body>
</html>






