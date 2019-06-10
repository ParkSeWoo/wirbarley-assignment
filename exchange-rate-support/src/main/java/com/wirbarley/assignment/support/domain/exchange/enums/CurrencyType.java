package com.wirbarley.assignment.support.domain.exchange.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CurrencyType {
	KRW("KRW"),
	JPN("JPN"),
	PHP("PHP");

	private String typeValue;

	public static CurrencyType of(String typeValue) {
		return Arrays.stream(values()).filter(x ->
				x.typeValue.equals(typeValue)).findFirst().get();
	}
}
