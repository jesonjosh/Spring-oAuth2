package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the inventory_group database table.
 * 
 */
@Entity
@Table(name="inventory_group")
@NamedQuery(name="InventoryGroup.findAll", query="SELECT i FROM InventoryGroup i")
public class InventoryGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private byte visible;
	private Set<InventoryItem> inventoryItems;

	public InventoryGroup() {
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


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-one association to InventoryItem
	@OneToMany(mappedBy="inventoryGroup")
	public Set<InventoryItem> getInventoryItems() {
		return this.inventoryItems;
	}

	public void setInventoryItems(Set<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}

	public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().add(inventoryItem);
		inventoryItem.setInventoryGroup(this);

		return inventoryItem;
	}

	public InventoryItem removeInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().remove(inventoryItem);
		inventoryItem.setInventoryGroup(null);

		return inventoryItem;
	}

}