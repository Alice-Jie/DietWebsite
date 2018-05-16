 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
<!-- 选项卡 -->
<div class="layui-tab">
    <ul class="layui-tab-title">
        <li class="layui-this">编辑员工信息</li>
    </ul>
    <div class="layui-tab-content">
        <div class="layui-tab-item layui-show">
            <form class="layui-form" method="post" action="../admin_updateStaff" enctype="multipart/form-data">
               <!-- 会员账号 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">账号：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.account" value="${staff.account}" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员密码 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">密码：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.pwd" value="${staff.pwd}" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员姓名 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">姓名：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.name" value="${staff.name}" required  lay-verify="required" placeholder="请输入姓名" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员性别 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">性别：</label>
                    <div class="layui-input-block">
                        <c:set var="sex" value="${staff.sex}" scope="request" />
                        <input type="radio" name="staff.sex" value="男" title="男" <c:if test="${sex=='男'}">checked</c:if>>
                        <input type="radio" name="staff.sex" value="女" title="女" <c:if test="${sex=='女'}">checked</c:if>>
                    </div>
                </div>
                <!-- 会员邮箱 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">电子邮箱：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.Email" value="${staff.email}" required  lay-verify="required|email" placeholder="请输入邮箱地址" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 会员手机 -->
                <div class="layui-form-item">
                    <label class="layui-form-label">手机号码：</label>
                    <div class="layui-input-block">
                        <input type="text" name="staff.phone" value="${staff.phone}" required  lay-verify="required|phone" placeholder="请输入手机号码" autocomplete="off" class="layui-input">
                    </div>
                </div>
                <!-- 注册时间-->
                <input type="hidden" name="staff.date" value="${staff.date}">
                <!-- 提交&重置 -->
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <input type="hidden" name="staff.id" value="${staff.id}">
                        <button type="submit" class="layui-btn" lay-submit">提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
