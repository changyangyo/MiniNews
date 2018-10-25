package com.pn.wechatmini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pn.wechatmini.dao")
public class WechatminiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatminiApplication.class, args);
	}
}
