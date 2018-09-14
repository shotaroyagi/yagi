package com.example.mastar.domain;

import org.hibernate.validator.constraints.NotBlank;

public class Item {
    private Integer id;
    @NotBlank
    private Booth booth;
    @NotBlank
    private Shop shop;
    @NotBlank
    private String category;
    @NotBlank
    private String itemName;
    @NotBlank
    private Integer price;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Booth getBooth() {
	return booth;
    }

    public void setBooth(Booth booth) {
	this.booth = booth;
    }

    public Shop getShop() {
	return shop;
    }

    public void setShop(Shop shop) {
	this.shop = shop;
    }

    public String getCategory() {
	return category;
    }

    public void setCategory(String category) {
	this.category = category;
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

}
