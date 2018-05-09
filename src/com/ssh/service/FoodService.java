package com.ssh.service;

import java.util.List;

import com.ssh.entity.Food;

import com.ssh.web.Page;

public interface FoodService {

	/** 获取菜品列表 */
	public List<Food> getFoodList();

	/** 添加菜品信息 */
	public void addFood(Food food);
	
}
