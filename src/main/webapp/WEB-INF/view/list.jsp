<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resource/css/css.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table border="1px">
		<tr>
			<td colspan="100">
				<form action="/tolist" method="post">
					<input type="hidden" name="pageNum">
					<table>
						<tr>
							<td id="name"></td>
							<td id="uptime"></td>
						</tr>
						<tr>
							<td id="dyname"></td>
							<td id="price"></td>
						</tr>
						<tr>
							<td id="ntime"></span></td>
							<td id="lotime"></td>
						</tr>
						<tr>
							<td id="cx"></td>
							<td id="cz"></td>
						</tr>
					</table>
				</form>
				<input type="button" value="查询影片" onclick="sel()">
				<input type="button" value="添加影片">
				<input type="button" value="删除影片" onclick="del()">
			</td>
		</tr>
		<tr>
			<td><input type="checkbox" onclick="fx()"></td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${movieList }" var="m">
			<tr>
				<td><input type="checkbox" class="ck" vlaue="${m.id }" onclick="ddd(${m.id})"></td>
				<td>${m.name }</td>
				<td>${m.dyname }</td>
				<td>${m.price }</td>
				<td>${m.uptime }</td>
				<td>${m.lotime }</td>
				<td>${m.type }</td>
				<td>${m.ntime }</td>
				<td>${m.area }</td>
				<td>
					<c:if test="${m.ztai==0}">
						正在热映
					</c:if>
					<c:if test="${m.ztai==1}">
						即将上线
					</c:if>
					<c:if test="${m.ztai==2}">
						已经下架
					</c:if>
				</td>
				<td>
					<input type="button" id="bt1" onclick="bt(${m.id})" value="下架">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="100" align="center"> 
				当前页${info.pageNum }/${info.pages},共${info.total }条数据
				<input type="button" value="首页" onclick="page(1)">
				<input type="button" value="上一页" onclick="page(${info.prePage})">
				<input type="button" value="下一页" onclick="page(${info.nextPage})">
				<input type="button" value="尾页" onclick="page(${info.pages})">
			
			</td>
		</tr>
	</table>
</body>

<script type="text/javascript">
	function page(pageNum) {
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
	
	function fx() {
		$(":checkbox").each(function() {
			if($('this:checked')==true){
				$('this').attr("checked",false);
			}else{
				$('this').attr("checked",true);
			}
		})
	}
	
	function sel() {
			$("#name").append("影片名称<input type='text' name='name' value='${name}'>");
			$("#uptime").append("上映时间<input type='date' name='uptime1'>至<input type='date' name='uptime2'>");
			$("#dyname").append("导演<input type='text' name='dyname' value='${dyname}'>");
			$("#price").append("价格<input type='text' name='price1' value='${price1}'>-<input type='text' name='price2' value='${price1}'>")
			$("#ntime").append("电影年代<input type='text' name='ntime' value='${ntime}'>");
			$("#lotime").append("电影时长<input type='text' name='lotime1'>-<input type='text' name='lotime2'>");
			$("#cx").append('<input type="submit" value="查询影片">');
			$("#cz").append('<input type="reset" value="重置影片">');

	}
	
	
	function bt(id) {
		var value = document.getElementById("bt1").value;
		if(value=="下架"){
			$.ajax({
				url:"ztai",
				data:{zt:2,id:id},
				type:"post",
				success:function(obj){
					if(obj){
						alert("下架成功");
						$("#bt1").val("上架");
						location.reload();
					}else{
						alert("下架失败");
					}
				}
			});
		}else if(value=="上架"){
			$.ajax({
				url:"ztai",
				data:{zt:0,id:id},
				type:"post",
				success:function(obj){
					if(obj){
						alert("上架成功");
						$("#bt1").val("下架");
						location.reload();
					}else{
						alert("上架失败");
					}
				}
			});
		}
	}
	
	var ids="";
	function ddd(id) {
		ids+=","+id;
	}
	function del(){
		ids=ids.substring(1);
		alert(ids);
		$.ajax({
			url:"del",
			data:{ids:ids},
			type:"post",
			dataType:"json",
			success:function(obj){
				if(obj){
					alert("删除成功");
					location.reload();
				}else{
					alert("删除失败")
				}
			}
		});
	}
</script>
</html>