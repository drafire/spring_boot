package com.drafire.spring_boot;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc    //这个注解用于开启swagger-ui
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
