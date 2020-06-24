package com.exam.nastha.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IdExceptions extends RuntimeException {
	
	public IdExceptions(String message) {
		super(message); 
	}

}
