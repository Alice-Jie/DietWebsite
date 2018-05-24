<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form id="resetPwd" class="layui-form" method="post" action="fore_updateMemberPwd">
    <!-- 会员密码 -->
<div class="layui-form-item">
    <label class="layui-form-label">密码：</label>
    <div class="layui-input-block">
        <input type="password" id="password" name="member.pwd" required lay-verify="required"
               placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
</div>
<!-- 密码确认 -->
<div class="layui-form-item">
    <label class="layui-form-label">密码确认：</label>
    <div class="layui-input-block">
        <input type="password" id="rePassword" name="repwd" required lay-verify="required" placeholder="请再次输入密码"
               autocomplete="off" class="layui-input">
    </div>
</div>
<!-- 提交&重置 -->
<div class="layui-form-item">
    <div class="layui-input-block">
        <input type="hidden" name="member.id" value="${member.id}">
            <button type="submit" class="layui-btn" lay-submit>提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
<script>
$(function(){
   <c:if test="${!empty msg}">
    layui.use('layer', function(){
        var layer = layui.layer;
        layer.msg('${msg}');
    });
    </c:if>
    /** 注册验证 */
    $("#resetPwd").submit(function() {
        if($("#password").val() != $("#rePassword").val()) {
            layer.msg('密码不一致！');
            return false;
        }
        return true;
    });
})
</script>
