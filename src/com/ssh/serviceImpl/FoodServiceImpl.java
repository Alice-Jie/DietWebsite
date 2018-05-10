package com.ssh.serviceImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.daoImpl.DAOImpl;
import com.ssh.entity.Food;
import com.ssh.service.FoodService;

import com.ssh.web.Page;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	DAOImpl dao;

	/** 
	 * 获取菜品信息
	 * @param cl 实体类
	 * @param id 索引ID
	 * @return ID对应对象
	 */
	 @Override
	 public Food getFood(Class cl, int id) {
		 return (Food)dao.get(cl, id);
	 }
	
	/**
	 * 获取菜品列表
	 * @return 菜品列表
	 */
	@Override
	public List<Food> getFoodList() {
		DetachedCriteria query = DetachedCriteria.forClass(Food.class);
		query.addOrder(Order.desc("id"));  // 根据ID排序
		return dao.findByCriteria(query);
	}

	
	/** 添加菜品信息 */
	@Override
	public void addFood(Food food) {
		dao.save(food);
	}
	
	/** 删除菜品信息 */
	public void delFood(Food food) {
		dao.delete(food);
	}
}
