package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the user_type database table.
 * 
 */
@Entity
@Table(name="user_type")
@NamedQuery(name="UserType.findAll", query="SELECT u FROM UserType u")
public class UserType implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String pName;
	private Set<UserPermission> userPermissions;
	private Set<User> users;

	public UserType() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="P_NAME")
	public String getPName() {
		return this.pName;
	}

	public void setPName(String pName) {
		this.pName = pName;
	}


	//bi-directional many-to-many association to UserPermission
	@ManyToMany(mappedBy="userTypes")
	public Set<UserPermission> getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(Set<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}


	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="userType")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setUserType(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUserType(null);

		return user;
	}

}