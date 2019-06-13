package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.DefaultDto;
import com.wirbarley.assignment.support.domain.exchange.enums.CurrencyType;
import com.wirbarley.assignment.support.exception.enums.ResultCode;
import lombok.*;

import java.math.BigDecimal;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CalculationResponseDto implements DefaultDto {
	private ResultCode success;
	private String message;
	private BigDecimal price;
	private String currencyType;
}
