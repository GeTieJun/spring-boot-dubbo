package com.tiejun.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiejun.dubbo.service.DubboClientService;

@RestController
public class UserController {

	@Autowired
	private DubboClientService clientService;
	
	@RequestMapping("")
	public Object saveUser() {
		return clientService.saveUser();
	}
}
