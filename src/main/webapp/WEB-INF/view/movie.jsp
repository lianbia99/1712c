<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<form action="/tolist" method="post">
	<table>
		<tr>
			<td>影片名称:<span id="name"></span></td>
			<td>上映时间:<span id="uptime"></span></td>
		</tr>
		<tr>
			<td>导演:<span id="dyname"></span></td>
			<td>价格:<span id="price"></span></td>
		</tr>
		<tr>
			<td>电影年代:<span id="ntime"></span></td>
			<td>电影时长:<span id="lotime"></span></td>
		</tr>
		<tr>
			<td><input type="submit" value="查询影片"></td>
			<td><input type="reset" value="重置查询"></td>
		</tr>
	</table>
</form>
</body>
<script type="text/javascript">
	$(function() {
		$("#name").append("<input type='text' name='name'>");
		$("#uptime").append("<input type='date' name='uptime1'>至<input type='date' name='uptime2'>");
		$("#dyname").append("<input type='text' name='dyname'>");
		$("#price").append("<input type='text' name='price1'>-<input type='text' name='price2'>")
		$("#ntime").append("<input type='text' name='ntime'>");
		$("#lotime").append("<input type='text' name='lotime1'>-<input type='text' name='lotime2'>");
	});
</script>
</html>