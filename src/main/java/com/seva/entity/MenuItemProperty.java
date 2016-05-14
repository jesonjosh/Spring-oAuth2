package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menu_item_properties database table.
 * 
 */
@Entity
@Table(name="menu_item_properties")
@NamedQuery(name="MenuItemProperty.findAll", query="SELECT m FROM MenuItemProperty m")
public class MenuItemProperty implements Serializable {
	private static final long serialVersionUID = 1L;
	private MenuItemPropertyPK id;
	private String propertyValue;
	private MenuItem menuItem;

	public MenuItemProperty() {
	}


	@Id
	public MenuItemPropertyPK getId() {
		return this.id;
	}

	public void setId(MenuItemPropertyPK id) {
		this.id = id;
	}


	@Column(name="PROPERTY_VALUE")
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}


	//bi-directional many-to-one association to MenuItem
//	@ManyToOne
//	@JoinColumn(name="MENU_ITEM_ID")
	public MenuItem getMenuItem() {
		return this.menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

}