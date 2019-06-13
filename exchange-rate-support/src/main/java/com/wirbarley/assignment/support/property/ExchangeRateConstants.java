package com.wirbarley.assignment.support.property;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Getter
@Setter
public class ExchangeRateConstants {

	@Value ("${exchange-rate.key-access}")
	private String key;
	@Value ("${exchange-rate.api-url}")
	private String apiUrl;

}
