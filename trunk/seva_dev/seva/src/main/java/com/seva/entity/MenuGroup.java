package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menu_group database table.
 * 
 */
@Entity
@Table(name="menu_group")
@NamedQuery(name="MenuGroup.findAll", query="SELECT m FROM MenuGroup m")
public class MenuGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int btnColor;
	private String name;
	private int sortOrder;
	private int textColor;
	private String translatedName;
	private byte visible;
	private MenuCategory menuCategory;
	private Set<MenuItem> menuItems;
	private Set<CouponAndDiscount> couponAndDiscounts;

	public MenuGroup() {
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-one association to MenuCategory
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	public MenuCategory getMenuCategory() {
		return this.menuCategory;
	}

	public void setMenuCategory(MenuCategory menuCategory) {
		this.menuCategory = menuCategory;
	}


	//bi-directional many-to-one association to MenuItem
	@OneToMany(mappedBy="menuGroup")
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem addMenuItem(MenuItem menuItem) {
		getMenuItems().add(menuItem);
		menuItem.setMenuGroup(this);

		return menuItem;
	}

	public MenuItem removeMenuItem(MenuItem menuItem) {
		getMenuItems().remove(menuItem);
		menuItem.setMenuGroup(null);

		return menuItem;
	}


	//bi-directional many-to-many association to CouponAndDiscount
	@ManyToMany(mappedBy="menuGroups")
	public Set<CouponAndDiscount> getCouponAndDiscounts() {
		return this.couponAndDiscounts;
	}

	public void setCouponAndDiscounts(Set<CouponAndDiscount> couponAndDiscounts) {
		this.couponAndDiscounts = couponAndDiscounts;
	}

}