package com.example.mastar.domain;

public class MemberAdmin {
    private Integer id;
    private Integer memberId;
    private String password;
    private String memberName;

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getMemberId() {
	return memberId;
    }

    public void setMemberId(Integer memberId) {
	this.memberId = memberId;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getMemberName() {
	return memberName;
    }

    public void setMemberName(String memberName) {
	this.memberName = memberName;
    }
}
