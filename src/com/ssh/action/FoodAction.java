package com.ssh.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.*;

import com.ssh.util.ImageUtil;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.2
 * @description：继承ActionResult，专注于处理Controller
 */
public class FoodAction extends ActionResult {

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
