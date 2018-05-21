package com.ssh.serviceImpl;

import org.springframework.stereotype.Service;

import com.ssh.service.MemberService;

/**TODO
 * @author：Alice
 * @date: 2018年5月21日
 * @version 0.0.2
 * @description：继承BaseServiceImpl
 */
@Service
public class MemberServiceImpl extends BaseServiceImpl implements MemberService {
	public MemberServiceImpl() {
		// 设置实体类
		setClass();
	}
}
