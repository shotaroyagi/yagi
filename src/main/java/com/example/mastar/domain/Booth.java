package com.example.mastar.domain;

import org.hibernate.validator.constraints.NotBlank;

public class Booth {
    private Integer id;
    @NotBlank
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
