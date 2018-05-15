package com.ssh.action;

import java.sql.Date;

import org.apache.struts2.convention.annotation.Action;

import com.ssh.entity.Member;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：继承ActionResult，专注于处理Controller
 */
public class MemberAction extends ActionResult {
	// 添加会员信息
	@Action("admin_addMember")
	public String addMember() {
		Date date = new Date(new java.util.Date().getTime());
		member.setDate(date);
		memberService.addData(member);
		return "memberListPage";
	}

	// 删除会员信息
	@Action("admin_delMember")
	public String delMember() {
		memberService.delData(member);
		return "memberListPage";
	}

	// 会员信息列表
	@Action("admin_memberList")
	public String memberList() {
		members = memberService.getDataList();
		System.out.println(members);
		return "memberList";
	}

	// 编辑会员信息
	@Action("admin_editMember")
	public String editMember() {
		int id = member.getId();
		member = (Member) memberService.getData(id);
		return "editMember";
	}
	
	// 更新会员信息
	@Action("admin_updateMember")
	public String updateMember() {
		memberService.updateData(member);
		return "memberListPage";
	}
}
