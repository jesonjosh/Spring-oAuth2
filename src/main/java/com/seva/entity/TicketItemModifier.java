package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ticket_item_modifier database table.
 * 
 */
@Entity
@Table(name="ticket_item_modifier")
@NamedQuery(name="TicketItemModifier.findAll", query="SELECT t FROM TicketItemModifier t")
public class TicketItemModifier implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int addonOrder;
	private int groupId;
	private int itemCount;
	private int itemId;
	private int itemOrder;
	private String modifierName;
	private double modifierPrice;
	private double modifierTaxRate;
	private int modifierType;
	private byte printToKitchen;
	private byte printedToKitchen;
	private double subtotalPrice;
	private double taxAmount;
	private double totalPrice;
	private TicketItem ticketItem1;
	private TicketItem ticketItem2;
	private TicketitemModifiergroup ticketitemModifiergroup1;
	private TicketitemModifiergroup ticketitemModifiergroup2;

	public TicketItemModifier() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ADDON_ORDER")
	public int getAddonOrder() {
		return this.addonOrder;
	}

	public void setAddonOrder(int addonOrder) {
		this.addonOrder = addonOrder;
	}


	@Column(name="GROUP_ID")
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}


	@Column(name="ITEM_COUNT")
	public int getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}


	@Column(name="ITEM_ID")
	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	@Column(name="ITEM_ORDER")
	public int getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(int itemOrder) {
		this.itemOrder = itemOrder;
	}


	@Column(name="MODIFIER_NAME")
	public String getModifierName() {
		return this.modifierName;
	}

	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
	}


	@Column(name="MODIFIER_PRICE")
	public double getModifierPrice() {
		return this.modifierPrice;
	}

	public void setModifierPrice(double modifierPrice) {
		this.modifierPrice = modifierPrice;
	}


	@Column(name="MODIFIER_TAX_RATE")
	public double getModifierTaxRate() {
		return this.modifierTaxRate;
	}

	public void setModifierTaxRate(double modifierTaxRate) {
		this.modifierTaxRate = modifierTaxRate;
	}


	@Column(name="MODIFIER_TYPE")
	public int getModifierType() {
		return this.modifierType;
	}

	public void setModifierType(int modifierType) {
		this.modifierType = modifierType;
	}


	@Column(name="PRINT_TO_KITCHEN")
	public byte getPrintToKitchen() {
		return this.printToKitchen;
	}

	public void setPrintToKitchen(byte printToKitchen) {
		this.printToKitchen = printToKitchen;
	}


	@Column(name="PRINTED_TO_KITCHEN")
	public byte getPrintedToKitchen() {
		return this.printedToKitchen;
	}

	public void setPrintedToKitchen(byte printedToKitchen) {
		this.printedToKitchen = printedToKitchen;
	}


	@Column(name="SUBTOTAL_PRICE")
	public double getSubtotalPrice() {
		return this.subtotalPrice;
	}

	public void setSubtotalPrice(double subtotalPrice) {
		this.subtotalPrice = subtotalPrice;
	}


	@Column(name="TAX_AMOUNT")
	public double getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}


	@Column(name="TOTAL_PRICE")
	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="ADDON_TICKET_ITEM_ID")
	public TicketItem getTicketItem1() {
		return this.ticketItem1;
	}

	public void setTicketItem1(TicketItem ticketItem1) {
		this.ticketItem1 = ticketItem1;
	}


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="TICKET_ITEM_ID")
	public TicketItem getTicketItem2() {
		return this.ticketItem2;
	}

	public void setTicketItem2(TicketItem ticketItem2) {
		this.ticketItem2 = ticketItem2;
	}


	//bi-directional many-to-one association to TicketitemModifiergroup
	@ManyToOne
	@JoinColumn(name="TICKETITEMMODIFIERGROUP_ID")
	public TicketitemModifiergroup getTicketitemModifiergroup1() {
		return this.ticketitemModifiergroup1;
	}

	public void setTicketitemModifiergroup1(TicketitemModifiergroup ticketitemModifiergroup1) {
		this.ticketitemModifiergroup1 = ticketitemModifiergroup1;
	}


	//bi-directional many-to-one association to TicketitemModifiergroup
	@ManyToOne
	@JoinColumn(name="ModifierGroup_ID")
	public TicketitemModifiergroup getTicketitemModifiergroup2() {
		return this.ticketitemModifiergroup2;
	}

	public void setTicketitemModifiergroup2(TicketitemModifiergroup ticketitemModifiergroup2) {
		this.ticketitemModifiergroup2 = ticketitemModifiergroup2;
	}

}