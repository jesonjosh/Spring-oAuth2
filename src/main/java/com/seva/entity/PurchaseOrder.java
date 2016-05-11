package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the purchase_order database table.
 * 
 */
@Entity
@Table(name="purchase_order")
@NamedQuery(name="PurchaseOrder.findAll", query="SELECT p FROM PurchaseOrder p")
public class PurchaseOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String orderId;
	private Set<InventoryTransaction> inventoryTransactions;

	public PurchaseOrder() {
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


	@Column(name="ORDER_ID")
	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}


	//bi-directional many-to-one association to InventoryTransaction
	@OneToMany(mappedBy="purchaseOrder")
	public Set<InventoryTransaction> getInventoryTransactions() {
		return this.inventoryTransactions;
	}

	public void setInventoryTransactions(Set<InventoryTransaction> inventoryTransactions) {
		this.inventoryTransactions = inventoryTransactions;
	}

	public InventoryTransaction addInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().add(inventoryTransaction);
		inventoryTransaction.setPurchaseOrder(this);

		return inventoryTransaction;
	}

	public InventoryTransaction removeInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().remove(inventoryTransaction);
		inventoryTransaction.setPurchaseOrder(null);

		return inventoryTransaction;
	}

}