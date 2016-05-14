package com.seva.framework.login;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.seva.Persistence.UserDAO;
import com.seva.models.LoginDTO;



@Service("userDetailsServiceTx")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	private UserDAO userDAO;
	
	/**
	 * To load user details.
	 */
	public UserDetails loadUserByUsername(String username) {
		System.out.println("username:-- "+username);
		
		LoginDTO loginVO = userDAO.fetchLoginCredentialsByLoginId(username);
		if (loginVO == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return populateUserEntity(loginVO);
	}
	
	/**
	 * for (SecurityRoleEntity role : userEntity.getRoles()) {
	 * authorities.add(new GrantedAuthorityImpl(role.getRoleName())); }
	 * 
	 * @param loginVO
	 * @return
	 */
	private User populateUserEntity(LoginDTO loginVO) {
		String username = loginVO.getUserId();
		String password = loginVO.getUserPassword();
		boolean enabled = true;
		boolean accountNonExpired = enabled;
		boolean credentialsNonExpired = enabled;
		boolean accountNonLocked = enabled;
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority(loginVO.getUser_authority()));
			
			User user = new UserImpl(username, password, enabled,
					accountNonExpired, credentialsNonExpired, accountNonLocked,
					authorities);
			return user;
	}

}
