package com.wirbarley.assignment.support.util;

import com.wirbarley.assignment.support.property.ExchangeRateConstants;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class UrlUtil {

	/**
	 * @param exchangeRateConstants
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConstants exchangeRateConstants) {
		Stream<String> appendUrl = Arrays.asList (exchangeRateConstants.getApiUrl ()
				, "?access_key="
				, exchangeRateConstants.getKey ()).stream ();
		return appendUrl.collect (Collectors.joining ());
	}

	/**
	 * @param exchangeRateConstants
	 * @param currency
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConstants exchangeRateConstants, String currency) {
		Stream<String> appendUrl =
				Arrays.asList (exchangeRateConstants.getApiUrl ()
						, "?access_key="
						, exchangeRateConstants.getKey ()
						, "&currencies="
						, currency).stream ();
		return appendUrl.collect (Collectors.joining ());
	}

}
