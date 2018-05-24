package com.ssh.service;

import com.ssh.entity.Admin;

/**TODO
 * @author：Alice
 * @date: 2018年5月24日
 * @version 0.0.2
 * @description：继承BaseService接口
 */
public interface AdminService extends BaseService {
	
	/** 账户匹配 */
	public Admin matchAccount(String account, String pwd);
	
}