package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the custom_payment database table.
 * 
 */
@Entity
@Table(name="custom_payment")
@NamedQuery(name="CustomPayment.findAll", query="SELECT c FROM CustomPayment c")
public class CustomPayment implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String refNumberFieldName;
	private byte requiredRefNumber;

	public CustomPayment() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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


	@Column(name="REF_NUMBER_FIELD_NAME")
	public String getRefNumberFieldName() {
		return this.refNumberFieldName;
	}

	public void setRefNumberFieldName(String refNumberFieldName) {
		this.refNumberFieldName = refNumberFieldName;
	}


	@Column(name="REQUIRED_REF_NUMBER")
	public byte getRequiredRefNumber() {
		return this.requiredRefNumber;
	}

	public void setRequiredRefNumber(byte requiredRefNumber) {
		this.requiredRefNumber = requiredRefNumber;
	}

}