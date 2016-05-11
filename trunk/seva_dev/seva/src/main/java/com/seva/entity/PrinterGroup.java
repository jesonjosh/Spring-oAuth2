package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the printer_group database table.
 * 
 */
@Entity
@Table(name="printer_group")
@NamedQuery(name="PrinterGroup.findAll", query="SELECT p FROM PrinterGroup p")
public class PrinterGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte isDefault;
	private String name;
	private Set<KitchenTicket> kitchenTickets;
	private Set<MenuItem> menuItems;
	private Set<PrinterGroupPrinter> printerGroupPrinters;
	private Set<TicketItem> ticketItems;

	public PrinterGroup() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="IS_DEFAULT")
	public byte getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(byte isDefault) {
		this.isDefault = isDefault;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to KitchenTicket
	@OneToMany(mappedBy="printerGroup")
	public Set<KitchenTicket> getKitchenTickets() {
		return this.kitchenTickets;
	}

	public void setKitchenTickets(Set<KitchenTicket> kitchenTickets) {
		this.kitchenTickets = kitchenTickets;
	}

	public KitchenTicket addKitchenTicket(KitchenTicket kitchenTicket) {
		getKitchenTickets().add(kitchenTicket);
		kitchenTicket.setPrinterGroup(this);

		return kitchenTicket;
	}

	public KitchenTicket removeKitchenTicket(KitchenTicket kitchenTicket) {
		getKitchenTickets().remove(kitchenTicket);
		kitchenTicket.setPrinterGroup(null);

		return kitchenTicket;
	}


	//bi-directional many-to-one association to MenuItem
	@OneToMany(mappedBy="printerGroup")
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem addMenuItem(MenuItem menuItem) {
		getMenuItems().add(menuItem);
		menuItem.setPrinterGroup(this);

		return menuItem;
	}

	public MenuItem removeMenuItem(MenuItem menuItem) {
		getMenuItems().remove(menuItem);
		menuItem.setPrinterGroup(null);

		return menuItem;
	}


	//bi-directional many-to-one association to PrinterGroupPrinter
	@OneToMany(mappedBy="printerGroup")
	public Set<PrinterGroupPrinter> getPrinterGroupPrinters() {
		return this.printerGroupPrinters;
	}

	public void setPrinterGroupPrinters(Set<PrinterGroupPrinter> printerGroupPrinters) {
		this.printerGroupPrinters = printerGroupPrinters;
	}

	public PrinterGroupPrinter addPrinterGroupPrinter(PrinterGroupPrinter printerGroupPrinter) {
		getPrinterGroupPrinters().add(printerGroupPrinter);
		printerGroupPrinter.setPrinterGroup(this);

		return printerGroupPrinter;
	}

	public PrinterGroupPrinter removePrinterGroupPrinter(PrinterGroupPrinter printerGroupPrinter) {
		getPrinterGroupPrinters().remove(printerGroupPrinter);
		printerGroupPrinter.setPrinterGroup(null);

		return printerGroupPrinter;
	}


	//bi-directional many-to-one association to TicketItem
	@OneToMany(mappedBy="printerGroup")
	public Set<TicketItem> getTicketItems() {
		return this.ticketItems;
	}

	public void setTicketItems(Set<TicketItem> ticketItems) {
		this.ticketItems = ticketItems;
	}

	public TicketItem addTicketItem(TicketItem ticketItem) {
		getTicketItems().add(ticketItem);
		ticketItem.setPrinterGroup(this);

		return ticketItem;
	}

	public TicketItem removeTicketItem(TicketItem ticketItem) {
		getTicketItems().remove(ticketItem);
		ticketItem.setPrinterGroup(null);

		return ticketItem;
	}

}