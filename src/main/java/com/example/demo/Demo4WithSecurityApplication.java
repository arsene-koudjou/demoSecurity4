package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Demo4WithSecurityApplication {

	private static final Logger log = LoggerFactory.getLogger(Demo4WithSecurityApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo4WithSecurityApplication.class, args);
		log.info("** Application spring 4 with security started **");

	}

}
