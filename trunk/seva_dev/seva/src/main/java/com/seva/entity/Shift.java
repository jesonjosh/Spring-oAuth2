package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the shift database table.
 * 
 */
@Entity
@NamedQuery(name="Shift.findAll", query="SELECT s FROM Shift s")
public class Shift implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date endTime;
	private String name;
	private BigInteger shiftLen;
	private Date startTime;
	private Set<AttendenceHistory> attendenceHistories;
	private Set<MenuitemShift> menuitemShifts;
	private Set<Ticket> tickets;
	private Set<User> users;

	public Shift() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_TIME")
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="SHIFT_LEN")
	public BigInteger getShiftLen() {
		return this.shiftLen;
	}

	public void setShiftLen(BigInteger shiftLen) {
		this.shiftLen = shiftLen;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_TIME")
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	//bi-directional many-to-one association to AttendenceHistory
	@OneToMany(mappedBy="shift")
	public Set<AttendenceHistory> getAttendenceHistories() {
		return this.attendenceHistories;
	}

	public void setAttendenceHistories(Set<AttendenceHistory> attendenceHistories) {
		this.attendenceHistories = attendenceHistories;
	}

	public AttendenceHistory addAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().add(attendenceHistory);
		attendenceHistory.setShift(this);

		return attendenceHistory;
	}

	public AttendenceHistory removeAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().remove(attendenceHistory);
		attendenceHistory.setShift(null);

		return attendenceHistory;
	}


	//bi-directional many-to-one association to MenuitemShift
	@OneToMany(mappedBy="shift")
	public Set<MenuitemShift> getMenuitemShifts() {
		return this.menuitemShifts;
	}

	public void setMenuitemShifts(Set<MenuitemShift> menuitemShifts) {
		this.menuitemShifts = menuitemShifts;
	}

	public MenuitemShift addMenuitemShift(MenuitemShift menuitemShift) {
		getMenuitemShifts().add(menuitemShift);
		menuitemShift.setShift(this);

		return menuitemShift;
	}

	public MenuitemShift removeMenuitemShift(MenuitemShift menuitemShift) {
		getMenuitemShifts().remove(menuitemShift);
		menuitemShift.setShift(null);

		return menuitemShift;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="shift")
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setShift(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setShift(null);

		return ticket;
	}


	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="shift")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setShift(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setShift(null);

		return user;
	}

}