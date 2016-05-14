package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_discount database table.
 * 
 */
@Entity
@Table(name="ticket_discount")
@NamedQuery(name="TicketDiscount.findAll", query="SELECT t FROM TicketDiscount t")
public class TicketDiscount implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte autoApply;
	private int discountId;
	private int minimumAmount;
	private String name;
	private int type;
	private double value;
	private Ticket ticket;

	public TicketDiscount() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="AUTO_APPLY")
	public byte getAutoApply() {
		return this.autoApply;
	}

	public void setAutoApply(byte autoApply) {
		this.autoApply = autoApply;
	}


	@Column(name="DISCOUNT_ID")
	public int getDiscountId() {
		return this.discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}


	@Column(name="MINIMUM_AMOUNT")
	public int getMinimumAmount() {
		return this.minimumAmount;
	}

	public void setMinimumAmount(int minimumAmount) {
		this.minimumAmount = minimumAmount;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}


	//bi-directional many-to-one association to Ticket
	@ManyToOne
	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}