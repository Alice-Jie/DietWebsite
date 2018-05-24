package com.ssh.action;

import java.sql.Date;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.web.util.HtmlUtils;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.*;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月24日
 * @version 0.0.4
 * @description：继承ActionResult，专注于处理Controller
 */
public class ForeAction extends ActionResult {

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
	
	// 登录
	@Action("fore_login")
	public String foreLogin() {
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(member.getAccount());
	    member.setAccount(account);
	    Member member_session = memberService.matchAccount(member.getAccount(), member.getPwd());
	    if(null == member_session) {
	        msg= "账号或密码错误！";
	        return "login";
	    }
	    ActionContext.getContext().getSession().put("member", member_session);
	    msg= "";
	    return "homePage";
	}
	
	// 注册
	@Action("fore_register")
	public String foreRegister() {
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(member.getAccount());
	    // 判断账户是否存在
	    boolean isExist = memberService.isAccount(account);
         if(isExist) {
             msg = "用户名已经被使用,不能使用";
             return "register"; 
         }
         member.setAccount(account);
 		 Date date = new Date(new java.util.Date().getTime());
 		 member.setDate(date);
         memberService.addData(member);
         msg= "";
         return "homePage";
	}
	
	// 退出
	@Action("fore_Logout")
	public String logout() {
	    ActionContext.getContext().getSession().remove("member");
	    return "homePage"; 
	}
	
	// 员工登录
	@Action("fore_staffLogin")
	public String foreStffLogin() {
		System.out.println("fore_staffLogin");
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(staff.getAccount());
	    staff.setAccount(account);
	    Staff staff_session = staffService.matchAccount(staff.getAccount(), staff.getPwd());
	    System.out.println(staff.getPwd());
	    System.out.println(staff.getAccount());
	    System.out.println(staff_session);
	    if(null == staff_session) {
	        msg= "员工账号或密码错误！";
	        return "staffLogin";
	    }
	    ActionContext.getContext().getSession().put("staff", staff_session);
	    msg= "";
	    return "homePage";
	}
	
	// 退出
	@Action("fore_staffLogout")
	public String foreStaffLogout() {
	    ActionContext.getContext().getSession().remove("staff");
	    return "homePage"; 
	}
	
	// 管理员登录
	@Action("fore_adminLogin")
	public String foreAdminLogin() {
		// 通过HtmlUtils.htmlEscape进行转义
		String account = HtmlUtils.htmlEscape(administrator.getAccount());
		administrator.setAccount(account);
	    Admin admin_session = adminService.matchAccount(administrator.getAccount(), administrator.getPwd());
	    if(null == admin_session) {
	        msg= "管理员账号或密码错误！";
	        return "adminLogin";
	    }
	    ActionContext.getContext().getSession().put("admin", admin_session);
	    msg= "";
	    return "admin";
	}
	
	// 更新会员信息
	@Action("fore_updateMemberInfo")
	public String updateMemberInfo() {
		int id = member.getId();
		Member tempMember = (Member) memberService.getData(id);
		tempMember.setSex(member.getSex());
		tempMember.setEmail(member.getEmail());
		tempMember.setPhone(member.getPhone());;
		memberService.updateData(tempMember);
		msg = "修改信息成功！";
		return "memberInfo";
	}
	
	// 更新会员信息
	@Action("fore_updateMemberPwd")
	public String updateMemberPwd() {
		int id = member.getId();
		Member tempMember = (Member) memberService.getData(id);
		tempMember.setPwd(member.getPwd());;
		memberService.updateData(tempMember);
		msg = "修改密码成功！";
		return "memberInfo";
	}
}
