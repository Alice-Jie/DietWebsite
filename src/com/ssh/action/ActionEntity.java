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

	protected Member member;         // 会员信息
	protected List<Member> members;  // 会员列表
	
	protected Food food;             // 菜品信息
	protected List<Food> foods;      // 菜品列表
	
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

}
