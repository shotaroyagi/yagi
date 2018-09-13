package com.example.mastar.domain;

import java.util.Date;

public class Order {
    private Integer id;
    private Integer ticketId;
    private Integer amount;
    private Integer allItem;
    private Date orderTime;
    private Integer memberId;

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

    public Integer getAmount() {
	return amount;
    }

    public void setAmount(Integer amount) {
	this.amount = amount;
    }

    public Integer getAllItem() {
	return allItem;
    }

    public void setAllItem(Integer allItem) {
	this.allItem = allItem;
    }

    public Date getOrderTime() {
	return orderTime;
    }

    public void setOrderTime(Date orderTime) {
	this.orderTime = orderTime;
    }

    public Integer getMemberId() {
	return memberId;
    }

    public void setMemberId(Integer memberId) {
	this.memberId = memberId;
    }
}
