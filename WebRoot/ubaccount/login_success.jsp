<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'login_success.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		success!
		<s:property value="account" />

		<br>
		<a href="ubaccount/list">我的账户</a>
		<br>
		<a href="ubaccount/transfer">联银转账</a>
		<br>
		<a href="ubaccount/transfer_in.jsp">跨行转入</a>
		<br>
		<a href="ubaccount/transfer_out.jsp">跨行转出</a>
		<br>
		<a href="ubtransaction/list!list_buyer">我是买家</a>
		<br>
		<a href="ubtransaction/list!list_seller">我是卖家</a>
		<s:debug></s:debug>
</html>
