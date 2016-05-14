package com.seva.framework.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

public class PrintStackTrace {
	/**
	 * 
	 * @param e
	 * @return ""
	 */
	public static String getStackTrace(Exception e) {
		StringWriter stringWriter = new StringWriter();
		PrintWriter printWriter = new PrintWriter(stringWriter);
		e.printStackTrace(printWriter);
		return stringWriter.toString();
	}
}
