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
    <link rel="stylesheet" href="css/detail.css">
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="layui/layui.js"></script>
</head>
<body  class="layui-bg-gray">
<!-- 顶部 -->
<div class="layui-header header">
    <%@include file="../include/header.jsp" %>
</div>
<!-- 主体 -->
<div class="layui-main detail-main">
    <%@include file="../include/foodDetail.jsp" %>
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