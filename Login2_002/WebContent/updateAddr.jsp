<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<div style="margin-left: 50px; padding-bottom: 5px;">
			<p>当前地址修改</p>
		</div>
		<form action="updateAddr" method="post">
		<table style="text-align: center;" border="1px" width="800px" height="30px">
			<input type="hidden" name="adid" value="${adid}"/>
			<tr>
				
				<td>省份</td>
				
				<td><input name="address1" type="text"/></td>
				
			</tr>
			<tr>
				<td>城市</td>
				<td><input name="address2" type="text"/></td>
				
			</tr>
			<tr>
				
				<td>区/县</td>
				<td><input name="address3" type="text"/></td>
			</tr>
			<tr>
				  
				<td>操作</td>
				<td><input type="submit" value="修改"/></td>
			</tr>
		</table>
		</form>
	</body>
</html>
