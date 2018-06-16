<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">菜品信息</li>
        <li>添加菜品</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
			<table class="layui-table" lay-filter="foodList">
			    <thead>
			        <tr class="success">
			            <th lay-data="{field:'id', width:'6.25%', sort:true}">ID</th>
			            <th lay-data="{field:'image', width:'6.25%'}">图片</th>
			            <th lay-data="{field:'name', width:'6.25%'}">名称</th>
			            <th lay-data="{field:'price', width:'6.25%', sort:true}">价格</th>
                        <th lay-data="{field:'description', width:'25%'}">描述</th>
                        <th lay-data="{field:'date', width:'6.25%', sort:true}">日期</th>
                        <th lay-data="{field:'protein', width:'6.25%', sort:true}">蛋白质</th>
                        <th lay-data="{field:'carbohydrate', width:'6.25%', sort:true}">糖类</th>
                        <th lay-data="{field:'fat', width:'6.25%', sort:true}">脂肪</th>
                        <th lay-data="{field:'dietaryFiber', width:'6.25%', sort:true}">膳食纤维</th>
                        <th lay-data="{field:'moisture', width:'6.25%', sort:true}">水分</th>
                        <th lay-data="{field:'edit', width:'6.25%'}">编辑</th>
                        <th lay-data="{field:'delete', width:'6.25%'}">删除</th>
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
                        <td>${food.date.toString()}</td>
                        <td>${food.protein}</td>
                        <td>${food.carbohydrate}</td>
                        <td>${food.fat}</td>
                        <td>${food.dietaryFiber}</td>
                        <td>${food.moisture}</td>
                        <td><a href="../admin_editFood?food.id=${food.id}"><i class="layui-icon">&#xe642;</i></a></td>
                        <td><a href="../admin_delFood?food.id=${food.id}"><i class="layui-icon">&#xe640;</i></a></td>
			        </tr>
		        </c:forEach>
			    </tbody>
			</table>
        </div>
		<script>
		// 表单数据格式化
        layui.use(['table'], function() {
            var table = layui.table;
            table.init('foodList', {
                height: 'full-210'  // 设置高度
                , cellMinWidth: 80  // 最小宽度
                , page: true        // 启用分页
            });
        });
        </script>
        <div class="layui-tab-item">
			<form class="layui-form" method="post" action="../admin_addFood" enctype="multipart/form-data">
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
                    <label class="layui-form-label">蛋白质：</label>
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
                    <label class="layui-form-label">水分：</label>
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
        </div>
    </div>
</div>