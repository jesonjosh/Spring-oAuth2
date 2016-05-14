package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the ticket_item database table.
 * 
 */
@Entity
@Table(name="ticket_item")
@NamedQuery(name="TicketItem.findAll", query="SELECT t FROM TicketItem t")
public class TicketItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte beverage;
	private String categoryName;
	private double discount;
	private byte fractionalUnit;
	private String groupName;
	private byte hasModiiers;
	private byte inventoryHandled;
	private int itemCount;
	private int itemId;
	private String itemName;
	private double itemPrice;
	private double itemQuantity;
	private double itemTaxRate;
	private String itemUnitName;
	private byte printToKitchen;
	private byte printedToKitchen;
	private byte stockAmountAdjusted;
	private double subTotal;
	private double subTotalWithoutModifiers;
	private double taxAmount;
	private double taxAmountWithoutModifiers;
	private double totalPrice;
	private double totalPriceWithoutModifiers;
	private PrinterGroup printerGroup;
	private Ticket ticket;
	private Set<TicketItemCookingInstruction> ticketItemCookingInstructions;
	private Set<TicketItemDiscount> ticketItemDiscounts;
	private Set<TicketItemModifier> ticketItemModifiers1;
	private Set<TicketItemModifier> ticketItemModifiers2;
	private Set<TicketitemModifiergroup> ticketitemModifiergroups1;
	private Set<TicketitemModifiergroup> ticketitemModifiergroups2;

	public TicketItem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getBeverage() {
		return this.beverage;
	}

	public void setBeverage(byte beverage) {
		this.beverage = beverage;
	}


	@Column(name="CATEGORY_NAME")
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Column(name="FRACTIONAL_UNIT")
	public byte getFractionalUnit() {
		return this.fractionalUnit;
	}

	public void setFractionalUnit(byte fractionalUnit) {
		this.fractionalUnit = fractionalUnit;
	}


	@Column(name="GROUP_NAME")
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Column(name="HAS_MODIIERS")
	public byte getHasModiiers() {
		return this.hasModiiers;
	}

	public void setHasModiiers(byte hasModiiers) {
		this.hasModiiers = hasModiiers;
	}


	@Column(name="INVENTORY_HANDLED")
	public byte getInventoryHandled() {
		return this.inventoryHandled;
	}

	public void setInventoryHandled(byte inventoryHandled) {
		this.inventoryHandled = inventoryHandled;
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


	@Column(name="ITEM_NAME")
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	@Column(name="ITEM_PRICE")
	public double getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}


	@Column(name="ITEM_QUANTITY")
	public double getItemQuantity() {
		return this.itemQuantity;
	}

	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	@Column(name="ITEM_TAX_RATE")
	public double getItemTaxRate() {
		return this.itemTaxRate;
	}

	public void setItemTaxRate(double itemTaxRate) {
		this.itemTaxRate = itemTaxRate;
	}


	@Column(name="ITEM_UNIT_NAME")
	public String getItemUnitName() {
		return this.itemUnitName;
	}

	public void setItemUnitName(String itemUnitName) {
		this.itemUnitName = itemUnitName;
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


	@Column(name="STOCK_AMOUNT_ADJUSTED")
	public byte getStockAmountAdjusted() {
		return this.stockAmountAdjusted;
	}

	public void setStockAmountAdjusted(byte stockAmountAdjusted) {
		this.stockAmountAdjusted = stockAmountAdjusted;
	}


	@Column(name="SUB_TOTAL")
	public double getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	@Column(name="SUB_TOTAL_WITHOUT_MODIFIERS")
	public double getSubTotalWithoutModifiers() {
		return this.subTotalWithoutModifiers;
	}

	public void setSubTotalWithoutModifiers(double subTotalWithoutModifiers) {
		this.subTotalWithoutModifiers = subTotalWithoutModifiers;
	}


	@Column(name="TAX_AMOUNT")
	public double getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}


	@Column(name="TAX_AMOUNT_WITHOUT_MODIFIERS")
	public double getTaxAmountWithoutModifiers() {
		return this.taxAmountWithoutModifiers;
	}

	public void setTaxAmountWithoutModifiers(double taxAmountWithoutModifiers) {
		this.taxAmountWithoutModifiers = taxAmountWithoutModifiers;
	}


	@Column(name="TOTAL_PRICE")
	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}


	@Column(name="TOTAL_PRICE_WITHOUT_MODIFIERS")
	public double getTotalPriceWithoutModifiers() {
		return this.totalPriceWithoutModifiers;
	}

	public void setTotalPriceWithoutModifiers(double totalPriceWithoutModifiers) {
		this.totalPriceWithoutModifiers = totalPriceWithoutModifiers;
	}


	//bi-directional many-to-one association to PrinterGroup
	@ManyToOne
	@JoinColumn(name="PG_ID")
	public PrinterGroup getPrinterGroup() {
		return this.printerGroup;
	}

	public void setPrinterGroup(PrinterGroup printerGroup) {
		this.printerGroup = printerGroup;
	}


	//bi-directional many-to-one association to Ticket
	@ManyToOne
	public Ticket getTicket() {
		return this.ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}


	//bi-directional many-to-one association to TicketItemCookingInstruction
	@OneToMany(mappedBy="ticketItem")
	public Set<TicketItemCookingInstruction> getTicketItemCookingInstructions() {
		return this.ticketItemCookingInstructions;
	}

	public void setTicketItemCookingInstructions(Set<TicketItemCookingInstruction> ticketItemCookingInstructions) {
		this.ticketItemCookingInstructions = ticketItemCookingInstructions;
	}

	public TicketItemCookingInstruction addTicketItemCookingInstruction(TicketItemCookingInstruction ticketItemCookingInstruction) {
		getTicketItemCookingInstructions().add(ticketItemCookingInstruction);
		ticketItemCookingInstruction.setTicketItem(this);

		return ticketItemCookingInstruction;
	}

	public TicketItemCookingInstruction removeTicketItemCookingInstruction(TicketItemCookingInstruction ticketItemCookingInstruction) {
		getTicketItemCookingInstructions().remove(ticketItemCookingInstruction);
		ticketItemCookingInstruction.setTicketItem(null);

		return ticketItemCookingInstruction;
	}


	//bi-directional many-to-one association to TicketItemDiscount
	@OneToMany(mappedBy="ticketItem")
	public Set<TicketItemDiscount> getTicketItemDiscounts() {
		return this.ticketItemDiscounts;
	}

	public void setTicketItemDiscounts(Set<TicketItemDiscount> ticketItemDiscounts) {
		this.ticketItemDiscounts = ticketItemDiscounts;
	}

	public TicketItemDiscount addTicketItemDiscount(TicketItemDiscount ticketItemDiscount) {
		getTicketItemDiscounts().add(ticketItemDiscount);
		ticketItemDiscount.setTicketItem(this);

		return ticketItemDiscount;
	}

	public TicketItemDiscount removeTicketItemDiscount(TicketItemDiscount ticketItemDiscount) {
		getTicketItemDiscounts().remove(ticketItemDiscount);
		ticketItemDiscount.setTicketItem(null);

		return ticketItemDiscount;
	}


	//bi-directional many-to-one association to TicketItemModifier
	@OneToMany(mappedBy="ticketItem1")
	public Set<TicketItemModifier> getTicketItemModifiers1() {
		return this.ticketItemModifiers1;
	}

	public void setTicketItemModifiers1(Set<TicketItemModifier> ticketItemModifiers1) {
		this.ticketItemModifiers1 = ticketItemModifiers1;
	}

	public TicketItemModifier addTicketItemModifiers1(TicketItemModifier ticketItemModifiers1) {
		getTicketItemModifiers1().add(ticketItemModifiers1);
		ticketItemModifiers1.setTicketItem1(this);

		return ticketItemModifiers1;
	}

	public TicketItemModifier removeTicketItemModifiers1(TicketItemModifier ticketItemModifiers1) {
		getTicketItemModifiers1().remove(ticketItemModifiers1);
		ticketItemModifiers1.setTicketItem1(null);

		return ticketItemModifiers1;
	}


	//bi-directional many-to-one association to TicketItemModifier
	@OneToMany(mappedBy="ticketItem2")
	public Set<TicketItemModifier> getTicketItemModifiers2() {
		return this.ticketItemModifiers2;
	}

	public void setTicketItemModifiers2(Set<TicketItemModifier> ticketItemModifiers2) {
		this.ticketItemModifiers2 = ticketItemModifiers2;
	}

	public TicketItemModifier addTicketItemModifiers2(TicketItemModifier ticketItemModifiers2) {
		getTicketItemModifiers2().add(ticketItemModifiers2);
		ticketItemModifiers2.setTicketItem2(this);

		return ticketItemModifiers2;
	}

	public TicketItemModifier removeTicketItemModifiers2(TicketItemModifier ticketItemModifiers2) {
		getTicketItemModifiers2().remove(ticketItemModifiers2);
		ticketItemModifiers2.setTicketItem2(null);

		return ticketItemModifiers2;
	}


	//bi-directional many-to-one association to TicketitemModifiergroup
	@OneToMany(mappedBy="ticketItem1")
	public Set<TicketitemModifiergroup> getTicketitemModifiergroups1() {
		return this.ticketitemModifiergroups1;
	}

	public void setTicketitemModifiergroups1(Set<TicketitemModifiergroup> ticketitemModifiergroups1) {
		this.ticketitemModifiergroups1 = ticketitemModifiergroups1;
	}

	public TicketitemModifiergroup addTicketitemModifiergroups1(TicketitemModifiergroup ticketitemModifiergroups1) {
		getTicketitemModifiergroups1().add(ticketitemModifiergroups1);
		ticketitemModifiergroups1.setTicketItem1(this);

		return ticketitemModifiergroups1;
	}

	public TicketitemModifiergroup removeTicketitemModifiergroups1(TicketitemModifiergroup ticketitemModifiergroups1) {
		getTicketitemModifiergroups1().remove(ticketitemModifiergroups1);
		ticketitemModifiergroups1.setTicketItem1(null);

		return ticketitemModifiergroups1;
	}


	//bi-directional many-to-one association to TicketitemModifiergroup
	@OneToMany(mappedBy="ticketItem2")
	public Set<TicketitemModifiergroup> getTicketitemModifiergroups2() {
		return this.ticketitemModifiergroups2;
	}

	public void setTicketitemModifiergroups2(Set<TicketitemModifiergroup> ticketitemModifiergroups2) {
		this.ticketitemModifiergroups2 = ticketitemModifiergroups2;
	}

	public TicketitemModifiergroup addTicketitemModifiergroups2(TicketitemModifiergroup ticketitemModifiergroups2) {
		getTicketitemModifiergroups2().add(ticketitemModifiergroups2);
		ticketitemModifiergroups2.setTicketItem2(this);

		return ticketitemModifiergroups2;
	}

	public TicketitemModifiergroup removeTicketitemModifiergroups2(TicketitemModifiergroup ticketitemModifiergroups2) {
		getTicketitemModifiergroups2().remove(ticketitemModifiergroups2);
		ticketitemModifiergroups2.setTicketItem2(null);

		return ticketitemModifiergroups2;
	}

}