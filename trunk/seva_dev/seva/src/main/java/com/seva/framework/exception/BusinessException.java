package com.seva.framework.exception;

public class BusinessException extends  ApplicationException {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 * @param message String
	 * @param errorCode String 
	 */
	public BusinessException(String message, String errorCode) {
		super(errorCode, message, null);
	}

	/**
	 * Constructor.
	 * @param throwable Throwable
	 * @param errorCode String
	 */
	public BusinessException(Throwable throwable, String errorCode) {
		super(errorCode, null, throwable);
	}

	/**
	 * Constructor.
	 * @param message String
	 * @param throwable Throwable
	 * @param errorCode String
	 */
	public BusinessException(String message, Throwable throwable, String errorCode) {
		super(errorCode, message, throwable);
	}
	
	/**
	 * Constructor.
	 * @param throwable Throwable
	 */
	public BusinessException(Throwable throwable) {
		super(throwable);
	}
}
