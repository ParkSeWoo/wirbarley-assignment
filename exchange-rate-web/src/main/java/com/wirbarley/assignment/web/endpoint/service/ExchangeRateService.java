package com.wirbarley.assignment.web.endpoint.service;

import com.wirbarley.assignment.support.domain.exchange.CalculationRequestDto;
import com.wirbarley.assignment.support.domain.exchange.CalculationResponseDto;
import com.wirbarley.assignment.support.domain.exchange.ExchangeRateResponseDto;
import com.wirbarley.assignment.support.property.ExchangeRateConstants;
import com.wirbarley.assignment.support.util.FormatUtil;
import com.wirbarley.assignment.support.util.UrlUtil;
import com.wirbarley.assignment.support.exception.enums.ResultCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExchangeRateService {
	private final RestTemplate restTemplate;
	private final ExchangeRateConstants exchangeRateConstants;

	public ExchangeRateResponseDto exchangeRateApiService(String currency) {
		String exchangeRateApiUrl = UrlUtil.exchangeRateUrlPath(exchangeRateConstants, currency);
		//log.info ("URL " + exchangeRateApiUrl);

		ExchangeRateResponseDto result =
				restTemplate.getForObject(exchangeRateApiUrl, ExchangeRateResponseDto.class);

		return result;
	}

	public CalculationResponseDto remittanceAmountApiService(CalculationRequestDto calc) {
		return CalculationResponseDto.builder()
				.price(
						FormatUtil.wirbarleyBigDicimalFormat (
							exchangeRateApiService(calc.getCurrency())
						   .getQuotes()
						   .get("USD"+calc.getCurrency())
						   .multiply(calc.getPrice())
						)
				)
				.success(ResultCode.SUCCESS)
				.currencyType(calc.getCurrency())
				.message("송금계산 결과")
				.build();
	}
}
