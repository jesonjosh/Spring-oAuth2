package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the inventory_vendor database table.
 * 
 */
@Entity
@Table(name="inventory_vendor")
@NamedQuery(name="InventoryVendor.findAll", query="SELECT i FROM InventoryVendor i")
public class InventoryVendor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private byte visible;
	private Set<InventoryItem> inventoryItems;
	private Set<InventoryTransaction> inventoryTransactions;

	public InventoryVendor() {
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


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-one association to InventoryItem
	@OneToMany(mappedBy="inventoryVendor")
	public Set<InventoryItem> getInventoryItems() {
		return this.inventoryItems;
	}

	public void setInventoryItems(Set<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}

	public InventoryItem addInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().add(inventoryItem);
		inventoryItem.setInventoryVendor(this);

		return inventoryItem;
	}

	public InventoryItem removeInventoryItem(InventoryItem inventoryItem) {
		getInventoryItems().remove(inventoryItem);
		inventoryItem.setInventoryVendor(null);

		return inventoryItem;
	}


	//bi-directional many-to-one association to InventoryTransaction
	@OneToMany(mappedBy="inventoryVendor")
	public Set<InventoryTransaction> getInventoryTransactions() {
		return this.inventoryTransactions;
	}

	public void setInventoryTransactions(Set<InventoryTransaction> inventoryTransactions) {
		this.inventoryTransactions = inventoryTransactions;
	}

	public InventoryTransaction addInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().add(inventoryTransaction);
		inventoryTransaction.setInventoryVendor(this);

		return inventoryTransaction;
	}

	public InventoryTransaction removeInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().remove(inventoryTransaction);
		inventoryTransaction.setInventoryVendor(null);

		return inventoryTransaction;
	}

}