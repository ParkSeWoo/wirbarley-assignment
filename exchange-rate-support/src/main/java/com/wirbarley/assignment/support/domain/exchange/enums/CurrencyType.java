package com.wirbarley.assignment.support.domain.exchange.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * 사용할려고 만들었으나.. 넘어오는 파라미터를 그대로 전달하면되서 내부적으로
 * 구분지을 필요를 못느껴 생략
 * 화폐종류별 분기나 구분이 필요할경우 이용..
 */
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
