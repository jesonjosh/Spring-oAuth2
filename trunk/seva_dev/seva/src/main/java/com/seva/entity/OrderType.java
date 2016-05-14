package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the order_type database table.
 * 
 */
@Entity
@Table(name="order_type")
@NamedQuery(name="OrderType.findAll", query="SELECT o FROM OrderType o")
public class OrderType implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte assignDriver;
	private byte barTab;
	private byte closeOnPaid;
	private byte consolidateTiemsInReceipt;
	private byte enabled;
	private byte hasForhereAndTogo;
	private byte hideItemWithEmptyInventory;
	private String name;
	private byte preAuthCreditCard;
	private byte prepaid;
	private byte requiredCustomerData;
	private byte requiredDeliveryData;
	private byte shouldPrintToKitchen;
	private byte showGuestSelection;
	private byte showInLoginScreen;
	private byte showItemBarcode;
	private byte showTableSelection;
	private Set<OrderSubType> orderSubTypes;

	public OrderType() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ASSIGN_DRIVER")
	public byte getAssignDriver() {
		return this.assignDriver;
	}

	public void setAssignDriver(byte assignDriver) {
		this.assignDriver = assignDriver;
	}


	@Column(name="BAR_TAB")
	public byte getBarTab() {
		return this.barTab;
	}

	public void setBarTab(byte barTab) {
		this.barTab = barTab;
	}


	@Column(name="CLOSE_ON_PAID")
	public byte getCloseOnPaid() {
		return this.closeOnPaid;
	}

	public void setCloseOnPaid(byte closeOnPaid) {
		this.closeOnPaid = closeOnPaid;
	}


	@Column(name="CONSOLIDATE_TIEMS_IN_RECEIPT")
	public byte getConsolidateTiemsInReceipt() {
		return this.consolidateTiemsInReceipt;
	}

	public void setConsolidateTiemsInReceipt(byte consolidateTiemsInReceipt) {
		this.consolidateTiemsInReceipt = consolidateTiemsInReceipt;
	}


	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}


	@Column(name="HAS_FORHERE_AND_TOGO")
	public byte getHasForhereAndTogo() {
		return this.hasForhereAndTogo;
	}

	public void setHasForhereAndTogo(byte hasForhereAndTogo) {
		this.hasForhereAndTogo = hasForhereAndTogo;
	}


	@Column(name="HIDE_ITEM_WITH_EMPTY_INVENTORY")
	public byte getHideItemWithEmptyInventory() {
		return this.hideItemWithEmptyInventory;
	}

	public void setHideItemWithEmptyInventory(byte hideItemWithEmptyInventory) {
		this.hideItemWithEmptyInventory = hideItemWithEmptyInventory;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PRE_AUTH_CREDIT_CARD")
	public byte getPreAuthCreditCard() {
		return this.preAuthCreditCard;
	}

	public void setPreAuthCreditCard(byte preAuthCreditCard) {
		this.preAuthCreditCard = preAuthCreditCard;
	}


	public byte getPrepaid() {
		return this.prepaid;
	}

	public void setPrepaid(byte prepaid) {
		this.prepaid = prepaid;
	}


	@Column(name="REQUIRED_CUSTOMER_DATA")
	public byte getRequiredCustomerData() {
		return this.requiredCustomerData;
	}

	public void setRequiredCustomerData(byte requiredCustomerData) {
		this.requiredCustomerData = requiredCustomerData;
	}


	@Column(name="REQUIRED_DELIVERY_DATA")
	public byte getRequiredDeliveryData() {
		return this.requiredDeliveryData;
	}

	public void setRequiredDeliveryData(byte requiredDeliveryData) {
		this.requiredDeliveryData = requiredDeliveryData;
	}


	@Column(name="SHOULD_PRINT_TO_KITCHEN")
	public byte getShouldPrintToKitchen() {
		return this.shouldPrintToKitchen;
	}

	public void setShouldPrintToKitchen(byte shouldPrintToKitchen) {
		this.shouldPrintToKitchen = shouldPrintToKitchen;
	}


	@Column(name="SHOW_GUEST_SELECTION")
	public byte getShowGuestSelection() {
		return this.showGuestSelection;
	}

	public void setShowGuestSelection(byte showGuestSelection) {
		this.showGuestSelection = showGuestSelection;
	}


	@Column(name="SHOW_IN_LOGIN_SCREEN")
	public byte getShowInLoginScreen() {
		return this.showInLoginScreen;
	}

	public void setShowInLoginScreen(byte showInLoginScreen) {
		this.showInLoginScreen = showInLoginScreen;
	}


	@Column(name="SHOW_ITEM_BARCODE")
	public byte getShowItemBarcode() {
		return this.showItemBarcode;
	}

	public void setShowItemBarcode(byte showItemBarcode) {
		this.showItemBarcode = showItemBarcode;
	}


	@Column(name="SHOW_TABLE_SELECTION")
	public byte getShowTableSelection() {
		return this.showTableSelection;
	}

	public void setShowTableSelection(byte showTableSelection) {
		this.showTableSelection = showTableSelection;
	}


	//bi-directional many-to-one association to OrderSubType
	@OneToMany(mappedBy="orderType")
	public Set<OrderSubType> getOrderSubTypes() {
		return this.orderSubTypes;
	}

	public void setOrderSubTypes(Set<OrderSubType> orderSubTypes) {
		this.orderSubTypes = orderSubTypes;
	}

	public OrderSubType addOrderSubType(OrderSubType orderSubType) {
		getOrderSubTypes().add(orderSubType);
		orderSubType.setOrderType(this);

		return orderSubType;
	}

	public OrderSubType removeOrderSubType(OrderSubType orderSubType) {
		getOrderSubTypes().remove(orderSubType);
		orderSubType.setOrderType(null);

		return orderSubType;
	}

}