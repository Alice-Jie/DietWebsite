package com.ssh.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.web.util.HtmlUtils;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.*;

import com.ssh.util.ImageUtil;
import com.ssh.util.DietReport;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年6月04日
 * @version 0.0.7
 * @description：继承ActionResult，专注于处理Controller
 */
public class ForeAction extends ActionResult {

	protected DietReport dietReport; // 饮食报告对象

	/* setter、getter */
	public DietReport getDietReport() {
		return dietReport;
	}

	public void setDietReport(DietReport dietReport) {
		this.dietReport = dietReport;
	}

	// 前台信息列表
	@Action("fore_home")
	public String infoList() {
		foods = foodService.getDataList();
		return "home";
	}

	// 查看菜品信息
	@Action("fore_foodDetail")
	public String foodDetail() {
		int id = food.getId();
		food = (Food) foodService.getData(id);
		return "foodDetail";
	}

	// 搜索菜品信息
	@Action("fore_foodSearch")
	public String foodSearch() {
		foods = foodService.searchList(keyWord);
		return "home";
	}

	// 登录
	@Action("fore_login")
	public String foreLogin() {
		msg = "";
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(member.getAccount());
		member.setAccount(account);
		Member member_session = memberService.matchAccount(member.getAccount(), member.getPwd());
		if (null == member_session) {
			member = null;
			msg = "账号或密码错误！";
			return "login";
		}
		ActionContext.getContext().getSession().put("member", member_session);
		return "homePage";
	}

	// 注册
	@Action("fore_register")
	public String foreRegister() {
		msg = "";
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(member.getAccount());
		// 判断账户是否存在
		boolean isExist = memberService.isAccount(account);
		if (isExist) {
			member = null;
			msg = "用户名已经被使用,不能使用。";
			return "register";
		}
		member.setAccount(account);
		Date date = new Date(new java.util.Date().getTime());
		member.setDate(date);
		memberService.addData(member);
		return "homePage";
	}

	// 会员退出
	@Action("fore_Logout")
	public String logout() {
		ActionContext.getContext().getSession().remove("member");
		member = null;
		return "homePage";
	}

	// 员工登录
	@Action("fore_staffLogin")
	public String foreStffLogin() {
		msg = "";
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(staff.getAccount());
		staff.setAccount(account);
		Staff staff_session = staffService.matchAccount(staff.getAccount(), staff.getPwd());
		if (null == staff_session) {
			staff = null;
			msg = "员工账号或密码错误！";
			return "staffLogin";
		}
		ActionContext.getContext().getSession().put("staff", staff_session);
		return "homePage";
	}

	// 员工退出
	@Action("fore_staffLogout")
	public String foreStaffLogout() {
		ActionContext.getContext().getSession().remove("staff");
		staff = null;
		return "homePage";
	}

	// 管理员登录
	@Action("fore_adminLogin")
	public String foreAdminLogin() {
		msg = "";
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(administrator.getAccount());
		administrator.setAccount(account);
		Admin admin_session = adminService.matchAccount(administrator.getAccount(), administrator.getPwd());
		if (null == admin_session) {
			administrator = null;
			msg = "管理员账号或密码错误！";
			return "adminLogin";
		}
		ActionContext.getContext().getSession().put("admin", admin_session);
		return "admin";
	}

	// 更新会员信息
	@Action("fore_updateMemberInfo")
	public String updateMemberInfo() {
		msg = "";
		int id = member.getId();
		Member tempMember = (Member) memberService.getData(id);
		tempMember.setSex(member.getSex());
		tempMember.setEmail(member.getEmail());
		tempMember.setPhone(member.getPhone());
		memberService.updateData(tempMember);
		msg = "修改信息成功！";
		return "memberInfo";
	}

	// 更新会员信息
	@Action("fore_updateMemberPwd")
	public String updateMemberPwd() {
		msg = "";
		int id = member.getId();
		Member tempMember = (Member) memberService.getData(id);
		tempMember.setPwd(member.getPwd());
		memberService.updateData(tempMember);
		msg = "修改密码成功！";
		return "memberInfo";
	}

	// 更新员工信息
	@Action("fore_updateStaffInfo")
	public String updateStaffInfo() {
		msg = "";
		int id = staff.getId();
		Staff tempStaff = (Staff) staffService.getData(id);
		tempStaff.setSex(staff.getSex());
		tempStaff.setEmail(staff.getEmail());
		tempStaff.setPhone(staff.getPhone());
		staffService.updateData(tempStaff);
		msg = "修改信息成功！";
		return "staffInfo";
	}

	// 更新员工信息
	@Action("fore_updateStaffPwd")
	public String updateStaffPwd() {
		msg = "";
		int id = staff.getId();
		Staff tempStaff = (Staff) staffService.getData(id);
		tempStaff.setPwd(staff.getPwd());
		staffService.updateData(tempStaff);
		msg = "修改密码成功！";
		return "staffInfo";
	}

	// 添加菜品信息
	@Action("fore_addFood")
	public String foreAddFood() {
		msg = "";
		Date date = new Date(new java.util.Date().getTime());
		food.setDate(date);
		foodService.addData(food);
		File imageFolder = new File(ServletActionContext.getServletContext().getRealPath("img/food"));
		// 上传图片
		File file = new File(imageFolder, "food_" + food.getId() + ".jpg");
		try {
			FileUtils.copyFile(img, file);
			BufferedImage img = ImageUtil.change2jpg(file);
			ImageIO.write(img, "jpg", file);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		msg = "添加菜品成功！";
		return "staffAddFood";
	}

	// 饮食信息列表
	@Action("report_dietList")
	public String reportDietList() {
		foods = foodService.getDataList();
		return "editDietReport";
	}

	// 获取饮食信息
	@Action("report_getDietData")
	public String getDietData() {
		int id = 0;
		String[] str = ServletActionContext.getRequest().getParameterValues("report");
		// 早餐数据
		id = Integer.parseInt(str[0], 10);
		moring = (Food) foodService.getData(id);
		// 午餐数据
		id = Integer.parseInt(str[1], 10);
		noon = (Food) foodService.getData(id);
		// 晚餐数据
		id = Integer.parseInt(str[2], 10);
		evening = (Food) foodService.getData(id);
		// 获取会员信息
		id = member.getId();
		member = (Member) memberService.getData(id);
		// 记录会员饮食信息
		member.setProtein((moring.getProtein() + noon.getProtein() + evening.getProtein()) / 3);
		member.setCarbohydrate((moring.getCarbohydrate() + noon.getCarbohydrate() + evening.getCarbohydrate()) / 3);
		member.setFat((moring.getFat() + noon.getFat() + evening.getFat()) / 3);
		member.setDietaryFiber((moring.getDietaryFiber() + noon.getDietaryFiber() + evening.getDietaryFiber()) / 3);
		member.setMoisture((moring.getMoisture() + noon.getMoisture() + evening.getMoisture()) / 3);
		memberService.updateData(member);
		ActionContext.getContext().getSession().put("member", member);
		// 饮食报告对象初始化
		dietReport = new DietReport(member.getProtein(), member.getCarbohydrate(), member.getFat(),
				member.getDietaryFiber(), member.getMoisture());
		dietReport.setDietReport();
		return "dietReport";
	}
}