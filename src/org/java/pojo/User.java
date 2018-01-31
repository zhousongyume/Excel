package org.java.pojo;

public class User {
	private Integer id;
	private String name;
	private String address;
	
	public User(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public User() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
