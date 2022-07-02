package com.example.bulletin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.bulletin")
public class BulletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulletinApplication.class, args);
	}

}
