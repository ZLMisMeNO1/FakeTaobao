<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Welcome</title>
	<base href="<%=basePath%>" />
	<script type="text/javascript" src="Plugins/jquery-1.10.1.js"></script>
	<script type="text/javascript">
		$.ajax({
			type:'post',
			url : 'server/test/getOrder',
			data : {
				'id' : 9
			},
			success :function(result){
				console.log(result)
				document.write(result)
			},
			error : function(){
				
			}
		})
	</script>
</head>
<body>
Hello World111

</body>
</html>