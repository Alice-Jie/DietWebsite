<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="layui-main diet-main">
    <div class='diet-logo'>
        <a href="fore_home"></a>
    </div>
    <ul class="layui-nav nav-user">
        <c:if test="${!empty staff}">
            <li class="layui-nav-item">
                <a href="">${staff.name}</a>
            </li>
            <li class="layui-nav-item">
                <a href="">退出</a>
            </li>   
        </c:if> 
        <c:if test="${!empty member}">
            <li class="layui-nav-item">
                <a href="memberInfo.jsp">${member.name}</a>
            </li>
            <li class="layui-nav-item">
                <a href="fore_Logout">退出</a>
            </li>   
        </c:if>
        <c:if test="${(empty staff && empty member)}">
	        <li class="layui-nav-item">
	            <a href="login.jsp">登录</a>
	        </li>
	        <li class="layui-nav-item">
	            <a href="register.jsp">注册</a>
	        </li>    
        </c:if>
    </ul>
</div>