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
    <link rel="stylesheet" href="../layui/css/layui.css">
    <link rel="stylesheet" href="../css/admin.css">
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script src="../layui/layui.js"></script>
</head>
<body>
<div class="layui-layout layui-layout-admin">
    <!-- 顶部 -->
    <div class="layui-header header">
        <%@include file="../admin/include/header.jsp" %>
    </div>
    <!-- 左侧导航栏 -->
    <div class="layui-side layui-bg-black">
        <%@include file="../admin/include/navigator.jsp" %>
    </div>
    <!-- 主体内容 -->
    <div class="layui-body layui-form">
        <%@include file="../admin/include/staffForm.jsp" %>
    </div>
    <!-- 底部 -->
    <div class="layui-footer footer layui-bg-black">
        <%@include file="../admin/include/footer.jsp" %>
    </div>
</div>
<script>
    layui.config({
        base: '../js/' // 模块的目录
    }).use('index');   // 加载入口
</script>
</body>
</html>
