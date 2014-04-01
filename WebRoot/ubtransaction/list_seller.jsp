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
		您的订单
		<s:property value="account" />
		<br>
		<table border="1">
			<tr>
				<td>
					订单编号
				</td>
				<td>
					金额
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

			<s:iterator value="list" var="l">
				<tr>
					<td>
						<a href="ubtransaction/detail?id=<s:property value="#l.id" />"><s:property
								value="#l.number" /> </a>
					</td>
					<td>
						<s:property value="#l.amount" />
					</td>
					<td>
						<s:property value="#l.account_seller" />
					</td>
					<td>
						<s:if test="#l.mode =='directly'">直接支付</s:if>
						<s:elseif test="#l.mode =='credit'">信用支付</s:elseif>
					</td>
					<td>
						<s:if test="#l.state =='dsp'">订单已确定，等待买方支付</s:if>
						<s:elseif test="#l.state =='dpd'">买方已支付，等待卖方发货</s:elseif>
						<s:elseif test="#l.state =='ddr'">卖方已发货，等待买方收货并付款</s:elseif>
						<s:elseif test="#l.state =='drg'|#l.state =='cpg'">交易已完成，等待双方互相评价</s:elseif>
						<s:elseif test="#l.state =='csd'">订单已确定，等待卖家发货</s:elseif>
						<s:elseif test="#l.state =='cdr'">卖家已发货，等待买家收货</s:elseif>
						<s:elseif test="#l.state =='crp'">买家已收货，等待买家再信用期内付款</s:elseif>
					</td>
					<td>
						<s:property value="#l.time_start" />
					</td>
					<td>
						<s:property value="#l.time_end" />
					</td>
				</tr>

			</s:iterator>
		</table>
		<s:debug></s:debug>

	</body>
</html>
