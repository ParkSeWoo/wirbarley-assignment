package com.wirbarley.assignment.support.property;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.NotNull;

@Configuration
@ConfigurationProperties(prefix = "exchange-rate.config")
@Getter
//@Builder
@ToString
public class ExchangeRateConfiguration {
	private String apiProtocol = "http://";
	private String apiUrl = "www.apilayer.net/api/live";
	private String privateKey = "747b12b63088e23604e0bbfc13b58b6a";

	/*public ExchangeRateConfiguration(@NotNull ExchangeRateConfiguration exchangeRateConfiguration) {
		this.apiProtocol = exchangeRateConfiguration.getApiProtocol();
		this.Url = exchangeRateConfiguration.getUrl();
		this.privateKey = exchangeRateConfiguration.getPrivateKey();
	}*/
}
