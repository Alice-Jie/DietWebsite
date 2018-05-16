 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">管理员信息</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <form class="layui-form" method="post" action="../admin_updateAdmin" enctype="multipart/form-data">
               <!-- 会员账号 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">账号：</label>
                    <div class="layui-input-block">
                        <input type="text" name="administrator.account" value="${administrator.account}" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">密码：</label>
                    <div class="layui-input-block">
                        <input type="text" name="administrator.pwd" value="${administrator.pwd}" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 提交&重置 -->
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="hidden" name="administrator.id" value="${administrator.id}">
                        <button type="submit" class="layui-btn" lay-submit">提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
