package com.code.hibernateCrud.exception;

public class APIException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public APIException(String message) {
		super(message);
	}
}
