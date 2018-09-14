package com.example.mastar.domain;

import java.util.Date;

public class BoothEntry {
    private Integer id;
    private Booth booth;
    private Date entry;
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
    public Date getEntry() {
	return entry;
    }
    public void setEntry(Date entry) {
	this.entry = entry;
    }
}
