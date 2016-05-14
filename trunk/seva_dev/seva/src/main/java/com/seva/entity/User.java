package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoId;
	private byte active;
	private byte availableForDelivery;
	private byte clockedIn;
	private double costPerHour;
	private String firstName;
	private byte isDriver;
	private Date lastClockInTime;
	private String lastName;
	private String phoneNo;
	private String ssn;
	private int userId;
	private String userPass;
	private Set<ActionHistory> actionHistories;
	private Set<AttendenceHistory> attendenceHistories;
	private Set<CashDrawerResetHistory> cashDrawerResetHistories;
	private Set<DrawerAssignedHistory> drawerAssignedHistories;
	private Set<DrawerPullReport> drawerPullReports;
	private Set<Gratuity> gratuities;
	private Set<TableBookingInfo> tableBookingInfos;
	private Set<Terminal> terminals;
	private Set<Ticket> tickets1;
	private Set<Ticket> tickets2;
	private Set<Ticket> tickets3;
	private Set<Transaction> transactions;
	private Shift shift;
	private Terminal terminal;
	private UserType userType;

	public User() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AUTO_ID")
	public int getAutoId() {
		return this.autoId;
	}

	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}


	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}


	@Column(name="AVAILABLE_FOR_DELIVERY")
	public byte getAvailableForDelivery() {
		return this.availableForDelivery;
	}

	public void setAvailableForDelivery(byte availableForDelivery) {
		this.availableForDelivery = availableForDelivery;
	}


	@Column(name="CLOCKED_IN")
	public byte getClockedIn() {
		return this.clockedIn;
	}

	public void setClockedIn(byte clockedIn) {
		this.clockedIn = clockedIn;
	}


	@Column(name="COST_PER_HOUR")
	public double getCostPerHour() {
		return this.costPerHour;
	}

	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}


	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Column(name="IS_DRIVER")
	public byte getIsDriver() {
		return this.isDriver;
	}

	public void setIsDriver(byte isDriver) {
		this.isDriver = isDriver;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_CLOCK_IN_TIME")
	public Date getLastClockInTime() {
		return this.lastClockInTime;
	}

	public void setLastClockInTime(Date lastClockInTime) {
		this.lastClockInTime = lastClockInTime;
	}


	@Column(name="LAST_NAME")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Column(name="PHONE_NO")
	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	@Column(name="USER_ID")
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	@Column(name="USER_PASS")
	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}


	//bi-directional many-to-one association to ActionHistory
	@OneToMany(mappedBy="user")
	public Set<ActionHistory> getActionHistories() {
		return this.actionHistories;
	}

	public void setActionHistories(Set<ActionHistory> actionHistories) {
		this.actionHistories = actionHistories;
	}

	public ActionHistory addActionHistory(ActionHistory actionHistory) {
		getActionHistories().add(actionHistory);
		actionHistory.setUser(this);

		return actionHistory;
	}

	public ActionHistory removeActionHistory(ActionHistory actionHistory) {
		getActionHistories().remove(actionHistory);
		actionHistory.setUser(null);

		return actionHistory;
	}


	//bi-directional many-to-one association to AttendenceHistory
	@OneToMany(mappedBy="user")
	public Set<AttendenceHistory> getAttendenceHistories() {
		return this.attendenceHistories;
	}

	public void setAttendenceHistories(Set<AttendenceHistory> attendenceHistories) {
		this.attendenceHistories = attendenceHistories;
	}

	public AttendenceHistory addAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().add(attendenceHistory);
		attendenceHistory.setUser(this);

		return attendenceHistory;
	}

	public AttendenceHistory removeAttendenceHistory(AttendenceHistory attendenceHistory) {
		getAttendenceHistories().remove(attendenceHistory);
		attendenceHistory.setUser(null);

		return attendenceHistory;
	}


	//bi-directional many-to-one association to CashDrawerResetHistory
	@OneToMany(mappedBy="user")
	public Set<CashDrawerResetHistory> getCashDrawerResetHistories() {
		return this.cashDrawerResetHistories;
	}

	public void setCashDrawerResetHistories(Set<CashDrawerResetHistory> cashDrawerResetHistories) {
		this.cashDrawerResetHistories = cashDrawerResetHistories;
	}

	public CashDrawerResetHistory addCashDrawerResetHistory(CashDrawerResetHistory cashDrawerResetHistory) {
		getCashDrawerResetHistories().add(cashDrawerResetHistory);
		cashDrawerResetHistory.setUser(this);

		return cashDrawerResetHistory;
	}

	public CashDrawerResetHistory removeCashDrawerResetHistory(CashDrawerResetHistory cashDrawerResetHistory) {
		getCashDrawerResetHistories().remove(cashDrawerResetHistory);
		cashDrawerResetHistory.setUser(null);

		return cashDrawerResetHistory;
	}


	//bi-directional many-to-one association to DrawerAssignedHistory
	@OneToMany(mappedBy="user")
	public Set<DrawerAssignedHistory> getDrawerAssignedHistories() {
		return this.drawerAssignedHistories;
	}

	public void setDrawerAssignedHistories(Set<DrawerAssignedHistory> drawerAssignedHistories) {
		this.drawerAssignedHistories = drawerAssignedHistories;
	}

	public DrawerAssignedHistory addDrawerAssignedHistory(DrawerAssignedHistory drawerAssignedHistory) {
		getDrawerAssignedHistories().add(drawerAssignedHistory);
		drawerAssignedHistory.setUser(this);

		return drawerAssignedHistory;
	}

	public DrawerAssignedHistory removeDrawerAssignedHistory(DrawerAssignedHistory drawerAssignedHistory) {
		getDrawerAssignedHistories().remove(drawerAssignedHistory);
		drawerAssignedHistory.setUser(null);

		return drawerAssignedHistory;
	}


	//bi-directional many-to-one association to DrawerPullReport
	@OneToMany(mappedBy="user")
	public Set<DrawerPullReport> getDrawerPullReports() {
		return this.drawerPullReports;
	}

	public void setDrawerPullReports(Set<DrawerPullReport> drawerPullReports) {
		this.drawerPullReports = drawerPullReports;
	}

	public DrawerPullReport addDrawerPullReport(DrawerPullReport drawerPullReport) {
		getDrawerPullReports().add(drawerPullReport);
		drawerPullReport.setUser(this);

		return drawerPullReport;
	}

	public DrawerPullReport removeDrawerPullReport(DrawerPullReport drawerPullReport) {
		getDrawerPullReports().remove(drawerPullReport);
		drawerPullReport.setUser(null);

		return drawerPullReport;
	}


	//bi-directional many-to-one association to Gratuity
	@OneToMany(mappedBy="user")
	public Set<Gratuity> getGratuities() {
		return this.gratuities;
	}

	public void setGratuities(Set<Gratuity> gratuities) {
		this.gratuities = gratuities;
	}

	public Gratuity addGratuity(Gratuity gratuity) {
		getGratuities().add(gratuity);
		gratuity.setUser(this);

		return gratuity;
	}

	public Gratuity removeGratuity(Gratuity gratuity) {
		getGratuities().remove(gratuity);
		gratuity.setUser(null);

		return gratuity;
	}


	//bi-directional many-to-one association to TableBookingInfo
	@OneToMany(mappedBy="user")
	public Set<TableBookingInfo> getTableBookingInfos() {
		return this.tableBookingInfos;
	}

	public void setTableBookingInfos(Set<TableBookingInfo> tableBookingInfos) {
		this.tableBookingInfos = tableBookingInfos;
	}

	public TableBookingInfo addTableBookingInfo(TableBookingInfo tableBookingInfo) {
		getTableBookingInfos().add(tableBookingInfo);
		tableBookingInfo.setUser(this);

		return tableBookingInfo;
	}

	public TableBookingInfo removeTableBookingInfo(TableBookingInfo tableBookingInfo) {
		getTableBookingInfos().remove(tableBookingInfo);
		tableBookingInfo.setUser(null);

		return tableBookingInfo;
	}


	//bi-directional many-to-one association to Terminal
	@OneToMany(mappedBy="user")
	public Set<Terminal> getTerminals() {
		return this.terminals;
	}

	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}

	public Terminal addTerminal(Terminal terminal) {
		getTerminals().add(terminal);
		terminal.setUser(this);

		return terminal;
	}

	public Terminal removeTerminal(Terminal terminal) {
		getTerminals().remove(terminal);
		terminal.setUser(null);

		return terminal;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="user1")
	public Set<Ticket> getTickets1() {
		return this.tickets1;
	}

	public void setTickets1(Set<Ticket> tickets1) {
		this.tickets1 = tickets1;
	}

	public Ticket addTickets1(Ticket tickets1) {
		getTickets1().add(tickets1);
		tickets1.setUser1(this);

		return tickets1;
	}

	public Ticket removeTickets1(Ticket tickets1) {
		getTickets1().remove(tickets1);
		tickets1.setUser1(null);

		return tickets1;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="user2")
	public Set<Ticket> getTickets2() {
		return this.tickets2;
	}

	public void setTickets2(Set<Ticket> tickets2) {
		this.tickets2 = tickets2;
	}

	public Ticket addTickets2(Ticket tickets2) {
		getTickets2().add(tickets2);
		tickets2.setUser2(this);

		return tickets2;
	}

	public Ticket removeTickets2(Ticket tickets2) {
		getTickets2().remove(tickets2);
		tickets2.setUser2(null);

		return tickets2;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="user3")
	public Set<Ticket> getTickets3() {
		return this.tickets3;
	}

	public void setTickets3(Set<Ticket> tickets3) {
		this.tickets3 = tickets3;
	}

	public Ticket addTickets3(Ticket tickets3) {
		getTickets3().add(tickets3);
		tickets3.setUser3(this);

		return tickets3;
	}

	public Ticket removeTickets3(Ticket tickets3) {
		getTickets3().remove(tickets3);
		tickets3.setUser3(null);

		return tickets3;
	}


	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="user")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setUser(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setUser(null);

		return transaction;
	}


	//bi-directional many-to-one association to Shift
	@ManyToOne
	public Shift getShift() {
		return this.shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}


	//bi-directional many-to-one association to Terminal
	@ManyToOne
	@JoinColumn(name="currentTerminal")
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


	//bi-directional many-to-one association to UserType
	@ManyToOne
	@JoinColumn(name="N_USER_TYPE")
	public UserType getUserType() {
		return this.userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

}