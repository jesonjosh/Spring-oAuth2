package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menu_modifier_group database table.
 * 
 */
@Entity
@Table(name="menu_modifier_group")
@NamedQuery(name="MenuModifierGroup.findAll", query="SELECT m FROM MenuModifierGroup m")
public class MenuModifierGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte enabled;
	private byte exclusived;
	private String name;
	private byte required;
	private String translatedName;
	private Set<MenuModifier> menuModifiers;
	private Set<MenuitemModifiergroup> menuitemModifiergroups;

	public MenuModifierGroup() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}


	public byte getExclusived() {
		return this.exclusived;
	}

	public void setExclusived(byte exclusived) {
		this.exclusived = exclusived;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public byte getRequired() {
		return this.required;
	}

	public void setRequired(byte required) {
		this.required = required;
	}


	@Column(name="TRANSLATED_NAME")
	public String getTranslatedName() {
		return this.translatedName;
	}

	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}


	//bi-directional many-to-one association to MenuModifier
	@OneToMany(mappedBy="menuModifierGroup")
	public Set<MenuModifier> getMenuModifiers() {
		return this.menuModifiers;
	}

	public void setMenuModifiers(Set<MenuModifier> menuModifiers) {
		this.menuModifiers = menuModifiers;
	}

	public MenuModifier addMenuModifier(MenuModifier menuModifier) {
		getMenuModifiers().add(menuModifier);
		menuModifier.setMenuModifierGroup(this);

		return menuModifier;
	}

	public MenuModifier removeMenuModifier(MenuModifier menuModifier) {
		getMenuModifiers().remove(menuModifier);
		menuModifier.setMenuModifierGroup(null);

		return menuModifier;
	}


	//bi-directional many-to-one association to MenuitemModifiergroup
	@OneToMany(mappedBy="menuModifierGroup")
	public Set<MenuitemModifiergroup> getMenuitemModifiergroups() {
		return this.menuitemModifiergroups;
	}

	public void setMenuitemModifiergroups(Set<MenuitemModifiergroup> menuitemModifiergroups) {
		this.menuitemModifiergroups = menuitemModifiergroups;
	}

	public MenuitemModifiergroup addMenuitemModifiergroup(MenuitemModifiergroup menuitemModifiergroup) {
		getMenuitemModifiergroups().add(menuitemModifiergroup);
		menuitemModifiergroup.setMenuModifierGroup(this);

		return menuitemModifiergroup;
	}

	public MenuitemModifiergroup removeMenuitemModifiergroup(MenuitemModifiergroup menuitemModifiergroup) {
		getMenuitemModifiergroups().remove(menuitemModifiergroup);
		menuitemModifiergroup.setMenuModifierGroup(null);

		return menuitemModifiergroup;
	}

}