package com.wirbarley.assignment.web.config;

import com.wirbarley.assignment.support.config.WebMvcConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import ({WebMvcConfiguration.class})
public class ExchangeRateConfiguration {

}
