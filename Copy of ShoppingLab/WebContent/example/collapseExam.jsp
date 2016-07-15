<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="./../common/top.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BootStrap Sample</title>
</head>
<body>
	<div class="container">
		<h2>Simple Collapsible</h2>
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#demo">첫 번째 버튼</button>
		<div id="demo" class="collapse">Lorem ipsum dolor sit amet,
			consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
			labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
			exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
		</div>
		<br> <br>
		<button type="button" class="btn btn-danger" data-toggle="collapse"
			data-target="#demo2">두 번째 버튼</button>
		<div id="demo2" class="collapse">Lorem ipsum dolor sit amet,
			consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
			labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
			exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
		</div>
		<hr>
	</div>
	<div class="col-md-offset-1 col-md-10">
		<h2>Collapsible Panel</h2>
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" href="#collapse1">Collapsible panel</a>
					</h4>
				</div>
				<div id="collapse1" class="panel-collapse collapse">
					<div class="panel-body">Panel Body</div>
					<div class="panel-footer">Panel Footer</div>
				</div>
			</div>
		</div>
	</div>
	<hr>
	<div class="col-md-offset-1 col-md-10">
		<h2>Collapsible List Group</h2>
		<div class="panel-group">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" href="#collapse2">Collapsible list
							group</a>
					</h4>
				</div>
				<div id="collapse2" class="panel-collapse collapse">
					<ul class="list-group">
						<li class="list-group-item"><a href="Koala.jsp"> 코알라 홈 </a></li>
						<li class="list-group-item">Two</li>
						<li class="list-group-item">Three</li>
					</ul>
					<div class="panel-footer">Footer</div>
				</div>
			</div>
		</div>
	</div>
	<hr>
	<div class="col-md-offset-1 col-md-10">
		<h2>Accordion Example</h2>
		<p>
			<strong>Note:</strong> The <strong>data-parent</strong> attribute
			makes sure that all collapsible elements under the specified parent
			will be closed when one of the collapsible item is shown.
		</p>
		<div class="panel-group" id="accordion">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#accordion1">Collapsible Group 1</a>
					</h4>
				</div>
				<div id="accordion1" class="panel-collapse collapse in">
					<div class="panel-body">Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
						labore et dolore magna aliqua. Ut enim ad minim veniam, quis
						nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
						consequat.</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#accordion2">Collapsible Group 2</a>
					</h4>
				</div>
				<div id="accordion2" class="panel-collapse collapse">
					<div class="panel-body">Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
						labore et dolore magna aliqua. Ut enim ad minim veniam, quis
						nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
						consequat.</div>
				</div>
			</div>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="panel-title">
						<a data-toggle="collapse" data-parent="#accordion"
							href="#accordion3">Collapsible Group 3</a>
					</h4>
				</div>
				<div id="accordion3" class="panel-collapse collapse">
					<div class="panel-body">Lorem ipsum dolor sit amet,
						consectetur adipisicing elit, sed do eiusmod tempor incididunt ut
						labore et dolore magna aliqua. Ut enim ad minim veniam, quis
						nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
						consequat.</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>















