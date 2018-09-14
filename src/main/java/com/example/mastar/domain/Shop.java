package com.example.mastar.domain;

import org.hibernate.validator.constraints.NotBlank;

public class Shop {
    private Integer id;
    @NotBlank
    private Booth booth;
    @NotBlank
    private String shopName;
    @NotBlank
    private String group;

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

}
