package com.example.mastar.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Admin {
    private Integer id;
    @NotNull
    private Integer staffId;
    @NotNull
    @Size(min = 6)
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
