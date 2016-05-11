package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the printer_group_printers database table.
 * 
 */
@Entity
@Table(name="printer_group_printers")
@NamedQuery(name="PrinterGroupPrinter.findAll", query="SELECT p FROM PrinterGroupPrinter p")
public class PrinterGroupPrinter implements Serializable {
	private static final long serialVersionUID = 1L;
	private String printerName;
	private PrinterGroup printerGroup;

	public PrinterGroupPrinter() {
	}


	@Column(name="PRINTER_NAME")
	public String getPrinterName() {
		return this.printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}


	//bi-directional many-to-one association to PrinterGroup
	@ManyToOne
	@JoinColumn(name="printer_id")
	public PrinterGroup getPrinterGroup() {
		return this.printerGroup;
	}

	public void setPrinterGroup(PrinterGroup printerGroup) {
		this.printerGroup = printerGroup;
	}

}