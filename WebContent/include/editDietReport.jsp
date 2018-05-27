<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form class="layui-form" method="post" action="">
    <!-- 早餐 -->
    <div class="layui-form-item">
        <label class="layui-form-label">早餐：</label>
	    <div class="layui-input-block">
			<select name="moring" lay-verify="required">
	        <c:forEach items="${foods}" var="food">
	            <option value=${food.id}>${food.name}</option>
	        </c:forEach>
			</select>
	    </div>
    </div>
    <!-- 午餐 -->
    <div class="layui-form-item">
        <label class="layui-form-label">午餐：</label>
        <div class="layui-input-block">
            <select name="noon" lay-verify="required">
            <c:forEach items="${foods}" var="food">
                <option value=${food.id}>${food.name}</option>
            </c:forEach>
            </select>
        </div>
    </div>
    <!-- 晚餐 -->
    <div class="layui-form-item">
        <label class="layui-form-label">晚餐：</label>
        <div class="layui-input-block">
            <select name="evening" lay-verify="required">
            <c:forEach items="${foods}" var="food">
                <option value=${food.id}>${food.name}</option>
            </c:forEach>
            </select>
        </div>
    </div>
    <!-- 提交&重置 -->
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn" lay-submit>提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>