package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the recepie_item database table.
 * 
 */
@Entity
@Table(name="recepie_item")
@NamedQuery(name="RecepieItem.findAll", query="SELECT r FROM RecepieItem r")
public class RecepieItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte inventoryDeductable;
	private double percentage;
	private InventoryItem inventoryItemBean;
	private Recepie recepie;

	public RecepieItem() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="INVENTORY_DEDUCTABLE")
	public byte getInventoryDeductable() {
		return this.inventoryDeductable;
	}

	public void setInventoryDeductable(byte inventoryDeductable) {
		this.inventoryDeductable = inventoryDeductable;
	}


	public double getPercentage() {
		return this.percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	//bi-directional many-to-one association to InventoryItem
	@ManyToOne
	@JoinColumn(name="INVENTORY_ITEM")
	public InventoryItem getInventoryItemBean() {
		return this.inventoryItemBean;
	}

	public void setInventoryItemBean(InventoryItem inventoryItemBean) {
		this.inventoryItemBean = inventoryItemBean;
	}


	//bi-directional many-to-one association to Recepie
	@ManyToOne
	public Recepie getRecepie() {
		return this.recepie;
	}

	public void setRecepie(Recepie recepie) {
		this.recepie = recepie;
	}

}