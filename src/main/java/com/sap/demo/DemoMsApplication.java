package com.sap.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class DemoMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMsApplication.class, args);
	}

	@Bean
	@Qualifier("name")
	@Profile("local")
	public String localName() {
		return "LOCAL";
	}

	@Bean
	@Qualifier("name")
	@Profile("dev")
	public String devName() {
		return "DEV";
	}

}
