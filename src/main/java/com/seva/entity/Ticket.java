package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the ticket database table.
 * 
 */
@Entity
@NamedQuery(name="Ticket.findAll", query="SELECT t FROM Ticket t")
public class Ticket implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date activeDate;
	private double advanceAmount;
	private Date closingDate;
	private Date createDate;
	private int creationHour;
	private byte customerPickeup;
	private Date deliveeryDate;
	private String deliveryAddress;
	private double deliveryCharge;
	private String deliveryExtraInfo;
	private byte drawerResetted;
	private double dueAmount;
	private byte isReOpened;
	private byte isTaxExempt;
	private int numberOfGuests;
	private byte paid;
	private double paidAmount;
	private byte refunded;
	private double serviceCharge;
	private byte settled;
	private String status;
	private double subTotal;
	private String ticketType;
	private double totalDiscount;
	private double totalPrice;
	private double totalTax;
	private String voidReason;
	private byte voided;
	private byte wasted;
	private Set<Gratuity> gratuities;
	private Gratuity gratuity;
	private Shift shift;
	private Terminal terminal;
	private User user1;
	private User user2;
	private User user3;
	private Set<TicketDiscount> ticketDiscounts;
	private Set<TicketItem> ticketItems;
	private Set<TicketProperty> ticketProperties;
	private Set<TicketTableNum> ticketTableNums;
	private Set<Transaction> transactions;

	public Ticket() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ACTIVE_DATE")
	public Date getActiveDate() {
		return this.activeDate;
	}

	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}


	@Column(name="ADVANCE_AMOUNT")
	public double getAdvanceAmount() {
		return this.advanceAmount;
	}

	public void setAdvanceAmount(double advanceAmount) {
		this.advanceAmount = advanceAmount;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CLOSING_DATE")
	public Date getClosingDate() {
		return this.closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Column(name="CREATION_HOUR")
	public int getCreationHour() {
		return this.creationHour;
	}

	public void setCreationHour(int creationHour) {
		this.creationHour = creationHour;
	}


	@Column(name="CUSTOMER_PICKEUP")
	public byte getCustomerPickeup() {
		return this.customerPickeup;
	}

	public void setCustomerPickeup(byte customerPickeup) {
		this.customerPickeup = customerPickeup;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DELIVEERY_DATE")
	public Date getDeliveeryDate() {
		return this.deliveeryDate;
	}

	public void setDeliveeryDate(Date deliveeryDate) {
		this.deliveeryDate = deliveeryDate;
	}


	@Column(name="DELIVERY_ADDRESS")
	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}


	@Column(name="DELIVERY_CHARGE")
	public double getDeliveryCharge() {
		return this.deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}


	@Column(name="DELIVERY_EXTRA_INFO")
	public String getDeliveryExtraInfo() {
		return this.deliveryExtraInfo;
	}

	public void setDeliveryExtraInfo(String deliveryExtraInfo) {
		this.deliveryExtraInfo = deliveryExtraInfo;
	}


	@Column(name="DRAWER_RESETTED")
	public byte getDrawerResetted() {
		return this.drawerResetted;
	}

	public void setDrawerResetted(byte drawerResetted) {
		this.drawerResetted = drawerResetted;
	}


	@Column(name="DUE_AMOUNT")
	public double getDueAmount() {
		return this.dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}


	@Column(name="IS_RE_OPENED")
	public byte getIsReOpened() {
		return this.isReOpened;
	}

	public void setIsReOpened(byte isReOpened) {
		this.isReOpened = isReOpened;
	}


	@Column(name="IS_TAX_EXEMPT")
	public byte getIsTaxExempt() {
		return this.isTaxExempt;
	}

	public void setIsTaxExempt(byte isTaxExempt) {
		this.isTaxExempt = isTaxExempt;
	}


	@Column(name="NUMBER_OF_GUESTS")
	public int getNumberOfGuests() {
		return this.numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}


	public byte getPaid() {
		return this.paid;
	}

	public void setPaid(byte paid) {
		this.paid = paid;
	}


	@Column(name="PAID_AMOUNT")
	public double getPaidAmount() {
		return this.paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}


	public byte getRefunded() {
		return this.refunded;
	}

	public void setRefunded(byte refunded) {
		this.refunded = refunded;
	}


	@Column(name="SERVICE_CHARGE")
	public double getServiceCharge() {
		return this.serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


	public byte getSettled() {
		return this.settled;
	}

	public void setSettled(byte settled) {
		this.settled = settled;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="SUB_TOTAL")
	public double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	@Column(name="TICKET_TYPE")
	public String getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}


	@Column(name="TOTAL_DISCOUNT")
	public double getTotalDiscount() {
		return this.totalDiscount;
	}

	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}


	@Column(name="TOTAL_PRICE")
	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Column(name="TOTAL_TAX")
	public double getTotalTax() {
		return this.totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}


	@Column(name="VOID_REASON")
	public String getVoidReason() {
		return this.voidReason;
	}

	public void setVoidReason(String voidReason) {
		this.voidReason = voidReason;
	}


	public byte getVoided() {
		return this.voided;
	}

	public void setVoided(byte voided) {
		this.voided = voided;
	}


	public byte getWasted() {
		return this.wasted;
	}

	public void setWasted(byte wasted) {
		this.wasted = wasted;
	}


	//bi-directional many-to-one association to Gratuity
	@OneToMany(mappedBy="ticket")
	public Set<Gratuity> getGratuities() {
		return this.gratuities;
	}

	public void setGratuities(Set<Gratuity> gratuities) {
		this.gratuities = gratuities;
	}

	public Gratuity addGratuity(Gratuity gratuity) {
		getGratuities().add(gratuity);
		gratuity.setTicket(this);

		return gratuity;
	}

	public Gratuity removeGratuity(Gratuity gratuity) {
		getGratuities().remove(gratuity);
		gratuity.setTicket(null);

		return gratuity;
	}


	//bi-directional many-to-one association to Gratuity
	@ManyToOne
	public Gratuity getGratuity() {
		return this.gratuity;
	}

	public void setGratuity(Gratuity gratuity) {
		this.gratuity = gratuity;
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
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="VOID_BY_USER")
	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="OWNER_ID")
	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="DRIVER_ID")
	public User getUser3() {
		return this.user3;
	}

	public void setUser3(User user3) {
		this.user3 = user3;
	}


	//bi-directional many-to-one association to TicketDiscount
	@OneToMany(mappedBy="ticket")
	public Set<TicketDiscount> getTicketDiscounts() {
		return this.ticketDiscounts;
	}

	public void setTicketDiscounts(Set<TicketDiscount> ticketDiscounts) {
		this.ticketDiscounts = ticketDiscounts;
	}

	public TicketDiscount addTicketDiscount(TicketDiscount ticketDiscount) {
		getTicketDiscounts().add(ticketDiscount);
		ticketDiscount.setTicket(this);

		return ticketDiscount;
	}

	public TicketDiscount removeTicketDiscount(TicketDiscount ticketDiscount) {
		getTicketDiscounts().remove(ticketDiscount);
		ticketDiscount.setTicket(null);

		return ticketDiscount;
	}


	//bi-directional many-to-one association to TicketItem
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "ticket",cascade = CascadeType.ALL,orphanRemoval = true)
	public Set<TicketItem> getTicketItems() {
		return this.ticketItems;
	}

	public void setTicketItems(Set<TicketItem> ticketItems) {
		this.ticketItems = ticketItems;
	}

	public TicketItem addTicketItem(TicketItem ticketItem) {
		getTicketItems().add(ticketItem);
		ticketItem.setTicket(this);

		return ticketItem;
	}

	public TicketItem removeTicketItem(TicketItem ticketItem) {
		getTicketItems().remove(ticketItem);
		ticketItem.setTicket(null);

		return ticketItem;
	}


	//bi-directional many-to-one association to TicketProperty
	@OneToMany(mappedBy="ticket")
	public Set<TicketProperty> getTicketProperties() {
		return this.ticketProperties;
	}

	public void setTicketProperties(Set<TicketProperty> ticketProperties) {
		this.ticketProperties = ticketProperties;
	}

	public TicketProperty addTicketProperty(TicketProperty ticketProperty) {
		getTicketProperties().add(ticketProperty);
		ticketProperty.setTicket(this);

		return ticketProperty;
	}

	public TicketProperty removeTicketProperty(TicketProperty ticketProperty) {
		getTicketProperties().remove(ticketProperty);
		ticketProperty.setTicket(null);

		return ticketProperty;
	}


	//bi-directional many-to-one association to TicketTableNum
	@OneToMany(mappedBy="ticket")
	public Set<TicketTableNum> getTicketTableNums() {
		return this.ticketTableNums;
	}

	public void setTicketTableNums(Set<TicketTableNum> ticketTableNums) {
		this.ticketTableNums = ticketTableNums;
	}

	public TicketTableNum addTicketTableNum(TicketTableNum ticketTableNum) {
		getTicketTableNums().add(ticketTableNum);
		ticketTableNum.setTicket(this);

		return ticketTableNum;
	}

	public TicketTableNum removeTicketTableNum(TicketTableNum ticketTableNum) {
		getTicketTableNums().remove(ticketTableNum);
		ticketTableNum.setTicket(null);

		return ticketTableNum;
	}


	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="ticket")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setTicket(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setTicket(null);

		return transaction;
	}

}