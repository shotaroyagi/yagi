package com.example.mastar.domain;

public class Shop {
    private Integer id;
    private String shopName;
    private String group;
    private Integer boothId;
    private String boothName;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getShopName() {
	return shopName;
    }

    public void setShopName(String shopName) {
	this.shopName = shopName;
    }

    public String getGroup() {
	return group;
    }

    public void setGroup(String group) {
	this.group = group;
    }

    public Integer getBoothId() {
	return boothId;
    }

    public void setBoothId(Integer boothId) {
	this.boothId = boothId;
    }

    public String getBoothName() {
	return boothName;
    }

    public void setBoothName(String boothName) {
	this.boothName = boothName;
    }
}
