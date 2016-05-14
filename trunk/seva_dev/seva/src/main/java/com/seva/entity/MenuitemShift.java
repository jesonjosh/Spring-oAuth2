package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menuitem_shift database table.
 * 
 */
@Entity
@Table(name="menuitem_shift")
@NamedQuery(name="MenuitemShift.findAll", query="SELECT m FROM MenuitemShift m")
public class MenuitemShift implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double shiftPrice;
	private MenuItem menuItem;
	private Shift shift;

	public MenuitemShift() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="SHIFT_PRICE")
	public double getShiftPrice() {
		return this.shiftPrice;
	}

	public void setShiftPrice(double shiftPrice) {
		this.shiftPrice = shiftPrice;
	}


	//bi-directional many-to-one association to MenuItem
	@ManyToOne
	public MenuItem getMenuItem() {
		return this.menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}


	//bi-directional many-to-one association to Shift
	@ManyToOne
	public Shift getShift() {
		return this.shift;
	}

	public void setShift(Shift shift) {
		this.shift = shift;
	}

}