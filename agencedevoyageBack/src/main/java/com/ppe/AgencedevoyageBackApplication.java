package com.ppe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
public class AgencedevoyageBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgencedevoyageBackApplication.class, args);
	}

}
