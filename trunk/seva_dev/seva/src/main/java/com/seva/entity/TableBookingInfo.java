package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the table_booking_info database table.
 * 
 */
@Entity
@Table(name="table_booking_info")
@NamedQuery(name="TableBookingInfo.findAll", query="SELECT t FROM TableBookingInfo t")
public class TableBookingInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double bookingCharge;
	private String bookingConfirm;
	private String bookingType;
	private Date fromDate;
	private int guestCount;
	private double paidAmount;
	private String paymentStatus;
	private double remainingBalance;
	private String status;
	private Date toDate;
	private User user;
	private Customer customer;
	private Set<ShopTable> shopTables;

	public TableBookingInfo() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="BOOKING_CHARGE")
	public double getBookingCharge() {
		return this.bookingCharge;
	}

	public void setBookingCharge(double bookingCharge) {
		this.bookingCharge = bookingCharge;
	}


	@Column(name="BOOKING_CONFIRM")
	public String getBookingConfirm() {
		return this.bookingConfirm;
	}

	public void setBookingConfirm(String bookingConfirm) {
		this.bookingConfirm = bookingConfirm;
	}


	@Column(name="BOOKING_TYPE")
	public String getBookingType() {
		return this.bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FROM_DATE")
	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	@Column(name="GUEST_COUNT")
	public int getGuestCount() {
		return this.guestCount;
	}

	public void setGuestCount(int guestCount) {
		this.guestCount = guestCount;
	}


	@Column(name="PAID_AMOUNT")
	public double getPaidAmount() {
		return this.paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}


	@Column(name="PAYMENT_STATUS")
	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}


	@Column(name="REMAINING_BALANCE")
	public double getRemainingBalance() {
		return this.remainingBalance;
	}

	public void setRemainingBalance(double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TO_DATE")
	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="customer_id")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	//bi-directional many-to-many association to ShopTable
	@ManyToMany(mappedBy="tableBookingInfos")
	public Set<ShopTable> getShopTables() {
		return this.shopTables;
	}

	public void setShopTables(Set<ShopTable> shopTables) {
		this.shopTables = shopTables;
	}

}