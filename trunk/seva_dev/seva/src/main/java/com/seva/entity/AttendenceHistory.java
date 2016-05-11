package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the attendence_history database table.
 * 
 */
@Entity
@Table(name="attendence_history")
@NamedQuery(name="AttendenceHistory.findAll", query="SELECT a FROM AttendenceHistory a")
public class AttendenceHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private short clockInHour;
	private Date clockInTime;
	private short clockOutHour;
	private Date clockOutTime;
	private byte clockedOut;
	private Terminal terminal;
	private User user;
	private Shift shift;

	public AttendenceHistory() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="CLOCK_IN_HOUR")
	public short getClockInHour() {
		return this.clockInHour;
	}

	public void setClockInHour(short clockInHour) {
		this.clockInHour = clockInHour;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CLOCK_IN_TIME")
	public Date getClockInTime() {
		return this.clockInTime;
	}

	public void setClockInTime(Date clockInTime) {
		this.clockInTime = clockInTime;
	}


	@Column(name="CLOCK_OUT_HOUR")
	public short getClockOutHour() {
		return this.clockOutHour;
	}

	public void setClockOutHour(short clockOutHour) {
		this.clockOutHour = clockOutHour;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CLOCK_OUT_TIME")
	public Date getClockOutTime() {
		return this.clockOutTime;
	}

	public void setClockOutTime(Date clockOutTime) {
		this.clockOutTime = clockOutTime;
	}


	@Column(name="CLOCKED_OUT")
	public byte getClockedOut() {
		return this.clockedOut;
	}

	public void setClockedOut(byte clockedOut) {
		this.clockedOut = clockedOut;
	}


	//bi-directional many-to-one association to Terminal
	@ManyToOne
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
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


	//bi-directional many-to-one association to Shift
	@ManyToOne
	public Shift getShift() {
		return this.shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

}