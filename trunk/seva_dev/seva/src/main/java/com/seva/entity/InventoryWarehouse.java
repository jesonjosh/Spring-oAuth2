package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the inventory_warehouse database table.
 * 
 */
@Entity
@Table(name="inventory_warehouse")
@NamedQuery(name="InventoryWarehouse.findAll", query="SELECT i FROM InventoryWarehouse i")
public class InventoryWarehouse implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private byte visible;
	private Set<InventoryLocation> inventoryLocations;
	private Set<InventoryTransaction> inventoryTransactions1;
	private Set<InventoryTransaction> inventoryTransactions2;

	public InventoryWarehouse() {
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


	//bi-directional many-to-one association to InventoryLocation
	@OneToMany(mappedBy="inventoryWarehouse")
	public Set<InventoryLocation> getInventoryLocations() {
		return this.inventoryLocations;
	}

	public void setInventoryLocations(Set<InventoryLocation> inventoryLocations) {
		this.inventoryLocations = inventoryLocations;
	}

	public InventoryLocation addInventoryLocation(InventoryLocation inventoryLocation) {
		getInventoryLocations().add(inventoryLocation);
		inventoryLocation.setInventoryWarehouse(this);

		return inventoryLocation;
	}

	public InventoryLocation removeInventoryLocation(InventoryLocation inventoryLocation) {
		getInventoryLocations().remove(inventoryLocation);
		inventoryLocation.setInventoryWarehouse(null);

		return inventoryLocation;
	}


	//bi-directional many-to-one association to InventoryTransaction
	@OneToMany(mappedBy="inventoryWarehouse1")
	public Set<InventoryTransaction> getInventoryTransactions1() {
		return this.inventoryTransactions1;
	}

	public void setInventoryTransactions1(Set<InventoryTransaction> inventoryTransactions1) {
		this.inventoryTransactions1 = inventoryTransactions1;
	}

	public InventoryTransaction addInventoryTransactions1(InventoryTransaction inventoryTransactions1) {
		getInventoryTransactions1().add(inventoryTransactions1);
		inventoryTransactions1.setInventoryWarehouse1(this);

		return inventoryTransactions1;
	}

	public InventoryTransaction removeInventoryTransactions1(InventoryTransaction inventoryTransactions1) {
		getInventoryTransactions1().remove(inventoryTransactions1);
		inventoryTransactions1.setInventoryWarehouse1(null);

		return inventoryTransactions1;
	}


	//bi-directional many-to-one association to InventoryTransaction
	@OneToMany(mappedBy="inventoryWarehouse2")
	public Set<InventoryTransaction> getInventoryTransactions2() {
		return this.inventoryTransactions2;
	}

	public void setInventoryTransactions2(Set<InventoryTransaction> inventoryTransactions2) {
		this.inventoryTransactions2 = inventoryTransactions2;
	}

	public InventoryTransaction addInventoryTransactions2(InventoryTransaction inventoryTransactions2) {
		getInventoryTransactions2().add(inventoryTransactions2);
		inventoryTransactions2.setInventoryWarehouse2(this);

		return inventoryTransactions2;
	}

	public InventoryTransaction removeInventoryTransactions2(InventoryTransaction inventoryTransactions2) {
		getInventoryTransactions2().remove(inventoryTransactions2);
		inventoryTransactions2.setInventoryWarehouse2(null);

		return inventoryTransactions2;
	}

}