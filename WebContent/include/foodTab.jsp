<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<li>
    <!-- 图片链接 -->
    <a class="diet-case-img" href="fore_foodDetail?food.id=${food.id}" target="_blank">
        <img alt="${food.name}" src="img/food/food_${food.id}.jpg">
        <i class="layui-icon">&#xe615;</i>
    </a>
    <!-- 文字标题 -->
    <h2 class="layui-elip">
        <a href="fore_foodDetail?food.id=${food.id}" target="_blank">${food.name}</a>
    </h2>
    <!-- 文字描述 -->
    <p class="diet-case-desc">${food.description}</p>
    <!-- 发布时间 -->
    <div class="diet-case-info">
        <p class="layui-elip">
            <span style="color:#666;">${food.date.toString()}</span>
        </p>
    </div>
</li>