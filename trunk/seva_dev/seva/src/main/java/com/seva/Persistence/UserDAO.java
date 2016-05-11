package com.seva.Persistence;

import com.seva.models.LoginDTO;

public interface UserDAO {
	
	/**
	 * 
	 * @param loginId String
	 * @return loginVO
	 */
	LoginDTO fetchLoginCredentialsByLoginId(String loginId);
}

