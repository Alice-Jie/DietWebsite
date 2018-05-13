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
	@Column(name = "FoodCa")
	private int ca;              // 营养-钙
	@Column(name = "FoodFe")
	private int fe;              // 营养-铁
	@Column(name = "FoodZn")
	private int zn;              // 营养-锌
	@Column(name = "FoodSe")
	private int se;              // 营养-硒
	@Column(name = "FoodVit")
	private int vit;             // 营养-维生素
	
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

	public int getCa() {
		return ca;
	}

	public void setCa(int ca) {
		this.ca = ca;
	}

	public int getFe() {
		return fe;
	}

	public void setFe(int fe) {
		this.fe = fe;
	}

	public int getZn() {
		return zn;
	}

	public void setZn(int zn) {
		this.zn = zn;
	}

	public int getSe() {
		return se;
	}

	public void setSe(int se) {
		this.se = se;
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	
	/**
	 * 打印属性
	 * @return 属性列表
	 */
	@Override
	public String toString() {
		String console = 
				"————————————————————————\n"
				+ "Food: \n"
				+ "id: "          + id          + "\n"
				+ "name: "        + name        + "\n"
				+ "price: "       + price       + "\n"
				+ "description: " + description + "\n"
				+ "ca: "          + ca 	        + "\n"
				+ "fe: "          + fe          + "\n"
				+ "zn: "          + zn          + "\n"
				+ "se: "          + se          + "\n"
				+ "vit: "         + vit         + "\n"
				+ "————————————————————————\n"
				;
		return console;
	}
}
