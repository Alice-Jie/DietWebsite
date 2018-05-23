<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="login-form">
    <form  id="register" class="layui-form" method="post" action="fore_register">
        <!-- 会员账号 -->
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>
            <div class="layui-input-block">
                <input type="text" id="registerAccount" name="member.account" required lay-verify="required" placeholder="请输入账号名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <!-- 会员密码 -->
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="password" id="registerPassword" name="member.pwd" required lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <!-- 密码验证 -->
        <div class="layui-form-item">
            <label class="layui-form-label">密码确认：</label>
            <div class="layui-input-block">
                <input type="password" id="registerRePassword" name="repwd" required lay-verify="required" placeholder="请再一次输入密码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <!-- 会员姓名 -->
        <div class="layui-form-item">
            <label class="layui-form-label">姓名：</label>
            <div class="layui-input-block">
                <input type="text" name="member.name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
            </div>
        </div>
        <!-- 会员性别 -->
        <div class="layui-form-item">
            <label class="layui-form-label">性别：</label>
            <div class="layui-input-block">
              <input type="radio" name="member.sex" value="男" title="男" checked>
              <input type="radio" name="member.sex" value="女" title="女">
            </div>
        </div>
        <!-- 会员邮箱 -->
        <div class="layui-form-item">
            <label class="layui-form-label">电子邮箱：</label>
            <div class="layui-input-block">
                <input type="text" name="member.Email" required  lay-verify="required|email" placeholder="请输入邮箱地址" autocomplete="off" class="layui-input">
            </div>
        </div>
        <!-- 会员手机 -->
        <div class="layui-form-item">
            <label class="layui-form-label">手机号码：</label>
            <div class="layui-input-block">
                <input type="text" name="member.phone" required  lay-verify="required|phone" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-input-block">
                <button type="submit" class="layui-btn btn-sumbit layui-btn-big">注册 </button>
                <button type="reset" class="layui-btn btn-reset layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>