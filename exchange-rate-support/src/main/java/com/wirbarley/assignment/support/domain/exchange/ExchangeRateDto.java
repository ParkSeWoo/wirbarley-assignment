package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.AbstractDto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExchangeRateDto implements AbstractDto {
	private String id;
}
