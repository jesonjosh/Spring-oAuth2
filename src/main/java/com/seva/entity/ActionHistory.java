package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the action_history database table.
 * 
 */
@Entity
@Table(name="action_history")
@NamedQuery(name="ActionHistory.findAll", query="SELECT a FROM ActionHistory a")
public class ActionHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String actionName;
	private Date actionTime;
	private String description;
	private User user;

	public ActionHistory() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ACTION_NAME")
	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ACTION_TIME")
	public Date getActionTime() {
		return this.actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}