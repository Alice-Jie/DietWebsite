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
import com.ssh.web.ImageUtil;

import com.ssh.web.Page;

@Namespace("/")
@ParentPackage("mypack")
@Results(
		{ 
			@Result(name = "foodList", location = "/admin/foodList.jsp"),
			@Result(name="foodListPage", type = "redirect", location="/admin_foodList")
		})
public class FoodAction {

	@Autowired
	FoodService foodService;

	List<Food> foods;  // 菜品列表
	Food food;         // 彩屏信息
	
	File img;  // 图片文件对象
	Page page;

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
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	/* 控制器 */
	
	@Action("admin_foodList")
	public String foodList() {
		foods = foodService.getFoodList();
		// System.out.println(foods);
		return "foodList";
	}
	
	@Action("admin_addFood")
    public String addFood() {
		foodService.addFood(food);
		// System.out.println(food);
		// 上传图片
        File imageFolder= new File(ServletActionContext.getServletContext().getRealPath("img/food"));
        File file = new File(imageFolder, "food_" + food.getId() + ".jpg");
        try {
            FileUtils.copyFile(img, file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img, "jpg", file);
            // System.out.println("上传成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "foodListPage";
    }
	
    @Action("admin_editFood")
    public String editFood() {
    	System.out.println(food);
        int id = food.getId();
        System.out.println(id);
        food = foodService.getFood(Food.class,id);
        // 尚未重定向
        return "";
    }
	
	@Action("admin_delFood")
	public String delFood() {
		foodService.delFood(food);
		return "foodListPage";
	}
	
}
