<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<!-- 菜品详细信息 -->
<div class="detail-info">
    <div class="info-title">
        <h1>${food.name}</h1>
    </div>
    <div class="layui-clear info-main">
        <!-- 菜品图片 -->
        <div class="info-main-left">
            <img alt="${food.name}" src="img/food/food_${food.id}.jpg">
        </div>
        <div class="info-main-right">
            <!-- 菜品价格 -->
            <div class="info-price">
                <em class="page-left">￥${food.price}<span> 元</span></em>
            </div>
            <!-- 营养参考 -->
            <div class="layui-clear nutrition">
                <span class="desc">蛋白质：</span><span class="num">${food.protein}</span>
                <span class="desc">糖类：</span><span class="num">${food.carbohydrate}</span>
                <span class="desc">脂肪：</span><span class="num">${food.fat}</span>
                <span class="desc">膳食纤维：</span><span class="num">${food.dietaryFiber}</span>
                <span class="desc">水分：</span><span class="num">${food.moisture}</span>
                <span class="desc">发布时间：</span><span class="num">${food.date.toString()}</span>
            </div>
        </div>
    </div>
    <!-- 描述部分 -->
        <div class="detail-desc">
            <div class="info-title">
                <h1>描述：</h1>
            </div>
            <div class="desc-main">
                <p>这款三明治可爱，简单，不会做饭的人也绝对会做，并且喜欢的简单料理！</p>
            </div>
        </div>
    </div>
</div>