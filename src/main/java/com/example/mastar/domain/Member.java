package com.example.mastar.domain;

public class Member {
    private Integer id;
    private String memberName;
    private String sex;
    private Integer age;
    private String password;
    private String zipcode;
    private String address;
    private String phone;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getMemberName() {
	return memberName;
    }

    public void setMemberName(String memberName) {
	this.memberName = memberName;
    }

    public String getSex() {
	return sex;
    }

    public void setSex(String sex) {
	this.sex = sex;
    }

    public Integer getAge() {
	return age;
    }

    public void setAge(Integer age) {
	this.age = age;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getZipcode() {
	return zipcode;
    }

    public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

}
