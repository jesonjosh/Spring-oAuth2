package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the ticketitem_modifiergroup database table.
 * 
 */
@Entity
@Table(name="ticketitem_modifiergroup")
@NamedQuery(name="TicketitemModifiergroup.findAll", query="SELECT t FROM TicketitemModifiergroup t")
public class TicketitemModifiergroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int itemOrder;
	private int maxQuantity;
	private int minQuantity;
	private Set<TicketItemModifier> ticketItemModifiers1;
	private Set<TicketItemModifier> ticketItemModifiers2;
	private MenuitemModifiergroup menuitemModifiergroup;
	private TicketItem ticketItem1;
	private TicketItem ticketItem2;

	public TicketitemModifiergroup() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="ITEM_ORDER")
	public int getItemOrder() {
		return this.itemOrder;
	}

	public void setItemOrder(int itemOrder) {
		this.itemOrder = itemOrder;
	}


	@Column(name="MAX_QUANTITY")
	public int getMaxQuantity() {
		return this.maxQuantity;
	}

	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}


	@Column(name="MIN_QUANTITY")
	public int getMinQuantity() {
		return this.minQuantity;
	}

	public void setMinQuantity(int minQuantity) {
		this.minQuantity = minQuantity;
	}


	//bi-directional many-to-one association to TicketItemModifier
	@OneToMany(mappedBy="ticketitemModifiergroup1")
	public Set<TicketItemModifier> getTicketItemModifiers1() {
		return this.ticketItemModifiers1;
	}

	public void setTicketItemModifiers1(Set<TicketItemModifier> ticketItemModifiers1) {
		this.ticketItemModifiers1 = ticketItemModifiers1;
	}

	public TicketItemModifier addTicketItemModifiers1(TicketItemModifier ticketItemModifiers1) {
		getTicketItemModifiers1().add(ticketItemModifiers1);
		ticketItemModifiers1.setTicketitemModifiergroup1(this);

		return ticketItemModifiers1;
	}

	public TicketItemModifier removeTicketItemModifiers1(TicketItemModifier ticketItemModifiers1) {
		getTicketItemModifiers1().remove(ticketItemModifiers1);
		ticketItemModifiers1.setTicketitemModifiergroup1(null);

		return ticketItemModifiers1;
	}


	//bi-directional many-to-one association to TicketItemModifier
	@OneToMany(mappedBy="ticketitemModifiergroup2")
	public Set<TicketItemModifier> getTicketItemModifiers2() {
		return this.ticketItemModifiers2;
	}

	public void setTicketItemModifiers2(Set<TicketItemModifier> ticketItemModifiers2) {
		this.ticketItemModifiers2 = ticketItemModifiers2;
	}

	public TicketItemModifier addTicketItemModifiers2(TicketItemModifier ticketItemModifiers2) {
		getTicketItemModifiers2().add(ticketItemModifiers2);
		ticketItemModifiers2.setTicketitemModifiergroup2(this);

		return ticketItemModifiers2;
	}

	public TicketItemModifier removeTicketItemModifiers2(TicketItemModifier ticketItemModifiers2) {
		getTicketItemModifiers2().remove(ticketItemModifiers2);
		ticketItemModifiers2.setTicketitemModifiergroup2(null);

		return ticketItemModifiers2;
	}


	//bi-directional many-to-one association to MenuitemModifiergroup
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	public MenuitemModifiergroup getMenuitemModifiergroup() {
		return this.menuitemModifiergroup;
	}

	public void setMenuitemModifiergroup(MenuitemModifiergroup menuitemModifiergroup) {
		this.menuitemModifiergroup = menuitemModifiergroup;
	}


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="parent")
	public TicketItem getTicketItem1() {
		return this.ticketItem1;
	}

	public void setTicketItem1(TicketItem ticketItem1) {
		this.ticketItem1 = ticketItem1;
	}


	//bi-directional many-to-one association to TicketItem
	@ManyToOne
	@JoinColumn(name="TICKETITEM_ID")
	public TicketItem getTicketItem2() {
		return this.ticketItem2;
	}

	public void setTicketItem2(TicketItem ticketItem2) {
		this.ticketItem2 = ticketItem2;
	}

}