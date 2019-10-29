<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript" src="/resource/js/jquery-3.2.1.js">
<!--

//-->
</script>
<div class="container">

	<button type="button" class="form-control">专题名称: ${special.title}</button>
		<br/>
	<button type="button" class="form-control"> 专题摘要: ${special.digest}</button>
		<br/>
	<button type="button" class=" form-control"> 专题文章:</button>
	<br/>
	<table  class="table" border="1" align="right" >
		<tr>
			<td>文章id</td>
			<td>文章标题</td>
			<td>发布时间</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${special.artilceList}" var="article"   varStatus="index">
			<tr>
				<td>${index.index+1 }</td>
				<td>${article.title}</td>
				<td> <fmt:formatDate value="${article.created}" pattern="yyyy年MM月dd日  HH:mm:ss"/> </td>
				<td><a href="javascript:remove(${special.id},${article.id})">移除</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	
	<div class="input-group mb-3">
	 	<div class="input-group-prepend">
	    	<span class="input-group-text" id="basic-addon1">添加新的文章</span>
	  	</div>
	 	 <input type="text"  name="articleId" id="articleId" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
	</div>
		
	   <button type="button" class="btn btn-dark"  onclick="addArticle()">添加文章</button>
	
	<br/>
	
	<script type="text/javascript">
		
	   function addArticle(){
		   
		   $.post("/special/addArticle",{specId:${special.id},articleId:$("#articleId").val()},function(msg){
				if(msg.result==1){
					alert("处理成功")
					$("#content-wrapper").load("/special/detail?id="+${special.id});
				}else{
					alert(msg.errorMsg);
				}
			},"json")
	   }
	
		function remove(specialId,articleId){
			
			$.post("/special/removeArticle",{specId:specialId,articleId:articleId},function(msg){
				if(msg.result==1){
					alert("处理成功")
					$("#content-wrapper").load("/special/detail?id="+specialId);
				}else{
					alert(msg.errorMsg);
				}
			},"json")
			
		}
	</script>
			

</div>