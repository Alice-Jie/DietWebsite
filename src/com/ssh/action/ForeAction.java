package com.ssh.action;

import java.sql.Date;

import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.*;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月21日
 * @version 0.0.1
 * @description：继承ActionResult，专注于处理Controller
 */
public class ForeAction extends ActionResult {

	// 前台信息列表
	@Action("fore_home")
	public String infoList() {
		foods = foodService.getDataList();
		return "home";
	}
	
	// 查看菜品信息
	@Action("fore_foodDetail")
	public String foodDetail() {
		int id = food.getId();
		food = (Food) foodService.getData(id);
		return "foodDetail";
	}
	
}
