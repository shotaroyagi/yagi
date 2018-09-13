package com.example.mastar.domain;

public class Admin {
    private Integer id;
    private Integer staffId;
    private String password;

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

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
