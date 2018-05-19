package com.ssh.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**TODO
 * @author：Alice
 * @date: 2018年5月19日
 * @version 0.0.3
 * @description：在Hibernate层建立映射关系
 */
@Entity
@Table(name = "Food")
public class Food {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FoodID")
	private int id;              // 菜品ID
	@Column(name = "FoodName")
	private String name;         // 菜品名字
	@Column(name = "FoodPrice")
	private String price;        // 菜品价格
	@Column(name = "FoodDescribe")
	private String description;  // 菜品描述
	@Column(name = "FoodDate")
	private Date date;           // 发布日期
	@Column(name = "FoodProtein")
	private int protein;         // 蛋白质
	@Column(name = "FoodCarbohydrate")
	private int carbohydrate;    // 糖类
	@Column(name = "FoodFat")
	private int fat;             // 脂肪
	@Column(name = "FoodDietaryFiber")
	private int dietaryFiber;    // 膳食纤维
	@Column(name = "FoodMoisture")
	private int moisture;        // 水分
	
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
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getDietaryFiber() {
		return dietaryFiber;
	}

	public void setDietaryFiber(int dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}

	public int getMoisture() {
		return moisture;
	}

	public void setMoisture(int moisture) {
		this.moisture = moisture;
	}

	/**
	 * 打印属性
	 * @return 属性列表
	 */
	@Override
	public String toString() {
		String console = 
				"\n————————————————————————\n"
				+ "Food: \n"
				+ "id: "          + id               + "\n"
				+ "name: "        + name             + "\n"
				+ "price: "       + price            + "\n"
				+ "description: " + description      + "\n"
				+ "date: "        + date.toString()  + "\n"
				+ "protein:"      + protein          + "\n"
				+ "carbohydrate:" + carbohydrate     + "\n"
				+ "fat:"          + fat              + "\n"
				+ "dietaryFiber:" + dietaryFiber     + "\n"
				+ "moisture:"     + moisture         + "\n"
				+ "————————————————————————\n"
				;
		return console;
	}
}
