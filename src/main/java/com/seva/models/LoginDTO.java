package com.seva.models;

import java.util.Date;
import java.util.List;

public class LoginDTO {
	private Short version;
	private String userId;
	private String userPassword;
	private String createdBy;
	private Date createdOn;
	private String updatedBy;
	private Date updatedOn;
	private String customerName;
	private String user_authority_id;
	private String user_authority;
	private List<UserPermissionDTO> userPermissions = null;
	public Short getVersion() {
		return version;
	}
	public void setVersion(Short version) {
		this.version = version;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getUser_authority() {
		return user_authority;
	}
	public void setUser_authority(String user_authority) {
		this.user_authority = user_authority;
	}
	public String getUser_authority_id() {
		return user_authority_id;
	}
	public void setUser_authority_id(String user_authority_id) {
		this.user_authority_id = user_authority_id;
	}
	public List<UserPermissionDTO> getUserPermissions() {
		return userPermissions;
	}
	public void setUserPermissions(List<UserPermissionDTO> userPermissions) {
		this.userPermissions = userPermissions;
	}

}
