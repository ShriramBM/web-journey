package com.orm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private String name;
	private Integer phone;
	private String address;

	public Student() {
	}

	public Student(Integer phone, String name, String address) {
		this.address = address;
		this.phone = phone;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}
}
