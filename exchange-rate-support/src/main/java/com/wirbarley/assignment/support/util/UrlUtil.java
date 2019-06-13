package com.wirbarley.assignment.support.util;

import com.wirbarley.assignment.support.property.ExchangeRateConfiguration;

public class UrlUtil {

	/**
	 *
	 * @param exchangeRateConfiguration
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConfiguration exchangeRateConfiguration) {
		String apiUrl =
				exchangeRateConfiguration.getApiProtocol()+
						exchangeRateConfiguration.getApiUrl()+"?access_key="+
						exchangeRateConfiguration.getKey();
		return apiUrl;
	}

	/**
	 *
	 * @param exchangeRateConfiguration
	 * @param currency
	 * @return
	 */
	public static String exchangeRateUrlPath(ExchangeRateConfiguration exchangeRateConfiguration, String currency) {
		String apiUrl =
				exchangeRateConfiguration.getApiProtocol()+
						exchangeRateConfiguration.getApiUrl()+"?access_key="+
						exchangeRateConfiguration.getKey()+"&currencies="+currency;
		return apiUrl;
	}

}
