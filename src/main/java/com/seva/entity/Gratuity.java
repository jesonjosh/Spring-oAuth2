package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the gratuity database table.
 * 
 */
@Entity
@NamedQuery(name="Gratuity.findAll", query="SELECT g FROM Gratuity g")
public class Gratuity implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double amount;
	private byte paid;
	private Terminal terminal;
	private Ticket ticket;
	private User user;
	private Set<Ticket> tickets;

	public Gratuity() {
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


	public byte getPaid() {
		return this.paid;
	}

	public void setPaid(byte paid) {
		this.paid = paid;
	}


	//bi-directional many-to-one association to Terminal
	@ManyToOne
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


	//bi-directional many-to-one association to Ticket
	@ManyToOne
	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="OWNER_ID")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	//bi-directional many-to-one association to Ticket
	@OneToMany(mappedBy="gratuity")
	public Set<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Ticket addTicket(Ticket ticket) {
		getTickets().add(ticket);
		ticket.setGratuity(this);

		return ticket;
	}

	public Ticket removeTicket(Ticket ticket) {
		getTickets().remove(ticket);
		ticket.setGratuity(null);

		return ticket;
	}

}