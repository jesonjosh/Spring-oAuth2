package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the zip_code_vs_delivery_charge database table.
 * 
 */
@Entity
@Table(name="zip_code_vs_delivery_charge")
@NamedQuery(name="ZipCodeVsDeliveryCharge.findAll", query="SELECT z FROM ZipCodeVsDeliveryCharge z")
public class ZipCodeVsDeliveryCharge implements Serializable {
	private static final long serialVersionUID = 1L;
	private int autoId;
	private double deliveryCharge;
	private String zipCode;

	public ZipCodeVsDeliveryCharge() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AUTO_ID")
	public int getAutoId() {
		return this.autoId;
	}

	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}


	@Column(name="DELIVERY_CHARGE")
	public double getDeliveryCharge() {
		return this.deliveryCharge;
	}

	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}


	@Column(name="ZIP_CODE")
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}