package com.seva.framework.login;

import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service("customPasswordEncoder")
public class CustomPasswordEncoder implements PasswordEncoder {

	public String encodePassword(String s, Object obj) {
//		return CryptoUtil.encrypt(s);
		return s;
	}

	public boolean isPasswordValid(String encrypted, String plainText, Object obj) {	

		boolean passwordOK = plainText.equals(encrypted);
		return passwordOK;
	}

}
