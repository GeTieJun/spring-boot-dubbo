package com.tiejun.dubbo.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tiejun.dubbo.domain.User;

@Component
public class DubboClientService {

	// 设置超时时间
	@Reference(timeout=3000)
	UserService userService;
	
	/**
	 * 保存用户操作(在客户端只设置用户的名称和年龄)
	 * @return
	 */
	public User saveUser() {
		User user = new User();
		user.setUserName("XiaoMing");
		user.setAge(18);
		return userService.saveUser(user);
	}
}
