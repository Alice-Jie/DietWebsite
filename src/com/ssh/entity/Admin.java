package com.ssh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**TODO
 * @author：Alice
 * @date: 2018年5月15日
 * @version 0.0.1
 * @description：在Hibernate层建立映射关系
 */
@Entity
@Table(name = "Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AdminID")
	private int id;          // 管理员ID
	@Column(name = "AdminAccount")
	private String account;  // 管理员账号
	@Column(name = "AdminPwd")
	private String pwd;      // 管理员密码
	
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
	
	/**
	 * 打印属性
	 * @return 属性列表
	 */
	@Override
	public String toString() {
		String console = 
				"\n————————————————————————\n"
				+ "Admin: \n"
				+ "id: "          + id          + "\n"
				+ "account: "     + account     + "\n"
				+ "password: "    + pwd         + "\n"
				+ "————————————————————————\n"
				;
		return console;
	}
}
