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
		<script type="text/javascript" src="/ub/preference/js.js">
	
</script>
	</head>

	<body>
		<s:property value="account" />
		<s:form action="transfer" namespace="/ubaccount" method="post">
			<s:label>转出账户</s:label>
			<s:property value="account" />
			<br />
			<s:label>转入账户</s:label>
			<s:property value="account" />
			<br />
			<s:label>转账金额</s:label>
			<s:textfield theme="simple" name="amount" id="amount" onkeyup="show('amount');" />
			<s:label theme="simple" id="show" />
			<br />
			<s:submit value="确定"></s:submit>
		</s:form>
		<s:debug></s:debug>
	</body>
</html>
