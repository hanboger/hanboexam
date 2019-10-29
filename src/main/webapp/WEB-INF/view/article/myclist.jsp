<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>
<div id="comList">


<c:forEach items="${comments.list }" var="comment">
				<div class="media-body">
					<h5 class="mt-0 mb-1"><small> ${comment.content}</small></h5>
					<h5 class="mt-0 mb-1"><small>文章标题： ${comment.userName }  &nbsp;  时间：<fmt:formatDate value="${comment.created }" pattern="yyyy-MM-dd"/> </small></h5>
				</div>
				</li>
				<hr>
	
		</c:forEach> 
	
	<div>${page }</div>
</div>
</body>

	
	<script type="text/javascript">	
		$(function(){
		      $('.page-link').click(function (e) {
		      	  //获取点击的的url
		          var url = $(this).attr('data');
		         //在中间区域显示地址的内容
		         $('#comList').load(url);
		      });
			
		})
</script>
		
</html>