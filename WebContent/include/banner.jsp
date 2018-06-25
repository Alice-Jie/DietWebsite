<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="layui-carousel" id="dietcarousel">
    <div carousel-item>
        <%-- 需要添加<a>标签，进入对应食物的详细页面 --%>
        <!--  
        <div>
        <a href="fore_foodDetail?food.id=${food.id}" target="_blank">
            <img alt="${food.name}" src="img/banner_${food.id}.jpg">
        </a>
        </div>
        -->
        <div><a href="fore_foodDetail?food.id=1" target="_blank"><img src="img/banner_1.jpg"></a></div>
        <div><a href="fore_foodDetail?food.id=5" target="_blank"><img src="img/banner_2.jpg"></a></div>
        <div><a href="fore_foodDetail?food.id=2" target="_blank"><img src="img/banner_3.jpg"></a></div>
    </div>
</div>
<script>
    layui.use('carousel', function () {
        var carousel = layui.carousel;
        carousel.render({
            elem: '#dietcarousel'
            , width: '100%'    // 设置容器宽度
            , height: '320px'  // 设置容器高度
            , arrow: 'always'  // 始终显示箭头
            //,anim: 'updown'  // 切换动画方式
        });
    });
</script>