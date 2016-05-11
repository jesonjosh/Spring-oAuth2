package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the virtual_printer database table.
 * 
 */
@Entity
@Table(name="virtual_printer")
@NamedQuery(name="VirtualPrinter.findAll", query="SELECT v FROM VirtualPrinter v")
public class VirtualPrinter implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private byte enabled;
	private String name;
	private int priority;
	private int type;
	private Set<TerminalPrinter> terminalPrinters;
	private Set<VirtualprinterOrderType> virtualprinterOrderTypes;

	public VirtualPrinter() {
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


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}


	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}


	//bi-directional many-to-one association to TerminalPrinter
	@OneToMany(mappedBy="virtualPrinter")
	public Set<TerminalPrinter> getTerminalPrinters() {
		return this.terminalPrinters;
	}

	public void setTerminalPrinters(Set<TerminalPrinter> terminalPrinters) {
		this.terminalPrinters = terminalPrinters;
	}

	public TerminalPrinter addTerminalPrinter(TerminalPrinter terminalPrinter) {
		getTerminalPrinters().add(terminalPrinter);
		terminalPrinter.setVirtualPrinter(this);

		return terminalPrinter;
	}

	public TerminalPrinter removeTerminalPrinter(TerminalPrinter terminalPrinter) {
		getTerminalPrinters().remove(terminalPrinter);
		terminalPrinter.setVirtualPrinter(null);

		return terminalPrinter;
	}


	//bi-directional many-to-one association to VirtualprinterOrderType
	@OneToMany(mappedBy="virtualPrinter")
	public Set<VirtualprinterOrderType> getVirtualprinterOrderTypes() {
		return this.virtualprinterOrderTypes;
	}

	public void setVirtualprinterOrderTypes(Set<VirtualprinterOrderType> virtualprinterOrderTypes) {
		this.virtualprinterOrderTypes = virtualprinterOrderTypes;
	}

	public VirtualprinterOrderType addVirtualprinterOrderType(VirtualprinterOrderType virtualprinterOrderType) {
		getVirtualprinterOrderTypes().add(virtualprinterOrderType);
		virtualprinterOrderType.setVirtualPrinter(this);

		return virtualprinterOrderType;
	}

	public VirtualprinterOrderType removeVirtualprinterOrderType(VirtualprinterOrderType virtualprinterOrderType) {
		getVirtualprinterOrderTypes().remove(virtualprinterOrderType);
		virtualprinterOrderType.setVirtualPrinter(null);

		return virtualprinterOrderType;
	}

}