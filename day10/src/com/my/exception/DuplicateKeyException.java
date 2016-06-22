package com.my.exception;
public class DuplicateKeyException extends AddException {
	public DuplicateKeyException() {
		super();
	}

	public DuplicateKeyException(String message) {
		super(message);
	}

}
