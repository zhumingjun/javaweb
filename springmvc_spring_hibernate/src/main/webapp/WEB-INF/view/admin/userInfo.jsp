<html>
<head>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <title>Bootstrap 实例 - 基本的表格</title>
   <link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet">
   <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
   <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table">
	<caption>用户信息表</caption>
	<thead>
		<tr>
			<th>姓名</th>
			<th>年龄</th>
			<th>phone</th>
			<th>email</th>
			<th>address</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.username}</td>
			<td>${user.age}</td>
			<td>${user.phone}</td>
			<td>${user.email}</td>
			<td>${user.address}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>