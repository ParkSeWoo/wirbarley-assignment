package com.wirbarley.assignment.support.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.wirbarley.assignment.support.exception.enums.ResultCode;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@ToString
public class ExchangeRateError {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private LocalDateTime timestamp;
	private String message;
	private int status;
	private String error;
	private int code;
}
