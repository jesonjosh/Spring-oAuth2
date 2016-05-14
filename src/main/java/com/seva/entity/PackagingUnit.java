package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the packaging_unit database table.
 * 
 */
@Entity
@Table(name="packaging_unit")
@NamedQuery(name="PackagingUnit.findAll", query="SELECT p FROM PackagingUnit p")
public class PackagingUnit implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte baseunit;
	private String dimension;
	private double factor;
	private String name;
	private String shortName;
	private Set<InventoryItem> inventoryItems;

	public PackagingUnit() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getBaseunit() {
		return this.baseunit;
	}

	public void setBaseunit(byte baseunit) {
		this.baseunit = baseunit;
	}


	public String getDimension() {
		return this.dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}


	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="SHORT_NAME")
	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}


	//bi-directional many-to-one association to InventoryItem
	@OneToMany(mappedBy="packagingUnit")
	public Set<InventoryItem> getInventoryItems() {
		return this.inventoryItems;
	}

	public void setInventoryItems(Set<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}

	public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().add(inventoryItem);
		inventoryItem.setPackagingUnit(this);

		return inventoryItem;
	}

	public InventoryItem removeInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().remove(inventoryItem);
		inventoryItem.setPackagingUnit(null);

		return inventoryItem;
	}

}