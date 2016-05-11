package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer_properties database table.
 * 
 */
@Entity
@Table(name="customer_properties")
@NamedQuery(name="CustomerProperty.findAll", query="SELECT c FROM CustomerProperty c")
public class CustomerProperty implements Serializable {
	private static final long serialVersionUID = 1L;
	private CustomerPropertyPK id;
	private String propertyValue;
	private Customer customer;

	public CustomerProperty() {
	}


	@EmbeddedId
	public CustomerPropertyPK getId() {
		return this.id;
	}

	public void setId(CustomerPropertyPK id) {
		this.id = id;
	}


	@Column(name="property_value")
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}


	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="id")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}