package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the printer_configuration database table.
 * 
 */
@Entity
@Table(name="printer_configuration")
@NamedQuery(name="PrinterConfiguration.findAll", query="SELECT p FROM PrinterConfiguration p")
public class PrinterConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String kitchenPrinter;
	private byte pkwtp;
	private byte pkwts;
	private byte prwtp;
	private byte prwts;
	private String receiptPrinter;
	private byte unpfk;
	private byte unpft;

	public PrinterConfiguration() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="KITCHEN_PRINTER")
	public String getKitchenPrinter() {
		return this.kitchenPrinter;
	}

	public void setKitchenPrinter(String kitchenPrinter) {
		this.kitchenPrinter = kitchenPrinter;
	}


	public byte getPkwtp() {
		return this.pkwtp;
	}

	public void setPkwtp(byte pkwtp) {
		this.pkwtp = pkwtp;
	}


	public byte getPkwts() {
		return this.pkwts;
	}

	public void setPkwts(byte pkwts) {
		this.pkwts = pkwts;
	}


	public byte getPrwtp() {
		return this.prwtp;
	}

	public void setPrwtp(byte prwtp) {
		this.prwtp = prwtp;
	}


	public byte getPrwts() {
		return this.prwts;
	}

	public void setPrwts(byte prwts) {
		this.prwts = prwts;
	}


	@Column(name="RECEIPT_PRINTER")
	public String getReceiptPrinter() {
		return this.receiptPrinter;
	}

	public void setReceiptPrinter(String receiptPrinter) {
		this.receiptPrinter = receiptPrinter;
	}


	public byte getUnpfk() {
		return this.unpfk;
	}

	public void setUnpfk(byte unpfk) {
		this.unpfk = unpfk;
	}


	public byte getUnpft() {
		return this.unpft;
	}

	public void setUnpft(byte unpft) {
		this.unpft = unpft;
	}

}