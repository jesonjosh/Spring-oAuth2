package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ticket_item_cooking_instruction database table.
 * 
 */
@Embeddable
public class TicketItemCookingInstructionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int ticketItemId;
	private int itemOrder;

	public TicketItemCookingInstructionPK() {
	}

	@Column(name="TICKET_ITEM_ID", insertable=false, updatable=false)
	public int getTicketItemId() {
		return this.ticketItemId;
	}
	public void setTicketItemId(int ticketItemId) {
		this.ticketItemId = ticketItemId;
	}

	@Column(name="ITEM_ORDER")
	public int getItemOrder() {
		return this.itemOrder;
	}
	public void setItemOrder(int itemOrder) {
		this.itemOrder = itemOrder;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TicketItemCookingInstructionPK)) {
			return false;
		}
		TicketItemCookingInstructionPK castOther = (TicketItemCookingInstructionPK)other;
		return 
			(this.ticketItemId == castOther.ticketItemId)
			&& (this.itemOrder == castOther.itemOrder);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ticketItemId;
		hash = hash * prime + this.itemOrder;
		
		return hash;
	}
}