<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	//String contextPath = request.getContextPath() + "/WEB-INF";
	String contextPath = request.getContextPath() + "";
	//String contextPath = "http://localhost:8787/exam";
	
	//out.print("컨텍스트 경로 : " + contextPath + "<br>");
	String pattern = "###,###" ;
	DecimalFormat df = new DecimalFormat( pattern ) ;
	int twelve = 12 ; //그리드 시스템의 숫자 값
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
</body>
</html>