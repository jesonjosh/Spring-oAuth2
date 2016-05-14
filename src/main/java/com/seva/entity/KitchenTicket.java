package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the kitchen_ticket database table.
 * 
 */
@Entity
@Table(name="kitchen_ticket")
@NamedQuery(name="KitchenTicket.findAll", query="SELECT k FROM KitchenTicket k")
public class KitchenTicket implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date closeDate;
	private Date createDate;
	private String serverName;
	private String status;
	private int ticketId;
	private String ticketType;
	private byte voided;
	private Set<KitTicketTableNum> kitTicketTableNums;
	private PrinterGroup printerGroup;
	private Set<KitchenTicketItem> kitchenTicketItems;

	public KitchenTicket() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CLOSE_DATE")
	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	@Column(name="SERVER_NAME")
	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}


	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name="TICKET_ID")
	public int getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	@Column(name="TICKET_TYPE")
	public String getTicketType() {
		return this.ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}


	public byte getVoided() {
		return this.voided;
	}

	public void setVoided(byte voided) {
		this.voided = voided;
	}


	//bi-directional many-to-one association to KitTicketTableNum
	@OneToMany(mappedBy="kitchenTicket")
	public Set<KitTicketTableNum> getKitTicketTableNums() {
		return this.kitTicketTableNums;
	}

	public void setKitTicketTableNums(Set<KitTicketTableNum> kitTicketTableNums) {
		this.kitTicketTableNums = kitTicketTableNums;
	}

	public KitTicketTableNum addKitTicketTableNum(KitTicketTableNum kitTicketTableNum) {
		getKitTicketTableNums().add(kitTicketTableNum);
		kitTicketTableNum.setKitchenTicket(this);

		return kitTicketTableNum;
	}

	public KitTicketTableNum removeKitTicketTableNum(KitTicketTableNum kitTicketTableNum) {
		getKitTicketTableNums().remove(kitTicketTableNum);
		kitTicketTableNum.setKitchenTicket(null);

		return kitTicketTableNum;
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


	//bi-directional many-to-one association to KitchenTicketItem
	@OneToMany(mappedBy="kitchenTicket")
	public Set<KitchenTicketItem> getKitchenTicketItems() {
		return this.kitchenTicketItems;
	}

	public void setKitchenTicketItems(Set<KitchenTicketItem> kitchenTicketItems) {
		this.kitchenTicketItems = kitchenTicketItems;
	}

	public KitchenTicketItem addKitchenTicketItem(KitchenTicketItem kitchenTicketItem) {
		getKitchenTicketItems().add(kitchenTicketItem);
		kitchenTicketItem.setKitchenTicket(this);

		return kitchenTicketItem;
	}

	public KitchenTicketItem removeKitchenTicketItem(KitchenTicketItem kitchenTicketItem) {
		getKitchenTicketItems().remove(kitchenTicketItem);
		kitchenTicketItem.setKitchenTicket(null);

		return kitchenTicketItem;
	}

}