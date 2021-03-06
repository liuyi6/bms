package com.luis.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: Main
 * @Description: 项目入口
 * @author luis
 * @date 2019年5月18日
 */
@ImportResource("classpath:spring-aop.xml")
@SpringBootApplication
@MapperScan("com.luis.bms.resource.mapper")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		System.out.println("bms-web启动完成");
	}
}
