<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<script>
	$(function() {
		<c:if test="${!empty msg}">layer.msg('${msg}');</c:if>
		/** 账户和密码不能为空 */
		$("#login").submit(function() {
	        if($("#account").val().length == 0
       		|| $("#password").val().length == 0) {
	        	layer.msg('账户和密码不能为空！');
	            return false;
	        }
	        return true;
		});
	})
</script>
<div class="login-form">
    <form id="login" class="layui-form" method="post" action="fore_login">
        <div class="layui-form-item">
            <label class="layui-form-label">账号：</label>
            <div class="layui-input-block">
                <input type="text" id="account" name="member.account" class="layui-input" required lay-verify="required" placeholder="请输入账号" autocomplete="off">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
                <input type="text" id="password" name="member.pwd" class="layui-input" required lay-verify="required" placeholder="请输入密码" autocomplete="off">
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