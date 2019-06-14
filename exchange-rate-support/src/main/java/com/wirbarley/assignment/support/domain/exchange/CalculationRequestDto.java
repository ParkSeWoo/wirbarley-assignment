package com.wirbarley.assignment.support.domain.exchange;

import com.wirbarley.assignment.support.domain.DefaultDto;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CalculationRequestDto implements DefaultDto {

	@NotNull(message = "통화정보는 필수 입니다.")
	private String currency;
	@Max(value = 10000, message = "최대 송금액은 10,000 USD 입니다.")
	@Min(value = 1, message = "최소 송금액은 1 USD 입니다.")
	@NotNull(message = "송금액은 필수 입니다.")
	private BigDecimal price; //10000 USD 최대 확정금액 큰금액일 경우 BigDecimal
}
