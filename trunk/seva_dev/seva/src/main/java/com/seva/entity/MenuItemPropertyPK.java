package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the menu_item_properties database table.
 * 
 */
@Embeddable
public class MenuItemPropertyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int menuItemId;
	private String propertyName;

	public MenuItemPropertyPK() {
	}

	@Column(name="MENU_ITEM_ID", insertable=false, updatable=false)
	public int getMenuItemId() {
		return this.menuItemId;
	}
	public void setMenuItemId(int menuItemId) {
		this.menuItemId = menuItemId;
	}

	@Column(name="PROPERTY_NAME")
	public String getPropertyName() {
		return this.propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MenuItemPropertyPK)) {
			return false;
		}
		MenuItemPropertyPK castOther = (MenuItemPropertyPK)other;
		return 
			(this.menuItemId == castOther.menuItemId)
			&& this.propertyName.equals(castOther.propertyName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.menuItemId;
		hash = hash * prime + this.propertyName.hashCode();
		
		return hash;
	}
}