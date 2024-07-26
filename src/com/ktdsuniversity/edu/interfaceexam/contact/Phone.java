package com.ktdsuniversity.edu.interfaceexam.contact;

public class Phone implements Contact {

	private String number;
	private String name;
	private String editNumber;
	
	public Phone(String number, String name, String editNumber) {
		this.number = number;
		this.name = name;
		this.editNumber = editNumber;
	}
	
	@Override
	public void searchNumber() {
		System.out.println(this.name + "의 연락처를 조회합니다");
		
	}

	@Override
	public void editNumber() {
		System.out.println(this.number + "를 " + this.editNumber + "로 변경합니다");
		
	}

}
