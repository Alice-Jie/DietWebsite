package com.ssh.service;

import com.ssh.entity.Member;

/**TODO
 * @author：Alice
 * @date: 2018年5月12日
 * @version 0.0.1
 * @description：继承BaseService接口
 */
public interface MemberService extends BaseService {
	
	/** 账户匹配 */
	public Member matchAccount(String account, String pwd);
}