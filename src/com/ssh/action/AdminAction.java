package com.ssh.action;

import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.Admin;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年6月22日
 * @version 0.0.2
 * @description：继承ActionResult，专注于处理Controller
 */
public class AdminAction extends ActionResult {
	// debug
	@Action("admin_log")
	public String log() {
		return "log";
	}
	
	// 编辑员工信息
	@Action("admin_editAdmin")
	public String editStaff() {
		administrator = (Admin) adminService.getData(1);
		return "editAdmin";
	}
	
	// 更新员工信息
	@Action("admin_updateAdmin")
	public String updateAdmin() {
		adminService.updateData(administrator);
		return "adminListPage";
	}
}
