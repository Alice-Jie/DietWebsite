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
    <link rel="stylesheet" href="css/login.css">
    <script src="layui/layui.js"></script>
    <script>
    // 主动加载jquery模块
    layui.use(['jquery'], function(){ 
      var $ = layui.$;  // 调用layui内部jquery
    });
    </script>
</head>
<body  class="layui-bg-gray">
<!-- 顶部 -->
<div class="layui-header header">
    <%@include file="../include/header.jsp" %>
</div>
<!-- 主体 -->
<div class="layui-main login-main">
        <!-- 登录界面 -->
    <div class="login-box">
        <div class="layui-tab">
            <ul class="layui-tab-title login-nav">
                <li class="layui-this">登录</li>
                <li>注册</li>
            </ul>
            <div class="layui-tab-content">
                <!-- 登录界面 -->
                <div class="layui-tab-item layui-show">
                    <%@include file="../include/loginPage.jsp" %>
                </div>
                <!-- 注册界面 -->
                <div class="layui-tab-item">
                    <%@include file="../include/registerPage.jsp" %>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 底部 -->
<div class="layui-footer footer">
    <%@include file="../include/footer.jsp" %>
</div>
<script>
    layui.config({
        base: 'js/' // 模块的目录
    }).use('index');   // 加载入口
</script>
</body>
</html>