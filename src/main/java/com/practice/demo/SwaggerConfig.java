package com.practice.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/v2/api-docs
//http://localhost:8080/swagger-ui.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	  public static final Contact DEFAULT_CONTACT = new Contact(
			  "Anik Saha", 
			  "https://www.facebook.com",
			  "anik_saha_001@yahoo.com");
	  public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
			  "Awesome Api Title",
			  "Awesome Api Documentation",
			  "1.0",
			  "urn:tos",
	          DEFAULT_CONTACT,
	          "Apache 2.0",
	          "http://www.apache.org/licenses/LICENSE-2.0");
	  
	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/json", "application/xml"));
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES);
	}

}
