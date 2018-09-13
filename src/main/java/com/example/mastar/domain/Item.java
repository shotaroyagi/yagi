package com.example.mastar.domain;

public class Item {
    private Integer id;
    private String itemName;
    private Integer price;
    private String category;
    private Integer shopId;
    private Integer boothId;
    private String shopName;
    private String boothName;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getItemName() {
	return itemName;
    }

    public void setItemName(String itemName) {
	this.itemName = itemName;
    }

    public Integer getPrice() {
	return price;
    }

    public void setPrice(Integer price) {
	this.price = price;
    }

    public String getCategory() {
	return category;
    }

    public void setCategory(String category) {
	this.category = category;
    }

    public Integer getShopId() {
	return shopId;
    }

    public void setShopId(Integer shopId) {
	this.shopId = shopId;
    }

    public Integer getBoothId() {
	return boothId;
    }

    public void setBoothId(Integer boothId) {
	this.boothId = boothId;
    }

    public String getShopName() {
	return shopName;
    }

    public void setShopName(String shopName) {
	this.shopName = shopName;
    }

    public String getBoothName() {
	return boothName;
    }

    public void setBoothName(String boothName) {
	this.boothName = boothName;
    }

}
