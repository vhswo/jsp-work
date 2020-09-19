package com.cos.blog.model;

import java.sql.Timestamp;


public class User {
	private int id; // 넘버링 1,2,3,4
	private String username; // ssarmango
	private String password;
	private String email;
	private String address;
	private Timestamp createData;
	
	
	public User(int id, String username, String password, String email, String address, Timestamp createData) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.createData = createData;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getCreateData() {
		return createData;
	}
	public void setCreateData(Timestamp createData) {
		this.createData = createData;
	}

	public User(String username, String password, String email, String address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", createData=" + createData + "]";
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User(int id, String username, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.address = address;
	}
	
	
	
	
}
