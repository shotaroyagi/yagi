package com.example.mastar.domain;

public class Staff {
    private Integer id;
    private String staffName;
    private Integer phone;
    private String address;
    private Integer classId;
    private String className;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getStaffName() {
	return staffName;
    }

    public void setStaffName(String stuffName) {
	this.staffName = stuffName;
    }

    public Integer getPhone() {
	return phone;
    }

    public void setPhone(Integer phone) {
	this.phone = phone;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public Integer getClassId() {
	return classId;
    }

    public void setClassId(Integer classId) {
	this.classId = classId;
    }

    public String getClassName() {
	return className;
    }

    public void setClassName(String className) {
	this.className = className;
    }
}
