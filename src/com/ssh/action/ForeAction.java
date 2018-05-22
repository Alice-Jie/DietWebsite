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
 * @date: 2018年5月21日
 * @version 0.0.1
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
	    System.out.println(member_session);
	    if(null == member_session) {
	        msg= "账号或密码错误！";
	        return "login.jsp";
	    }
	    ActionContext.getContext().getSession().put("member", member_session);
	    // return "homePage";  // 尚未添加路由
	    return "home";
	}
	
}
