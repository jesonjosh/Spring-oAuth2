package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menu_category database table.
 * 
 */
@Entity
@Table(name="menu_category")
@NamedQuery(name="MenuCategory.findAll", query="SELECT m FROM MenuCategory m")
public class MenuCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte beverage;
	private int btnColor;
	private String name;
	private int sortOrder;
	private int textColor;
	private String translatedName;
	private byte visible;
	private Set<CouponAndDiscount> couponAndDiscounts;
	private Set<MenuGroup> menuGroups;

	public MenuCategory() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getBeverage() {
		return this.beverage;
	}

	public void setBeverage(byte beverage) {
		this.beverage = beverage;
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


	//bi-directional many-to-many association to CouponAndDiscount
	@ManyToMany(mappedBy="menuCategories")
	public Set<CouponAndDiscount> getCouponAndDiscounts() {
		return this.couponAndDiscounts;
	}

	public void setCouponAndDiscounts(Set<CouponAndDiscount> couponAndDiscounts) {
		this.couponAndDiscounts = couponAndDiscounts;
	}


	//bi-directional many-to-one association to MenuGroup
	@OneToMany(mappedBy="menuCategory")
	public Set<MenuGroup> getMenuGroups() {
		return this.menuGroups;
	}

	public void setMenuGroups(Set<MenuGroup> menuGroups) {
		this.menuGroups = menuGroups;
	}

	public MenuGroup addMenuGroup(MenuGroup menuGroup) {
		getMenuGroups().add(menuGroup);
		menuGroup.setMenuCategory(this);

		return menuGroup;
	}

	public MenuGroup removeMenuGroup(MenuGroup menuGroup) {
		getMenuGroups().remove(menuGroup);
		menuGroup.setMenuCategory(null);

		return menuGroup;
	}

}