package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the transaction_properties database table.
 * 
 */
@Embeddable
public class TransactionPropertyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int id;
	private String propertyName;

	public TransactionPropertyPK() {
	}

	@Column(insertable=false, updatable=false)
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Column(name="property_name")
	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransactionPropertyPK)) {
			return false;
		}
		TransactionPropertyPK castOther = (TransactionPropertyPK)other;
		return 
			(this.id == castOther.id)
			&& this.propertyName.equals(castOther.propertyName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.propertyName.hashCode();
		
		return hash;
	}
}