package com.practice.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.models.HelloWorldBean;

@RestController
public class HomeController {

	@Autowired
	private MessageSource messageSource;

	@Value("${spring.profiles.active}")
	private String environment;

	@Value("${msg}")
	private String msg;

	@GetMapping("/")
	public String home() {
		return msg;
	}

	@GetMapping("/hello-world")
	public HelloWorldBean helloWorld() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping("/hello-world/path-variabe/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}

	@GetMapping("/hello")
	public String helloWorldInternationalization() {
		return messageSource.getMessage("good.morning.messages", null, LocaleContextHolder.getLocale());

	}

}
