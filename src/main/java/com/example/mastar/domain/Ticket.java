package com.example.mastar.domain;

import java.util.Date;

public class Ticket {
    private Integer id;
    private Date asaign;
    private Integer memberId;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Date getAsaign() {
	return asaign;
    }

    public void setAsaign(Date asaign) {
	this.asaign = asaign;
    }

    public Integer getMemberId() {
	return memberId;
    }

    public void setMemberId(Integer memberId) {
	this.memberId = memberId;
    }

}
