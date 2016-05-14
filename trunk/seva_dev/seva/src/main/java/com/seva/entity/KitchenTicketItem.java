package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the kitchen_ticket_item database table.
 * 
 */
@Entity
@Table(name="kitchen_ticket_item")
@NamedQuery(name="KitchenTicketItem.findAll", query="SELECT k FROM KitchenTicketItem k")
public class KitchenTicketItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte cookable;
	private double fractionalQuantity;
	private byte fractionalUnit;
	private int itemOrder;
	private String menuItemCode;
	private int menuItemGroupId;
	private String menuItemGroupName;
	private String menuItemName;
	private int quantity;
	private int sortOrder;
	private String status;
	private String unitName;
	private byte voided;
	private KitchenTicket kitchenTicket;

	public KitchenTicketItem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getCookable() {
		return this.cookable;
	}

	public void setCookable(byte cookable) {
		this.cookable = cookable;
	}


	@Column(name="FRACTIONAL_QUANTITY")
	public double getFractionalQuantity() {
		return this.fractionalQuantity;
	}

	public void setFractionalQuantity(double fractionalQuantity) {
		this.fractionalQuantity = fractionalQuantity;
	}


	@Column(name="FRACTIONAL_UNIT")
	public byte getFractionalUnit() {
		return this.fractionalUnit;
	}

	public void setFractionalUnit(byte fractionalUnit) {
		this.fractionalUnit = fractionalUnit;
	}


	@Column(name="ITEM_ORDER")
	public int getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(int itemOrder) {
		this.itemOrder = itemOrder;
	}


	@Column(name="MENU_ITEM_CODE")
	public String getMenuItemCode() {
		return this.menuItemCode;
	}

	public void setMenuItemCode(String menuItemCode) {
		this.menuItemCode = menuItemCode;
	}


	@Column(name="MENU_ITEM_GROUP_ID")
	public int getMenuItemGroupId() {
		return this.menuItemGroupId;
	}

	public void setMenuItemGroupId(int menuItemGroupId) {
		this.menuItemGroupId = menuItemGroupId;
	}


	@Column(name="MENU_ITEM_GROUP_NAME")
	public String getMenuItemGroupName() {
		return this.menuItemGroupName;
	}

	public void setMenuItemGroupName(String menuItemGroupName) {
		this.menuItemGroupName = menuItemGroupName;
	}


	@Column(name="MENU_ITEM_NAME")
	public String getMenuItemName() {
		return this.menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}


	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="UNIT_NAME")
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}


	public byte getVoided() {
		return this.voided;
	}

	public void setVoided(byte voided) {
		this.voided = voided;
	}


	//bi-directional many-to-one association to KitchenTicket
	@ManyToOne
	@JoinColumn(name="KITHEN_TICKET_ID")
	public KitchenTicket getKitchenTicket() {
		return this.kitchenTicket;
	}

	public void setKitchenTicket(KitchenTicket kitchenTicket) {
		this.kitchenTicket = kitchenTicket;
	}

}