package com.seva.framework.exception;

public abstract class ApplicationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * errorCode.
	 */
	protected String errorCode;
	
	/**
	 * Constructor.
	 * @param errorCode String
	 * @param message String
	 * @param throwable Throwable
	 */
	public ApplicationException(String errorCode, String message, Throwable throwable) {
		super(message, throwable);
		this.errorCode = errorCode;
	}
	
	/**
	 * Constructor.
	 * @param throwable Throwable
	 */
	public ApplicationException(Throwable throwable) {
		super(throwable);
	}

	/**
	 * Get errorCode.
	 * @return String
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * Set errorCode.
	 * @param errorCode String
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}