package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the shop_table database table.
 * 
 */
@Entity
@Table(name="shop_table")
@NamedQuery(name="ShopTable.findAll", query="SELECT s FROM ShopTable s")
public class ShopTable implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte booked;
	private int capacity;
	private String description;
	private byte dirty;
	private byte disable;
	private byte free;
	private String name;
	private byte serving;
	private int x;
	private int y;
	private ShopFloor shopFloor;
	private Set<TableBookingInfo> tableBookingInfos;
	private Set<ShopTableType> shopTableTypes;

	public ShopTable() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getBooked() {
		return this.booked;
	}

	public void setBooked(byte booked) {
		this.booked = booked;
	}


	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public byte getDirty() {
		return this.dirty;
	}

	public void setDirty(byte dirty) {
		this.dirty = dirty;
	}


	public byte getDisable() {
		return this.disable;
	}

	public void setDisable(byte disable) {
		this.disable = disable;
	}


	public byte getFree() {
		return this.free;
	}

	public void setFree(byte free) {
		this.free = free;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public byte getServing() {
		return this.serving;
	}

	public void setServing(byte serving) {
		this.serving = serving;
	}


	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}


	//bi-directional many-to-one association to ShopFloor
	@ManyToOne
	@JoinColumn(name="FLOOR_ID")
	public ShopFloor getShopFloor() {
		return this.shopFloor;
	}

	public void setShopFloor(ShopFloor shopFloor) {
		this.shopFloor = shopFloor;
	}


	//bi-directional many-to-many association to TableBookingInfo
	@ManyToMany
	@JoinTable(
		name="table_booking_mapping"
		, joinColumns={
			@JoinColumn(name="TABLE_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="BOOKING_ID")
			}
		)
	public Set<TableBookingInfo> getTableBookingInfos() {
		return this.tableBookingInfos;
	}

	public void setTableBookingInfos(Set<TableBookingInfo> tableBookingInfos) {
		this.tableBookingInfos = tableBookingInfos;
	}


	//bi-directional many-to-many association to ShopTableType
	@ManyToMany(mappedBy="shopTables")
	public Set<ShopTableType> getShopTableTypes() {
		return this.shopTableTypes;
	}

	public void setShopTableTypes(Set<ShopTableType> shopTableTypes) {
		this.shopTableTypes = shopTableTypes;
	}

}