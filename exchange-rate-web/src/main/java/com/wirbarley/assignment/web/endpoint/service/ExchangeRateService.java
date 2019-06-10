package com.wirbarley.assignment.web.endpoint.service;

import com.wirbarley.assignment.support.property.ExchangeRateConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExchangeRateService {
	private final RestTemplate restTemplate;
	private final ExchangeRateConfiguration exchangeRateConfiguration;
	//private final String url = "http://www.apilayer.net/api/live?access_key=747b12b63088e23604e0bbfc13b58b6a";

	public String exchangeRateApiService(String currency) {
		String url =
		exchangeRateConfiguration.getApiProtocol()+
		exchangeRateConfiguration.getApiUrl()+
		exchangeRateConfiguration.getPrivateKey();

		String result = restTemplate.getForObject(url, String.class);

		return result;
	}
}
