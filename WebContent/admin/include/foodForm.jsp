 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">编辑菜品信息</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <form class="layui-form" method="post" action="../admin_updateFood" enctype="multipart/form-data">
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
                        <input type="text" name="food.name" value="${food.name}" required  lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 菜品价格 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">价格：</label>
                    <div class="layui-input-block">
                        <input type="text" name="food.price" value="${food.price}" required lay-verify="required" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 菜品描述 -->
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">描述：</label>
                    <div class="layui-input-block">
                        <textarea name="food.description" class="layui-textarea">${food.description}</textarea>
                    </div>
                </div>
                <!-- 提交&重置 -->
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="hidden" name="food.id" value="${food.id}">
                        <button type="submit" class="layui-btn" lay-submit">提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
