package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.AbstractDto;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CalculationDto implements AbstractDto {

	@NotNull(message = "통화정보는 필수 입니다.")
	private String currency;

	@Max(value = 10000, message = "최대 송금액은 10,000 USD 입니다.")
	@PositiveOrZero(message = "송금액(USD)가 올바르지 않습니다.")
	@NotNull(message = "송금액(USD)가 올바르지 않습니다.")
	private Long price; //10000 USD 최대 확정금액 큰금액일 경우 BigDecimal
}
