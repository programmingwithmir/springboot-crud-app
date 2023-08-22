package com.example.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TutorialNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TutorialNotFoundException(String message) {
		super(message);
	}

}
