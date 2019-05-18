package com.luis.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.luis.bms.system.dao")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
