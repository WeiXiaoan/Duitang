<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">

	function check() {
		if (null == document.getElementById("numId")
				|| "" == document.getElementById("numId")) {
			alert("输入不能为空!");
			return false;
		}else {
			return true;
		}
	}
</script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>堆糖HR笔试题</title>
</head>
<body>
	<div style="margin:0px auto;padding:10px" >
		<form action="NumHandle" method="post" onsubmit="return check()">
			请输入N个整数，注意每个整数之间使用英文的逗号进行分隔<br /> 
			<input type="text" name="num" id="numId"/><br />
			<input type="submit" value="确定" />
		</form>
	</div>
</body>
</html>