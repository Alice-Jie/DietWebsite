package com.ssh.action;

import java.sql.Date;

import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.Staff;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：继承ActionResult，专注于处理Controller
 */
public class StaffAction extends ActionResult {
	// 添加员工信息
	@Action("admin_addStaff")
	public String addStaff() {
		Date date = new Date(new java.util.Date().getTime());
		staff.setDate(date);
		staffService.addData(staff);
		return "staffListPage";
	}

	// 删除员工信息
	@Action("admin_delStaff")
	public String delStaff() {
		staffService.delData(staff);
		return "staffListPage";
	}

	// 员工信息列表
	@Action("admin_staffList")
	public String staffList() {
		staffs = staffService.getDataList();
		return "staffList";
	}

	// 编辑员工信息
	@Action("admin_editStaff")
	public String editStaff() {
		int id = staff.getId();
		staff = (Staff) staffService.getData(id);
		return "editStaff";
	}
	
	// 更新员工信息
	@Action("admin_updateStaff")
	public String updateStaff() {
		staffService.updateData(staff);
		return "staffListPage";
	}
}
