package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the menu_modifier_properties database table.
 * 
 */
@Embeddable
public class MenuModifierPropertyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private int menuModifierId;
	private String propertyName;

	public MenuModifierPropertyPK() {
	}

	@Column(name="MENU_MODIFIER_ID", insertable=false, updatable=false)
	public int getMenuModifierId() {
		return this.menuModifierId;
	}
	public void setMenuModifierId(int menuModifierId) {
		this.menuModifierId = menuModifierId;
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
		if (!(other instanceof MenuModifierPropertyPK)) {
			return false;
		}
		MenuModifierPropertyPK castOther = (MenuModifierPropertyPK)other;
		return 
			(this.menuModifierId == castOther.menuModifierId)
			&& this.propertyName.equals(castOther.propertyName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.menuModifierId;
		hash = hash * prime + this.propertyName.hashCode();
		
		return hash;
	}
}