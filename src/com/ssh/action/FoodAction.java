package com.ssh.action;

import java.util.List;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssh.entity.Food;
import com.ssh.service.FoodService;
import com.ssh.unit.ImageUtil;

@Namespace("/")
@ParentPackage("mypack")
@Results({ 
		@Result(name = "foodList", location = "/admin/foodList.jsp"),
		@Result(name = "foodListPage", type = "redirect", location = "/admin_foodList"),
		@Result(name = "editFood", location = "/admin/editFood.jsp"), 
})
public class FoodAction {

	@Autowired
	FoodService foodService;

	Food food;        // 菜品信息
	List<Food> foods; // 菜品列表

	File img;  // 图片文件对象

	/* set、get */

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public File getImg() {
		return img;
	}

	public void setImg(File img) {
		this.img = img;
	}

	/* 控制器 */

	// 添加菜品信息
	@Action("admin_addFood")
	public String addFood() {
		foodService.addData(food);
		// 上传图片
		File imageFolder = new File(ServletActionContext.getServletContext().getRealPath("img/food"));
		File file = new File(imageFolder, "food_" + food.getId() + ".jpg");
		try {
			FileUtils.copyFile(img, file);
			BufferedImage img = ImageUtil.change2jpg(file);
			ImageIO.write(img, "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "foodListPage";
	}

	// 删除菜品信息
	@Action("admin_delFood")
	public String delFood() {
		foodService.delData(food);
		return "foodListPage";
	}

	// 菜品信息列表
	@Action("admin_foodList")
	public String foodList() {
		foods = foodService.getDataList();
		return "foodList";
	}

	// 编辑菜品信息
	@Action("admin_editFood")
	public String editFood() {
		int id = food.getId();
		food = (Food) foodService.getData(id);
		return "editFood";
	}

	// 更新菜品信息
	@Action("admin_updateFood")
	public String updateFood() {
		foodService.updateData(food);
		// 更新图片
		if (null != img) {
			File imageFolder = new File(ServletActionContext.getServletContext().getRealPath("img/food"));
			File file = new File(imageFolder, "food_" + food.getId() + ".jpg");
			try {
				FileUtils.copyFile(img, file);
				BufferedImage img = ImageUtil.change2jpg(file);
				ImageIO.write(img, "jpg", file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "foodListPage";
	}

}
