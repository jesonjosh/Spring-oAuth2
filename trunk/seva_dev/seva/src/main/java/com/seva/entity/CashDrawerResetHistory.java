package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cash_drawer_reset_history database table.
 * 
 */
@Entity
@Table(name="cash_drawer_reset_history")
@NamedQuery(name="CashDrawerResetHistory.findAll", query="SELECT c FROM CashDrawerResetHistory c")
public class CashDrawerResetHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date resetTime;
	private User user;

	public CashDrawerResetHistory() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RESET_TIME")
	public Date getResetTime() {
		return this.resetTime;
	}

	public void setResetTime(Date resetTime) {
		this.resetTime = resetTime;
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