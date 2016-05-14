package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_properties database table.
 * 
 */
@Entity
@Table(name="ticket_properties")
@NamedQuery(name="TicketProperty.findAll", query="SELECT t FROM TicketProperty t")
public class TicketProperty implements Serializable {
	private static final long serialVersionUID = 1L;
	private TicketPropertyPK id;
	private String propertyValue;
	private Ticket ticket;

	public TicketProperty() {
	}


	@EmbeddedId
	public TicketPropertyPK getId() {
		return this.id;
	}

	public void setId(TicketPropertyPK id) {
		this.id = id;
	}


	@Lob
	@Column(name="property_value")
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}


	//bi-directional many-to-one association to Ticket
//	@ManyToOne
//	@JoinColumn(name="id")
	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}