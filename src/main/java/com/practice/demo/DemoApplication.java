package com.practice.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.practice.demo.models.MyConfigModel;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		String[] beanNames =  ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String name: beanNames) {
			System.out.println(name);
		}
		
		
	}
}
