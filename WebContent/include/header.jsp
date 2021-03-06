<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="layui-main diet-main">
    <div class='diet-logo'>
        <a href="fore_home"></a>
    </div>
    <%-- 搜索栏
    <%@include file="../include/search.jsp"%>
    --%>
    <ul class="layui-nav nav-user">
        <%-- 会员状态不为空 --%>
        <c:if test="${!empty member}">
            <li class="layui-nav-item">
                <a href="memberInfo.jsp">${member.name}</a>
            </li>
            <li class="layui-nav-item">
                <a href="fore_Logout">退出</a>
            </li>
        </c:if>
        <%-- 员工状态不为空 --%>
        <c:if test="${!empty staff}">
            <li class="layui-nav-item">
                <a href="staffInfo.jsp">${staff.name}</a>
            </li>
            <li class="layui-nav-item">
                <a href="fore_staffLogout">退出</a>
            </li>
        </c:if> 
        <%-- 会员和员工为空 --%>
        <c:if test="${(empty staff && empty member)}">
	        <li class="layui-nav-item">
	            <a href="login.jsp">登录</a>
	        </li>
	        <li class="layui-nav-item">
	            <a href="register.jsp">注册</a>
	        </li>
	        <li class="layui-nav-item">
                <a href="staffLogin.jsp">后台</a>
            </li>
        </c:if>
    </ul>
</div>