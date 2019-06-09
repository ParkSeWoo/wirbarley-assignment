package com.wirbarley.assignment.web.endpoint.controller;

import com.wirbarley.assignment.web.endpoint.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
public class ExchangeRateController
{
	private final ExchangeRateService exchangeRateService;

	public String exchangeRate() {
		return exchangeRateService.exchangeRateApiService();
	}
}
