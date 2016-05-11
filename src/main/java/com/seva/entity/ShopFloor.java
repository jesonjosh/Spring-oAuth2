package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shop_floor database table.
 * 
 */
@Entity
@Table(name="shop_floor")
@NamedQuery(name="ShopFloor.findAll", query="SELECT s FROM ShopFloor s")
public class ShopFloor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte[] image;
	private String name;
	private byte occupied;
	private Set<ShopTable> shopTables;

	public ShopFloor() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Lob
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public byte getOccupied() {
		return this.occupied;
	}

	public void setOccupied(byte occupied) {
		this.occupied = occupied;
	}


	//bi-directional many-to-one association to ShopTable
	@OneToMany(mappedBy="shopFloor")
	public Set<ShopTable> getShopTables() {
		return this.shopTables;
	}

	public void setShopTables(Set<ShopTable> shopTables) {
		this.shopTables = shopTables;
	}

	public ShopTable addShopTable(ShopTable shopTable) {
		getShopTables().add(shopTable);
		shopTable.setShopFloor(this);

		return shopTable;
	}

	public ShopTable removeShopTable(ShopTable shopTable) {
		getShopTables().remove(shopTable);
		shopTable.setShopFloor(null);

		return shopTable;
	}

}