package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the drawer_assigned_history database table.
 * 
 */
@Entity
@Table(name="drawer_assigned_history")
@NamedQuery(name="DrawerAssignedHistory.findAll", query="SELECT d FROM DrawerAssignedHistory d")
public class DrawerAssignedHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String operation;
	private Date time;
	private User user;

	public DrawerAssignedHistory() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="A_USER")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}