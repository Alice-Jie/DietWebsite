<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<div class="login-form">
    <form class="layui-form" method="post" action="">
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>
            <div class="layui-input-block">
                <input type="text" name="member.account" required lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="text" name="member.pwd" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="button" class="layui-btn btn-sumbit layui-btn-big" onclick="">登录 </button>
                <button type="reset" class="layui-btn btn-reset layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>