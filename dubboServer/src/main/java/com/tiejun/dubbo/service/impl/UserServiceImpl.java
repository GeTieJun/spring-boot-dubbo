package com.tiejun.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tiejun.dubbo.domain.User;
import com.tiejun.dubbo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User saveUser(User user) {
		user.setId(101);
		user.setAddress("陕西省西安市高新区");
		return user;
	}


}
