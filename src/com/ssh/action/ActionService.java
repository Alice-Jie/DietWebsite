package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssh.service.FoodService;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.2
 * @description：继承ActionEntity，专注于处理Service层的注入
 */
public class ActionService extends ActionEntity {

	@Autowired
	FoodService foodService;  // 菜品Service层
	
}