package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the menu_item database table.
 * 
 */
@Entity
@Table(name="menu_item")
@NamedQuery(name="MenuItem.findAll", query="SELECT m FROM MenuItem m")
public class MenuItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String barcode;
	private int btnColor;
	private double buyPrice;
	private String description;
	private byte disableWhenStockAmountIsZero;
	private double discountRate;
	private byte fractionalUnit;
	private byte[] image;
	private String name;
	private double price;
	private byte showImageOnly;
	private int sortOrder;
	private double stockAmount;
	private int textColor;
	private String translatedName;
	private String unitName;
	private byte visible;
	private Set<CouponAndDiscount> couponAndDiscounts;
	private Set<ItemOrderType> itemOrderTypes;
	private MenuGroup menuGroup;
	private PrinterGroup printerGroup;
	private Recepie recepieBean;
	private Tax tax;
	private Set<Terminal> terminals;
	private Set<MenuItemProperty> menuItemProperties;
	private Set<MenuitemModifiergroup> menuitemModifiergroups;
	private Set<MenuitemShift> menuitemShifts;
	private Set<Recepie> recepies;

	public MenuItem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	@Column(name="BTN_COLOR")
	public int getBtnColor() {
		return this.btnColor;
	}

	public void setBtnColor(int btnColor) {
		this.btnColor = btnColor;
	}


	@Column(name="BUY_PRICE")
	public double getBuyPrice() {
		return this.buyPrice;
	}

	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Column(name="DISABLE_WHEN_STOCK_AMOUNT_IS_ZERO")
	public byte getDisableWhenStockAmountIsZero() {
		return this.disableWhenStockAmountIsZero;
	}

	public void setDisableWhenStockAmountIsZero(byte disableWhenStockAmountIsZero) {
		this.disableWhenStockAmountIsZero = disableWhenStockAmountIsZero;
	}


	@Column(name="DISCOUNT_RATE")
	public double getDiscountRate() {
		return this.discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	@Column(name="FRACTIONAL_UNIT")
	public byte getFractionalUnit() {
		return this.fractionalUnit;
	}

	public void setFractionalUnit(byte fractionalUnit) {
		this.fractionalUnit = fractionalUnit;
	}


	@Lob
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	@Column(name="SHOW_IMAGE_ONLY")
	public byte getShowImageOnly() {
		return this.showImageOnly;
	}

	public void setShowImageOnly(byte showImageOnly) {
		this.showImageOnly = showImageOnly;
	}


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	@Column(name="STOCK_AMOUNT")
	public double getStockAmount() {
		return this.stockAmount;
	}

	public void setStockAmount(double stockAmount) {
		this.stockAmount = stockAmount;
	}


	@Column(name="TEXT_COLOR")
	public int getTextColor() {
		return this.textColor;
	}

	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}


	@Column(name="TRANSLATED_NAME")
	public String getTranslatedName() {
		return this.translatedName;
	}

	public void setTranslatedName(String translatedName) {
		this.translatedName = translatedName;
	}


	@Column(name="UNIT_NAME")
	public String getUnitName() {
		return this.unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-many association to CouponAndDiscount
	@ManyToMany(mappedBy="menuItems")
	public Set<CouponAndDiscount> getCouponAndDiscounts() {
		return this.couponAndDiscounts;
	}

	public void setCouponAndDiscounts(Set<CouponAndDiscount> couponAndDiscounts) {
		this.couponAndDiscounts = couponAndDiscounts;
	}


	//bi-directional many-to-one association to ItemOrderType
	@OneToMany(mappedBy="menuItem")
	public Set<ItemOrderType> getItemOrderTypes() {
		return this.itemOrderTypes;
	}

	public void setItemOrderTypes(Set<ItemOrderType> itemOrderTypes) {
		this.itemOrderTypes = itemOrderTypes;
	}

	public ItemOrderType addItemOrderType(ItemOrderType itemOrderType) {
		getItemOrderTypes().add(itemOrderType);
		itemOrderType.setMenuItem(this);

		return itemOrderType;
	}

	public ItemOrderType removeItemOrderType(ItemOrderType itemOrderType) {
		getItemOrderTypes().remove(itemOrderType);
		itemOrderType.setMenuItem(null);

		return itemOrderType;
	}


	//bi-directional many-to-one association to MenuGroup
	@ManyToOne
	@JoinColumn(name="GROUP_ID")
	public MenuGroup getMenuGroup() {
		return this.menuGroup;
	}

	public void setMenuGroup(MenuGroup menuGroup) {
		this.menuGroup = menuGroup;
	}


	//bi-directional many-to-one association to PrinterGroup
	@ManyToOne
	@JoinColumn(name="PG_ID")
	public PrinterGroup getPrinterGroup() {
		return this.printerGroup;
	}

	public void setPrinterGroup(PrinterGroup printerGroup) {
		this.printerGroup = printerGroup;
	}


	//bi-directional many-to-one association to Recepie
	@ManyToOne
	@JoinColumn(name="RECEPIE")
	public Recepie getRecepieBean() {
		return this.recepieBean;
	}

	public void setRecepieBean(Recepie recepieBean) {
		this.recepieBean = recepieBean;
	}


	//bi-directional many-to-one association to Tax
	@ManyToOne
	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}


	//bi-directional many-to-many association to Terminal
	@ManyToMany
	@JoinTable(
		name="menu_item_terminal_ref"
		, joinColumns={
			@JoinColumn(name="MENU_ITEM_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="TERMINAL_ID")
			}
		)
	public Set<Terminal> getTerminals() {
		return this.terminals;
	}

	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}


	//bi-directional many-to-one association to MenuItemProperty
	@OneToMany(mappedBy="menuItem")
	public Set<MenuItemProperty> getMenuItemProperties() {
		return this.menuItemProperties;
	}

	public void setMenuItemProperties(Set<MenuItemProperty> menuItemProperties) {
		this.menuItemProperties = menuItemProperties;
	}

	public MenuItemProperty addMenuItemProperty(MenuItemProperty menuItemProperty) {
		getMenuItemProperties().add(menuItemProperty);
		menuItemProperty.setMenuItem(this);

		return menuItemProperty;
	}

	public MenuItemProperty removeMenuItemProperty(MenuItemProperty menuItemProperty) {
		getMenuItemProperties().remove(menuItemProperty);
		menuItemProperty.setMenuItem(null);

		return menuItemProperty;
	}


	//bi-directional many-to-one association to MenuitemModifiergroup
	@OneToMany(mappedBy="menuItem")
	public Set<MenuitemModifiergroup> getMenuitemModifiergroups() {
		return this.menuitemModifiergroups;
	}

	public void setMenuitemModifiergroups(Set<MenuitemModifiergroup> menuitemModifiergroups) {
		this.menuitemModifiergroups = menuitemModifiergroups;
	}

	public MenuitemModifiergroup addMenuitemModifiergroup(MenuitemModifiergroup menuitemModifiergroup) {
		getMenuitemModifiergroups().add(menuitemModifiergroup);
		menuitemModifiergroup.setMenuItem(this);

		return menuitemModifiergroup;
	}

	public MenuitemModifiergroup removeMenuitemModifiergroup(MenuitemModifiergroup menuitemModifiergroup) {
		getMenuitemModifiergroups().remove(menuitemModifiergroup);
		menuitemModifiergroup.setMenuItem(null);

		return menuitemModifiergroup;
	}


	//bi-directional many-to-one association to MenuitemShift
	@OneToMany(mappedBy="menuItem")
	public Set<MenuitemShift> getMenuitemShifts() {
		return this.menuitemShifts;
	}

	public void setMenuitemShifts(Set<MenuitemShift> menuitemShifts) {
		this.menuitemShifts = menuitemShifts;
	}

	public MenuitemShift addMenuitemShift(MenuitemShift menuitemShift) {
		getMenuitemShifts().add(menuitemShift);
		menuitemShift.setMenuItem(this);

		return menuitemShift;
	}

	public MenuitemShift removeMenuitemShift(MenuitemShift menuitemShift) {
		getMenuitemShifts().remove(menuitemShift);
		menuitemShift.setMenuItem(null);

		return menuitemShift;
	}


	//bi-directional many-to-one association to Recepie
	@OneToMany(mappedBy="menuItemBean")
	public Set<Recepie> getRecepies() {
		return this.recepies;
	}

	public void setRecepies(Set<Recepie> recepies) {
		this.recepies = recepies;
	}

	public Recepie addRecepy(Recepie recepy) {
		getRecepies().add(recepy);
		recepy.setMenuItemBean(this);

		return recepy;
	}

	public Recepie removeRecepy(Recepie recepy) {
		getRecepies().remove(recepy);
		recepy.setMenuItemBean(null);

		return recepy;
	}

}