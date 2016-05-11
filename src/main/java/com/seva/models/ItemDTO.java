package com.seva.models;

/***
 * 
 * @author Joshua Joseph
 *@Since 28-04-2016
 */
public class ItemDTO {
	private Long id;
	private String name;
	private String description;
	private String quantity;
	private String unit;
	
	public ItemDTO(Long id, String name, String description, String quantity,String unit) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unit= unit;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
}
