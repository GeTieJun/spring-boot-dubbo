package com.tiejun.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages={"com.tiejun.dubboClient.service.*"})
@SpringBootApplication
public class DubboClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboClientApplication.class, args);
	}

}

