package com.drafire.spring_boot;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableSwagger2Doc    //这个注解用于开启swagger-ui
@EnableAsync          //支持异步执行
@EnableScheduling     //支持定时任务
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
