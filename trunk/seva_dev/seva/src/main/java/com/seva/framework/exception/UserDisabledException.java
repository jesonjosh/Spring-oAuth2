package com.seva.framework.exception;

import org.springframework.security.core.AuthenticationException;

public class UserDisabledException extends AuthenticationException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Constructs a <code>UserInactiveException</code> with the specified
     * message.
     *
     * @param msg the detail message.
     */
    public UserDisabledException(String msg) {
        super(msg);
    }

    /**
     * Constructs a <code>UserInactiveException</code>, making use of the <tt>extraInformation</tt>
     * property of the superclass.
     *
     * @param msg the detail message
     * @param info Object
     * extraInformation additional information such as the username.
     */
    public UserDisabledException(String msg, Object info) {
        super(msg, info);
    }

    /**
     * Constructs a <code>UserInactiveException</code> with the specified
     * message and root cause.
     *
     * @param msg the detail message.
     * @param t root cause
     */
    public UserDisabledException(String msg, Throwable t) {
        super(msg, t);
    }
}