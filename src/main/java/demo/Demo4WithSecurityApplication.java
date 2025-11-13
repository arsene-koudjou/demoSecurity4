package demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Demo4WithSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4WithSecurityApplication.class, args);
		log.info("** Application spring 4 with security started **");

	}

}
