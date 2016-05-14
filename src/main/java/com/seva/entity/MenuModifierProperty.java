package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menu_modifier_properties database table.
 * 
 */
@Entity
@Table(name="menu_modifier_properties")
@NamedQuery(name="MenuModifierProperty.findAll", query="SELECT m FROM MenuModifierProperty m")
public class MenuModifierProperty implements Serializable {
	private static final long serialVersionUID = 1L;
	private MenuModifierPropertyPK id;
	private String propertyValue;
	private MenuModifier menuModifier;

	public MenuModifierProperty() {
	}


	@EmbeddedId
	public MenuModifierPropertyPK getId() {
		return this.id;
	}

	public void setId(MenuModifierPropertyPK id) {
		this.id = id;
	}


	@Column(name="PROPERTY_VALUE")
	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}


	//bi-directional many-to-one association to MenuModifier
//	@ManyToOne
//	@JoinColumn(name="MENU_MODIFIER_ID")
	public MenuModifier getMenuModifier() {
		return this.menuModifier;
	}

	public void setMenuModifier(MenuModifier menuModifier) {
		this.menuModifier = menuModifier;
	}

}