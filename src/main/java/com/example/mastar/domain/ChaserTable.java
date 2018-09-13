package com.example.mastar.domain;

public class ChaserTable {
    private Integer id;
    private Integer ticketId;
    private Integer price;
    private String allItem;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getTicketId() {
	return ticketId;
    }

    public void setTicketId(Integer ticketId) {
	this.ticketId = ticketId;
    }

    public Integer getPrice() {
	return price;
    }

    public void setPrice(Integer price) {
	this.price = price;
    }

    public String getAllItem() {
	return allItem;
    }

    public void setAllItem(String allItem) {
	this.allItem = allItem;
    }
}
