package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the recepie database table.
 * 
 */
@Entity
@NamedQuery(name="Recepie.findAll", query="SELECT r FROM Recepie r")
public class Recepie implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Set<MenuItem> menuItems;
	private MenuItem menuItemBean;
	private Set<RecepieItem> recepieItems;

	public Recepie() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	//bi-directional many-to-one association to MenuItem
	@OneToMany(mappedBy="recepieBean")
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public MenuItem addMenuItem(MenuItem menuItem) {
		getMenuItems().add(menuItem);
		menuItem.setRecepieBean(this);

		return menuItem;
	}

	public MenuItem removeMenuItem(MenuItem menuItem) {
		getMenuItems().remove(menuItem);
		menuItem.setRecepieBean(null);

		return menuItem;
	}


	//bi-directional many-to-one association to MenuItem
	@ManyToOne
	@JoinColumn(name="MENU_ITEM")
	public MenuItem getMenuItemBean() {
		return this.menuItemBean;
	}

	public void setMenuItemBean(MenuItem menuItemBean) {
		this.menuItemBean = menuItemBean;
	}


	//bi-directional many-to-one association to RecepieItem
	@OneToMany(mappedBy="recepie")
	public Set<RecepieItem> getRecepieItems() {
		return this.recepieItems;
	}

	public void setRecepieItems(Set<RecepieItem> recepieItems) {
		this.recepieItems = recepieItems;
	}

	public RecepieItem addRecepieItem(RecepieItem recepieItem) {
		getRecepieItems().add(recepieItem);
		recepieItem.setRecepie(this);

		return recepieItem;
	}

	public RecepieItem removeRecepieItem(RecepieItem recepieItem) {
		getRecepieItems().remove(recepieItem);
		recepieItem.setRecepie(null);

		return recepieItem;
	}

}