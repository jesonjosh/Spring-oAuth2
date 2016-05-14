package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_table_num database table.
 * 
 */
@Entity
@Table(name="ticket_table_num")
@NamedQuery(name="TicketTableNum.findAll", query="SELECT t FROM TicketTableNum t")
public class TicketTableNum implements Serializable {
	private static final long serialVersionUID = 1L;
	private int tableId;
	private Ticket ticket;

	public TicketTableNum() {
	}

	@Id
	@Column(name="TABLE_ID")
	public int getTableId() {
		return this.tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
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