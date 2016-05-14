package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inventory_meta_code database table.
 * 
 */
@Entity
@Table(name="inventory_meta_code")
@NamedQuery(name="InventoryMetaCode.findAll", query="SELECT i FROM InventoryMetaCode i")
public class InventoryMetaCode implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private int codeNo;
	private String codeText;
	private String description;
	private String type;

	public InventoryMetaCode() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="CODE_NO")
	public int getCodeNo() {
		return this.codeNo;
	}

	public void setCodeNo(int codeNo) {
		this.codeNo = codeNo;
	}


	@Column(name="CODE_TEXT")
	public String getCodeText() {
		return this.codeText;
	}

	public void setCodeText(String codeText) {
		this.codeText = codeText;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}