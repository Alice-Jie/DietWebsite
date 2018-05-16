package com.ssh.action;

import java.sql.Date;

import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.Admin;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：继承ActionResult，专注于处理Controller
 */
public class AdminAction extends ActionResult {
	// 编辑员工信息
	@Action("admin_editAdmin")
	public String editStaff() {
		administrator = (Admin) adminService.getData(1);
		System.out.println(administrator);
		return "editAdmin";
	}
	
	// 更新员工信息
	@Action("admin_updateAdmin")
	public String updateAdmin() {
		adminService.updateData(administrator);
		return "adminListPage";
	}
}
