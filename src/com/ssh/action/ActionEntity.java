package com.ssh.action;

import java.util.List;

import com.ssh.entity.*;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.2
 * @description：继承ActionPage，专注于处理实体对象以及实体对象集合的setter和getter
 */
public class ActionEntity extends ActionPage {

	protected Food food;         // 菜品信息
	protected List<Food> foods;  // 菜品列表
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

}
