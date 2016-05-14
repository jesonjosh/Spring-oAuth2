package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_item_discount database table.
 * 
 */
@Entity
@Table(name="ticket_item_discount")
@NamedQuery(name="TicketItemDiscount.findAll", query="SELECT t FROM TicketItemDiscount t")
public class TicketItemDiscount implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double amount;
	private byte autoApply;
	private int discountId;
	private int minimumQuantity;
	private String name;
	private int type;
	private double value;
	private TicketItem ticketItem;

	public TicketItemDiscount() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
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


	@Column(name="MINIMUM_QUANTITY")
	public int getMinimumQuantity() {
		return this.minimumQuantity;
	}

	public void setMinimumQuantity(int minimumQuantity) {
		this.minimumQuantity = minimumQuantity;
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


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="TICKET_ITEMID")
	public TicketItem getTicketItem() {
		return this.ticketItem;
	}

	public void setTicketItem(TicketItem ticketItem) {
		this.ticketItem = ticketItem;
	}

}