package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the drawer_pull_report_voidtickets database table.
 * 
 */
@Entity
@Table(name="drawer_pull_report_voidtickets")
@NamedQuery(name="DrawerPullReportVoidticket.findAll", query="SELECT d FROM DrawerPullReportVoidticket d")
public class DrawerPullReportVoidticket implements Serializable {
	private static final long serialVersionUID = 1L;
	private double amount;
	private int code;
	private String hast;
	private int quantity;
	private String reason;
	private DrawerPullReport drawerPullReport;

	public DrawerPullReportVoidticket() {
	}


	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}


	public String getHast() {
		return this.hast;
	}

	public void setHast(String hast) {
		this.hast = hast;
	}


	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}


	//bi-directional many-to-one association to DrawerPullReport
	@ManyToOne
	@JoinColumn(name="DPREPORT_ID")
	public DrawerPullReport getDrawerPullReport() {
		return this.drawerPullReport;
	}

	public void setDrawerPullReport(DrawerPullReport drawerPullReport) {
		this.drawerPullReport = drawerPullReport;
	}

}