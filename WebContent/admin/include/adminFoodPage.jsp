<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li>查询菜品</li>
        <li>添加菜品</li>
        <li>修改菜品</li>
        <li>删除菜品</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
			<table class="layui-table" lay-filter="list">
			    <thead>
			        <tr class="success">
			            <th lay-data="{field:'id', width:100, sort:true}">ID</th>
			            <th lay-data="{field:'image', width:200}">图片</th>
			            <th lay-data="{field:'name', width:100, sort:true}">名称</th>
			            <th lay-data="{field:'price', width:100, sort:true}">价格</th>
                        <th lay-data="{field:'description', width:400}">描述</th>
			        </tr>
			    </thead>
			    <tbody>
			    <c:forEach items="${foods}" var="food">
			        <tr>
			            <td>${food.id}</td>
			            <td><img src="../img/food/food_${food.id}.jpg" weight="45px" height="45px"></td>
			            <td>${food.name}</td>
                        <td>${food.price}</td>
                        <td>${food.description}</td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
        </div>
        <div class="layui-tab-item">
			<form class="layui-form" action="">
				<div class="layui-form-item">
					<label class="layui-form-label">名称：</label>
					<div class="layui-input-block">
						<input type="text" name="title" required  lay-verify="required" placeholder="请输入菜品名称" autocomplete="off" class="layui-input">
					</div>
				</div>
                <div class="layui-form-item">
                    <label class="layui-form-label">价格：</label>
                    <div class="layui-input-block">
                        <input type="text" name="title" required  lay-verify="required" placeholder="请输入菜品价格" autocomplete="off" class="layui-input">
                    </div>
                </div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">描述：</label>
					<div class="layui-input-block">
						<textarea name="desc" placeholder="请输入菜品内容" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="formDemo">提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
        </div>
        <div class="layui-tab-item">update</div>
        <div class="layui-tab-item">delete</div>
    </div>
</div>