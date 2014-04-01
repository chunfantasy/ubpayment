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

		<title>My JSP 'detail.jsp' starting page</title>

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
		<s:form action="detail_d" namespace="/ubtransaction" method="post">
			<table border="1">
				<tr>
					<td>
						订单编号
					</td>
					<td>
						金额
					</td>
					<td>
						买家账号
					</td>
					<td>
						卖家账号
					</td>
					<td>
						支付模式
					</td>
					<td>
						交易状态
					</td>
					<td>
						交易开始时间
					</td>
					<td>
						交易结束时间
					</td>
				</tr>
				<tr>
					<td>
						<s:property value="td.number" />
					</td>
					<td>
						<s:property value="td.amount" />
					</td>
					<td>
						<s:property value="td.account_buyer" />
					</td>
					<td>
						<s:property value="td.account_seller" />
					</td>
					<td>
						<s:property value="td.mode" />
					</td>
					<td>
						<s:property value="td.state" />
					</td>
					<td>
						<s:property value="td.time_start" />
					</td>
					<td>
						<s:property value="td.time_end" />
					</td>
				</tr>
			</table>
			卖家已发货，请确认收货并付款<s:submit value="确定" align="left"></s:submit>
		</s:form>
		<s:debug></s:debug>
	</body>
</html>
