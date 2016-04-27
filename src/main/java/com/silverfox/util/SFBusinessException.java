package com.silverfox.util;

public class SFBusinessException extends RuntimeException {

	private static final long serialVersionUID = -4799192768155713633L;

	public  SFBusinessException(String msg){
		super(msg);
	}
	
	public  SFBusinessException(String msg, Throwable cause){
		super(msg, cause);
	}
}
