<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- 蛋白质-->
<div class="site-title">
  <fieldset><legend><a name="other">蛋白质</a></legend></fieldset>
</div>
<div class="site-text">
  <p>今日已摄取${member.protein}克蛋白质，蛋白质摄取${dietReport.proteinStr}。</p>
</div>
<!-- 糖类-->
<div class="site-title">
  <fieldset><legend><a name="other">糖类</a></legend></fieldset>
</div>
<div class="site-text">
  <p>今日已摄取${member.carbohydrate}克糖类，糖类摄取${dietReport.carbohydrateStr}。</p>
</div>
<!-- 脂肪-->
<div class="site-title">
  <fieldset><legend><a name="other">脂肪</a></legend></fieldset>
</div>
<div class="site-text">
  <p>今日已摄取${member.fat}克脂肪，脂肪摄取${dietReport.fatStr}。</p>
</div>
<!-- 膳食纤维-->
<div class="site-title">
  <fieldset><legend><a name="other">膳食纤维</a></legend></fieldset>
</div>
<div class="site-text">
  <p>今日已摄取${member.dietaryFiber}克膳食纤维，膳食纤维摄取${dietReport.dietaryFiberStr}。</p>
</div>
<!-- 水分-->
<div class="site-title">
  <fieldset><legend><a name="other">水分</a></legend></fieldset>
</div>
<div class="site-text">
  <p>今日已摄取${member.moisture}克水分，水分摄取${dietReport.moistureStr}。</p>
</div>