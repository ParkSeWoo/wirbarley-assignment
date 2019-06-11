package com.wirbarley.assignment.support.property;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "exchange-rate")
@Getter
@ToString
public class ExchangeRateConfiguration {
	private String apiProtocol = "http://";
	private String apiUrl = "www.apilayer.net/api/live";
	private String key = "747b12b63088e23604e0bbfc13b58b6a";
}
