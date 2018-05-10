<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li>菜品信息</li>
        <li>添加菜品</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
			<table class="layui-table" lay-filter="foodList">
			    <thead>
			        <tr class="success">
			            <th lay-data="{field:'id', width:100, sort:true}">ID</th>
			            <th lay-data="{field:'image', width:200}">图片</th>
			            <th lay-data="{field:'name', width:100}">名称</th>
			            <th lay-data="{field:'price', width:100, sort:true}">价格</th>
                        <th lay-data="{field:'description', width:400}">描述</th>
                        <th lay-data="{field:'edit', width:100}">编辑</th>
                        <th lay-data="{field:'delete', width:100}">删除</th>
			        </tr>
			    </thead>
			    <tbody>
			    <c:forEach items="${foods}" var="food">
			        <tr>
			            <td>${food.id}</td>
			            <td><a href="../img/food/food_${food.id}.jpg"><img src="../img/food/food_${food.id}.jpg" weight="45px" height="45px"></a></td>
			            <td>${food.name}</td>
                        <td>${food.price}</td>
                        <td>${food.description}</td>
                        <td><a href="../admin_editFood?food.id=${food.id}"><i class="layui-icon">&#xe642;</i></a></td>
                        <td><a href="../admin_delFood?food.id=${food.id}"><i class="layui-icon">&#xe640;</i></a></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
        </div>
        <div class="layui-tab-item">
			<form class="layui-form" method="post" action="../admin_addFood" enctype="multipart/form-data">
			    <!-- 菜品图片 -->
                <div class="layui-form-item">
	                <label class="layui-form-label">图片：</label>
	                <div class="layui-input-block">
	                    <input id="foodImg" type="file" name="img" />
	                <!--
                        <button type="button" class="layui-btn layui-btn-primary" id="uploadImg">
                            <i class="layui-icon">&#xe67c;</i>上传图片
                        </button>
                    -->
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
                <!-- 提交&重置 -->
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button type="submit" class="layui-btn" lay-submit lay-filter="addFood">提交</button>
						<button type="reset" class="layui-btn layui-btn-primary">重置</button>
					</div>
				</div>
			</form>
        </div>
    </div>
</div>