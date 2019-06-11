package com.wirbarley.assignment.web.exception.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ResultCode {
	SUCCESS(0, "seccess"),
	FAIL(-1,"failed");

	int code;
	String message;

	ResultCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
