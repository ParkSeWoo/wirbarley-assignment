package com.wirbarley.assignment.web.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
public class ExchangeRateError {
	private ZonedDateTime timestamp;
	private String message;
	private HttpStatus status;
	private String result;
}
