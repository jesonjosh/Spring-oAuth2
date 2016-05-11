package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the void_reasons database table.
 * 
 */
@Entity
@Table(name="void_reasons")
@NamedQuery(name="VoidReason.findAll", query="SELECT v FROM VoidReason v")
public class VoidReason implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String reasonText;

	public VoidReason() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Column(name="REASON_TEXT")
	public String getReasonText() {
		return this.reasonText;
	}

	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
	}

}