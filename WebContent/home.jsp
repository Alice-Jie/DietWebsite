<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%
    String path = request.getRequestURI();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
    %>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="layui/css/layui.css">
    <link rel="stylesheet" href="css/base.css">
    <script src="layui/layui.js"></script>
    <script>
    // 主动加载jquery模块
    layui.use(['jquery'], function(){ 
      var $ = layui.$;  // 调用layui内部jquery
    });
    </script>
</head>
<body>
<!-- 顶部 -->
<div class="layui-header">
    <%@include file="../include/header.jsp" %>
</div>
<script>
    layui.config({
        base: 'js/' // 模块的目录
    }).use('index');   // 加载入口
</script>
</body>
</html>