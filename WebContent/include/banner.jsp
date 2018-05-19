<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<div class="layui-carousel" id="dietcarousel">
    <div carousel-item>
	    <div><img src="img/banner_1.jpg"></div>
	    <div><img src="img/banner_2.jpg"></div>
	    <div><img src="img/banner_3.jpg"></div>
    </div>
</div>
<script>
    layui.use('carousel', function () {
        var carousel = layui.carousel;
        carousel.render({
            elem: '#dietcarousel'
            , width: '100%'    // 设置容器宽度
            , height: '550px'  // 设置容器高度
            , arrow: 'always'  // 始终显示箭头
            //,anim: 'updown'  // 切换动画方式
        });
    });
</script>