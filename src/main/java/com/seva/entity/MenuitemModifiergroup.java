package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menuitem_modifiergroup database table.
 * 
 */
@Entity
@Table(name="menuitem_modifiergroup")
@NamedQuery(name="MenuitemModifiergroup.findAll", query="SELECT m FROM MenuitemModifiergroup m")
public class MenuitemModifiergroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int maxQuantity;
	private int minQuantity;
	private int sortOrder;
	private MenuItem menuItem;
	private MenuModifierGroup menuModifierGroup;
	private Set<TicketitemModifiergroup> ticketitemModifiergroups;

	public MenuitemModifiergroup() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	//bi-directional many-to-one association to MenuItem
	@ManyToOne
	@JoinColumn(name="MENUITEM_MODIFIERGROUP_ID")
	public MenuItem getMenuItem() {
		return this.menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}


	//bi-directional many-to-one association to MenuModifierGroup
	@ManyToOne
	@JoinColumn(name="MODIFIER_GROUP")
	public MenuModifierGroup getMenuModifierGroup() {
		return this.menuModifierGroup;
	}

	public void setMenuModifierGroup(MenuModifierGroup menuModifierGroup) {
		this.menuModifierGroup = menuModifierGroup;
	}


	//bi-directional many-to-one association to TicketitemModifiergroup
	@OneToMany(mappedBy="menuitemModifiergroup")
	public Set<TicketitemModifiergroup> getTicketitemModifiergroups() {
		return this.ticketitemModifiergroups;
	}

	public void setTicketitemModifiergroups(Set<TicketitemModifiergroup> ticketitemModifiergroups) {
		this.ticketitemModifiergroups = ticketitemModifiergroups;
	}

	public TicketitemModifiergroup addTicketitemModifiergroup(TicketitemModifiergroup ticketitemModifiergroup) {
		getTicketitemModifiergroups().add(ticketitemModifiergroup);
		ticketitemModifiergroup.setMenuitemModifiergroup(this);

		return ticketitemModifiergroup;
	}

	public TicketitemModifiergroup removeTicketitemModifiergroup(TicketitemModifiergroup ticketitemModifiergroup) {
		getTicketitemModifiergroups().remove(ticketitemModifiergroup);
		ticketitemModifiergroup.setMenuitemModifiergroup(null);

		return ticketitemModifiergroup;
	}

}