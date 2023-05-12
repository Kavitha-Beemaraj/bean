package com.kavitha.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {

		//SpringApplication.run(BeanApplication.class, args);

		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}

}
