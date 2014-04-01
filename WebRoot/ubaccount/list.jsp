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

		<title>My JSP 'list.jsp' starting page</title>

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
		您的账户
		<br>
		<table border="1">
			<tr>
				<td>
					账号
				</td>
				<td>
					客户姓名
				</td>
				<td>
					余额
				</td>
				<td>
					买家信用
				</td>
				<td>
					卖家信用
				</td>
				<td>
					开户认证银行
				</td>
				<td>
					开户认证银行卡号
				</td>
			</tr>

			<%
				int i = 0;
			%>
			<s:iterator value="list" var="l">
				<tr>
					<td>
						<a href="ubtransaction/detail?i=<%=i++%>"><s:property
								value="#l.account" /> </a>
					</td>
					<td>
						<s:property value="#l.name" />
					</td>
					<td>
						<s:property value="#l.balance" />
					</td>
					<td>
						<s:property value="#l.credit_buyer" />
					</td>
					<td>
						<s:property value="#l.credit_seller" />
					</td>
					<td>
						<s:property value="#l.bank_certificate" />
					</td>
					<td>
						<s:property value="#l.account_certificate" />
					</td>
				</tr>

			</s:iterator>
		</table>
		<s:debug></s:debug>

	</body>
</html>
