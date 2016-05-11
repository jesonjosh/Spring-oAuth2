package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the inventory_transaction database table.
 * 
 */
@Entity
@Table(name="inventory_transaction")
@NamedQuery(name="InventoryTransaction.findAll", query="SELECT i FROM InventoryTransaction i")
public class InventoryTransaction implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int quantity;
	private String remark;
	private int tranType;
	private Date transactionDate;
	private double unitPrice;
	private PurchaseOrder purchaseOrder;
	private InventoryItem inventoryItem;
	private InventoryVendor inventoryVendor;
	private InventoryWarehouse inventoryWarehouse1;
	private InventoryWarehouse inventoryWarehouse2;

	public InventoryTransaction() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Column(name="TRAN_TYPE")
	public int getTranType() {
		return this.tranType;
	}

	public void setTranType(int tranType) {
		this.tranType = tranType;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TRANSACTION_DATE")
	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


	@Column(name="UNIT_PRICE")
	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	//bi-directional many-to-one association to PurchaseOrder
	@ManyToOne
	@JoinColumn(name="REFERENCE_ID")
	public PurchaseOrder getPurchaseOrder() {
		return this.purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}


	//bi-directional many-to-one association to InventoryItem
	@ManyToOne
	@JoinColumn(name="ITEM_ID")
	public InventoryItem getInventoryItem() {
		return this.inventoryItem;
	}

	public void setInventoryItem(InventoryItem inventoryItem) {
		this.inventoryItem = inventoryItem;
	}


	//bi-directional many-to-one association to InventoryVendor
	@ManyToOne
	@JoinColumn(name="VENDOR_ID")
	public InventoryVendor getInventoryVendor() {
		return this.inventoryVendor;
	}

	public void setInventoryVendor(InventoryVendor inventoryVendor) {
		this.inventoryVendor = inventoryVendor;
	}


	//bi-directional many-to-one association to InventoryWarehouse
	@ManyToOne
	@JoinColumn(name="TO_WAREHOUSE_ID")
	public InventoryWarehouse getInventoryWarehouse1() {
		return this.inventoryWarehouse1;
	}

	public void setInventoryWarehouse1(InventoryWarehouse inventoryWarehouse1) {
		this.inventoryWarehouse1 = inventoryWarehouse1;
	}


	//bi-directional many-to-one association to InventoryWarehouse
	@ManyToOne
	@JoinColumn(name="FROM_WAREHOUSE_ID")
	public InventoryWarehouse getInventoryWarehouse2() {
		return this.inventoryWarehouse2;
	}

	public void setInventoryWarehouse2(InventoryWarehouse inventoryWarehouse2) {
		this.inventoryWarehouse2 = inventoryWarehouse2;
	}

}