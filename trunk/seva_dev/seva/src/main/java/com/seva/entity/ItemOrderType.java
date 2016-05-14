package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the item_order_type database table.
 * 
 */
@Entity
@Table(name="item_order_type")
@NamedQuery(name="ItemOrderType.findAll", query="SELECT i FROM ItemOrderType i")
public class ItemOrderType implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String orderType;
	private MenuItem menuItem;

	public ItemOrderType() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="ORDER_TYPE")
	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


	//bi-directional many-to-one association to MenuItem
	@ManyToOne
	@JoinColumn(name="MENU_ITEM_ID")
	public MenuItem getMenuItem() {
		return this.menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

}