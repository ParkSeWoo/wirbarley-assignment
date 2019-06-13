package com.wirbarley.assignment.support.domain.exchange;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private String timestamp;
	private String source;
	private Map<String, BigDecimal> quotes;
	//실패시 응답받기용
	private Map<String, String> error;
}
