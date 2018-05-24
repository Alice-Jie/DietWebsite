package com.ssh.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ssh.entity.Staff;
import com.ssh.service.StaffService;

/**TODO
 * @author：Alice
 * @date: 2018年5月24日
 * @version 0.0.3
 * @description：继承BaseServiceImpl
 */
@Service
public class StaffServiceImpl extends BaseServiceImpl implements StaffService {
	
	public StaffServiceImpl() {
		// 设置实体类
		setClass();
	}
	
	/**
	 *  账户匹配
	 *  
	 *  @return 成功返回匹配信息，失败返回null
	 */
	@Override
	public Staff matchAccount(String account, String pwd) {
		List<Staff> list = getDataList("account", account, "pwd", pwd);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
	
}