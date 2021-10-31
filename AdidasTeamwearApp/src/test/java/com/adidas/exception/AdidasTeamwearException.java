package com.adidas.exception;

@SuppressWarnings("serial")
public class AdidasTeamwearException extends RuntimeException {
	public AdidasTeamwearException(String message) {
		super(message);
		System.out.println("Exception Message :" + message);
	}
}
