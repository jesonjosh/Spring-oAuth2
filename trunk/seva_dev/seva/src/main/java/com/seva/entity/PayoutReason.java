package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the payout_reasons database table.
 * 
 */
@Entity
@Table(name="payout_reasons")
@NamedQuery(name="PayoutReason.findAll", query="SELECT p FROM PayoutReason p")
public class PayoutReason implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String reason;
	private Set<Transaction> transactions;

	public PayoutReason() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="payoutReason")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setPayoutReason(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setPayoutReason(null);

		return transaction;
	}

}