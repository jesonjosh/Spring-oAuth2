package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the order_sub_type database table.
 * 
 */
@Entity
@Table(name="order_sub_type")
@NamedQuery(name="OrderSubType.findAll", query="SELECT o FROM OrderSubType o")
public class OrderSubType implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private OrderType orderType;

	public OrderSubType() {
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to OrderType
	@ManyToOne
	@JoinColumn(name="ORDER_TYPE_ID")
	public OrderType getOrderType() {
		return this.orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

}