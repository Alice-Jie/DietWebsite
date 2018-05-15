package com.ssh.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO
 * 
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：在Hibernate层建立映射关系
 */
@Entity
@Table(name = "member")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MemberID")
	private int id;         // 会员ID
	@Column(name = "MemberAccount")
	private String account; // 会员账号
	@Column(name = "MemberPwd")
	private String pwd;     // 会员密码
	@Column(name = "MemberName")
	private String name;    // 会员姓名
	@Column(name = "MemberSex")
	private String sex;     // 会员性别
	@Column(name = "MemberEmail")
	private String email;   // 会员电子邮箱
	@Column(name = "MemberPhone")
	private String phone;   // 会员电话
	@Column(name = "MemberDate")
	private Date date;    // 注册日期
	
	/* setter、getter */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * 打印属性
	 * @return 属性列表
	 */
	@Override
	public String toString() {
		String console = 
				"————————————————————————\n"
				+ "Member: \n"
				+ "id: "          + id               + "\n"
				+ "account: "     + account          + "\n"
				+ "password: "    + pwd              + "\n"
				+ "name: "        + name             + "\n"
				+ "sex: "         + sex              + "\n"
				+ "Email: "       + email            + "\n"
				+ "phone: "       + phone            + "\n"
				+ "date: "        + date.toString()  + "\n"
				+ "————————————————————————\n"
				;
		return console;
	}
}
