package com.example.mastar.domain;

public class Position {
    private Integer id;
    private Integer staffId;
    private String positionName;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getStaffId() {
	return staffId;
    }

    public void setStaffId(Integer staffId) {
	this.staffId = staffId;
    }

    public String getPositionName() {
	return positionName;
    }

    public void setPositionName(
	    String positionName) {
	this.positionName = positionName;
    }

}
