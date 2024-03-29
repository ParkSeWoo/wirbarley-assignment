package com.wirbarley.assignment.support.config;


import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties(prefix = "rest.config")
public class RestTemplateConfig {

	@Bean
	public RestTemplate restTemplate() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory ();
		factory.setReadTimeout (5000);
		factory.setConnectTimeout (3000);

		HttpClient httpClient = HttpClientBuilder.create ()
				.setMaxConnTotal (100)
				.setMaxConnPerRoute (5)
				.build ();

		factory.setHttpClient (httpClient);
		RestTemplate restTemplate = new RestTemplate (factory);

		return restTemplate;
	}
}
