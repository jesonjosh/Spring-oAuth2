package com.seva.models;

import java.util.List;

public class MenuDTO {

	private String status;
	private List<ItemDTO> items = null;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
}
