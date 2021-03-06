package com.hudson.bean;

import java.io.Serializable;

public class Book implements Serializable {

	/**   
	 * @Fields: serialVersionUID  
	 */ 
	private static final long serialVersionUID = -4781816073612022742L;

	private Integer id;

	private String loginname;

	private String password;

	private String username;

	private String phone;

	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
