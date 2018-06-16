<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form class="layui-form" method="post" action="fore_addFood" enctype="multipart/form-data">
    <!-- 菜品图片 -->
    <div class="layui-form-item">
        <label class="layui-form-label">图片：</label>
        <div class="layui-input-block">
            <input id="foodImg" type="file" name="img" />
        </div>
    </div>
    <!-- 菜品名称 -->
    <div class="layui-form-item">
        <label class="layui-form-label">名称：</label>
        <div class="layui-input-block">
            <input type="text" name="food.name" required  lay-verify="required" placeholder="请输入菜品名称" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品价格 -->
    <div class="layui-form-item">
        <label class="layui-form-label">价格：</label>
        <div class="layui-input-block">
            <input type="text" name="food.price" required  lay-verify="required" placeholder="请输入菜品价格" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品描述 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">描述：</label>
        <div class="layui-input-block">
            <textarea name="food.description" placeholder="请输入菜品内容" class="layui-textarea"></textarea>
        </div>
    </div>
    <!-- 菜品蛋白质 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">蛋白质：</label>
        <div class="layui-input-block">
            <input type="text" name="food.protein" required  lay-verify="required" placeholder="请输入菜品蛋白质含量" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品糖类 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">糖 类：</label>
        <div class="layui-input-block">
            <input type="text" name="food.carbohydrate" required  lay-verify="required" placeholder="请输入菜品糖类含量" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品脂肪 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">脂 肪：</label>
        <div class="layui-input-block">
            <input type="text" name="food.fat" required  lay-verify="required" placeholder="请输入菜品脂肪含量" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品膳食纤维 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">膳食纤维：</label>
        <div class="layui-input-block">
            <input type="text" name="food.dietaryFiber" required  lay-verify="required" placeholder="请输入菜品膳食纤维含量" autocomplete="off" class="layui-input">
        </div>
    </div>
    <!-- 菜品水分 -->
    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">水 分：</label>
        <div class="layui-input-block">
            <input type="text" name="food.moisture" required  lay-verify="required" placeholder="请输入菜品水分含量" autocomplete="off" class="layui-input">
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