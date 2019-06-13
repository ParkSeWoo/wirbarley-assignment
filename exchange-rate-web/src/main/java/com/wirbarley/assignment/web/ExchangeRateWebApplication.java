package com.wirbarley.assignment.web;

import com.wirbarley.assignment.support.config.RestTemplateConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableConfigurationProperties(value = {RestTemplateConfig.class})
@ComponentScan("com.wirbarley.assignment")
public class ExchangeRateWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExchangeRateWebApplication.class, args);
	}
}
