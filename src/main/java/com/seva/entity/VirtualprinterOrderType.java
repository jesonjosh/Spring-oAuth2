package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the virtualprinter_order_type database table.
 * 
 */
@Entity
@Table(name="virtualprinter_order_type")
@NamedQuery(name="VirtualprinterOrderType.findAll", query="SELECT v FROM VirtualprinterOrderType v")
public class VirtualprinterOrderType implements Serializable {
	private static final long serialVersionUID = 1L;
	private String orderType;
	private VirtualPrinter virtualPrinter;

	public VirtualprinterOrderType() {
	}


	@Column(name="ORDER_TYPE")
	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


	//bi-directional many-to-one association to VirtualPrinter
	@ManyToOne
	@JoinColumn(name="printer_id")
	public VirtualPrinter getVirtualPrinter() {
		return this.virtualPrinter;
	}

	public void setVirtualPrinter(VirtualPrinter virtualPrinter) {
		this.virtualPrinter = virtualPrinter;
	}

}