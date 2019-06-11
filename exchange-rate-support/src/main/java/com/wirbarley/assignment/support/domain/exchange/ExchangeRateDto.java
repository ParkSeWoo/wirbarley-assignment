package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.AbstractDto;
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
public class ExchangeRateDto implements AbstractDto {
	private String timestamp;
	private String source;
	private Map<String, BigDecimal> quotes;
}
