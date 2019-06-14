<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
<link href="css/index_work.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
	function page(cpage) {
		$("[name='cpage']").val(cpage);
		$("#page").submit();
	}
	$(function() {
		
		$("#all").click(function() {
			$(":checkbox:gt(2)").prop("checked",true);
		});
		
		$("#no").click(function() {
			$(":checkbox:gt(2)").prop("checked",false);
		});
		
		$("#fx").click(function() {
			$(":checkbox:gt(2)").each(function() {
				this.checked=!this.checked;
			});
		});
		
	});

</script>
<body>
<form id="page" action="list.do" method="post">
	<input type="hidden" name="cpage" id="cpage">
	
	<input type="button" value="查询" onclick="location='cx.do'">
	<input type="button" value="添加">
</form>
<form id="delete" action="deleteAll.do" method="post">
	<table>
		<tr>
			<td>
				<input type="checkbox" id="all">全选
				<input type="checkbox" id="no">全否
				<input type="checkbox" id="fx">反选
			</td>
			<td>编号</td>
			<td>书名</td>
			<td>人名</td>
			<td>价格</td>
			<td>书店</td>
			<td>地址</td>
			<td>
				<input type="submit" value="批量删除" >
			</td>
		</tr>
		<c:forEach items="${bookList }" var="book">
			<tr>
				<td><input type="checkbox" name="ids" value="${book.bid }" id="ids"></td>
				<td>${book.bid }</td>
				<td>${book.bname }</td>
				<td>${book.person }</td>
				<td>${book.price }</td>
				<td>${book.sname }</td>
				<td>${book.addr }</td>
				<td>
					<input type="button" value="详情">
					<input type="button" value="编辑">
					<input type="button" value="下架" >
				</td>
			</tr>
		</c:forEach>
			<tr>
				<td colspan="19">
					<input type="button" value="首页" onclick="page('1')">
					<input type="button" value="上一页" onclick="page('${page.prePage==0?1:page.prePage}')">
					<input type="button" value="下一页" onclick="page('${page.nextPage==0?page.lastPage:page.nextPage}')">
					<input type="button" value="尾页" onclick="page('${page.lastPage}')">
				</td>
			</tr>
	</table>
</form>
</body>
</html>