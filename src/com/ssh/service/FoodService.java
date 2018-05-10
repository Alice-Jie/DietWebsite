package com.ssh.service;

import java.util.List;

import com.ssh.entity.Food;

import com.ssh.web.Page;

public interface FoodService {

	/** 
	 * 获取菜品信息
	 * @param cl 类
	 * @param id 索引ID
	 * @return 对应对象
	 */
	public Food getFood(Class cl, int id);
	
	/** 获取菜品列表 */
	public List<Food> getFoodList();

	/** 添加菜品信息 */
	public void addFood(Food food);
	
	/** 删除菜品信息 */
	public void delFood(Food food);
	
}
