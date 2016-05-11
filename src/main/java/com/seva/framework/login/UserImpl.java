package com.seva.framework.login;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


public class UserImpl extends User {


	public UserImpl(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				accountNonLocked, authorities);
		this.id = "";
		this.displayName ="";
		this.email ="";
		this.firstName = "";
		this.isActive = 1;
		this.isDelete = 1;
		this.phone = "";
	}
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String displayName;
	private String email;
	private String firstName;
	private short isActive;
	private short isDelete;
	private String phone;

   
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public short getIsActive() {
		return isActive;
	}


	public void setIsActive(short isActive) {
		this.isActive = isActive;
	}


	public short getIsDelete() {
		return isDelete;
	}


	public void setIsDelete(short isDelete) {
		this.isDelete = isDelete;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
