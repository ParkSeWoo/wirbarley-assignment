package com.wirbarley.assignment.support.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FormatUtil {

	/**
	 * 상수 포멧 3자리마다 콤마, 실수는 2째자리 까지
	 * @param number
	 * @return
	 */
	public static String wirbarleyBigDicimalFormat(BigDecimal number) {
		return new DecimalFormat ("###,##0.00").format(number);
	}

	/**
	 * 콤마등 특수문자 변경이 필요할 경우 아래 샘플로 만듬...
	 * @param decimalFormatSymbols
	 * @param number
	 * @return
	 */
	public static String wirbarleyBigDicimalFormat(DecimalFormatSymbols decimalFormatSymbols, BigDecimal number) {
		decimalFormatSymbols.setDecimalSeparator('.');
		decimalFormatSymbols.setDecimalSeparator('@');
		return new DecimalFormat ("###,##0.00").format(number);
	}
}
