package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menu_modifier database table.
 * 
 */
@Entity
@Table(name="menu_modifier")
@NamedQuery(name="MenuModifier.findAll", query="SELECT m FROM MenuModifier m")
public class MenuModifier implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int btnColor;
	private byte enable;
	private double extraPrice;
	private String name;
	private double price;
	private byte printToKitchen;
	private int sortOrder;
	private int textColor;
	private String translatedName;
	private MenuModifierGroup menuModifierGroup;
	private Tax tax;
	private Set<MenuModifierProperty> menuModifierProperties;

	public MenuModifier() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="BTN_COLOR")
	public int getBtnColor() {
		return this.btnColor;
	}

	public void setBtnColor(int btnColor) {
		this.btnColor = btnColor;
	}


	public byte getEnable() {
		return this.enable;
	}

	public void setEnable(byte enable) {
		this.enable = enable;
	}


	@Column(name="EXTRA_PRICE")
	public double getExtraPrice() {
		return this.extraPrice;
	}

	public void setExtraPrice(double extraPrice) {
		this.extraPrice = extraPrice;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Column(name="PRINT_TO_KITCHEN")
	public byte getPrintToKitchen() {
		return this.printToKitchen;
	}

	public void setPrintToKitchen(byte printToKitchen) {
		this.printToKitchen = printToKitchen;
	}


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	@Column(name="TEXT_COLOR")
	public int getTextColor() {
		return this.textColor;
	}

	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}


	@Column(name="TRANSLATED_NAME")
	public String getTranslatedName() {
		return this.translatedName;
	}

	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}


	//bi-directional many-to-one association to MenuModifierGroup
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	public MenuModifierGroup getMenuModifierGroup() {
		return this.menuModifierGroup;
	}

	public void setMenuModifierGroup(MenuModifierGroup menuModifierGroup) {
		this.menuModifierGroup = menuModifierGroup;
	}


	//bi-directional many-to-one association to Tax
	@ManyToOne
	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}


	//bi-directional many-to-one association to MenuModifierProperty
	@OneToMany(mappedBy="menuModifier")
	public Set<MenuModifierProperty> getMenuModifierProperties() {
		return this.menuModifierProperties;
	}

	public void setMenuModifierProperties(Set<MenuModifierProperty> menuModifierProperties) {
		this.menuModifierProperties = menuModifierProperties;
	}

	public MenuModifierProperty addMenuModifierProperty(MenuModifierProperty menuModifierProperty) {
		getMenuModifierProperties().add(menuModifierProperty);
		menuModifierProperty.setMenuModifier(this);

		return menuModifierProperty;
	}

	public MenuModifierProperty removeMenuModifierProperty(MenuModifierProperty menuModifierProperty) {
		getMenuModifierProperties().remove(menuModifierProperty);
		menuModifierProperty.setMenuModifier(null);

		return menuModifierProperty;
	}

}