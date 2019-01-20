package com.example.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`User`")
public class User {
	@Id
	private String emailId;

	private String name;

	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String emailId, String name, String password) {
		super();
		this.emailId = emailId;
		this.name = name;
		this.password = password;
	}

	public User() {
		super();
	}
}