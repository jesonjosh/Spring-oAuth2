package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the terminal_printers database table.
 * 
 */
@Entity
@Table(name="terminal_printers")
@NamedQuery(name="TerminalPrinter.findAll", query="SELECT t FROM TerminalPrinter t")
public class TerminalPrinter implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String printerName;
	private Terminal terminal;
	private VirtualPrinter virtualPrinter;

	public TerminalPrinter() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="PRINTER_NAME")
	public String getPrinterName() {
		return this.printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}


	//bi-directional many-to-one association to Terminal
	@ManyToOne
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}


	//bi-directional many-to-one association to VirtualPrinter
	@ManyToOne
	@JoinColumn(name="VIRTUAL_PRINTER_ID")
	public VirtualPrinter getVirtualPrinter() {
		return this.virtualPrinter;
	}

	public void setVirtualPrinter(VirtualPrinter virtualPrinter) {
		this.virtualPrinter = virtualPrinter;
	}

}