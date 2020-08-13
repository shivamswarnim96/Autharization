package com.amdocs.media.controller;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class AuthorizarionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthorizarionException(String message) {
		super(message);
	}
	
	

}
