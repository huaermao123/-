<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<div style="margin-left: 50px; padding-bottom: 5px;">
			<p>当前会员修改</p>
		</div>
		<form action="updateConsServlet" method="post">
		<table style="text-align: center;" border="1px" width="800px" height="30px">
			<input type="text" name="bid1" value="${bid1}"/>
			<tr>
				
				<td>会员名</td>
				
				<td><input name="hname" type="text"/></td>
				
			</tr>
			<tr>
				<td>会员密码</td>
				<td><input name="hpsw" type="text"/></td>
				
			</tr>
			
			<tr>
				
				<td>操作</td>
				<td><input type="submit" value="修改"/></td>
			</tr>
		</table>
		</form>
	</body>
</html>
