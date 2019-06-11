package com.wirbarley.assignment.web.exception;

import com.wirbarley.assignment.web.exception.enums.ResultCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExchangeRateExceptionHandler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= {Exception.class})
	public ResponseEntity<?> ExchangeRateException(Exception ex, WebRequest request) {

		ExchangeRateError errorDetails = new ExchangeRateError();
		errorDetails.setTimestamp(ZonedDateTime.now(ZoneId.of("Asia/Seoul")));
		errorDetails.setMessage(ex.getMessage());
		errorDetails.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		errorDetails.setResult (ResultCode.FAIL.getMessage());

		return new ResponseEntity<> (errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value= {RuntimeException.class})
	public ResponseEntity<?> ExchangeRateRuntimeException(RuntimeException ex, WebRequest request) {

		ExchangeRateError errorDetails = new ExchangeRateError();
		errorDetails.setTimestamp(ZonedDateTime.now(ZoneId.of("Asia/Seoul")));
		errorDetails.setMessage(ex.getMessage());
		errorDetails.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		errorDetails.setResult (ResultCode.FAIL.getMessage());

		return new ResponseEntity<> (errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
