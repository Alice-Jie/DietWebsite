package com.ssh.action;

import java.util.List;

import com.ssh.entity.*;

/**TODO
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.3
 * @description：继承ActionPage，专注于处理实体对象以及实体对象集合的setter和getter
 */
public class ActionEntity extends ActionPage {

	protected Member member;               // 会员信息
	protected List<Member> members;        // 会员列表
	
	protected Staff staff;                 // 员工信息
	protected List<Staff> staffs;          // 员工列表
	
	protected Food food;                   // 菜品信息
	protected List<Food> foods;            // 菜品列表
	
	protected Admin administrator;         // 管理员
	protected List<Admin> administrators;  // 管路员列表
	
	protected Food moring;                 // 早餐
	protected Food noon;                   // 午餐
	protected Food evening;                // 晚餐
	
	/* setter、getter */

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}
	
	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public Admin getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Admin administrator) {
		this.administrator = administrator;
	}

	public List<Admin> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(List<Admin> administrators) {
		this.administrators = administrators;
	}

	public Food getMoring() {
		return moring;
	}

	public void setMoring(Food moring) {
		this.moring = moring;
	}

	public Food getNoon() {
		return noon;
	}

	public void setNoon(Food noon) {
		this.noon = noon;
	}

	public Food getEvening() {
		return evening;
	}

	public void setEvening(Food evening) {
		this.evening = evening;
	}
	
}
