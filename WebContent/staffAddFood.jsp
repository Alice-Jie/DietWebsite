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
    <link rel="stylesheet" href="css/info.css">
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="layui/layui.js"></script>
</head>
<body  class="layui-bg-gray">
<!-- 顶部 -->
<div class="layui-header header">
    <%@include file="../include/header.jsp" %>
</div>
<!-- 主体 -->
<div class="layui-main member-main">
    <!-- 左侧导航栏 -->
    <%@include file="../include/staffLeftNav.jsp" %>
	<!-- 右侧显示内容 -->
	<div class="member-panel">
	    <div class="layui-tab layui-tab-brief">
	        <ul class="layui-tab-title">
	            <li class="layui-this">添加菜品</li>
	        </ul>
	        <div class="layui-tab-content">
	            <!-- 添加菜品 -->
	            <div class="layui-tab-item layui-show">
	                <%@include file="../include/addFood.jsp" %>
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