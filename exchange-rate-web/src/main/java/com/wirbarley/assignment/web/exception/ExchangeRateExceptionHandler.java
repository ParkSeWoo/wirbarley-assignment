package com.wirbarley.assignment.web.exception;

import com.wirbarley.assignment.support.exception.ExchangeRateError;
import com.wirbarley.assignment.support.exception.ExchangeRateNotFountException;
import com.wirbarley.assignment.support.exception.enums.ResultCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;


@Slf4j
@RequiredArgsConstructor
@ControllerAdvice
public class ExchangeRateExceptionHandler {

	/**
	 * coustom....
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(ExchangeRateNotFountException.class)
	public ResponseEntity<ExchangeRateError> customHandleNotFound(ExchangeRateNotFountException ex, WebRequest request) {
		ExchangeRateError errors = ExchangeRateError
									.builder()
									.timestamp(LocalDateTime.now())
									.error (ex.getMessage())
									.status(HttpStatus.NOT_FOUND.value())
									.code (ResultCode.FAIL.getCode()).build();

		return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);

	}

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(BindException.class)
	public final ResponseEntity<?> handleBindException(BindException ex, WebRequest request) {
		ExchangeRateError errors =  ExchangeRateError
									.builder()
									.timestamp(LocalDateTime.now())
									.error (ex.getBindingResult().getAllErrors().get(0).getDefaultMessage())
									.status(HttpStatus.BAD_REQUEST.value())
									.code (ResultCode.FAIL.getCode()).build();

		return new ResponseEntity<> (errors, HttpStatus.BAD_REQUEST);
	}

	//전체
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({Exception.class, RuntimeException.class})
	public ResponseEntity<?> ExchangeRateException(Exception ex, WebRequest request) {
		ExchangeRateError errors = ExchangeRateError
									.builder()
									.timestamp(LocalDateTime.now())
									.error (ex.getMessage())
									.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
									.code (ResultCode.FAIL.getCode()).build();

		return new ResponseEntity<> (errors, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
