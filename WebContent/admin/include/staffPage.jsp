    <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">员工信息</li>
        <li>添加员工</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
			<table class="layui-table" lay-filter="staffList">
			    <thead>
			        <tr class="success">
			            <th lay-data="{field:'id', width:'10%', sort:true}">ID</th>
			            <th lay-data="{field:'account', width:'10%', sort:true}">账号</th>
			            <th lay-data="{field:'password', width:'10%'}">密码</th>
			            <th lay-data="{field:'name', width:'10%', sort:true}">名称</th>
                        <th lay-data="{field:'sex', width:'10%', sort:true}">性别</th>
                        <th lay-data="{field:'Email', width:'10%', sort:true}">邮箱</th>
                        <th lay-data="{field:'phone', width:'10%', sort:true}">电话</th>
                        <th lay-data="{field:'date', width:'10%', sort:true}">注册日期</th>
                        <th lay-data="{field:'edit', width:'10%'}">编辑</th>
                        <th lay-data="{field:'delete', width:'10%'}">删除</th>
			        </tr>
			    </thead>
			    <tbody>
			    <c:forEach items="${staffs}" var="staff">
			        <tr>
			            <td>${staff.id}</td>
			            <td>${staff.account}</td>
					    <td>${staff.pwd}</td>
                        <td>${staff.name}</td>
                        <td>${staff.sex}</td>
                        <td>${staff.email}</td>
                        <td>${staff.phone}</td>
                        <td>${staff.date}</td>
                        <td><a href="../admin_editStaff?staff.id=${staff.id}"><i class="layui-icon">&#xe642;</i></a></td>
                        <td><a href="../admin_delStaff?staff.id=${staff.id}"><i class="layui-icon">&#xe640;</i></a></td>
			        </tr>
			        </c:forEach>
			    </tbody>
			</table>
        </div>
		<script>
        // 表单数据格式化
        layui.use(['table'], function() {
            var table = layui.table;
            table.init('staffList', {
                height: 'full-210'  // 设置高度
                , cellMinWidth: 80  // 最小宽度
                , page: true        // 启用分页
            });
        });
        </script>
        <div class="layui-tab-item">
			<form class="layui-form" method="post" action="../admin_addStaff" enctype="multipart/form-data">
                <!-- 会员账号 -->
				<div class="layui-form-item">
					<label class="layui-form-label">账号：</label>
					<div class="layui-input-block">
						<input type="text" name="staff.account" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
					</div>
				</div>
                <!-- 会员密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">密码：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.pwd" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员姓名 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.name" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员性别 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">性别：</label>
				    <div class="layui-input-block">
				      <input type="radio" name="staff.sex" value="男" title="男" checked>
				      <input type="radio" name="staff.sex" value="女" title="女">
				    </div>
                </div>
                <!-- 会员邮箱 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">电子邮箱：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.Email" required  lay-verify="required|email" placeholder="请输入邮箱地址" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员手机 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">手机号码：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.phone" required  lay-verify="required|phone" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
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
        <script>
        </script>
    </div>
</div>