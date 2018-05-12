package com.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**TODO
 * @author：Alice
 * @date: 2018年5月7日
 * @version 0.0.1
 * @description：在Hibernate层建立映射关系
 */
@Entity
@Table(name = "food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FoodID")
	int id;              // 菜品ID
	@Column(name = "FoodName")
	String name;         // 菜品名字
	@Column(name = "FoodPrice")
	String price;        // 菜品价格
	@Column(name = "FoodDescribe")
	String description;  // 菜品描述

	/* setter、getter */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/* 调试 */

	@Override
	public String toString() {
		return "Food: [" + "id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + "]";
	}
}
