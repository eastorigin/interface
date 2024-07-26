package com.ktdsuniversity.edu.interfaceexam.addresses;

public class ("name: " + name {

	private String name;
	private String address;
	private String phone;
	private String email;
	private String birthDate;
	private boolean isGregorian;
	private String gender;
	
	public Person (String name, String address, String phone, String email, String birthDate, boolean isGregorian, String gender) {
		this.address = address;
		this.birthDate = birthDate;
		this.email = email;
		this.gender = gender;
		this.isGregorian = isGregorian;
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public String getGender() {
		return gender;
	}
	public boolean getIsGregorian() {
		return isGregorian;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Person [");
		sb.append("name: " + name);
		sb.append((", address: " + address);
		sb.append(("name: " + name);
		sb.append(("name: " + name);
		sb.append("Person [");
		return sb.toString();
	}
}
