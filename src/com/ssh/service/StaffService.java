package com.ssh.service;

import com.ssh.entity.Staff;

/**TODO
 * @author：Alice
 * @date: 2018年5月24日
 * @version 0.0.2
 * @description：继承BaseService接口
 */
public interface StaffService extends BaseService {

	/** 账户匹配 */
	public Staff matchAccount(String account, String pwd);
	
}
