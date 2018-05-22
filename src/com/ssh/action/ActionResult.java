package com.ssh.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**TODO
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.4
 * @description：继承ActionParameter，专注于处理JSP返回页面以及路径映射
 */
@Namespace("/")
@ParentPackage("mypack")
@Results({
	/* 前台信息路由 */
	@Result(name = "home", location = "/home.jsp"),
	@Result(name = "foodDetail", location = "/detail.jsp"),
	
	
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
	@Result(name = "adminListPage", type = "redirect", location = "/admin_editAdmin"),
	@Result(name = "editAdmin", location = "/admin/editAdmin.jsp"),
	
})
public class ActionResult extends ActionParameter {

}