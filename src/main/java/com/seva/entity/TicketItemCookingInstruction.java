package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_item_cooking_instruction database table.
 * 
 */
@Entity
@Table(name="ticket_item_cooking_instruction")
@NamedQuery(name="TicketItemCookingInstruction.findAll", query="SELECT t FROM TicketItemCookingInstruction t")
public class TicketItemCookingInstruction implements Serializable {
	private static final long serialVersionUID = 1L;
	private TicketItemCookingInstructionPK id;
	private String description;
	private byte printedToKitchen;
	private TicketItem ticketItem;

	public TicketItemCookingInstruction() {
	}


	@EmbeddedId
	public TicketItemCookingInstructionPK getId() {
		return this.id;
	}

	public void setId(TicketItemCookingInstructionPK id) {
		this.id = id;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public byte getPrintedToKitchen() {
		return this.printedToKitchen;
	}

	public void setPrintedToKitchen(byte printedToKitchen) {
		this.printedToKitchen = printedToKitchen;
	}


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="TICKET_ITEM_ID")
	public TicketItem getTicketItem() {
		return this.ticketItem;
	}

	public void setTicketItem(TicketItem ticketItem) {
		this.ticketItem = ticketItem;
	}

}