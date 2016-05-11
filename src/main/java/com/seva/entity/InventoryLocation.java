package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the inventory_location database table.
 * 
 */
@Entity
@Table(name="inventory_location")
@NamedQuery(name="InventoryLocation.findAll", query="SELECT i FROM InventoryLocation i")
public class InventoryLocation implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int sortOrder;
	private byte visible;
	private Set<InventoryItem> inventoryItems;
	private InventoryWarehouse inventoryWarehouse;

	public InventoryLocation() {
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


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-one association to InventoryItem
	@OneToMany(mappedBy="inventoryLocation")
	public Set<InventoryItem> getInventoryItems() {
		return this.inventoryItems;
	}

	public void setInventoryItems(Set<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}

	public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().add(inventoryItem);
		inventoryItem.setInventoryLocation(this);

		return inventoryItem;
	}

	public InventoryItem removeInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().remove(inventoryItem);
		inventoryItem.setInventoryLocation(null);

		return inventoryItem;
	}


	//bi-directional many-to-one association to InventoryWarehouse
	@ManyToOne
	@JoinColumn(name="WAREHOUSE_ID")
	public InventoryWarehouse getInventoryWarehouse() {
		return this.inventoryWarehouse;
	}

	public void setInventoryWarehouse(InventoryWarehouse inventoryWarehouse) {
		this.inventoryWarehouse = inventoryWarehouse;
	}

}