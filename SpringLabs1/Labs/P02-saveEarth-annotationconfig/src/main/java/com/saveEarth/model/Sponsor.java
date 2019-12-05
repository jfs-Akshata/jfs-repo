package com.saveEarth.model;

public class Sponsor {

	private String first_name;
	private String id;
	private String last_name;
	private byte age;
	private float amount;
	private String address;
	
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String adress) {
		this.address = adress;
	}
	
	
	@Override
	public String toString() {
		return "Sponsor [first_name=" + first_name + ", id=" + id + ", last_name=" + last_name + ", age=" + age
				+ ", amount=" + amount + ", adress=" + address + "]";
	}
	
	
	
}
