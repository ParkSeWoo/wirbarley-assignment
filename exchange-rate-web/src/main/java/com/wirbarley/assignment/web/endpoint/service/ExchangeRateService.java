package com.wirbarley.assignment.web.endpoint.service;

import com.wirbarley.assignment.support.domain.exchange.CalculationDto;
import com.wirbarley.assignment.support.domain.exchange.ExchangeRateDto;
import com.wirbarley.assignment.support.property.ExchangeRateConfiguration;
import com.wirbarley.assignment.support.util.UrlUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExchangeRateService {
	private final RestTemplate restTemplate;
	private final ExchangeRateConfiguration exchangeRateConfiguration;

	public ExchangeRateDto exchangeRateApiService(String currency) {

		String exchangeRateApiUrl = UrlUtil.exchangeRateUrlPath(exchangeRateConfiguration, currency);
		//log.info ("URL " + exchangeRateApiUrl);
		ExchangeRateDto result = restTemplate.getForObject(exchangeRateApiUrl, ExchangeRateDto.class);

		return result;
	}

	public BigDecimal remittanceAmountApiService(CalculationDto calc) {
		return exchangeRateApiService(calc.getCurrency())
					.getQuotes()
					.get("USD"+calc.getCurrency())
					.multiply(new BigDecimal(calc.getPrice())) ;
	}
}
