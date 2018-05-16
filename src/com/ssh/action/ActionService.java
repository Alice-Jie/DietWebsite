package com.ssh.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssh.service.*;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.2
 * @description：继承ActionEntity，专注于处理Service层的注入
 */
public class ActionService extends ActionEntity {

	@Autowired
	protected MemberService memberService;  // 会员信息Service层
	
	@Autowired
	protected StaffService staffService;    // 员工信息Service层
	
	@Autowired
	protected FoodService foodService;      // 菜品信息Service层
	
	@Autowired
	protected AdminService adminService;    // 管理信息Service层
	
}