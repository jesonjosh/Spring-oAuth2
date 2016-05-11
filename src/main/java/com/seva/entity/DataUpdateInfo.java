package com.seva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the data_update_info database table.
 * 
 */
@Entity
@Table(name="data_update_info")
@NamedQuery(name="DataUpdateInfo.findAll", query="SELECT d FROM DataUpdateInfo d")
public class DataUpdateInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Date lastUpdateTime;

	public DataUpdateInfo() {
	}


	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LAST_UPDATE_TIME")
	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

}