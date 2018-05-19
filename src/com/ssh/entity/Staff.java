package com.ssh.entity;

import java.util.Date;

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
@Table(name = "Staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "StaffID")
	private int id;           // 员工ID
	@Column(name = "StaffAccount")
	private String account;   // 员工账号
	@Column(name = "StaffPwd")
	private String pwd;       // 员工密码
	@Column(name = "StaffName")
	private String name;      // 员工姓名
	@Column(name = "StaffSex")
	private String sex;       // 员工性别
	@Column(name = "StaffEmail")
	private String Email;     // 员工邮箱
	@Column(name = "StaffPhone")
	private String phone;     // 员工电话
	@Column(name = "StaffDate")
	private Date date;        // 注册日期
	
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
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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
				"\n————————————————————————\n"
				+ "Staff: \n"
				+ "id: "          + id               + "\n"
				+ "account: "     + account          + "\n"
				+ "password: "    + pwd              + "\n"
				+ "name: "        + name             + "\n"
				+ "sex: "         + sex              + "\n"
				+ "Email: "       + Email            + "\n"
				+ "phone: "       + phone            + "\n"
				+ "date: "        + date.toString()  + "\n"
				+ "————————————————————————\n"
				;
		return console;
	}
}
