<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>我的个人空间</title>

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css"
	href="/resource/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/resource/css/cms.css?v=1.1" />
<style type="text/css">
</style>



<script type="text/javascript">

function myopen(id){
	
	
	// alert(id)
	window.open("/vote/getVote?arId="+id,"_blank");
	
}

</script>


</head>
<body>

	<c:forEach items="${list}" var="article">
		<dl>
			<dt><a href="javascript:myopen(${article.id })">${article.title }</a></dt>
		</dl>
		<hr>
	</c:forEach>
	<dl>
		<input type="button" value="添加" onclick="toadd()"/>
	</dl>
	


</body>
<script type="text/javascript">
	function toadd() {
		location.href="push";
	}
</script>
</html>