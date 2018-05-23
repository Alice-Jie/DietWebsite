package com.ssh.service;

import com.ssh.entity.Member;

/**TODO
 * @author：Alice
 * @date: 2018年5月23日
 * @version 0.0.3
 * @description：继承BaseService接口
 */
public interface MemberService extends BaseService {
	
	/** 账户匹配 */
	public Member matchAccount(String account, String pwd);
	
	/** 是否存在账户 */
	public boolean isAccount(String account);
	
}