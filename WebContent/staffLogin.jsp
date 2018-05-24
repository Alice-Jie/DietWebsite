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
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="layui/layui.js"></script>
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
                <li class="layui-this">员工登录</li>
                <li>管理员登录</li>
            </ul>
            <div class="layui-tab-content">
                <!-- 员工登录界面 -->
                <div class="layui-tab-item layui-show">
                    <%@include file="../include/staffLoginPage.jsp" %>
                </div>
                <!-- 管理员登录界面 -->
                <div class="layui-tab-item">
                    <%@include file="../include/adminLoginPage.jsp" %>
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
        base: 'js/'   // 模块的目录
    }).use('index');  // 加载入口
</script>
<script>
$(function(){
	<c:if test="${!empty msg}">
    layui.use('layer', function(){
        var layer = layui.layer;
        layer.msg('${msg}');
    });
	</c:if>
})
</script>
</body>
</html>