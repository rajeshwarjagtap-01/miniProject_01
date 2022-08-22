package com.example.demo;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


import lombok.Data;
@Data
@Entity
public class plan {
	
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(name="planname")
	private String planame;
	@Column(name="startdate")
	private Date startdate;
	private Date enddate;
	private Integer pcid;
	private String Active_switch;
	private String createdby;
	private Date createddate;
	private String updatedby;
	private Date updatedate;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPlaname() {
		return planame;
	}
	public void setPlaname(String planame) {
		this.planame = planame;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Integer getPcid() {
		return pcid;
	}
	public void setPcid(Integer pcid) {
		this.pcid = pcid;
	}
	public String getActive_switch() {
		return Active_switch;
	}
	public void setActive_switch(String active_switch) {
		Active_switch = active_switch;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	
	
	
	

}