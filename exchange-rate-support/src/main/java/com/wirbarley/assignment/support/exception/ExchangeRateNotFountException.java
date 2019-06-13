package com.wirbarley.assignment.support.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 추후 업무에 맞게 커스텀 Exception 만들어서 진행 하면 될거 같지만..
 * 여기선 일단 샘플용..
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND )
public class ExchangeRateNotFountException extends RuntimeException {

	public ExchangeRateNotFountException() {
		super();
	}

	public ExchangeRateNotFountException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExchangeRateNotFountException(String message) {
		super(message);
	}

	public ExchangeRateNotFountException(Throwable cause) {
		super(cause);
	}


}
