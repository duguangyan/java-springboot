package com.dgy.dgy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.dgy.dgy.dao")
@SpringBootApplication
public class DgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgyApplication.class, args);
	}
}
