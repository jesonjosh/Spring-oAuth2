package com.seva.framework.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
public class UserSessionUtil {
	
	private static final String DEFAULT_USER = "SYSTEM";
	
	/**
	 * 
	 */
	private UserSessionUtil() {
	}

	/**
	 * 
	 * @return
	 */
	public static UserImpl getLoggedInUser() {
		UserImpl user = (UserImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return user;
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getLoggedInUserName() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String userName = DEFAULT_USER;
		if (authentication != null) {
			Object principal = authentication.getPrincipal();
			if(principal != null) {
				if (principal instanceof UserImpl) {
					userName = ((UserImpl) principal).getUsername();
				} else {
					userName = principal.toString();
				}
			}

		}
		return userName;
		
	}

}
