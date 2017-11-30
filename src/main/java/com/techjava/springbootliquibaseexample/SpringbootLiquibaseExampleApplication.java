package com.techjava.springbootliquibaseexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication (exclude = {LiquibaseAutoConfiguration.class})
public class SpringbootLiquibaseExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLiquibaseExampleApplication.class, args);
	}
}
