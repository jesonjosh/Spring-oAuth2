package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the restaurant database table.
 * 
 */
@Entity
@NamedQuery(name="Restaurant.findAll", query="SELECT r FROM Restaurant r")
public class Restaurant implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String addressLine1;
	private String addressLine2;
	private String addressLine3;
	private int capacity;
	private String cname;
	private String csymbol;
	private double gratuityPercentage;
	private String name;
	private byte priceIncludesTax;
	private double scPercentage;
	private int tables;
	private String telephone;
	private String ticketFooter;
	private int uniqueId;
	private String zipCode;

	public Restaurant() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ADDRESS_LINE1")
	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	@Column(name="ADDRESS_LINE2")
	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	@Column(name="ADDRESS_LINE3")
	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}


	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCsymbol() {
		return this.csymbol;
	}

	public void setCsymbol(String csymbol) {
		this.csymbol = csymbol;
	}


	@Column(name="GRATUITY_PERCENTAGE")
	public double getGratuityPercentage() {
		return this.gratuityPercentage;
	}

	public void setGratuityPercentage(double gratuityPercentage) {
		this.gratuityPercentage = gratuityPercentage;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PRICE_INCLUDES_TAX")
	public byte getPriceIncludesTax() {
		return this.priceIncludesTax;
	}

	public void setPriceIncludesTax(byte priceIncludesTax) {
		this.priceIncludesTax = priceIncludesTax;
	}


	@Column(name="SC_PERCENTAGE")
	public double getScPercentage() {
		return this.scPercentage;
	}

	public void setScPercentage(double scPercentage) {
		this.scPercentage = scPercentage;
	}


	public int getTables() {
		return this.tables;
	}

	public void setTables(int tables) {
		this.tables = tables;
	}


	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	@Column(name="TICKET_FOOTER")
	public String getTicketFooter() {
		return this.ticketFooter;
	}

	public void setTicketFooter(String ticketFooter) {
		this.ticketFooter = ticketFooter;
	}


	@Column(name="UNIQUE_ID")
	public int getUniqueId() {
		return this.uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}


	@Column(name="ZIP_CODE")
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}