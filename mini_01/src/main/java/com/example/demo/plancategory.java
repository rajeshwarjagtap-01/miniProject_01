package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class plancategory {

@Id
@GeneratedValue
private Integer pcid;
private String plancategoryName;
private	String createby;
private Date createddate;
private	Date updateddate;
private	String updatedby;
private	String sw;
public Integer getPcid() {
	return pcid;
}
public void setPcid(Integer pcid) {
	this.pcid = pcid;
}
public String getPlancategoryName() {
	return plancategoryName;
}
public void setPlancategoryName(String plancategoryName) {
	this.plancategoryName = plancategoryName;
}
public String getCreateby() {
	return createby;
}
public void setCreateby(String createby) {
	this.createby = createby;
}
public Date getCreateddate() {
	return createddate;
}
public void setCreateddate(Date createddate) {
	this.createddate = createddate;
}
public Date getUpdateddate() {
	return updateddate;
}
public void setUpdateddate(Date updateddate) {
	this.updateddate = updateddate;
}
public String getUpdatedby() {
	return updatedby;
}
public void setUpdatedby(String updatedby) {
	this.updatedby = updatedby;
}
public String getSw() {
	return sw;
}
public void setSw(String sw) {
	this.sw = sw;
}

	
	
}
