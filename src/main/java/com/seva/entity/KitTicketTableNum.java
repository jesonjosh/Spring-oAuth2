package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the kit_ticket_table_num database table.
 * 
 */
@Entity
@Table(name="kit_ticket_table_num")
@NamedQuery(name="KitTicketTableNum.findAll", query="SELECT k FROM KitTicketTableNum k")
public class KitTicketTableNum implements Serializable {
	private static final long serialVersionUID = 1L;
	private int tableId;
	private KitchenTicket kitchenTicket;

	public KitTicketTableNum() {
	}


	@Column(name="TABLE_ID")
	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}


	//bi-directional many-to-one association to KitchenTicket
	@ManyToOne
	@JoinColumn(name="kit_ticket_id")
	public KitchenTicket getKitchenTicket() {
		return this.kitchenTicket;
	}

	public void setKitchenTicket(KitchenTicket kitchenTicket) {
		this.kitchenTicket = kitchenTicket;
	}

}