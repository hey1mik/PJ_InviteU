package com.sample.invite;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("let's inspect the beans provided by Spring Boot");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

}
