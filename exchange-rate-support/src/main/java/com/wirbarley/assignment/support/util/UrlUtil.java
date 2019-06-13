package com.wirbarley.assignment.support.util;

import com.wirbarley.assignment.support.property.ExchangeRateConstants;

public class UrlUtil {

	/**
	 *
	 * @param exchangeRateConstants
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConstants exchangeRateConstants) {
		String apiUrl = exchangeRateConstants.getApiUrl()+"?access_key="+
						exchangeRateConstants.getKey();
		return apiUrl;
	}

	/**
	 *
	 * @param exchangeRateConstants
	 * @param currency
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConstants exchangeRateConstants, String currency) {
		String apiUrl = exchangeRateConstants.getApiUrl()+"?access_key="+
						exchangeRateConstants.getKey()+"&currencies="+currency;
		return apiUrl;
	}

}
