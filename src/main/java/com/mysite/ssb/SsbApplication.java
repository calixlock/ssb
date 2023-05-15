package com.mysite.ssb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SsbApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081"); // 멀티 포트 설정
		SpringApplication.run(SsbApplication.class, args);
	}

}
