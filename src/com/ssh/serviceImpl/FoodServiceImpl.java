package com.ssh.serviceImpl;

import org.springframework.stereotype.Service;

import com.ssh.service.FoodService;

/**TODO
 * @author：Alice
 * @date: 2018年5月21日
 * @version 0.0.2
 * @description：继承BaseServiceImpl
 */
@Service
public class FoodServiceImpl extends BaseServiceImpl implements FoodService {
	public FoodServiceImpl() {
		// 设置实体类
		setClass();
	}
}
