package com.in28minutes.learning.jpa.jpain10steps.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Table - User

@Entity
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	
	private String role;
	
	protected User() {		
	}
	
	public User(long id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

	public long getId() {
		
		return id;
	}
	
	
}
