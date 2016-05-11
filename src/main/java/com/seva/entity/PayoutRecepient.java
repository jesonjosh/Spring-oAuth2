package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the payout_recepients database table.
 * 
 */
@Entity
@Table(name="payout_recepients")
@NamedQuery(name="PayoutRecepient.findAll", query="SELECT p FROM PayoutRecepient p")
public class PayoutRecepient implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Set<Transaction> transactions;

	public PayoutRecepient() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="payoutRecepient")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setPayoutRecepient(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setPayoutRecepient(null);

		return transaction;
	}

}