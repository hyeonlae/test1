<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<%
	int myoffset = 3 ; //좌측 옵셋
	int mywidth = twelve - 2 * myoffset ; //너비
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
			<div class="panel-heading" align="right">Panel Heading</div>
			<div class="panel-body">Panel Content</div>
		</div>
	</div>
</body>
</html>