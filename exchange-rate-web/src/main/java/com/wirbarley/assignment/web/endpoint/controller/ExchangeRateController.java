package com.wirbarley.assignment.web.endpoint.controller;

import com.wirbarley.assignment.support.domain.exchange.CalculationDto;
import com.wirbarley.assignment.web.endpoint.service.ExchangeRateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/exchange-rate")
public class ExchangeRateController
{
	private final ExchangeRateService exchangeRateService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("/currency")
	public ResponseEntity<?> reqExchangeRate(@RequestParam String currency) {
		return ResponseEntity.ok(
				exchangeRateService.exchangeRateApiService(currency));
	}


	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@RequestMapping("/currency/calculation")
	public ResponseEntity<?> reqAmountReceived(@Valid @ModelAttribute CalculationDto calu) {
		return ResponseEntity.ok(
				exchangeRateService.amountReceivedApiService(calu));
	}

}
