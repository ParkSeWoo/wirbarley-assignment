package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.DefaultDto;
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
public class ExchangeRateResponseDto implements DefaultDto {
	private boolean success;
	private String timestamp;
	private String source;
	private Map<String, BigDecimal> quotes;
}
