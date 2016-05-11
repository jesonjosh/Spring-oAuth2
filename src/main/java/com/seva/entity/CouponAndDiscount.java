package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the coupon_and_discount database table.
 * 
 */
@Entity
@Table(name="coupon_and_discount")
@NamedQuery(name="CouponAndDiscount.findAll", query="SELECT c FROM CouponAndDiscount c")
public class CouponAndDiscount implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte applyToAll;
	private byte autoApply;
	private String barcode;
	private byte enabled;
	private Date expiryDate;
	private int maximumOff;
	private int minimumBuy;
	private byte modifiable;
	private String name;
	private byte neverExpire;
	private int qualificationType;
	private int type;
	private String uuid;
	private double value;
	private Set<MenuCategory> menuCategories;
	private Set<MenuGroup> menuGroups;
	private Set<MenuItem> menuItems;

	public CouponAndDiscount() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="APPLY_TO_ALL")
	public byte getApplyToAll() {
		return this.applyToAll;
	}

	public void setApplyToAll(byte applyToAll) {
		this.applyToAll = applyToAll;
	}


	@Column(name="AUTO_APPLY")
	public byte getAutoApply() {
		return this.autoApply;
	}

	public void setAutoApply(byte autoApply) {
		this.autoApply = autoApply;
	}


	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXPIRY_DATE")
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	@Column(name="MAXIMUM_OFF")
	public int getMaximumOff() {
		return this.maximumOff;
	}

	public void setMaximumOff(int maximumOff) {
		this.maximumOff = maximumOff;
	}


	@Column(name="MINIMUM_BUY")
	public int getMinimumBuy() {
		return this.minimumBuy;
	}

	public void setMinimumBuy(int minimumBuy) {
		this.minimumBuy = minimumBuy;
	}


	public byte getModifiable() {
		return this.modifiable;
	}

	public void setModifiable(byte modifiable) {
		this.modifiable = modifiable;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="NEVER_EXPIRE")
	public byte getNeverExpire() {
		return this.neverExpire;
	}

	public void setNeverExpire(byte neverExpire) {
		this.neverExpire = neverExpire;
	}


	@Column(name="QUALIFICATION_TYPE")
	public int getQualificationType() {
		return this.qualificationType;
	}

	public void setQualificationType(int qualificationType) {
		this.qualificationType = qualificationType;
	}


	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}


	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}


	//bi-directional many-to-many association to MenuCategory
	@ManyToMany
	@JoinTable(
		name="menucategory_discount"
		, joinColumns={
			@JoinColumn(name="DISCOUNT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MENUCATEGORY_ID")
			}
		)
	public Set<MenuCategory> getMenuCategories() {
		return this.menuCategories;
	}

	public void setMenuCategories(Set<MenuCategory> menuCategories) {
		this.menuCategories = menuCategories;
	}


	//bi-directional many-to-many association to MenuGroup
	@ManyToMany
	@JoinTable(
		name="menugroup_discount"
		, joinColumns={
			@JoinColumn(name="DISCOUNT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MENUGROUP_ID")
			}
		)
	public Set<MenuGroup> getMenuGroups() {
		return this.menuGroups;
	}

	public void setMenuGroups(Set<MenuGroup> menuGroups) {
		this.menuGroups = menuGroups;
	}


	//bi-directional many-to-many association to MenuItem
	@ManyToMany
	@JoinTable(
		name="menuitem_discount"
		, joinColumns={
			@JoinColumn(name="DISCOUNT_ID")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MENUITEM_ID")
			}
		)
	public Set<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public void setMenuItems(Set<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

}