package com.example.mastar.domain;

import javax.validation.constraints.NotNull;

public class Booth {
    private Integer id;
    @NotNull
    private String boothName;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getBoothName() {
	return boothName;
    }

    public void setBoothName(String boothName) {
	this.boothName = boothName;
    }
}
