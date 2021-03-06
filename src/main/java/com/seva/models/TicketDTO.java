package com.seva.models;

import java.util.List;

public class TicketDTO {

	private String id;
	private String create_date;
	private String active_date;
	private String created_hour;
	private String advanceAmount;
	private String is_paid;
	private String deliveryDate;
	private String deliveryAddress;
	private String guest_count;
	private String ticket_type;
	private List<ItemDTO> items = null;
	private List<ShopTableDTO> shopTables = null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getActive_date() {
		return active_date;
	}
	public void setActive_date(String active_date) {
		this.active_date = active_date;
	}
	public String getCreated_hour() {
		return created_hour;
	}
	public void setCreated_hour(String created_hour) {
		this.created_hour = created_hour;
	}
	public String getAdvanceAmount() {
		return advanceAmount;
	}
	public void setAdvanceAmount(String advanceAmount) {
		this.advanceAmount = advanceAmount;
	}
	public String getIs_paid() {
		return is_paid;
	}
	public void setIs_paid(String is_paid) {
		this.is_paid = is_paid;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public String getGuest_count() {
		return guest_count;
	}
	public void setGuest_count(String guest_count) {
		this.guest_count = guest_count;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public List<ShopTableDTO> getShopTables() {
		return shopTables;
	}
	public void setShopTables(List<ShopTableDTO> shopTables) {
		this.shopTables = shopTables;
	}
	public String getTicket_type() {
		return ticket_type;
	}
	public void setTicket_type(String ticket_type) {
		this.ticket_type = ticket_type;
	}
	

}
