<%@ page contentType="text/html; charset=utf-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="${pageContext.request.contextPath }/css/general.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath }/css/main.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" href="${pageContext.request.contextPath}/images/tit.ico" type="image/x-icon" />
  <script type="text/javascript">
  //js对表单的非空校验
  function validate(){
	  var username = document.getElementById("username").value;
	  if(username == null || username == ""){
		  alert("用户名不能为空");
		  return false;
	  }
	  var password = document.getElementById("password").value;
	  if(password == null || password == ""){
		  alert("密码不能为空");
		  return false;
	  }
  }

</script>
  <body>
  <form method="post" action="${pageContext.request.contextPath}/admin_login.action" target="_parent" name='theForm' onsubmit="return validate();">
  管理员姓名：<input type="text" id="ausername" name="ausername" />
  管理员密码：<input type="password" id="apassword" name="apassword" />
  <input type="submit" value="进入后台管理中心" class="button"/>
  <input type="hidden" name="act" value="signin" />
  </form>
  </body>
</html>
