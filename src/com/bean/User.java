package com.bean;

public class User {
	
	private String  uid;
	private String uname;
	
	public String getUid() {
		return uid;
	}
	public User() {
		super();
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public User(String uid, String uname) {
		super();
		this.uid = uid;
		this.uname = uname;
	}
	
	

}
