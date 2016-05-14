package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inventory_unit database table.
 * 
 */
@Entity
@Table(name="inventory_unit")
@NamedQuery(name="InventoryUnit.findAll", query="SELECT i FROM InventoryUnit i")
public class InventoryUnit implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String altName;
	private String convFactor1;
	private String convFactor2;
	private String convFactor3;
	private String longName;
	private String shortName;

	public InventoryUnit() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ALT_NAME")
	public String getAltName() {
		return this.altName;
	}

	public void setAltName(String altName) {
		this.altName = altName;
	}


	@Column(name="CONV_FACTOR1")
	public String getConvFactor1() {
		return this.convFactor1;
	}

	public void setConvFactor1(String convFactor1) {
		this.convFactor1 = convFactor1;
	}


	@Column(name="CONV_FACTOR2")
	public String getConvFactor2() {
		return this.convFactor2;
	}

	public void setConvFactor2(String convFactor2) {
		this.convFactor2 = convFactor2;
	}


	@Column(name="CONV_FACTOR3")
	public String getConvFactor3() {
		return this.convFactor3;
	}

	public void setConvFactor3(String convFactor3) {
		this.convFactor3 = convFactor3;
	}


	@Column(name="LONG_NAME")
	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}


	@Column(name="SHORT_NAME")
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}