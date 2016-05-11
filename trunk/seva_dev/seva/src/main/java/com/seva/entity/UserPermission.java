package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the user_permission database table.
 * 
 */
@Entity
@Table(name="user_permission")
@NamedQuery(name="UserPermission.findAll", query="SELECT u FROM UserPermission u")
public class UserPermission implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Set<UserType> userTypes;

	public UserPermission() {
	}


	@Id
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-many association to UserType
	@ManyToMany
	@JoinTable(
		name="user_user_permission"
		, joinColumns={
			@JoinColumn(name="elt")
			}
		, inverseJoinColumns={
			@JoinColumn(name="permissionId")
			}
		)
	public Set<UserType> getUserTypes() {
		return this.userTypes;
	}

	public void setUserTypes(Set<UserType> userTypes) {
		this.userTypes = userTypes;
	}

}