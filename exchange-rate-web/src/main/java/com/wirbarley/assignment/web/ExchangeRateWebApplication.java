package com.wirbarley.assignment.web;

import com.wirbarley.assignment.support.config.RestTemplateConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



@SpringBootApplication
@EnableConfigurationProperties(value = RestTemplateConfig.class)
public class ExchangeRateWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExchangeRateWebApplication.class, args);
	}
}
