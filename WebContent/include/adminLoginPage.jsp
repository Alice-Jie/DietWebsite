<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="login-form">
    <form id="login" class="layui-form" method="post" action="fore_adminLogin">
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>
            <div class="layui-input-block">
                <input type="text" name="administrator.account" class="layui-input" required lay-verify="required" placeholder="请输入管理员账号" autocomplete="off">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="password" name="administrator.pwd" class="layui-input" required lay-verify="required" placeholder="请输入管理员密码" autocomplete="off">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn btn-sumbit layui-btn-big">登录 </button>
                <button type="reset" class="layui-btn btn-reset layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>