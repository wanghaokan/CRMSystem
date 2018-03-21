<%@ page language="java" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html>  
<html>  
<head>  
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>CRM客户关系管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/base.css" />
    <link rel="stylesheet" type="text/css" href="css/admin-all.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript" src="js/jquery.spritely-0.6.js"></script>
    <script type="text/javascript" src="js/chur.min.js"></script>
    <link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>
	<div id="clouds" class="stage"></div>
    	<div class="loginmain">
	</div>
    <div class="row-fluid">
        <h1>CRM客户关系管理系统</h1>
        <form action="index.jsp" method="post">
	        <p>
	            <label>帐&nbsp;&nbsp;&nbsp;号：<input type="text" id="name" placeholder="请输入用户名" name="usname"></label>
	        	<span class="text-danger">${error }</span>
	        </p>
	        <p>
		        <label>密&nbsp;&nbsp;&nbsp;码：<input type="password" id="password" placeholder="请输入密码" name="uspwd"></label>
		        <span class="text-danger">${error1 }</span>
		    </p>
		    <p class="tip">&nbsp;</p>
		    <hr />	
		    <button type="submit" class="btn btn-primary btn-large login">登录</button>
		    &nbsp;&nbsp;&nbsp;<button type="button" class="btn btn-large">取消</button>
	    </form>
	</div>
</body>
</html>