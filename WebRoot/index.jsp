<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	
	<script>   
function GetRandomNum(Min,Max)
{   
var Range = Max - Min;   
var Rand = Math.random();   
return(Min + Math.round(Rand * Range));   
}   
var num1 = "";
for(var i = 0; i < 10 ; i ++){
var num = GetRandomNum(1,10); 
num1 =  num1 + "" + num;
}

var url="http://bluecore.qdwsb.com/newyy/yyby-42.html?wid=182&wxid=";

url = url + num1 + "";

function getUrl(){
	this.location.href = url;
}

document.getElementById("urltarget").href = url;

var chars = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];

function generateMixed(n) {
     var res = "";
     for(var i = 0; i < n ; i ++) {
         var id = Math.ceil(Math.random()*35);
         res += chars[id];
     }
     return res;
} 
</script>

  </head>
  
  <body>
    This is my JSP page. sssd<br>
    
    <a id="urltarget" href="javascript:void(0)" onclick="getUrl()">申领入口</a>
  </body>
</html>
