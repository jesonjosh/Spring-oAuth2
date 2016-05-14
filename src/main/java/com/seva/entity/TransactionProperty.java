package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transaction_properties database table.
 * 
 */
@Entity
@Table(name="transaction_properties")
@NamedQuery(name="TransactionProperty.findAll", query="SELECT t FROM TransactionProperty t")
public class TransactionProperty implements Serializable {
	private static final long serialVersionUID = 1L;
	private TransactionPropertyPK id;
	private String propertyValue;
	private Transaction transaction;

	public TransactionProperty() {
	}


	@EmbeddedId
	public TransactionPropertyPK getId() {
		return this.id;
	}

	public void setId(TransactionPropertyPK id) {
		this.id = id;
	}


	@Column(name="property_value")
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}


	//bi-directional many-to-one association to Transaction
//	@ManyToOne
//	@JoinColumn(name="id")
	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}