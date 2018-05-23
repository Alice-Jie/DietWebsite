package com.ssh.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssh.entity.Member;
import com.ssh.service.MemberService;

/**TODO
 * @author：Alice
 * @date: 2018年5月23日
 * @version 0.0.3
 * @description：继承BaseServiceImpl
 */
@Service
public class MemberServiceImpl extends BaseServiceImpl implements MemberService {
	
	public MemberServiceImpl() {
		// 设置实体类
		setClass();
	}
	
	/**
	 *  账户匹配
	 *  
	 *  @return 成功返回匹配信息，失败返回null
	 */
	@Override
	public Member matchAccount(String account, String pwd) {
		List<Member> list = getDataList("account", account, "pwd", pwd);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
	/** 
	 * 是否存在账户
	 * 
	 * @return 存在返回true，不存在返回false
	 */
	@Override
	public boolean isAccount(String account) {
		List list = getDataList("account", account);
        if(!list.isEmpty()) {
            return true;
        }
        return false;
	}
}
