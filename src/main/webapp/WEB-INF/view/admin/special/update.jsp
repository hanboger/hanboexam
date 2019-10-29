<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script type="text/javascript" src="/resource/js/jquery-3.2.1.js">
<!--

//-->
</script>
<div class="container">
<form action="" id="spform">

	    	<input type="hidden" value="${special.id}" name="id"  id="id">
	

	<div class="input-group mb-3">
	 	<div class="input-group-prepend">
	    	<span class="input-group-text" id="basic-addon1">标题</span>
	  	</div>
	 	 <input type="text"  name="title" id="title" value="${special.title} " class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
	</div>
	
	<div class="input-group mb-3">
	 	<div class="input-group-prepend">
	    	<span class="input-group-text" id="basic-addon1">摘要</span>
	  
	  	<textarea rows="10" cols="100" name="digest" id="digest">${special.digest}</textarea>
	  	</div>
	</div>
		<br/>
		<button type="button"  onclick="addata()" class="btn btn-primary btn-lg btn-block">提交</button>
		
		<script type="text/javascript">
			function addata(){
				$.post("/special/update",$("#spform").serialize(),function(msg){
					if(msg.result==1){
						alert("处理成功")
						$("#content-wrapper").load("/special/list")
					}else{
						alert(msg.errorMsg);
					}
				},"json")
			}
		</script>
</form>

</div>

