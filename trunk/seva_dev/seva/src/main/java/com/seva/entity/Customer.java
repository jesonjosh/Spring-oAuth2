package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoId;
	private String address;
	private String city;
	private String country;
	private String creditCardNo;
	private double creditLimit;
	private double creditSpent;
	private String dob;
	private String email;
	private String firstName;
	private String homephoneNo;
	private String lastName;
	private String loyaltyNo;
	private int loyaltyPoint;
	private String mobileNo;
	private String note;
	private byte[] picture;
	private String salutation;
	private String socialSecurityNumber;
	private String ssn;
	private String state;
	private byte vip;
	private String workphoneNo;
	private String zipCode;
	private Set<CustomerProperty> customerProperties;
	private Set<TableBookingInfo> tableBookingInfos;

	public Customer() {
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


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Column(name="CREDIT_CARD_NO")
	public String getCreditCardNo() {
		return this.creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}


	@Column(name="CREDIT_LIMIT")
	public double getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


	@Column(name="CREDIT_SPENT")
	public double getCreditSpent() {
		return this.creditSpent;
	}

	public void setCreditSpent(double creditSpent) {
		this.creditSpent = creditSpent;
	}


	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	@Column(name="HOMEPHONE_NO")
	public String getHomephoneNo() {
		return this.homephoneNo;
	}

	public void setHomephoneNo(String homephoneNo) {
		this.homephoneNo = homephoneNo;
	}


	@Column(name="LAST_NAME")
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Column(name="LOYALTY_NO")
	public String getLoyaltyNo() {
		return this.loyaltyNo;
	}

	public void setLoyaltyNo(String loyaltyNo) {
		this.loyaltyNo = loyaltyNo;
	}


	@Column(name="LOYALTY_POINT")
	public int getLoyaltyPoint() {
		return this.loyaltyPoint;
	}

	public void setLoyaltyPoint(int loyaltyPoint) {
		this.loyaltyPoint = loyaltyPoint;
	}


	@Column(name="MOBILE_NO")
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}


	@Lob
	public byte[] getPicture() {
		return this.picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}


	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}


	@Column(name="SOCIAL_SECURITY_NUMBER")
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}


	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public byte getVip() {
		return this.vip;
	}

	public void setVip(byte vip) {
		this.vip = vip;
	}


	@Column(name="WORKPHONE_NO")
	public String getWorkphoneNo() {
		return this.workphoneNo;
	}

	public void setWorkphoneNo(String workphoneNo) {
		this.workphoneNo = workphoneNo;
	}


	@Column(name="ZIP_CODE")
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	//bi-directional many-to-one association to CustomerProperty
	@OneToMany(mappedBy="customer")
	public Set<CustomerProperty> getCustomerProperties() {
		return this.customerProperties;
	}

	public void setCustomerProperties(Set<CustomerProperty> customerProperties) {
		this.customerProperties = customerProperties;
	}

	public CustomerProperty addCustomerProperty(CustomerProperty customerProperty) {
		getCustomerProperties().add(customerProperty);
		customerProperty.setCustomer(this);

		return customerProperty;
	}

	public CustomerProperty removeCustomerProperty(CustomerProperty customerProperty) {
		getCustomerProperties().remove(customerProperty);
		customerProperty.setCustomer(null);

		return customerProperty;
	}


	//bi-directional many-to-one association to TableBookingInfo
	@OneToMany(mappedBy="customer")
	public Set<TableBookingInfo> getTableBookingInfos() {
		return this.tableBookingInfos;
	}

	public void setTableBookingInfos(Set<TableBookingInfo> tableBookingInfos) {
		this.tableBookingInfos = tableBookingInfos;
	}

	public TableBookingInfo addTableBookingInfo(TableBookingInfo tableBookingInfo) {
		getTableBookingInfos().add(tableBookingInfo);
		tableBookingInfo.setCustomer(this);

		return tableBookingInfo;
	}

	public TableBookingInfo removeTableBookingInfo(TableBookingInfo tableBookingInfo) {
		getTableBookingInfos().remove(tableBookingInfo);
		tableBookingInfo.setCustomer(null);

		return tableBookingInfo;
	}

}