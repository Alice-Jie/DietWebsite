package com.ssh.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**TODO
 * @author：Alice
 * @date: 2018年5月25日
 * @version 0.0.8
 * @description：继承ActionParameter，专注于处理JSP返回页面以及路径映射
 */
@Namespace("/")
@ParentPackage("mypack")
@Results({
	/* 前台信息路由 */
	@Result(name = "home", location = "/home.jsp"),
	@Result(name = "homePage", type = "redirect", location = "/fore_home"),
	@Result(name = "foodDetail", location = "/detail.jsp"),
	@Result(name = "login", location = "/login.jsp"),
	@Result(name = "staffLogin", location = "/staffLogin.jsp"),
	@Result(name = "adminLogin", location = "/adminLogin.jsp"),
	@Result(name = "register", location = "/register.jsp"),
	@Result(name = "memberInfo", location = "/memberInfo.jsp"),
	@Result(name = "editDietReport", location = "/editDiet.jsp"),
	@Result(name = "dietReport", location = "/dietReport.jsp"),
	@Result(name = "staffInfo", location = "/staffInfo.jsp"),
	@Result(name = "staffAddFood", location = "/staffAddFood.jsp"),
	@Result(name = "admin", location = "/admin/log.jsp"),
	
	/* 会员信息路由 */
	@Result(name = "memberList", location = "/admin/memberList.jsp"),
	@Result(name = "memberListPage", type = "redirect", location = "/admin_memberList"),
	@Result(name = "editMember", location = "/admin/editMember.jsp"),
	
	/* 员工信息路由 */
	@Result(name = "staffList", location = "/admin/staffList.jsp"),
	@Result(name = "staffListPage", type = "redirect", location = "/admin_staffList"),
	@Result(name = "editStaff", location = "/admin/editStaff.jsp"),
	
	/* 菜品信息路由 */
	@Result(name = "foodList", location = "/admin/foodList.jsp"),
	@Result(name = "foodListPage", type = "redirect", location = "/admin_foodList"),
	@Result(name = "editFood", location = "/admin/editFood.jsp"),
	
	/* 管理员信息路由 */
	@Result(name = "log", location = "/admin/log.jsp"),
	@Result(name = "adminListPage", type = "redirect", location = "/admin_editAdmin"),
	@Result(name = "editAdmin", location = "/admin/editAdmin.jsp"),
})
public class ActionResult extends ActionParameter {

}