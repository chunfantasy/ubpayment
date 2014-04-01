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

		<title>My JSP 'message.jsp' starting page</title>

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
		<noscript>
			您必须打开您浏览器的JavaScript支持才能使用
		</noscript>

		<input type="hidden" value="<s:property value="message"/>"
			id="message" />
		<input type="hidden" value="<s:property value="action"/>" id="action" />
		<script type="text/javascript">
	if (document.getElementById("message").value == "success") {
		alert(document.getElementById("message").value);
		window.location.href(document.getElementById("action").value);
	} else if (document.getElementById("message").value == "moneyless") {
		alert("余额不足");
		history.go(-1);
	} else if (document.getElementById("message").value == "error") {
		alert("error");
		history.go(-1);
	}
</script>
	</body>
	<s:debug></s:debug>
</html>
