package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shop_table_type database table.
 * 
 */
@Entity
@Table(name="shop_table_type")
@NamedQuery(name="ShopTableType.findAll", query="SELECT s FROM ShopTableType s")
public class ShopTableType implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;
	private String name;
	private Set<ShopTable> shopTables;

	public ShopTableType() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-many association to ShopTable
	@ManyToMany
	@JoinTable(
		name="table_type_relation"
		, joinColumns={
			@JoinColumn(name="TYPE_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="TABLE_ID")
			}
		)
	public Set<ShopTable> getShopTables() {
		return this.shopTables;
	}

	public void setShopTables(Set<ShopTable> shopTables) {
		this.shopTables = shopTables;
	}

}