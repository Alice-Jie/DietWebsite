<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 头像 -->
<!-- 下拉列表 -->
<div class="navBar layui-side-scroll" id="navBarId">
    <ul class="layui-nav layui-nav-tree layui-left-nav">
        <li class="layui-nav-item layui-nav-itemed">
            <a href="../admin/debug.jsp">
                <i class="layui-icon">&#xe63c;</i><cite> 更新日志</cite>
            </a>
        </li>
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">
                <i class="layui-icon">&#xe620;</i><cite> 信息管理</cite>
                <span class="layui-nav-more"></span>
            </a>
            <dl class="layui-nav-child">
                <dd><a href="../admin_memberList"><i class="layui-icon">&#xe770;</i><cite> 会员管理</cite></a></dd>
                <dd><a href="../admin_staffList"><i class="layui-icon">&#xe606;</i><cite> 员工管理</cite></a></dd>
                <dd><a href="../admin_foodList"><i class="layui-icon">&#xe62e;</i><cite> 菜品管理</cite></a></dd>
            </dl>
        </li>
        <li class="layui-nav-item layui-nav-itemed">
            <a href="../admin_editAdmin">
                <i class="layui-icon">&#xe66f;</i><cite> 管理员</cite>
            </a>
        </li>
    </ul>
</div>