package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the tax database table.
 * 
 */
@Entity
@NamedQuery(name="Tax.findAll", query="SELECT t FROM Tax t")
public class Tax implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double rate;
	private Set<MenuItem> menuItems;
	private Set<MenuModifier> menuModifiers;

	public Tax() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}


	//bi-directional many-to-one association to MenuItem
	@OneToMany(mappedBy="tax")
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem addMenuItem(MenuItem menuItem) {
		getMenuItems().add(menuItem);
		menuItem.setTax(this);

		return menuItem;
	}

	public MenuItem removeMenuItem(MenuItem menuItem) {
		getMenuItems().remove(menuItem);
		menuItem.setTax(null);

		return menuItem;
	}


	//bi-directional many-to-one association to MenuModifier
	@OneToMany(mappedBy="tax")
	public Set<MenuModifier> getMenuModifiers() {
		return this.menuModifiers;
	}

	public void setMenuModifiers(Set<MenuModifier> menuModifiers) {
		this.menuModifiers = menuModifiers;
	}

	public MenuModifier addMenuModifier(MenuModifier menuModifier) {
		getMenuModifiers().add(menuModifier);
		menuModifier.setTax(this);

		return menuModifier;
	}

	public MenuModifier removeMenuModifier(MenuModifier menuModifier) {
		getMenuModifiers().remove(menuModifier);
		menuModifier.setTax(null);

		return menuModifier;
	}

}