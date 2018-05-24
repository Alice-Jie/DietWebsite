<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form class="layui-form" method="post" action="fore_updateStaffInfo">
    <!-- 员工性别 -->
    <div class="layui-form-item">
        <label class="layui-form-label">性别：</label>
        <div class="layui-input-block">
         <c:set var="sex" value="${staff.sex}" scope="request" />
         <input type="radio" name="staff.sex" value="男" title="男" <c:if test="${sex=='男'}">checked</c:if>>
         <input type="radio" name="staff.sex" value="女" title="女" <c:if test="${sex=='女'}">checked</c:if>>
        </div>
    </div>
    <!-- 员工邮箱 -->
    <div class="layui-form-item">
        <label class="layui-form-label">电子邮箱：</label>
        <div class="layui-input-block">
            <input type="text" name="staff.Email" value="${staff.email}" required lay-verify="required|email"
                   placeholder="请输入邮箱地址" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 员工手机 -->
    <div class="layui-form-item">
        <label class="layui-form-label">手机号码：</label>
        <div class="layui-input-block">
            <input type="text" name="staff.phone" value="${staff.phone}" required lay-verify="required|phone"
                   placeholder="请输入手机号码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 提交&重置 -->
    <div class="layui-form-item">
        <div class="layui-input-block">
            <input type="hidden" name="staff.id" value="${staff.id}">
            <button type="submit" class="layui-btn" lay-submit>提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>