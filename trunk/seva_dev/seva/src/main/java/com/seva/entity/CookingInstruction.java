package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cooking_instruction database table.
 * 
 */
@Entity
@Table(name="cooking_instruction")
@NamedQuery(name="CookingInstruction.findAll", query="SELECT c FROM CookingInstruction c")
public class CookingInstruction implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;

	public CookingInstruction() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}