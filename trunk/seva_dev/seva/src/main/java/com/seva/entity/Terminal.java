package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the terminal database table.
 * 
 */
@Entity
@NamedQuery(name="Terminal.findAll", query="SELECT t FROM Terminal t")
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double currentBalance;
	private byte hasCashDrawer;
	private String name;
	private double openingBalance;
	private Set<AttendenceHistory> attendenceHistories;
	private Set<DrawerPullReport> drawerPullReports;
	private Set<Gratuity> gratuities;
	private Set<MenuItem> menuItems;
	private User user;
	private Set<TerminalPrinter> terminalPrinters;
	private Set<Ticket> tickets;
	private Set<Transaction> transactions;
	private Set<User> users;

	public Terminal() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="CURRENT_BALANCE")
	public double getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}


	@Column(name="HAS_CASH_DRAWER")
	public byte getHasCashDrawer() {
		return this.hasCashDrawer;
	}

	public void setHasCashDrawer(byte hasCashDrawer) {
		this.hasCashDrawer = hasCashDrawer;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="OPENING_BALANCE")
	public double getOpeningBalance() {
		return this.openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}


	//bi-directional many-to-one association to AttendenceHistory
	@OneToMany(mappedBy="terminal")
	public Set<AttendenceHistory> getAttendenceHistories() {
		return this.attendenceHistories;
	}

	public void setAttendenceHistories(Set<AttendenceHistory> attendenceHistories) {
		this.attendenceHistories = attendenceHistories;
	}

	public AttendenceHistory addAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().add(attendenceHistory);
		attendenceHistory.setTerminal(this);

		return attendenceHistory;
	}

	public AttendenceHistory removeAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().remove(attendenceHistory);
		attendenceHistory.setTerminal(null);

		return attendenceHistory;
	}


	//bi-directional many-to-one association to DrawerPullReport
	@OneToMany(mappedBy="terminal")
	public Set<DrawerPullReport> getDrawerPullReports() {
		return this.drawerPullReports;
	}

	public void setDrawerPullReports(Set<DrawerPullReport> drawerPullReports) {
		this.drawerPullReports = drawerPullReports;
	}

	public DrawerPullReport addDrawerPullReport(DrawerPullReport drawerPullReport) {
		getDrawerPullReports().add(drawerPullReport);
		drawerPullReport.setTerminal(this);

		return drawerPullReport;
	}

	public DrawerPullReport removeDrawerPullReport(DrawerPullReport drawerPullReport) {
		getDrawerPullReports().remove(drawerPullReport);
		drawerPullReport.setTerminal(null);

		return drawerPullReport;
	}


	//bi-directional many-to-one association to Gratuity
	@OneToMany(mappedBy="terminal")
	public Set<Gratuity> getGratuities() {
		return this.gratuities;
	}

	public void setGratuities(Set<Gratuity> gratuities) {
		this.gratuities = gratuities;
	}

	public Gratuity addGratuity(Gratuity gratuity) {
		getGratuities().add(gratuity);
		gratuity.setTerminal(this);

		return gratuity;
	}

	public Gratuity removeGratuity(Gratuity gratuity) {
		getGratuities().remove(gratuity);
		gratuity.setTerminal(null);

		return gratuity;
	}


	//bi-directional many-to-many association to MenuItem
	@ManyToMany(mappedBy="terminals")
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="ASSIGNED_USER")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	//bi-directional many-to-one association to TerminalPrinter
	@OneToMany(mappedBy="terminal")
	public Set<TerminalPrinter> getTerminalPrinters() {
		return this.terminalPrinters;
	}

	public void setTerminalPrinters(Set<TerminalPrinter> terminalPrinters) {
		this.terminalPrinters = terminalPrinters;
	}

	public TerminalPrinter addTerminalPrinter(TerminalPrinter terminalPrinter) {
		getTerminalPrinters().add(terminalPrinter);
		terminalPrinter.setTerminal(this);

		return terminalPrinter;
	}

	public TerminalPrinter removeTerminalPrinter(TerminalPrinter terminalPrinter) {
		getTerminalPrinters().remove(terminalPrinter);
		terminalPrinter.setTerminal(null);

		return terminalPrinter;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="terminal")
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setTerminal(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setTerminal(null);

		return ticket;
	}


	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="terminal")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setTerminal(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setTerminal(null);

		return transaction;
	}


	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="terminal")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setTerminal(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setTerminal(null);

		return user;
	}

}