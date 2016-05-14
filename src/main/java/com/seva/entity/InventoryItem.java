package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the inventory_item database table.
 * 
 */
@Entity
@Table(name="inventory_item")
@NamedQuery(name="InventoryItem.findAll", query="SELECT i FROM InventoryItem i")
public class InventoryItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private double averagePackagePrice;
	private Date createTime;
	private String description;
	private Date lastUpdateDate;
	private String name;
	private String packageBarcode;
	private int packageReorderLevel;
	private int packageReplenishLevel;
	private int sortOrder;
	private int totalPackages;
	private double totalRecepieUnits;
	private String unitBarcode;
	private double unitPerPackage;
	private double unitPurchasePrice;
	private double unitSellingPrice;
	private byte visible;
	private InventoryGroup inventoryGroup;
	private InventoryLocation inventoryLocation;
	private InventoryVendor inventoryVendor;
	private PackagingUnit packagingUnit;
	private Set<InventoryTransaction> inventoryTransactions;
	private Set<RecepieItem> recepieItems;

	public InventoryItem() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="AVERAGE_PACKAGE_PRICE")
	public double getAveragePackagePrice() {
		return this.averagePackagePrice;
	}

	public void setAveragePackagePrice(double averagePackagePrice) {
		this.averagePackagePrice = averagePackagePrice;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME")
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_DATE")
	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PACKAGE_BARCODE")
	public String getPackageBarcode() {
		return this.packageBarcode;
	}

	public void setPackageBarcode(String packageBarcode) {
		this.packageBarcode = packageBarcode;
	}


	@Column(name="PACKAGE_REORDER_LEVEL")
	public int getPackageReorderLevel() {
		return this.packageReorderLevel;
	}

	public void setPackageReorderLevel(int packageReorderLevel) {
		this.packageReorderLevel = packageReorderLevel;
	}


	@Column(name="PACKAGE_REPLENISH_LEVEL")
	public int getPackageReplenishLevel() {
		return this.packageReplenishLevel;
	}

	public void setPackageReplenishLevel(int packageReplenishLevel) {
		this.packageReplenishLevel = packageReplenishLevel;
	}


	@Column(name="SORT_ORDER")
	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}


	@Column(name="TOTAL_PACKAGES")
	public int getTotalPackages() {
		return this.totalPackages;
	}

	public void setTotalPackages(int totalPackages) {
		this.totalPackages = totalPackages;
	}


	@Column(name="TOTAL_RECEPIE_UNITS")
	public double getTotalRecepieUnits() {
		return this.totalRecepieUnits;
	}

	public void setTotalRecepieUnits(double totalRecepieUnits) {
		this.totalRecepieUnits = totalRecepieUnits;
	}


	@Column(name="UNIT_BARCODE")
	public String getUnitBarcode() {
		return this.unitBarcode;
	}

	public void setUnitBarcode(String unitBarcode) {
		this.unitBarcode = unitBarcode;
	}


	@Column(name="UNIT_PER_PACKAGE")
	public double getUnitPerPackage() {
		return this.unitPerPackage;
	}

	public void setUnitPerPackage(double unitPerPackage) {
		this.unitPerPackage = unitPerPackage;
	}


	@Column(name="UNIT_PURCHASE_PRICE")
	public double getUnitPurchasePrice() {
		return this.unitPurchasePrice;
	}

	public void setUnitPurchasePrice(double unitPurchasePrice) {
		this.unitPurchasePrice = unitPurchasePrice;
	}


	@Column(name="UNIT_SELLING_PRICE")
	public double getUnitSellingPrice() {
		return this.unitSellingPrice;
	}

	public void setUnitSellingPrice(double unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}


	public byte getVisible() {
		return this.visible;
	}

	public void setVisible(byte visible) {
		this.visible = visible;
	}


	//bi-directional many-to-one association to InventoryGroup
	@ManyToOne
	@JoinColumn(name="ITEM_GROUP_ID")
	public InventoryGroup getInventoryGroup() {
		return this.inventoryGroup;
	}

	public void setInventoryGroup(InventoryGroup inventoryGroup) {
		this.inventoryGroup = inventoryGroup;
	}


	//bi-directional many-to-one association to InventoryLocation
	@ManyToOne
	@JoinColumn(name="ITEM_LOCATION_ID")
	public InventoryLocation getInventoryLocation() {
		return this.inventoryLocation;
	}

	public void setInventoryLocation(InventoryLocation inventoryLocation) {
		this.inventoryLocation = inventoryLocation;
	}


	//bi-directional many-to-one association to InventoryVendor
	@ManyToOne
	@JoinColumn(name="ITEM_VENDOR_ID")
	public InventoryVendor getInventoryVendor() {
		return this.inventoryVendor;
	}

	public void setInventoryVendor(InventoryVendor inventoryVendor) {
		this.inventoryVendor = inventoryVendor;
	}


	//bi-directional many-to-one association to PackagingUnit
	@ManyToOne
	@JoinColumn(name="PUNIT_ID")
	public PackagingUnit getPackagingUnit() {
		return this.packagingUnit;
	}

	public void setPackagingUnit(PackagingUnit packagingUnit) {
		this.packagingUnit = packagingUnit;
	}


	//bi-directional many-to-one association to InventoryTransaction
	@OneToMany(mappedBy="inventoryItem")
	public Set<InventoryTransaction> getInventoryTransactions() {
		return this.inventoryTransactions;
	}

	public void setInventoryTransactions(Set<InventoryTransaction> inventoryTransactions) {
		this.inventoryTransactions = inventoryTransactions;
	}

	public InventoryTransaction addInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().add(inventoryTransaction);
		inventoryTransaction.setInventoryItem(this);

		return inventoryTransaction;
	}

	public InventoryTransaction removeInventoryTransaction(InventoryTransaction inventoryTransaction) {
		getInventoryTransactions().remove(inventoryTransaction);
		inventoryTransaction.setInventoryItem(null);

		return inventoryTransaction;
	}


	//bi-directional many-to-one association to RecepieItem
	@OneToMany(mappedBy="inventoryItemBean")
	public Set<RecepieItem> getRecepieItems() {
		return this.recepieItems;
	}

	public void setRecepieItems(Set<RecepieItem> recepieItems) {
		this.recepieItems = recepieItems;
	}

	public RecepieItem addRecepieItem(RecepieItem recepieItem) {
		getRecepieItems().add(recepieItem);
		recepieItem.setInventoryItemBean(this);

		return recepieItem;
	}

	public RecepieItem removeRecepieItem(RecepieItem recepieItem) {
		getRecepieItems().remove(recepieItem);
		recepieItem.setInventoryItemBean(null);

		return recepieItem;
	}

}